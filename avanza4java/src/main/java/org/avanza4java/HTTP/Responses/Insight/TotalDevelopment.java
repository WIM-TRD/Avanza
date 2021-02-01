package org.avanza4java.HTTP.Responses.Insight;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "currentValue",
        "startValue",
        "totalChange"
})
public class TotalDevelopment {

   @JsonProperty("currentValue")
   private String currentValue;
   @JsonProperty("startValue")
   private String startValue;
   @JsonProperty("totalChange")
   private String totalChange;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("currentValue")
   public String getCurrentValue() {
      return currentValue;
   }

   @JsonProperty("currentValue")
   public void setCurrentValue(String currentValue) {
      this.currentValue = currentValue;
   }

   @JsonProperty("startValue")
   public String getStartValue() {
      return startValue;
   }

   @JsonProperty("startValue")
   public void setStartValue(String startValue) {
      this.startValue = startValue;
   }

   @JsonProperty("totalChange")
   public String getTotalChange() {
      return totalChange;
   }

   @JsonProperty("totalChange")
   public void setTotalChange(String totalChange) {
      this.totalChange = totalChange;
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

