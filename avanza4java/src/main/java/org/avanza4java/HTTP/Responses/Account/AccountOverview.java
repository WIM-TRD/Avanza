package org.avanza4java.HTTP.Responses.Account;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "accountId",
        "accountType",
        "accountTypeName",
        "accruedInterest",
        "allowMonthlySaving",
        "availableSuperLoanAmount",
        "buyingPower",
        "clearingNumber",
        "courtageClass",
        "creditAfterInterest",
        "creditLimit",
        "currencyAccounts",
        "depositable",
        "forwardBalance",
        "instrumentTransferPossible",
        "interestRate",
        "internalTransferPossible",
        "jointlyOwned",
        "numberOfDeals",
        "numberOfIntradayTransfers",
        "numberOfOrders",
        "numberOfTransfers",
        "overMortgaged",
        "overdrawn",
        "ownCapital",
        "performance",
        "performancePercent",
        "performanceSinceOneMonth",
        "performanceSinceOneMonthPercent",
        "performanceSinceOneWeek",
        "performanceSinceOneWeekPercent",
        "performanceSinceOneYear",
        "performanceSinceOneYearPercent",
        "performanceSinceSixMonths",
        "performanceSinceSixMonthsPercent",
        "performanceSinceThreeMonths",
        "performanceSinceThreeMonthsPercent",
        "performanceSinceThreeYears",
        "performanceSinceThreeYearsPercent",
        "reservedAmount",
        "sharpeRatio",
        "standardDeviation",
        "totalBalance",
        "totalCollateralValue",
        "totalPositionsValue",
        "totalProfit",
        "totalProfitPercent",
        "withdrawable"
})
public class AccountOverview {

   @JsonProperty ("accountId")
   private String accountId;
   @JsonProperty ("accountType")
   private String accountType;
   @JsonProperty ("accountTypeName")
   private String accountTypeName;
   @JsonProperty ("accruedInterest")
   private String accruedInterest;
   @JsonProperty ("allowMonthlySaving")
   private String allowMonthlySaving;
   @JsonProperty ("availableSuperLoanAmount")
   private String availableSuperLoanAmount;
   @JsonProperty ("buyingPower")
   private String buyingPower;
   @JsonProperty ("clearingNumber")
   private String clearingNumber;
   @JsonProperty ("courtageClass")
   private String courtageClass;
   @JsonProperty ("creditAfterInterest")
   private String creditAfterInterest;
   @JsonProperty ("creditLimit")
   private String creditLimit;
   @JsonProperty ("currencyAccounts")
   private List<CurrencyAccount> currencyAccounts = null;
   @JsonProperty ("depositable")
   private String depositable;
   @JsonProperty ("forwardBalance")
   private String forwardBalance;
   @JsonProperty ("instrumentTransferPossible")
   private String instrumentTransferPossible;
   @JsonProperty ("interestRate")
   private String interestRate;
   @JsonProperty ("internalTransferPossible")
   private String internalTransferPossible;
   @JsonProperty ("jointlyOwned")
   private String jointlyOwned;
   @JsonProperty ("numberOfDeals")
   private String numberOfDeals;
   @JsonProperty ("numberOfIntradayTransfers")
   private String numberOfIntradayTransfers;
   @JsonProperty ("numberOfOrders")
   private String numberOfOrders;
   @JsonProperty ("numberOfTransfers")
   private String numberOfTransfers;
   @JsonProperty ("overMortgaged")
   private String overMortgaged;
   @JsonProperty ("overdrawn")
   private String overdrawn;
   @JsonProperty ("ownCapital")
   private String ownCapital;
   @JsonProperty ("performance")
   private String performance;
   @JsonProperty ("performancePercent")
   private String performancePercent;
   @JsonProperty ("performanceSinceOneMonth")
   private String performanceSinceOneMonth;
   @JsonProperty ("performanceSinceOneMonthPercent")
   private String performanceSinceOneMonthPercent;
   @JsonProperty ("performanceSinceOneWeek")
   private String performanceSinceOneWeek;
   @JsonProperty ("performanceSinceOneWeekPercent")
   private String performanceSinceOneWeekPercent;
   @JsonProperty ("performanceSinceOneYear")
   private String performanceSinceOneYear;
   @JsonProperty ("performanceSinceOneYearPercent")
   private String performanceSinceOneYearPercent;
   @JsonProperty ("performanceSinceSixMonths")
   private String performanceSinceSixMonths;
   @JsonProperty ("performanceSinceSixMonthsPercent")
   private String performanceSinceSixMonthsPercent;
   @JsonProperty ("performanceSinceThreeMonths")
   private String performanceSinceThreeMonths;
   @JsonProperty ("performanceSinceThreeMonthsPercent")
   private String performanceSinceThreeMonthsPercent;
   @JsonProperty ("performanceSinceThreeYears")
   private String performanceSinceThreeYears;
   @JsonProperty ("performanceSinceThreeYearsPercent")
   private String performanceSinceThreeYearsPercent;
   @JsonProperty ("reservedAmount")
   private String reservedAmount;
   @JsonProperty ("sharpeRatio")
   private String sharpeRatio;
   @JsonProperty ("standardDeviation")
   private String standardDeviation;
   @JsonProperty ("totalBalance")
   private String totalBalance;
   @JsonProperty ("totalCollateralValue")
   private String totalCollateralValue;
   @JsonProperty ("totalPositionsValue")
   private String totalPositionsValue;
   @JsonProperty ("totalProfit")
   private String totalProfit;
   @JsonProperty ("totalProfitPercent")
   private String totalProfitPercent;
   @JsonProperty ("withdrawable")
   private String withdrawable;
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

