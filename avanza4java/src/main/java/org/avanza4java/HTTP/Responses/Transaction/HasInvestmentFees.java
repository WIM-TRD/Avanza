package org.avanza4java.HTTP.Responses.Transaction;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "buy",
        "sell"
})
public class HasInvestmentFees {

   @JsonProperty ("buy")
   private String buy;
   @JsonProperty ("sell")
   private String sell;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("buy")
   public String getBuy() {
      return buy;
   }

   @JsonProperty ("buy")
   public void setBuy(String buy) {
      this.buy = buy;
   }

   @JsonProperty ("sell")
   public String getSell() {
      return sell;
   }

   @JsonProperty ("sell")
   public void setSell(String sell) {
      this.sell = sell;
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
