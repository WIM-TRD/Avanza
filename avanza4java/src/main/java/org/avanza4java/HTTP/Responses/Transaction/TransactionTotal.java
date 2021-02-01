package org.avanza4java.HTTP.Responses.Transaction;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "count",
        "presentableTransactionType",
        "totalAmount",
        "transactionType"
})
public class TransactionTotal {

   @JsonProperty ("count")
   private String count;
   @JsonProperty ("presentableTransactionType")
   private String presentableTransactionType;
   @JsonProperty ("totalAmount")
   private String totalAmount;
   @JsonProperty ("transactionType")
   private String transactionType;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("count")
   public String getCount() {
      return count;
   }

   @JsonProperty ("count")
   public void setCount(String count) {
      this.count = count;
   }

   @JsonProperty ("presentableTransactionType")
   public String getPresentableTransactionType() {
      return presentableTransactionType;
   }

   @JsonProperty ("presentableTransactionType")
   public void setPresentableTransactionType(String presentableTransactionType) {
      this.presentableTransactionType = presentableTransactionType;
   }

   @JsonProperty ("totalAmount")
   public String getTotalAmount() {
      return totalAmount;
   }

   @JsonProperty ("totalAmount")
   public void setTotalAmount(String totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty ("transactionType")
   public String getTransactionType() {
      return transactionType;
   }

   @JsonProperty ("transactionType")
   public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
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