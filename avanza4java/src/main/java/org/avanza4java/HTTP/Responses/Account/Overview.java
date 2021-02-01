package org.avanza4java.HTTP.Responses.Account;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "accounts",
        "numberOfDeals",
        "numberOfIntradayTransfers",
        "numberOfOrders",
        "numberOfTransfers",
        "totalBalance",
        "totalBuyingPower",
        "totalOwnCapital",
        "totalPerformance",
        "totalPerformancePercent"
})
public class Overview {

   @JsonProperty ("accounts")
   private List<Account> accounts = null;
   @JsonProperty ("numberOfDeals")
   private String numberOfDeals;
   @JsonProperty ("numberOfIntradayTransfers")
   private String numberOfIntradayTransfers;
   @JsonProperty ("numberOfOrders")
   private String numberOfOrders;
   @JsonProperty ("numberOfTransfers")
   private String numberOfTransfers;
   @JsonProperty ("totalBalance")
   private String totalBalance;
   @JsonProperty ("totalBuyingPower")
   private String totalBuyingPower;
   @JsonProperty ("totalOwnCapital")
   private String totalOwnCapital;
   @JsonProperty ("totalPerformance")
   private String totalPerformance;
   @JsonProperty ("totalPerformancePercent")
   private String totalPerformancePercent;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("accounts")
   public List<Account> getAccounts() {
      return accounts;
   }

   @JsonProperty ("accounts")
   public void setAccounts(List<Account> accounts) {
      this.accounts = accounts;
   }

   @JsonProperty ("numberOfDeals")
   public String getNumberOfDeals() {
      return numberOfDeals;
   }

   @JsonProperty ("numberOfDeals")
   public void setNumberOfDeals(String numberOfDeals) {
      this.numberOfDeals = numberOfDeals;
   }

   @JsonProperty ("numberOfIntradayTransfers")
   public String getNumberOfIntradayTransfers() {
      return numberOfIntradayTransfers;
   }

   @JsonProperty ("numberOfIntradayTransfers")
   public void setNumberOfIntradayTransfers(String numberOfIntradayTransfers) {
      this.numberOfIntradayTransfers = numberOfIntradayTransfers;
   }

   @JsonProperty ("numberOfOrders")
   public String getNumberOfOrders() {
      return numberOfOrders;
   }

   @JsonProperty ("numberOfOrders")
   public void setNumberOfOrders(String numberOfOrders) {
      this.numberOfOrders = numberOfOrders;
   }

   @JsonProperty ("numberOfTransfers")
   public String getNumberOfTransfers() {
      return numberOfTransfers;
   }

   @JsonProperty ("numberOfTransfers")
   public void setNumberOfTransfers(String numberOfTransfers) {
      this.numberOfTransfers = numberOfTransfers;
   }

   @JsonProperty ("totalBalance")
   public String getTotalBalance() {
      return totalBalance;
   }

   @JsonProperty ("totalBalance")
   public void setTotalBalance(String totalBalance) {
      this.totalBalance = totalBalance;
   }

   @JsonProperty ("totalBuyingPower")
   public String getTotalBuyingPower() {
      return totalBuyingPower;
   }

   @JsonProperty ("totalBuyingPower")
   public void setTotalBuyingPower(String totalBuyingPower) {
      this.totalBuyingPower = totalBuyingPower;
   }

   @JsonProperty ("totalOwnCapital")
   public String getTotalOwnCapital() {
      return totalOwnCapital;
   }

   @JsonProperty ("totalOwnCapital")
   public void setTotalOwnCapital(String totalOwnCapital) {
      this.totalOwnCapital = totalOwnCapital;
   }

   @JsonProperty ("totalPerformance")
   public String getTotalPerformance() {
      return totalPerformance;
   }

   @JsonProperty ("totalPerformance")
   public void setTotalPerformance(String totalPerformance) {
      this.totalPerformance = totalPerformance;
   }

   @JsonProperty ("totalPerformancePercent")
   public String getTotalPerformancePercent() {
      return totalPerformancePercent;
   }

   @JsonProperty ("totalPerformancePercent")
   public void setTotalPerformancePercent(String totalPerformancePercent) {
      this.totalPerformancePercent = totalPerformancePercent;
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
