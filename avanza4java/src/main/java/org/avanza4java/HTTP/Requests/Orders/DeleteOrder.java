package org.avanza4java.HTTP.Requests.Orders;

import com.google.gson.JsonObject;
import org.avanza4java.Config.Constants;

public class DeleteOrder extends OrderOptions {

   private String accountId;
   private String orderId;

   public DeleteOrder(String accountId, String orderId, OrderOptions orderOptions) {
      super(orderOptions);
      this.accountId = accountId;
      this.orderId = orderId;
   }

   public JsonObject toJson() {
      JsonObject json = super.toJson();
      return json;
   }

   public String getDeleteOrderExtension() {
      String retVal = Constants.ORDER_DELETE_PATH;
      retVal = retVal.replace("{0}", accountId);
      retVal = retVal.replace("{1}", orderId);
      return retVal;
   }
}
