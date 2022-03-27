package org.avanza4java.HTTP.Responses.Company;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "homePage",
        "name"
})
public class FundCompany {

   @JsonProperty ("homePage")
   private String homePage;
   @JsonProperty ("name")
   private String name;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("homePage")
   public String getHomePage() {
      return homePage;
   }

   @JsonProperty ("homePage")
   public void setHomePage(String homePage) {
      this.homePage = homePage;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
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
