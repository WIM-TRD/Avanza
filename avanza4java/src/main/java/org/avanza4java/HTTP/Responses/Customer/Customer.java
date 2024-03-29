package org.avanza4java.HTTP.Responses.Customer;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "courtageClass",
        "showCourtageClassInfoOnOrderPage"
})
public class Customer {

   @JsonProperty ("courtageClass")
   private String courtageClass;
   @JsonProperty ("showCourtageClassInfoOnOrderPage")
   private String showCourtageClassInfoOnOrderPage;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("courtageClass")
   public String getCourtageClass() {
      return courtageClass;
   }

   @JsonProperty ("courtageClass")
   public void setCourtageClass(String courtageClass) {
      this.courtageClass = courtageClass;
   }

   @JsonProperty ("showCourtageClassInfoOnOrderPage")
   public String getShowCourtageClassInfoOnOrderPage() {
      return showCourtageClassInfoOnOrderPage;
   }

   @JsonProperty ("showCourtageClassInfoOnOrderPage")
   public void setShowCourtageClassInfoOnOrderPage(String showCourtageClassInfoOnOrderPage) {
      this.showCourtageClassInfoOnOrderPage = showCourtageClassInfoOnOrderPage;
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

