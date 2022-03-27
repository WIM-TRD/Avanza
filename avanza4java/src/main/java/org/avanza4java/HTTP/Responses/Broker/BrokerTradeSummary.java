package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Broker;

import com.fasterxml.jackson.annotation.*;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Orders.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "items",
        "orderbookId"
})
public class BrokerTradeSummary {

   @JsonProperty ("items")
   private List<Item> items = null;
   @JsonProperty ("orderbookId")
   private String orderbookId;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("items")
   public List<Item> getItems() {
      return items;
   }

   @JsonProperty ("items")
   public void setItems(List<Item> items) {
      this.items = items;
   }

   @JsonProperty ("orderbookId")
   public String getOrderbookId() {
      return orderbookId;
   }

   @JsonProperty ("orderbookId")
   public void setOrderbookId(String orderbookId) {
      this.orderbookId = orderbookId;
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