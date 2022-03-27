package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Transaction;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "month",
        "total",
        "totalAutogiro",
        "totalDeposits",
        "totalWithdrawals",
        "transactions",
        "year",
        "yearMonth"
})
public class AllTransaction {

   @JsonProperty ("month")
   private String month;
   @JsonProperty ("total")
   private String total;
   @JsonProperty ("totalAutogiro")
   private String totalAutogiro;
   @JsonProperty ("totalDeposits")
   private String totalDeposits;
   @JsonProperty ("totalWithdrawals")
   private String totalWithdrawals;
   @JsonProperty ("transactions")
   private List<Transaction> transactions = null;
   @JsonProperty ("year")
   private String year;
   @JsonProperty ("yearMonth")
   private String yearMonth;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

   @JsonProperty ("totalAutogiro")
   public String getTotalAutogiro() {
      return totalAutogiro;
   }

   @JsonProperty ("totalAutogiro")
   public void setTotalAutogiro(String totalAutogiro) {
      this.totalAutogiro = totalAutogiro;
   }

   @JsonProperty ("totalDeposits")
   public String getTotalDeposits() {
      return totalDeposits;
   }

   @JsonProperty ("totalDeposits")
   public void setTotalDeposits(String totalDeposits) {
      this.totalDeposits = totalDeposits;
   }

   @JsonProperty ("totalWithdrawals")
   public String getTotalWithdrawals() {
      return totalWithdrawals;
   }

   @JsonProperty ("totalWithdrawals")
   public void setTotalWithdrawals(String totalWithdrawals) {
      this.totalWithdrawals = totalWithdrawals;
   }

   @JsonProperty ("transactions")
   public List<Transaction> getTransactions() {
      return transactions;
   }

   @JsonProperty ("transactions")
   public void setTransactions(List<Transaction> transactions) {
      this.transactions = transactions;
   }

   @JsonProperty ("year")
   public String getYear() {
      return year;
   }

   @JsonProperty ("year")
   public void setYear(String year) {
      this.year = year;
   }

   @JsonProperty ("yearMonth")
   public String getYearMonth() {
      return yearMonth;
   }

   @JsonProperty ("yearMonth")
   public void setYearMonth(String yearMonth) {
      this.yearMonth = yearMonth;
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
