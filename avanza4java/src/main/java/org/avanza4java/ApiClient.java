package org.avanza4java;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.IOUtils;
import org.avanza4java.Config.Constants;
import org.avanza4java.HTTP.HTTPMethod;
import org.avanza4java.HTTP.Responses.HTTPResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;

public class ApiClient {
   private final static Logger LOGGER = LoggerFactory.getLogger(ApiClient.class);
   private static boolean authenticated;
   private final String username;
   private final String password;
   private final String totp;

   public ApiClient(String username, String password, String totp) {
      this.username = username;
      this.password = password;
      this.totp = totp;
      this.authenticated = false;
   }

   public <T> HTTPResponse<T> call(HTTPMethod method, Map<String, String> headers, JsonObject data,
                                   String urlextension, Class<T> responseType) {
      if (authenticated) {
         if (urlextension.substring(urlextension.length() - 1).equals("?")) {
            urlextension = urlextension.substring(0, urlextension.length() - 1);
         }
         return (request(method, headers, data, urlextension, responseType));
      } else {
         throw new RuntimeException("User not authenticated.");
      }
   }

   synchronized <T> HTTPResponse<T> request(HTTPMethod httpMethod, Map<String, String> headers,
                                            JsonObject data, String urlExtension, Class<T> responseType) {
      HTTPResponse retVal = new HTTPResponse<>();
      headers = new HashMap<>(ofNullable(headers).orElseGet(HashMap :: new));
      headers.put("Accept", "*/*");
      headers.put("User-Agent", "Avanza API client");
      headers.put("Content-Type", "application/json; charset=UTF-8");
      try {
         URL avanzaURL = new URL(urlBuilder(urlExtension));
         HttpURLConnection avanzaConnection = (HttpURLConnection) avanzaURL.openConnection();
         avanzaConnection.setUseCaches(false);
         avanzaConnection.setRequestMethod(httpMethod.getHttpMethod());
         headers.forEach(avanzaConnection :: setRequestProperty);
         if (data != null) {
            avanzaConnection.setRequestProperty("Content-Length", String.valueOf(data.size()));
            avanzaConnection.setDoOutput(true);
            IOUtils.write(String.valueOf(data), avanzaConnection.getOutputStream(), StandardCharsets.UTF_8);
         }

         int responseCode = avanzaConnection.getResponseCode();
         String responseBody = "";
         try (InputStream inputStream = getResponseInputStream(avanzaConnection, responseCode)) {
            responseBody = readInputStream(inputStream);
            ;
         }
         if ((responseCode >= 200 &&
              responseCode <= 299)) {
            Gson gson = new Gson();
            JsonObject jsonObject = new JsonParser().parse(responseBody).getAsJsonObject();
            retVal = new HTTPResponse(
                    getResponseHeaders(avanzaConnection.getHeaderFields()),
                    gson.fromJson(jsonObject.toString(), responseType)
            );
            //TODO: Remove LOGGER.
            LOGGER.debug("Response ---HEAD--- {} ---BODY--- {} ------ {}",
                         avanzaConnection.getHeaderFields(),
                         responseBody, avanzaConnection.getResponseMessage());
         } else {
            LOGGER.warn("Request to {} failed with error code {}---BODY---{} ----{}",
                        avanzaConnection.getURL().toString(), responseCode, responseBody, avanzaConnection.getResponseMessage());
         }
      } catch (MalformedURLException e) {
         e.printStackTrace();
      } catch (ProtocolException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      return retVal;
   }

   private String readInputStream(InputStream inputStream) throws IOException {
      StringBuilder responseBody = new StringBuilder(IOUtils.toString(inputStream, StandardCharsets.UTF_8));
      int openingBracket = responseBody.toString().indexOf("[");
      if (openingBracket == 0) {
         responseBody.deleteCharAt(openingBracket);
         int closingBracket = responseBody.toString().lastIndexOf("]");
         responseBody.deleteCharAt(closingBracket);
      }
      return responseBody.toString();

   }

   private Map<String, String> getResponseHeaders(Map<String, List<String>> headerFields) {
      return headerFields.entrySet().stream()
              .collect(Collectors.toMap(Map.Entry :: getKey,
                                        o -> o.getValue().stream().collect(joining(","))));
   }

   private InputStream getResponseInputStream(HttpURLConnection avanzaConnection, int responseCode) {
      try {
         return (responseCode >= 200 && responseCode <= 299) ?
                avanzaConnection.getInputStream() : avanzaConnection.getErrorStream();
      } catch (IOException e) {
         throw new RuntimeException("Failed to obtain response input stream", e);
      }
   }

   private String urlBuilder(String extension) {
      String path = extension;
      while (path.startsWith("/") && path.length() > 1) path = path.substring(1);
      return (Constants.AVANZA_BASE + path);
   }

   public void setAuthenticated() {
      this.authenticated = true;
   }
}
