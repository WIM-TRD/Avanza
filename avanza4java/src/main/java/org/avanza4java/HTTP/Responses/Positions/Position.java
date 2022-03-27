package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Positions;

import com.fasterxml.jackson.annotation.*;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Insight.Link;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Outcome.Outcome;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "accountId",
        "accountName",
        "accountType",
        "acquiredValue",
        "averageAcquiredPrice",
        "change",
        "changePercent",
        "changePercentPeriod",
        "changePercentThreeMonths",
        "currency",
        "depositable",
        "lastPrice",
        "lastPriceUpdated",
        "name",
        "orderbookId",
        "profit",
        "profitPercent",
        "tradable",
        "value",
        "volume",
        "currentPosition",
        "endValue",
        "isin",
        "link",
        "outcome",
        "shortName",
        "startValue"
})
public class Position {

   @JsonProperty ("accountId")
   private String accountId;
   @JsonProperty ("accountName")
   private String accountName;
   @JsonProperty ("accountType")
   private String accountType;
   @JsonProperty ("acquiredValue")
   private String acquiredValue;
   @JsonProperty ("averageAcquiredPrice")
   private String averageAcquiredPrice;
   @JsonProperty ("change")
   private String change;
   @JsonProperty ("changePercent")
   private String changePercent;
   @JsonProperty ("changePercentPeriod")
   private String changePercentPeriod;
   @JsonProperty ("changePercentThreeMonths")
   private String changePercentThreeMonths;
   @JsonProperty ("currency")
   private String currency;
   @JsonProperty ("depositable")
   private String depositable;
   @JsonProperty ("lastPrice")
   private String lastPrice;
   @JsonProperty ("lastPriceUpdated")
   private String lastPriceUpdated;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("orderbookId")
   private String orderbookId;
   @JsonProperty ("profit")
   private String profit;
   @JsonProperty ("profitPercent")
   private String profitPercent;
   @JsonProperty ("tradable")
   private String tradable;
   @JsonProperty ("value")
   private String value;
   @JsonProperty ("volume")
   private String volume;
   @JsonProperty ("currentPosition")
   private String currentPosition;
   @JsonProperty ("endValue")
   private String endValue;
   @JsonProperty ("isin")
   private String isin;
   @JsonProperty ("link")
   private Link link;
   @JsonProperty ("outcome")
   private Outcome outcome;
   @JsonProperty ("shortName")
   private String shortName;
   @JsonProperty ("startValue")
   private String startValue;
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

   @JsonProperty ("accountName")
   public String getAccountName() {
      return accountName;
   }

   @JsonProperty ("accountName")
   public void setAccountName(String accountName) {
      this.accountName = accountName;
   }

   @JsonProperty ("accountType")
   public String getAccountType() {
      return accountType;
   }

   @JsonProperty ("accountType")
   public void setAccountType(String accountType) {
      this.accountType = accountType;
   }

   @JsonProperty ("acquiredValue")
   public String getAcquiredValue() {
      return acquiredValue;
   }

   @JsonProperty ("acquiredValue")
   public void setAcquiredValue(String acquiredValue) {
      this.acquiredValue = acquiredValue;
   }

   @JsonProperty ("averageAcquiredPrice")
   public String getAverageAcquiredPrice() {
      return averageAcquiredPrice;
   }

   @JsonProperty ("averageAcquiredPrice")
   public void setAverageAcquiredPrice(String averageAcquiredPrice) {
      this.averageAcquiredPrice = averageAcquiredPrice;
   }

   @JsonProperty ("change")
   public String getChange() {
      return change;
   }

   @JsonProperty ("change")
   public void setChange(String change) {
      this.change = change;
   }

   @JsonProperty ("changePercent")
   public String getChangePercent() {
      return changePercent;
   }

   @JsonProperty ("changePercent")
   public void setChangePercent(String changePercent) {
      this.changePercent = changePercent;
   }

   @JsonProperty ("changePercentPeriod")
   public String getChangePercentPeriod() {
      return changePercentPeriod;
   }

