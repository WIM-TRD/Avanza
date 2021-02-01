package org.avanza4java.HTTP.Responses.Charts;

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
        "allTransactions",
        "autogiro",
        "deposit",
        "development",
        "dividends",
        "month",
        "total",
        "withdrawal",
        "year"
})
public class ChartDatum {
   @JsonProperty ("allTransactions")
   private String allTransactions;
   @JsonProperty ("autogiro")
   private String autogiro;
   @JsonProperty ("deposit")
   private String deposit;
   @JsonProperty ("development")
   private String development;
   @JsonProperty ("dividends")
   private String dividends;
   @JsonProperty ("month")
   private String month;
   @JsonProperty ("total")
   private String total;
   @JsonProperty ("withdrawal")
   private String withdrawal;
   @JsonProperty ("year")
   private String year;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("allTransactions")
   public String getAllTransactions() {
      return allTransactions;
   }

   @JsonProperty ("allTransactions")
   public void setAllTransactions(String allTransactions) {
      this.allTransactions = allTransactions;
   }

   @JsonProperty ("autogiro")
   public String getAutogiro() {
      return autogiro;
   }

   @JsonProperty ("autogiro")
   public void setAutogiro(String autogiro) {
      this.autogiro = autogiro;
   }

   @JsonProperty ("deposit")
   public String getDeposit() {
      return deposit;
   }

   @JsonProperty ("deposit")
   public void setDeposit(String deposit) {
      this.deposit = deposit;
   }

   @JsonProperty ("development")
   public String getDevelopment() {
      return development;
   }

   @JsonProperty ("development")
   public void setDevelopment(String development) {
      this.development = development;
   }

   @JsonProperty ("dividends")
   public String getDividends() {
      return dividends;
   }

   @JsonProperty ("dividends")
   public void setDividends(String dividends) {
      this.dividends = dividends;
   }

   @JsonProperty ("month")
   public String getMonth() {
      return month;
   }

   @JsonProperty ("month")
   public void setMonth(String month) {
      this.month = month;
   }

   @JsonProperty ("total")
   public String getTotal() {
      return total;
   }

   @JsonProperty ("total")
   public void setTotal(String total) {
      this.total = total;
   }

   @JsonProperty ("withdrawal")
   public String getWithdrawal() {
      return withdrawal;
   }

   @JsonProperty ("withdrawal")
   public void setWithdrawal(String withdrawal) {
      this.withdrawal = withdrawal;
   }

   @JsonProperty ("year")
   public String getYear() {
      return year;
   }

   @JsonProperty ("year")
   public void setYear(String year) {
      this.year = year;
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