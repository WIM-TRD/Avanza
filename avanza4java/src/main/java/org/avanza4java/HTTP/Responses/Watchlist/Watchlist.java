package org.avanza4java.HTTP.Responses.Watchlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "editable",
        "id",
        "name",
        "orderbooks"
})
public class  Watchlist{

   @JsonProperty("editable")
   private String editable;
   @JsonProperty("id")
   private String id;
   @JsonProperty("name")
   private String name;
   @JsonProperty("orderbooks")
   private List<String> orderbooks;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("editable")
   public String getEditable() {
      return editable;
   }

   @JsonProperty("editable")
   public void setEditable(String editable) {
      this.editable = editable;
   }

   @JsonProperty("id")
   public String getId() {
      return id;
   }

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("name")
   public String getName() {
      return name;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("orderbooks")
   public List<String> getOrderbooks() {
      return orderbooks;
   }

   @JsonProperty("orderbooks")
   public void setOrderbooks(String orderbook) {
      this.orderbooks.add(orderbook);
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