   @JsonProperty ("accountType")
   public String getAccountType() {
      return accountType;
   }

   @JsonProperty ("accountType")
   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   @JsonProperty ("accountTypeName")
   public String getAccountTypeName() {
      return accountTypeName;
   }

   @JsonProperty ("accountTypeName")
   public void setAccountTypeName(String accountTypeName) {
      this.accountTypeName = accountTypeName;
   }

   @JsonProperty ("accruedInterest")
   public String getAccruedInterest() {
      return accruedInterest;
   }

   @JsonProperty ("accruedInterest")
   public void setAccruedInterest(String accruedInterest) {
      this.accruedInterest = accruedInterest;
   }

   @JsonProperty ("allowMonthlySaving")
   public String getAllowMonthlySaving() {
      return allowMonthlySaving;
   }

   @JsonProperty ("allowMonthlySaving")
   public void setAllowMonthlySaving(String allowMonthlySaving) {
      this.allowMonthlySaving = allowMonthlySaving;
   }

   @JsonProperty ("availableSuperLoanAmount")
   public String getAvailableSuperLoanAmount() {
      return availableSuperLoanAmount;
   }

   @JsonProperty ("availableSuperLoanAmount")
   public void setAvailableSuperLoanAmount(String availableSuperLoanAmount) {
      this.availableSuperLoanAmount = availableSuperLoanAmount;
   }

   @JsonProperty ("buyingPower")
   public String getBuyingPower() {
      return buyingPower;
   }

   @JsonProperty ("buyingPower")
   public void setBuyingPower(String buyingPower) {
      this.buyingPower = buyingPower;
   }

   @JsonProperty ("clearingNumber")
   public String getClearingNumber() {
      return clearingNumber;
   }

   @JsonProperty ("clearingNumber")
   public void setClearingNumber(String clearingNumber) {
      this.clearingNumber = clearingNumber;
   }

   @JsonProperty ("courtageClass")
   public String getCourtageClass() {
      return courtageClass;
   }

   @JsonProperty ("courtageClass")
   public void setCourtageClass(String courtageClass) {
      this.courtageClass = courtageClass;
   }

   @JsonProperty ("creditAfterInterest")
   public String getCreditAfterInterest() {
      return creditAfterInterest;
   }

   @JsonProperty ("creditAfterInterest")
   public void setCreditAfterInterest(String creditAfterInterest) {
      this.creditAfterInterest = creditAfterInterest;
   }

   @JsonProperty ("creditLimit")
   public String getCreditLimit() {
      return creditLimit;
   }

   @JsonProperty ("creditLimit")
   public void setCreditLimit(String creditLimit) {
      this.creditLimit = creditLimit;
   }

   @JsonProperty ("currencyAccounts")
   public List<CurrencyAccount> getCurrencyAccounts() {
      return currencyAccounts;
   }

   @JsonProperty ("currencyAccounts")
   public void setCurrencyAccounts(List<CurrencyAccount> currencyAccounts) {
      this.currencyAccounts = currencyAccounts;
   }

   @JsonProperty ("depositable")
   public String getDepositable() {
      return depositable;
   }

