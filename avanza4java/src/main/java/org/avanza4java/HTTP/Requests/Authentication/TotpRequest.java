package org.avanza4java.HTTP.Requests.Authentication;

import com.google.gson.JsonObject;

public class TotpRequest {
   private String method;
   private String totpSecret;

   public String getMethod() {
      return method;
   }

   public void setMethod(String method) {
      this.method = method;
   }

   public String getTotpSecret() {
      return totpSecret;
   }

   public void setTotpSecret(String totpSecret) {
      this.totpSecret = totpSecret;
   }

   public JsonObject toJSON() {
      JsonObject json = new JsonObject();
      json.addProperty("method", method);
      json.addProperty("totpCode", totpSecret);
      return json;
   }
}
