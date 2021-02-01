package org.avanza4java.HTTP.Responses.Account;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "balance",
        "currency"
})
public class CurrencyAccount {

   @JsonProperty ("balance")
   private String balance;
   @JsonProperty ("currency")
   private String currency;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("balance")
   public String getBalance() {
      return balance;
   }

   @JsonProperty ("balance")
   public void setBalance(String balance) {
      this.balance = balance;
   }

   @JsonProperty ("currency")
   public String getCurrency() {
      return currency;
   }

   @JsonProperty ("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
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

