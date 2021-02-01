package org.avanza4java.HTTP.Responses.Authentication;

import org.avanza4java.HTTP.Responses.HTTPResponse;

public class TotpResponse extends HTTPResponse {

   String authenticationSession;
   String pushSubscriptionId;
   String customerId;
   String registrationComplete;

   public String getAuthenticationSession() {
      return authenticationSession;
   }

   public String getPushSubscriptionId() {
      return pushSubscriptionId;
   }

   public Boolean getRegistrationComplete() {
      if (registrationComplete == null) {
         registrationComplete = "false";
      }
      return Boolean.valueOf(registrationComplete);
   }

   public String getCustomerId() {
      return customerId;
   }
}
