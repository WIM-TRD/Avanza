package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.Stock;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "directYield",
        "priceEarningsRatio",
        "volatility"
})
public class KeyRatios {

   @JsonProperty ("directYield")
   private String directYield;
   @JsonProperty ("priceEarningsRatio")
   private String priceEarningsRatio;
   @JsonProperty ("volatility")
   private String volatility;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("directYield")
   public String getDirectYield() {
      return directYield;
   }

   @JsonProperty ("directYield")
   public void setDirectYield(String directYield) {
      this.directYield = directYield;
   }

   @JsonProperty ("priceEarningsRatio")
   public String getPriceEarningsRatio() {
      return priceEarningsRatio;
   }

   @JsonProperty ("priceEarningsRatio")
   public void setPriceEarningsRatio(String priceEarningsRatio) {
      this.priceEarningsRatio = priceEarningsRatio;
   }

   @JsonProperty ("volatility")
   public String getVolatility() {
      return volatility;
   }

   @JsonProperty ("volatility")
   public void setVolatility(String volatility) {
      this.volatility = volatility;
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




