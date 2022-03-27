package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Transaction;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "otherTransactionsGroups",
        "total"
})
public class OtherTransactions {

   @JsonProperty ("otherTransactionsGroups")
   private List<Object> otherTransactionsGroups = null;
   @JsonProperty ("total")
   private String total;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("otherTransactionsGroups")
   public List<Object> getOtherTransactionsGroups() {
      return otherTransactionsGroups;
   }

   @JsonProperty ("otherTransactionsGroups")
   public void setOtherTransactionsGroups(List<Object> otherTransactionsGroups) {
      this.otherTransactionsGroups = otherTransactionsGroups;
   }

   @JsonProperty ("total")
   public String getTotal() {
      return total;
   }

   @JsonProperty ("total")
   public void setTotal(String total) {
      this.total = total;
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
