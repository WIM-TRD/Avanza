package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.Stock;

import com.fasterxml.jackson.annotation.*;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Transaction.Activity.Buy;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Transaction.Activity.Sell;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "buy",
        "sell"
})
public class OrderDepthLevel {

   @JsonProperty ("buy")
   private Buy buy;
   @JsonProperty ("sell")
   private Sell sell;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("buy")
   public Buy getBuy() {
      return buy;
   }

   @JsonProperty ("buy")
   public void setBuy(Buy buy) {
      this.buy = buy;
   }

   @JsonProperty ("sell")
   public Sell getSell() {
      return sell;
   }

   @JsonProperty ("sell")
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

