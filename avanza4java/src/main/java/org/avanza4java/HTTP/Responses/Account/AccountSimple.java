package org.avanza4java.HTTP.Responses.Account;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "id",
        "name",
        "type"
})
public class AccountSimple {

   @JsonProperty ("id")
   private String id;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("type")
   private String type;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

   @JsonProperty ("type")
   public String getType() {
      return type;
   }

   @JsonProperty ("type")
   public void setType(String type) {
      this.type = type;
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
