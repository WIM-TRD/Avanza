package org.avanza4java.HTTP.Responses.InstrumentInfo.Stock;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.avanza4java.HTTP.Responses.Transaction.Activity.Buy;
import org.avanza4java.HTTP.Responses.Transaction.Activity.Sell;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "buy",
        "sell"
})
public class OrderDepthLevel {

   @JsonProperty("buy")
   private Buy buy;
   @JsonProperty("sell")
   private Sell sell;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("buy")
   public Buy getBuy() {
      return buy;
   }

   @JsonProperty("buy")
   public void setBuy(Buy buy) {
      this.buy = buy;
   }

   @JsonProperty("sell")
   public Sell getSell() {
      return sell;
   }

   @JsonProperty("sell")
   public void setSell(Sell sell) {
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

