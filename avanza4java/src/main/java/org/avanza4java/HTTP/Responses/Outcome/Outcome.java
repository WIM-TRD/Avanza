package org.avanza4java.HTTP.Responses.Outcome;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.avanza4java.HTTP.Responses.Transaction.Transaction;
import org.avanza4java.HTTP.Responses.Transaction.TransactionTotal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "balanceDevelopments",
        "development",
        "developmentPartOfTotalDevelopmentInPercent",
        "dividends",
        "dividendsPartOfTotalDevelopmentInPercent",
        "stake",
        "total",
        "totalBuyAmount",
        "totalDevelopmentInPercent",
        "totalOtherAmount",
        "totalSellAmount",
        "totalTurnover",
        "transactionTotals",
        "transactions"
})
public class Outcome {

   @JsonProperty("balanceDevelopments")
   private List<Object> balanceDevelopments = null;
   @JsonProperty("development")
   private String development;
   @JsonProperty("developmentPartOfTotalDevelopmentInPercent")
   private String developmentPartOfTotalDevelopmentInPercent;
   @JsonProperty("dividends")
   private String dividends;
   @JsonProperty("dividendsPartOfTotalDevelopmentInPercent")
   private String dividendsPartOfTotalDevelopmentInPercent;
   @JsonProperty("stake")
   private String stake;
   @JsonProperty("total")
   private String total;
   @JsonProperty("totalBuyAmount")
   private String totalBuyAmount;
   @JsonProperty("totalDevelopmentInPercent")
   private String totalDevelopmentInPercent;
   @JsonProperty("totalOtherAmount")
   private String totalOtherAmount;
   @JsonProperty("totalSellAmount")
   private String totalSellAmount;
   @JsonProperty("totalTurnover")
   private String totalTurnover;
   @JsonProperty("transactionTotals")
   private List<TransactionTotal> transactionTotals = null;
   @JsonProperty("transactions")
   private List<Transaction> transactions = null;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("balanceDevelopments")
   public List<Object> getBalanceDevelopments() {
      return balanceDevelopments;
   }

   @JsonProperty("balanceDevelopments")
   public void setBalanceDevelopments(List<Object> balanceDevelopments) {
      this.balanceDevelopments = balanceDevelopments;
   }

   @JsonProperty("development")
   public String getDevelopment() {
      return development;
   }

   @JsonProperty("development")
   public void setDevelopment(String development) {
      this.development = development;
   }

   @JsonProperty("developmentPartOfTotalDevelopmentInPercent")
   public String getDevelopmentPartOfTotalDevelopmentInPercent() {
      return developmentPartOfTotalDevelopmentInPercent;
   }

   @JsonProperty("developmentPartOfTotalDevelopmentInPercent")
   public void setDevelopmentPartOfTotalDevelopmentInPercent(String developmentPartOfTotalDevelopmentInPercent) {
      this.developmentPartOfTotalDevelopmentInPercent = developmentPartOfTotalDevelopmentInPercent;
   }

   @JsonProperty("dividends")
   public String getDividends() {
      return dividends;
   }

   @JsonProperty("dividends")
   public void setDividends(String dividends) {
      this.dividends = dividends;
   }

   @JsonProperty("dividendsPartOfTotalDevelopmentInPercent")
   public String getDividendsPartOfTotalDevelopmentInPercent() {
      return dividendsPartOfTotalDevelopmentInPercent;
   }

   @JsonProperty("dividendsPartOfTotalDevelopmentInPercent")
   public void setDividendsPartOfTotalDevelopmentInPercent(String dividendsPartOfTotalDevelopmentInPercent) {
      this.dividendsPartOfTotalDevelopmentInPercent = dividendsPartOfTotalDevelopmentInPercent;
   }

   @JsonProperty("stake")
   public String getStake() {
      return stake;
   }

   @JsonProperty("stake")
   public void setStake(String stake) {
      this.stake = stake;
   }

   @JsonProperty("total")
   public String getTotal() {
      return total;
   }

   @JsonProperty("total")
   public void setTotal(String total) {
      this.total = total;
   }

   @JsonProperty("totalBuyAmount")
   public String getTotalBuyAmount() {
      return totalBuyAmount;
   }

   @JsonProperty("totalBuyAmount")
   public void setTotalBuyAmount(String totalBuyAmount) {
      this.totalBuyAmount = totalBuyAmount;
   }

   @JsonProperty("totalDevelopmentInPercent")
   public String getTotalDevelopmentInPercent() {
      return totalDevelopmentInPercent;
   }

   @JsonProperty("totalDevelopmentInPercent")
   public void setTotalDevelopmentInPercent(String totalDevelopmentInPercent) {
      this.totalDevelopmentInPercent = totalDevelopmentInPercent;
   }

   @JsonProperty("totalOtherAmount")
   public String getTotalOtherAmount() {
      return totalOtherAmount;
   }

   @JsonProperty("totalOtherAmount")
   public void setTotalOtherAmount(String totalOtherAmount) {
      this.totalOtherAmount = totalOtherAmount;
   }

   @JsonProperty("totalSellAmount")
   public String getTotalSellAmount() {
      return totalSellAmount;
   }

   @JsonProperty("totalSellAmount")
   public void setTotalSellAmount(String totalSellAmount) {
      this.totalSellAmount = totalSellAmount;
   }

   @JsonProperty("totalTurnover")
   public String getTotalTurnover() {
      return totalTurnover;
   }

   @JsonProperty("totalTurnover")
   public void setTotalTurnover(String totalTurnover) {
      this.totalTurnover = totalTurnover;
   }

   @JsonProperty("transactionTotals")
   public List<TransactionTotal> getTransactionTotals() {
      return transactionTotals;
   }

   @JsonProperty("transactionTotals")
   public void setTransactionTotals(List<TransactionTotal> transactionTotals) {
      this.transactionTotals = transactionTotals;
   }

   @JsonProperty("transactions")
   public List<Transaction> getTransactions() {
      return transactions;
   }

   @JsonProperty("transactions")
   public void setTransactions(List<Transaction> transactions) {
      this.transactions = transactions;
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
