package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Requests.Orders;

import com.google.gson.JsonObject;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Orders.OrderType;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.Utils.date.DateUtils;

import java.util.Date;

public class OrderOptions {
   private String accountId;
   private String orderbookId;
   private OrderType orderType;
   private float price;
   private String validUntil; //YYYY-MM-DD
   private String volume;

   public OrderOptions(String accountId, String orderbookId, OrderType orderType,
                       float price, Date validUntil, String volume) {
      this.accountId = accountId;
      this.orderbookId = orderbookId;
      this.orderType = orderType;
      this.price = price;
      this.validUntil = DateUtils.parseDate(validUntil);
      this.volume = volume;
   }

   public OrderOptions(OrderOptions orderOptions) {
      this.accountId = orderOptions.getAccountId();
      this.orderbookId = orderOptions.getOrderbookId();
      this.orderType = orderOptions.getOrderType();
      this.price = orderOptions.getPrice();
      this.validUntil = orderOptions.getValidUntil();
      this.volume = orderOptions.getVolume();
   }

   public JsonObject toJson() {
      JsonObject json = new JsonObject();
      json.addProperty("accountId", accountId);
      json.addProperty("orderbookId", orderbookId);
      json.addProperty("side", orderType.toString());
      json.addProperty("price", price);
      json.addProperty("validUntil", validUntil);
      json.addProperty("volume", volume);
      return json;
   }

   public String getAccountId() {
      return accountId;
   }

   public String getOrderbookId() {
      return orderbookId;
   }

   public OrderType getOrderType() {
      return orderType;
   }

   public float getPrice() {
      return price;
   }

   public String getValidUntil() {
      return validUntil;
   }

   public String getVolume() {
      return volume;
   }
}
