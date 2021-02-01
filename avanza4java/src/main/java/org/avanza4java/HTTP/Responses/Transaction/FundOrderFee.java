package org.avanza4java.HTTP.Responses.Transaction;

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
        "rate",
        "sum"
})
public class FundOrderFee {

   @JsonProperty("rate")
   private String rate;
   @JsonProperty("sum")
   private String sum;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("rate")
   public String getRate() {
      return rate;
   }

   @JsonProperty("rate")
   public void setRate(String rate) {
      this.rate = rate;
   }

   @JsonProperty("sum")
   public String getSum() {
      return sum;
   }

   @JsonProperty("sum")
   public void setSum(String sum) {
      this.sum = sum;
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
