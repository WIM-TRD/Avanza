package org.avanza4java.HTTP.Responses;

import java.util.Map;

public class HTTPResponse <T> {

   Map<String, String> headers;
   T body;

   public HTTPResponse(Map<String, String> headers, T body) {
      this.headers = headers;
      this.body = body;
   }

   public HTTPResponse() {
   }

   public Map<String, String> getHeaders() {
      return headers;
   }

   public T getBody() {
      return body;
   }
}
