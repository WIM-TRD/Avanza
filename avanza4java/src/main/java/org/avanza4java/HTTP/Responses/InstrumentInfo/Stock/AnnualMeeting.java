package org.avanza4java.HTTP.Responses.InstrumentInfo.Stock;

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
        "eventDate",
        "extra"
})
public class AnnualMeeting {

   @JsonProperty("eventDate")
   private String eventDate;
   @JsonProperty("extra")
   private String extra;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("eventDate")
   public String getEventDate() {
      return eventDate;
   }

   @JsonProperty("eventDate")
   public void setEventDate(String eventDate) {
      this.eventDate = eventDate;
   }

   @JsonProperty("extra")
   public String getExtra() {
      return extra;
   }

   @JsonProperty("extra")
   public void setExtra(String extra) {
      this.extra = extra;
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


