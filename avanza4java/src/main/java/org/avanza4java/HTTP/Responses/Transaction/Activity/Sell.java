package org.avanza4java.HTTP.Responses.Transaction.Activity;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "percent",
        "price",
        "volume"
})
public class Sell {

   @JsonProperty ("percent")
   private String percent;
   @JsonProperty ("price")
   private String price;
   @JsonProperty ("volume")
   private String volume;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("percent")
   public String getPercent() {
      return percent;
   }

   @JsonProperty ("percent")
   public void setPercent(String percent) {
      this.percent = percent;
   }

   @JsonProperty ("price")
   public String getPrice() {
      return price;
   }

   @JsonProperty ("price")
   public void setPrice(String price) {
      this.price = price;
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



