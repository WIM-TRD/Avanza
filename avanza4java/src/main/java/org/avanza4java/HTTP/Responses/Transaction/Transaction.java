package org.avanza4java.HTTP.Responses.Transaction;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "accountName",
        "amount",
        "accountTypeName",
        "date",
        "isin",
        "price",
        "type",
        "volume",
        "description",
        "transactionType",
        "transactionTypeName"
})
public class Transaction {

   @JsonProperty ("accountName")
   private String accountName;
   @JsonProperty ("accountTypeName")
   private String accountTypeName;
   @JsonProperty ("amount")
   private String amount;
   @JsonProperty ("date")
   private String date;
   @JsonProperty ("isin")
   private String isin;
   @JsonProperty ("price")
   private String price;
   @JsonProperty ("type")
   private String type;
   @JsonProperty ("volume")
   private String volume;
   @JsonProperty ("description")
   private String description;
   @JsonProperty ("transactionType")
   private String transactionType;
   @JsonProperty ("transactionTypeName")
   private String transactionTypeName;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("accountName")
   public String getAccountName() {
      return accountName;
   }

   @JsonProperty ("accountName")
   public void setAccountName(String accountName) {
      this.accountName = accountName;
   }

   @JsonProperty ("accountTypeName")
   public String getAccountTypeName() {
      return accountTypeName;
   }

   @JsonProperty ("accountTypeName")
   public void setAccountTypeName(String accountTypeName) {
      this.accountTypeName = accountTypeName;
   }

   @JsonProperty ("amount")
   public String getAmount() {
      return amount;
   }

   @JsonProperty ("amount")
   public void setAmount(String amount) {
      this.amount = amount;
   }

   @JsonProperty ("date")
   public String getDate() {
      return date;
   }

   @JsonProperty ("date")
   public void setDate(String date) {
      this.date = date;
   }

   @JsonProperty ("isin")
   public String getIsin() {
      return isin;
   }

   @JsonProperty ("isin")
   public void setIsin(String isin) {
      this.isin = isin;
   }

   @JsonProperty ("price")
   public String getPrice() {
      return price;
   }

   @JsonProperty ("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty ("type")
   public String getType() {
      return type;
   }

   @JsonProperty ("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty ("volume")
   public String getVolume() {
      return volume;
   }

   @JsonProperty ("volume")
   public void setVolume(String volume) {
      this.volume = volume;
   }

   @JsonProperty ("transactionType")
   public String getTransactionType() {
      return transactionType;
   }

   @JsonProperty ("transactionType")
   public void setTransactionType(String transactionType) {
      this.transactionType = transactionType;
   }

   @JsonProperty ("transactionTypeName")
   public String getTransactionTypeName() {
      return transactionTypeName;
   }

   @JsonProperty ("transactionTypeName")
   public void setTransactionTypeName(String transactionTypeName) {
      this.transactionTypeName = transactionTypeName;
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