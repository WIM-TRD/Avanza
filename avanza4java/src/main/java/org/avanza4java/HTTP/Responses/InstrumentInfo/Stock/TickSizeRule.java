package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.Stock;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "maxPrice",
        "minPrice",
        "tickSize"
})
public class TickSizeRule {

   @JsonProperty ("maxPrice")
   private String maxPrice;
   @JsonProperty ("minPrice")
   private String minPrice;
   @JsonProperty ("tickSize")
   private String tickSize;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("maxPrice")
   public String getMaxPrice() {
      return maxPrice;
   }

   @JsonProperty ("maxPrice")
   public void setMaxPrice(String maxPrice) {
      this.maxPrice = maxPrice;
   }

   @JsonProperty ("minPrice")
   public String getMinPrice() {
      return minPrice;
   }

   @JsonProperty ("minPrice")
   public void setMinPrice(String minPrice) {
      this.minPrice = minPrice;
   }

   @JsonProperty ("tickSize")
   public String getTickSize() {
      return tickSize;
   }

   @JsonProperty ("tickSize")
   public void setTickSize(String tickSize) {
      this.tickSize = tickSize;
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
