package org.avanza4java.HTTP.Responses.Series;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "timestamp",
        "value"
})
public class ComparisonSeries {

   @JsonProperty ("timestamp")
   private String timestamp;
   @JsonProperty ("value")
   private String value;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("timestamp")
   public String getTimestamp() {
      return timestamp;
   }

   @JsonProperty ("timestamp")
   public void setTimestamp(String timestamp) {
      this.timestamp = timestamp;
   }

   @JsonProperty ("value")
   public String getValue() {
      return value;
   }

   @JsonProperty ("value")
   public void setValue(String value) {
      this.value = value;
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