   @JsonProperty ("changePercentPeriod")
   public void setChangePercentPeriod(String changePercentPeriod) {
      this.changePercentPeriod = changePercentPeriod;
   }

   @JsonProperty ("changePercentThreeMonths")
   public String getChangePercentThreeMonths() {
      return changePercentThreeMonths;
   }

   @JsonProperty ("changePercentThreeMonths")
   public void setChangePercentThreeMonths(String changePercentThreeMonths) {
      this.changePercentThreeMonths = changePercentThreeMonths;
   }

   @JsonProperty ("currency")
   public String getCurrency() {
      return currency;
   }

   @JsonProperty ("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty ("depositable")
   public String getDepositable() {
      return depositable;
   }

   @JsonProperty ("depositable")
   public void setDepositable(String depositable) {
      this.depositable = depositable;
   }

   @JsonProperty ("lastPrice")
   public String getLastPrice() {
      return lastPrice;
   }

   @JsonProperty ("lastPrice")
   public void setLastPrice(String lastPrice) {
      this.lastPrice = lastPrice;
   }

   @JsonProperty ("lastPriceUpdated")
   public String getLastPriceUpdated() {
      return lastPriceUpdated;
   }

   @JsonProperty ("lastPriceUpdated")
   public void setLastPriceUpdated(String lastPriceUpdated) {
      this.lastPriceUpdated = lastPriceUpdated;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("orderbookId")
   public String getOrderbookId() {
      return orderbookId;
   }

   @JsonProperty ("orderbookId")
   public void setOrderbookId(String orderbookId) {
      this.orderbookId = orderbookId;
   }

   @JsonProperty ("profit")
   public String getProfit() {
      return profit;
   }

   @JsonProperty ("profit")
   public void setProfit(String profit) {
      this.profit = profit;
   }

   @JsonProperty ("profitPercent")
   public String getProfitPercent() {
      return profitPercent;
   }

   @JsonProperty ("profitPercent")
   public void setProfitPercent(String profitPercent) {
      this.profitPercent = profitPercent;
   }

   @JsonProperty ("tradable")
   public String getTradable() {
      return tradable;
   }

   @JsonProperty ("tradable")
   public void setTradable(String tradable) {
      this.tradable = tradable;
   }

   @JsonProperty ("value")
   public String getValue() {
      return value;
   }

   @JsonProperty ("value")
   public void setValue(String value) {
      this.value = value;
   }

   @JsonProperty ("volume")
   public String getVolume() {
      return volume;
   }

   @JsonProperty ("volume")
   public void setVolume(String volume) {
      this.volume = volume;
   }

   @JsonProperty ("currentPosition")
   public String getCurrentPosition() {
      return currentPosition;
   }

   @JsonProperty ("currentPosition")
   public void setCurrentPosition(String currentPosition) {
      this.currentPosition = currentPosition;
   }

   @JsonProperty ("endValue")
   public String getEndValue() {
      return endValue;
   }

   @JsonProperty ("endValue")
   public void setEndValue(String endValue) {
      this.endValue = endValue;
   }

   @JsonProperty ("isin")
   public String getIsin() {
      return isin;
   }

   @JsonProperty ("isin")
   public void setIsin(String isin) {
      this.isin = isin;
   }

   @JsonProperty ("link")
   public Link getLink() {
      return link;
   }

   @JsonProperty ("link")
   public void setLink(Link link) {
      this.link = link;
   }

   @JsonProperty ("outcome")
   public Outcome getOutcome() {
      return outcome;
   }

   @JsonProperty ("outcome")
   public void setOutcome(Outcome outcome) {
      this.outcome = outcome;
   }

   @JsonProperty ("shortName")
   public String getShortName() {
      return shortName;
   }

   @JsonProperty ("shortName")
   public void setShortName(String shortName) {
      this.shortName = shortName;
   }

   @JsonProperty ("startValue")
   public String getStartValue() {
      return startValue;
   }

   @JsonProperty ("startValue")
   public void setStartValue(String startValue) {
      this.startValue = startValue;
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
