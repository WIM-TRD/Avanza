package org.avanza4java.HTTP.Authentication;

public class TwoFactorLogin {
   String method;
   String transactionId;

   public TwoFactorLogin(String method, String transactionId) {
      this.method = method;
      this.transactionId = transactionId;
   }

   public String getTransactionId() {
      return transactionId;
   }

   public void setTransactionId(String transactionId) {
      this.transactionId = transactionId;
   }

   public String getMethod() {
      return method;
   }

   public void setMethod(String method) {
      this.method = method;
   }

}
