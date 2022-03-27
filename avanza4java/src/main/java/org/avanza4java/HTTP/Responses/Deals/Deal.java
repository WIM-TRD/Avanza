package org.avanza4java.HTTP.Responses.Deals;

import com.fasterxml.jackson.annotation.*;
import org.avanza4java.HTTP.Responses.Account.AccountSimple;
import org.avanza4java.HTTP.Responses.OrderBook.OrderBook;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "account",
        "dealId",
        "dealTime",
        "marketTransaction",
        "orderId",
        "orderbook",
        "price",
        "sum",
        "type",
        "volume"
})
public class Deal {

   @JsonProperty ("account")
   private AccountSimple account;
   @JsonProperty ("dealId")
   private String dealId;
   @JsonProperty ("dealTime")
   private String dealTime;
   @JsonProperty ("marketTransaction")
   private String marketTransaction;
   @JsonProperty ("orderId")
   private String orderId;
   @JsonProperty ("orderbook")
   private OrderBook orderbook;
   @JsonProperty ("price")
   private String price;
   @JsonProperty ("sum")
   private String sum;
   @JsonProperty ("type")
   private String type;
   @JsonProperty ("volume")
   private String volume;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("account")
   public AccountSimple getAccount() {
      return account;
   }

   @JsonProperty ("account")
   public void setAccount(AccountSimple account) {
      this.account = account;
   }

   @JsonProperty ("dealId")
   public String getDealId() {
      return dealId;
   }

   @JsonProperty ("dealId")
   public void setDealId(String dealId) {
      this.dealId = dealId;
   }

   @JsonProperty ("dealTime")
   public String getDealTime() {
      return dealTime;
   }

   @JsonProperty ("dealTime")
   public void setDealTime(String dealTime) {
      this.dealTime = dealTime;
   }

   @JsonProperty ("marketTransaction")
   public String getMarketTransaction() {
      return marketTransaction;
   }

   @JsonProperty ("marketTransaction")
   public void setMarketTransaction(String marketTransaction) {
      this.marketTransaction = marketTransaction;
   }

   @JsonProperty ("orderId")
   public String getOrderId() {
      return orderId;
   }

   @JsonProperty ("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty ("orderbook")
   public OrderBook getOrderbook() {
      return orderbook;
   }

   @JsonProperty ("orderbook")
   public void setOrderbook(OrderBook orderbook) {
      this.orderbook = orderbook;
   }

   @JsonProperty ("price")
   public String getPrice() {
      return price;
   }

   @JsonProperty ("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty ("sum")
   public String getSum() {
      return sum;
   }

   @JsonProperty ("sum")
   public void setSum(String sum) {
      this.sum = sum;
   }

   @JsonProperty ("type")
   public String getType() {
      return type;
   }

   @JsonProperty ("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty ("volume")
   public String getVolume() {
      return volume;
   }

   @JsonProperty ("volume")
   public void setVolume(String volume) {
      this.volume = volume;
   }

   @JsonAnyGetter
   public Map<String, Object> getAdditionalProperties() {
      return this.additionalProperties;
   }

   @JsonAnySetter
   public void setAdditionalProperty(String name, Object value) {
      this.additionalProperties.put(name, value);
   }

}
