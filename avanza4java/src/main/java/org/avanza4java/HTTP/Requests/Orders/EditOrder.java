package org.avanza4java.HTTP.Requests.Orders;

import com.google.gson.JsonObject;
import org.avanza4java.Config.Constants;

public class EditOrder extends OrderOptions {
   private String instrumentType;
   private String orderId;

   public EditOrder(String instrumentType, String orderId, OrderOptions orderOptions) {
      super(orderOptions);
      this.instrumentType = instrumentType;
      this.orderId = orderId;
   }

   public JsonObject toJson() {
      JsonObject json = super.toJson();
      return json;
   }

   public String getEditOrderExtension() {
      String retVal = Constants.ORDER_EDIT_PATH;
      retVal = retVal.replace("{0}", instrumentType);
      retVal = retVal.replace("{1}", orderId);
      return retVal;
   }
}
