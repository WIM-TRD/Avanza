package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Outcome;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "development",
        "dividends",
        "total"
})
public class TotalOutcome {

   @JsonProperty ("development")
   private String development;
   @JsonProperty ("dividends")
   private String dividends;
   @JsonProperty ("total")
   private String total;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("development")
   public String getDevelopment() {
      return development;
   }

   @JsonProperty ("development")
   public void setDevelopment(String development) {
      this.development = development;
   }

   @JsonProperty ("dividends")
   public String getDividends() {
      return dividends;
   }

   @JsonProperty ("dividends")
   public void setDividends(String dividends) {
      this.dividends = dividends;
   }

   @JsonProperty ("total")
   public String getTotal() {
      return total;
   }

   @JsonProperty ("total")
   public void setTotal(String total) {
      this.total = total;
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