   @JsonProperty ("depositable")
   public void setDepositable(String depositable) {
      this.depositable = depositable;
   }

   @JsonProperty ("forwardBalance")
   public String getForwardBalance() {
      return forwardBalance;
   }

   @JsonProperty ("forwardBalance")
   public void setForwardBalance(String forwardBalance) {
      this.forwardBalance = forwardBalance;
   }

   @JsonProperty ("instrumentTransferPossible")
   public String getInstrumentTransferPossible() {
      return instrumentTransferPossible;
   }

   @JsonProperty ("instrumentTransferPossible")
   public void setInstrumentTransferPossible(String instrumentTransferPossible) {
      this.instrumentTransferPossible = instrumentTransferPossible;
   }

   @JsonProperty ("interestRate")
   public String getInterestRate() {
      return interestRate;
   }

   @JsonProperty ("interestRate")
   public void setInterestRate(String interestRate) {
      this.interestRate = interestRate;
   }

   @JsonProperty ("internalTransferPossible")
   public String getInternalTransferPossible() {
      return internalTransferPossible;
   }

   @JsonProperty ("internalTransferPossible")
   public void setInternalTransferPossible(String internalTransferPossible) {
      this.internalTransferPossible = internalTransferPossible;
   }

   @JsonProperty ("jointlyOwned")
   public String getJointlyOwned() {
      return jointlyOwned;
   }

