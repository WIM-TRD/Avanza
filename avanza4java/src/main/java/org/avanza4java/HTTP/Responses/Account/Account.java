package org.avanza4java.HTTP.Responses.Account;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "accountId",
        "accountPartlyOwned",
        "accountType",
        "active",
        "attorney",
        "buyingPower",
        "depositable",
        "id",
        "interestRate",
        "name",
        "ownCapital",
        "performance",
        "performancePercent",
        "totalBalance",
        "totalBalanceDue",
        "totalProfit",
        "totalProfitPercent",
        "tradable",
        "type"
})
public class Account {

   @JsonProperty ("accountId")
   private String accountId;
   @JsonProperty ("accountPartlyOwned")
   private String accountPartlyOwned;
   @JsonProperty ("accountType")
   private String accountType;
   @JsonProperty ("active")
   private String active;
   @JsonProperty ("attorney")
   private String attorney;
   @JsonProperty ("buyingPower")
   private String buyingPower;
   @JsonProperty ("depositable")
   private String depositable;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("interestRate")
   private String interestRate;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("ownCapital")
   private String ownCapital;
   @JsonProperty ("performance")
   private String performance;
   @JsonProperty ("performancePercent")
   private String performancePercent;
   @JsonProperty ("totalBalance")
   private String totalBalance;
   @JsonProperty ("totalBalanceDue")
   private String totalBalanceDue;
   @JsonProperty ("totalProfit")
   private String totalProfit;
   @JsonProperty ("totalProfitPercent")
   private String totalProfitPercent;
   @JsonProperty ("tradable")
   private String tradable;
   @JsonProperty ("type")
   private String type;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("accountId")
   public String getAccountId() {
      return accountId;
   }

   @JsonProperty ("accountId")
   public void setAccountId(String accountId) {
      this.accountId = accountId;
   }

   @JsonProperty ("accountPartlyOwned")
   public String getAccountPartlyOwned() {
      return accountPartlyOwned;
   }

   @JsonProperty ("accountPartlyOwned")
   public void setAccountPartlyOwned(String accountPartlyOwned) {
      this.accountPartlyOwned = accountPartlyOwned;
   }

   @JsonProperty ("accountType")
   public String getAccountType() {
      return accountType;
   }

   @JsonProperty ("accountType")
   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   @JsonProperty ("active")
   public String getActive() {
      return active;
   }

   @JsonProperty ("active")
   public void setActive(String active) {
      this.active = active;
   }

   @JsonProperty ("attorney")
   public String getAttorney() {
      return attorney;
   }

   @JsonProperty ("attorney")
   public void setAttorney(String attorney) {
      this.attorney = attorney;
   }

   @JsonProperty ("buyingPower")
   public String getBuyingPower() {
      return buyingPower;
   }

   @JsonProperty ("buyingPower")
   public void setBuyingPower(String buyingPower) {
      this.buyingPower = buyingPower;
   }

   @JsonProperty ("depositable")
   public String getDepositable() {
      return depositable;
   }

   @JsonProperty ("depositable")
   public void setDepositable(String depositable) {
      this.depositable = depositable;
   }

   @JsonProperty ("id")
   public String getId() {
      return id;
   }

   @JsonProperty ("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty ("interestRate")
   public String getInterestRate() {
      return interestRate;
   }

   @JsonProperty ("interestRate")
   public void setInterestRate(String interestRate) {
      this.interestRate = interestRate;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("ownCapital")
   public String getOwnCapital() {
      return ownCapital;
   }

   @JsonProperty ("ownCapital")
   public void setOwnCapital(String ownCapital) {
      this.ownCapital = ownCapital;
   }

   @JsonProperty ("performance")
   public String getPerformance() {
      return performance;
   }

   @JsonProperty ("performance")
   public void setPerformance(String performance) {
      this.performance = performance;
   }

   @JsonProperty ("performancePercent")
   public String getPerformancePercent() {
      return performancePercent;
   }

   @JsonProperty ("performancePercent")
   public void setPerformancePercent(String performancePercent) {
      this.performancePercent = performancePercent;
   }

   @JsonProperty ("totalBalance")
   public String getTotalBalance() {
      return totalBalance;
   }

   @JsonProperty ("totalBalance")
   public void setTotalBalance(String totalBalance) {
      this.totalBalance = totalBalance;
   }

   @JsonProperty ("totalBalanceDue")
   public String getTotalBalanceDue() {
      return totalBalanceDue;
   }

   @JsonProperty ("totalBalanceDue")
   public void setTotalBalanceDue(String totalBalanceDue) {
      this.totalBalanceDue = totalBalanceDue;
   }

   @JsonProperty ("totalProfit")
   public String getTotalProfit() {
      return totalProfit;
   }

   @JsonProperty ("totalProfit")
   public void setTotalProfit(String totalProfit) {
      this.totalProfit = totalProfit;
   }

   @JsonProperty ("totalProfitPercent")
   public String getTotalProfitPercent() {
      return totalProfitPercent;
   }

   @JsonProperty ("totalProfitPercent")
   public void setTotalProfitPercent(String totalProfitPercent) {
      this.totalProfitPercent = totalProfitPercent;
   }

   @JsonProperty ("tradable")
   public String getTradable() {
      return tradable;
   }

   @JsonProperty ("tradable")
   public void setTradable(String tradable) {
      this.tradable = tradable;
   }

   @JsonProperty ("type")
   public String getType() {
      return type;
   }

   @JsonProperty ("type")
   public void setType(String type) {
      this.type = type;
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