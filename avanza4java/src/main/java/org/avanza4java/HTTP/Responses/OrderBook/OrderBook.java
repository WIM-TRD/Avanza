package org.avanza4java.HTTP.Responses.OrderBook;

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
        "change",
        "changePercentOneYear",
        "changePercentPeriod",
        "changePercentThreeMonths",
        "currency",
        "exchangeRate",
        "flagCode",
        "highestPrice",
        "id",
        "instrumentType",
        "lastPrice",
        "lastPriceUpdated",
        "lastUpdated",
        "lowestPrice",
        "managementFee",
        "minMonthlySavingAmount",
        "name",
        "prospectus",
        "positionVolume",
        "rating",
        "risk",
        "tickerSymbol",
        "totalValueTraded",
        "totalVolumeTraded",
        "tradable",
        "tradingUnit",
        "type",
        "volumeFactor"
})
public class OrderBook {

   @JsonProperty ("changePercentOneYear")
   private String changePercentOneYear;
   @JsonProperty ("changePercentPeriod")
   private String changePercentPeriod;
   @JsonProperty ("changePercentThreeMonths")
   private String changePercentThreeMonths;
   @JsonProperty ("currency")
   private String currency;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("instrumentType")
   private String instrumentType;
   @JsonProperty ("lastUpdated")
   private String lastUpdated;
   @JsonProperty ("managementFee")
   private String managementFee;
   @JsonProperty ("minMonthlySavingAmount")
   private String minMonthlySavingAmount;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("prospectus")
   private String prospectus;
   @JsonProperty ("rating")
   private String rating;
   @JsonProperty ("risk")
   private String risk;
   @JsonProperty ("tradable")
   private String tradable;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("change")
   private String change;
   @JsonProperty ("changePercent")
   private String changePercent;
   @JsonProperty ("exchangeRate")
   private String exchangeRate;
   @JsonProperty ("flagCode")
   private String flagCode;
   @JsonProperty ("highestPrice")
   private String highestPrice;
   @JsonProperty ("lastPrice")
   private String lastPrice;
   @JsonProperty ("lastPriceUpdated")
   private String lastPriceUpdated;
   @JsonProperty ("lowestPrice")
   private String lowestPrice;
   @JsonProperty ("positionVolume")
   private String positionVolume;
   @JsonProperty ("tickerSymbol")
   private String tickerSymbol;
   @JsonProperty ("totalValueTraded")
   private String totalValueTraded;
   @JsonProperty ("totalVolumeTraded")
   private String totalVolumeTraded;
   @JsonProperty ("tradingUnit")
   private String tradingUnit;
   @JsonProperty ("type")
   private String type;
   @JsonProperty ("volumeFactor")
   private String volumeFactor;

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

   @JsonProperty ("exchangeRate")
   public String getExchangeRate() {
      return exchangeRate;
   }

   @JsonProperty ("exchangeRate")
   public void setExchangeRate(String exchangeRate) {
      this.exchangeRate = exchangeRate;
   }

   @JsonProperty ("flagCode")
   public String getFlagCode() {
      return flagCode;
   }

   @JsonProperty ("flagCode")
   public void setFlagCode(String flagCode) {
      this.flagCode = flagCode;
   }

   @JsonProperty ("highestPrice")
   public String getHighestPrice() {
      return highestPrice;
   }

   @JsonProperty ("highestPrice")
   public void setHighestPrice(String highestPrice) {
      this.highestPrice = highestPrice;
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

   @JsonProperty ("lowestPrice")
   public String getLowestPrice() {
      return lowestPrice;
   }

   @JsonProperty ("lowestPrice")
   public void setLowestPrice(String lowestPrice) {
      this.lowestPrice = lowestPrice;
   }

   @JsonProperty ("positionVolume")
   public String getPositionVolume() {
      return positionVolume;
   }

   @JsonProperty ("positionVolume")
   public void setPositionVolume(String positionVolume) {
      this.positionVolume = positionVolume;
   }

   @JsonProperty ("tickerSymbol")
   public String getTickerSymbol() {
      return tickerSymbol;
   }

   @JsonProperty ("tickerSymbol")
   public void setTickerSymbol(String tickerSymbol) {
      this.tickerSymbol = tickerSymbol;
   }

   @JsonProperty ("totalValueTraded")
   public String getTotalValueTraded() {
      return totalValueTraded;
   }

   @JsonProperty ("totalValueTraded")
   public void setTotalValueTraded(String totalValueTraded) {
      this.totalValueTraded = totalValueTraded;
   }

   @JsonProperty ("totalVolumeTraded")
   public String getTotalVolumeTraded() {
      return totalVolumeTraded;
   }

   @JsonProperty ("totalVolumeTraded")
   public void setTotalVolumeTraded(String totalVolumeTraded) {
      this.totalVolumeTraded = totalVolumeTraded;
   }

   @JsonProperty ("tradingUnit")
   public String getTradingUnit() {
      return tradingUnit;
   }

   @JsonProperty ("tradingUnit")
   public void setTradingUnit(String tradingUnit) {
      this.tradingUnit = tradingUnit;
   }

   @JsonProperty ("type")
   public String getType() {
      return type;
   }

   @JsonProperty ("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty ("volumeFactor")
   public String getVolumeFactor() {
      return volumeFactor;
   }

   @JsonProperty ("volumeFactor")
   public void setVolumeFactor(String volumeFactor) {
      this.volumeFactor = volumeFactor;
   }

   @JsonProperty ("changePercentOneYear")
   public String getChangePercentOneYear() {
      return changePercentOneYear;
   }

   @JsonProperty ("changePercentOneYear")
   public void setChangePercentOneYear(String changePercentOneYear) {
      this.changePercentOneYear = changePercentOneYear;
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

   @JsonProperty ("id")
   public String getId() {
      return id;
   }

   @JsonProperty ("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty ("instrumentType")
   public String getInstrumentType() {
      return instrumentType;
   }

   @JsonProperty ("instrumentType")
   public void setInstrumentType(String instrumentType) {
      this.instrumentType = instrumentType;
   }

   @JsonProperty ("lastUpdated")
   public String getLastUpdated() {
      return lastUpdated;
   }

   @JsonProperty ("lastUpdated")
   public void setLastUpdated(String lastUpdated) {
      this.lastUpdated = lastUpdated;
   }

   @JsonProperty ("managementFee")
   public String getManagementFee() {
      return managementFee;
   }

   @JsonProperty ("managementFee")
   public void setManagementFee(String managementFee) {
      this.managementFee = managementFee;
   }

   @JsonProperty ("minMonthlySavingAmount")
   public String getMinMonthlySavingAmount() {
      return minMonthlySavingAmount;
   }

   @JsonProperty ("minMonthlySavingAmount")
   public void setMinMonthlySavingAmount(String minMonthlySavingAmount) {
      this.minMonthlySavingAmount = minMonthlySavingAmount;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("prospectus")
   public String getProspectus() {
      return prospectus;
   }

   @JsonProperty ("prospectus")
   public void setProspectus(String prospectus) {
      this.prospectus = prospectus;
   }

   @JsonProperty ("rating")
   public String getRating() {
      return rating;
   }

   @JsonProperty ("rating")
   public void setRating(String rating) {
      this.rating = rating;
   }

   @JsonProperty ("risk")
   public String getRisk() {
      return risk;
   }

   @JsonProperty ("risk")
   public void setRisk(String risk) {
      this.risk = risk;
   }

   @JsonProperty ("tradable")
   public String getTradable() {
      return tradable;
   }

   @JsonProperty ("tradable")
   public void setTradable(String tradable) {
      this.tradable = tradable;
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