   @JsonProperty ("jointlyOwned")
   public void setJointlyOwned(String jointlyOwned) {
      this.jointlyOwned = jointlyOwned;
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

   @JsonProperty ("overMortgaged")
   public String getOverMortgaged() {
      return overMortgaged;
   }

   @JsonProperty ("overMortgaged")
   public void setOverMortgaged(String overMortgaged) {
      this.overMortgaged = overMortgaged;
   }

   @JsonProperty ("overdrawn")
   public String getOverdrawn() {
      return overdrawn;
   }

   @JsonProperty ("overdrawn")
   public void setOverdrawn(String overdrawn) {
      this.overdrawn = overdrawn;
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

   @JsonProperty ("performanceSinceOneMonth")
   public String getPerformanceSinceOneMonth() {
      return performanceSinceOneMonth;
   }

   @JsonProperty ("performanceSinceOneMonth")
   public void setPerformanceSinceOneMonth(String performanceSinceOneMonth) {
      this.performanceSinceOneMonth = performanceSinceOneMonth;
   }

   @JsonProperty ("performanceSinceOneMonthPercent")
   public String getPerformanceSinceOneMonthPercent() {
      return performanceSinceOneMonthPercent;
   }

   @JsonProperty ("performanceSinceOneMonthPercent")
   public void setPerformanceSinceOneMonthPercent(String performanceSinceOneMonthPercent) {
      this.performanceSinceOneMonthPercent = performanceSinceOneMonthPercent;
   }

   @JsonProperty ("performanceSinceOneWeek")
   public String getPerformanceSinceOneWeek() {
      return performanceSinceOneWeek;
   }

   @JsonProperty ("performanceSinceOneWeek")
   public void setPerformanceSinceOneWeek(String performanceSinceOneWeek) {
      this.performanceSinceOneWeek = performanceSinceOneWeek;
   }

   @JsonProperty ("performanceSinceOneWeekPercent")
   public String getPerformanceSinceOneWeekPercent() {
      return performanceSinceOneWeekPercent;
   }

   @JsonProperty ("performanceSinceOneWeekPercent")
   public void setPerformanceSinceOneWeekPercent(String performanceSinceOneWeekPercent) {
      this.performanceSinceOneWeekPercent = performanceSinceOneWeekPercent;
   }

   @JsonProperty ("performanceSinceOneYear")
   public String getPerformanceSinceOneYear() {
      return performanceSinceOneYear;
   }

   @JsonProperty ("performanceSinceOneYear")
   public void setPerformanceSinceOneYear(String performanceSinceOneYear) {
      this.performanceSinceOneYear = performanceSinceOneYear;
   }

   @JsonProperty ("performanceSinceOneYearPercent")
   public String getPerformanceSinceOneYearPercent() {
      return performanceSinceOneYearPercent;
   }

   @JsonProperty ("performanceSinceOneYearPercent")
   public void setPerformanceSinceOneYearPercent(String performanceSinceOneYearPercent) {
      this.performanceSinceOneYearPercent = performanceSinceOneYearPercent;
   }

   @JsonProperty ("performanceSinceSixMonths")
   public String getPerformanceSinceSixMonths() {
      return performanceSinceSixMonths;
   }

   @JsonProperty ("performanceSinceSixMonths")
   public void setPerformanceSinceSixMonths(String performanceSinceSixMonths) {
      this.performanceSinceSixMonths = performanceSinceSixMonths;
   }

   @JsonProperty ("performanceSinceSixMonthsPercent")
   public String getPerformanceSinceSixMonthsPercent() {
      return performanceSinceSixMonthsPercent;
   }

   @JsonProperty ("performanceSinceSixMonthsPercent")
   public void setPerformanceSinceSixMonthsPercent(String performanceSinceSixMonthsPercent) {
      this.performanceSinceSixMonthsPercent = performanceSinceSixMonthsPercent;
   }

   @JsonProperty ("performanceSinceThreeMonths")
   public String getPerformanceSinceThreeMonths() {
      return performanceSinceThreeMonths;
   }

   @JsonProperty ("performanceSinceThreeMonths")
   public void setPerformanceSinceThreeMonths(String performanceSinceThreeMonths) {
      this.performanceSinceThreeMonths = performanceSinceThreeMonths;
   }

   @JsonProperty ("performanceSinceThreeMonthsPercent")
   public String getPerformanceSinceThreeMonthsPercent() {
      return performanceSinceThreeMonthsPercent;
   }

   @JsonProperty ("performanceSinceThreeMonthsPercent")
   public void setPerformanceSinceThreeMonthsPercent(String performanceSinceThreeMonthsPercent) {
      this.performanceSinceThreeMonthsPercent = performanceSinceThreeMonthsPercent;
   }

   @JsonProperty ("performanceSinceThreeYears")
   public String getPerformanceSinceThreeYears() {
      return performanceSinceThreeYears;
   }

   @JsonProperty ("performanceSinceThreeYears")
   public void setPerformanceSinceThreeYears(String performanceSinceThreeYears) {
      this.performanceSinceThreeYears = performanceSinceThreeYears;
   }

   @JsonProperty ("performanceSinceThreeYearsPercent")
   public String getPerformanceSinceThreeYearsPercent() {
      return performanceSinceThreeYearsPercent;
   }

   @JsonProperty ("performanceSinceThreeYearsPercent")
   public void setPerformanceSinceThreeYearsPercent(String performanceSinceThreeYearsPercent) {
      this.performanceSinceThreeYearsPercent = performanceSinceThreeYearsPercent;
   }

   @JsonProperty ("reservedAmount")
   public String getReservedAmount() {
      return reservedAmount;
   }

   @JsonProperty ("reservedAmount")
   public void setReservedAmount(String reservedAmount) {
      this.reservedAmount = reservedAmount;
   }

   @JsonProperty ("sharpeRatio")
   public String getSharpeRatio() {
      return sharpeRatio;
   }

   @JsonProperty ("sharpeRatio")
   public void setSharpeRatio(String sharpeRatio) {
      this.sharpeRatio = sharpeRatio;
   }

   @JsonProperty ("standardDeviation")
   public String getStandardDeviation() {
      return standardDeviation;
   }

   @JsonProperty ("standardDeviation")
   public void setStandardDeviation(String standardDeviation) {
      this.standardDeviation = standardDeviation;
   }

   @JsonProperty ("totalBalance")
   public String getTotalBalance() {
      return totalBalance;
   }

   @JsonProperty ("totalBalance")
   public void setTotalBalance(String totalBalance) {
      this.totalBalance = totalBalance;
   }

   @JsonProperty ("totalCollateralValue")
   public String getTotalCollateralValue() {
      return totalCollateralValue;
   }

   @JsonProperty ("totalCollateralValue")
   public void setTotalCollateralValue(String totalCollateralValue) {
      this.totalCollateralValue = totalCollateralValue;
   }

   @JsonProperty ("totalPositionsValue")
   public String getTotalPositionsValue() {
      return totalPositionsValue;
   }

   @JsonProperty ("totalPositionsValue")
   public void setTotalPositionsValue(String totalPositionsValue) {
      this.totalPositionsValue = totalPositionsValue;
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

   @JsonProperty ("withdrawable")
   public String getWithdrawable() {
      return withdrawable;
   }

   @JsonProperty ("withdrawable")
   public void setWithdrawable(String withdrawable) {
      this.withdrawable = withdrawable;
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

