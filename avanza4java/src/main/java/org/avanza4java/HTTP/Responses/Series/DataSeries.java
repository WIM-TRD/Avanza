package org.avanza4java.HTTP.Responses.Series;
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
        "timestamp",
        "value"
})
public class DataSeries {

   @JsonProperty("timestamp")
   private String timestamp;
   @JsonProperty("value")
   private String value;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("timestamp")
   public String getTimestamp() {
      return timestamp;
   }

   @JsonProperty("timestamp")
   public void setTimestamp(String timestamp) {
      this.timestamp = timestamp;
   }

   @JsonProperty("value")
   public String getValue() {
      return value;
   }

   @JsonProperty("value")
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
