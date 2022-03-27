package org.avanza4java.HTTP.Responses.Deals;

import com.fasterxml.jackson.annotation.*;
import org.avanza4java.HTTP.Responses.Account.AccountSimple;
import org.avanza4java.HTTP.Responses.Orders.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "accounts",
        "deals",
        "orders",
        "reservedAmount"
})
public class DealsAndOrders {

   @JsonProperty ("accounts")
   private List<AccountSimple> accounts = null;
   @JsonProperty ("deals")
   private List<Deal> deals = null;
   @JsonProperty ("orders")
   private List<Order> orders = null;
   @JsonProperty ("reservedAmount")
   private String reservedAmount;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("accounts")
   public List<AccountSimple> getAccounts() {
      return accounts;
   }

   @JsonProperty ("accounts")
   public void setAccounts(List<AccountSimple> accounts) {
      this.accounts = accounts;
   }

   @JsonProperty ("deals")
   public List<Deal> getDeals() {
      return deals;
   }

   @JsonProperty ("deals")
   public void setDeals(List<Deal> deals) {
      this.deals = deals;
   }

   @JsonProperty ("orders")
   public List<Order> getOrders() {
      return orders;
   }

   @JsonProperty ("orders")
   public void setOrders(List<Order> orders) {
      this.orders = orders;
   }

   @JsonProperty ("reservedAmount")
   public String getReservedAmount() {
      return reservedAmount;
   }

   @JsonProperty ("reservedAmount")
   public void setReservedAmount(String reservedAmount) {
      this.reservedAmount = reservedAmount;
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

