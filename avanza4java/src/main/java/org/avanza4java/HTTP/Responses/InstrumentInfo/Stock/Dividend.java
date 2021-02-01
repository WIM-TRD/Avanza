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
        "amountPerShare",
        "currency",
        "exDate",
        "paymentDate"
})
public class Dividend {

   @JsonProperty("amountPerShare")
   private String amountPerShare;
   @JsonProperty("currency")
   private String currency;
   @JsonProperty("exDate")
   private String exDate;
   @JsonProperty("paymentDate")
   private String paymentDate;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("amountPerShare")
   public String getAmountPerShare() {
      return amountPerShare;
   }

   @JsonProperty("amountPerShare")
   public void setAmountPerShare(String amountPerShare) {
      this.amountPerShare = amountPerShare;
   }

   @JsonProperty("currency")
   public String getCurrency() {
      return currency;
   }

   @JsonProperty("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty("exDate")
   public String getExDate() {
      return exDate;
   }

   @JsonProperty("exDate")
   public void setExDate(String exDate) {
      this.exDate = exDate;
   }

   @JsonProperty("paymentDate")
   public String getPaymentDate() {
      return paymentDate;
   }

   @JsonProperty("paymentDate")
   public void setPaymentDate(String paymentDate) {
      this.paymentDate = paymentDate;
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
