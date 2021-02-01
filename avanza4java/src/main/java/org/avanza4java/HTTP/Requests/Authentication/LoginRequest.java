package org.avanza4java.HTTP.Requests.Authentication;

import com.google.gson.JsonObject;

public class LoginRequest {

   private long maxMinutesInactive;
   private String username;
   private String password;

   public LoginRequest(long maxMinutesInactive, String username, String password) {
      this.password = password;
      this.username = username;
      this.maxMinutesInactive = maxMinutesInactive;
   }

   public JsonObject toJSON() {
      JsonObject json = new JsonObject();
      json.addProperty("username", username);
      json.addProperty("password", password);
      json.addProperty("maxInactiveMinutes", maxMinutesInactive);
      return json;
   }
}

