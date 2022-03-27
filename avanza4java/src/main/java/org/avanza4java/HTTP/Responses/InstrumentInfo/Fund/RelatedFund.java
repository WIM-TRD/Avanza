package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.Fund;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "changeSinceOneYear",
        "id",
        "name"
})
public class RelatedFund {

   @JsonProperty ("changeSinceOneYear")
   private String changeSinceOneYear;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("name")
   private String name;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("changeSinceOneYear")
   public String getChangeSinceOneYear() {
      return changeSinceOneYear;
   }

   @JsonProperty ("changeSinceOneYear")
   public void setChangeSinceOneYear(String changeSinceOneYear) {
      this.changeSinceOneYear = changeSinceOneYear;
   }

   @JsonProperty ("id")
   public String getId() {
      return id;
   }

   @JsonProperty ("id")
   public void setId(String id) {
      this.id = id;
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
