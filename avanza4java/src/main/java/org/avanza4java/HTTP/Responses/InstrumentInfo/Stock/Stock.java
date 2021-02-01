package org.avanza4java.HTTP.Responses.InstrumentInfo.Stock;

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
        "name",
        "totalNumberOfShares"
})
public class Stock {

   @JsonProperty ("name")
   private String name;
   @JsonProperty ("totalNumberOfShares")
   private String totalNumberOfShares;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("totalNumberOfShares")
   public String getTotalNumberOfShares() {
      return totalNumberOfShares;
   }

   @JsonProperty ("totalNumberOfShares")
   public void setTotalNumberOfShares(String totalNumberOfShares) {
      this.totalNumberOfShares = totalNumberOfShares;
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
