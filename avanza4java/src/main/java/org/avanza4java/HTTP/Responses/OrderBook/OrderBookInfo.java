package org.avanza4java.HTTP.Responses.OrderBook;

import com.fasterxml.jackson.annotation.*;
import org.avanza4java.HTTP.Responses.Account.Account;
import org.avanza4java.HTTP.Responses.InstrumentInfo.Fund.Fund;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "account",
        "fund"
})
public class OrderBookInfo {

   @JsonProperty ("account")
   private Account account;
   @JsonProperty ("fund")
   private Fund fund;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("account")
   public Account getAccount() {
      return account;
   }

   @JsonProperty ("account")
   public void setAccount(Account account) {
      this.account = account;
   }

   @JsonProperty ("fund")
   public Fund getFund() {
      return fund;
   }

   @JsonProperty ("fund")
   public void setFund(Fund fund) {
      this.fund = fund;
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

