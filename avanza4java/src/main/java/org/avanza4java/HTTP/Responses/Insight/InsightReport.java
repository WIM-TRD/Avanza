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
        "developmentResponse"
})
public class InsightReport {

   @JsonProperty("developmentResponse")
   private DevelopmentResponse developmentResponse;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("developmentResponse")
   public DevelopmentResponse getDevelopmentResponse() {
      return developmentResponse;
   }

   @JsonProperty("developmentResponse")
   public void setDevelopmentResponse(DevelopmentResponse developmentResponse) {
      this.developmentResponse = developmentResponse;
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
