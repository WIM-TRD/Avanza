package org.avanza4java.HTTP.Responses.InstrumentInfo.Warrant;

import com.fasterxml.jackson.annotation.*;
import org.avanza4java.HTTP.Responses.OrderBook.UnderlyingOrderbook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "callIndicator",
        "change",
        "changePercent",
        "currency",
        "direction",
        "endDate",
        "finalTerms",
        "flagCode",
        "hasInvestmentFees",
        "highestPrice",
        "id",
        "isin",
        "issuerName",
        "lastPrice",
        "lastPriceUpdated",
        "lowestPrice",
        "marketPlace",
        "name",
        "numberOfPriceAlerts",
        "parity",
        "positions",
        "positionsTotalValue",
        "priceAtStartOfYear",
        "priceOneMonthAgo",
        "priceOneWeekAgo",
        "priceOneYearAgo",
        "priceSixMonthsAgo",
        "priceThreeMonthsAgo",
        "priipDocumentUrl",
        "pushPermitted",
        "quoteUpdated",
        "strikePrice",
        "tickerSymbol",
        "totalValueTraded",
        "totalVolumeTraded",
        "tradable",
        "underlyingCurrency",
        "underlyingOrderbook",
        "warrantType"
})
public class WarrantInfo {

   @JsonProperty ("callIndicator")
   private String callIndicator;
   @JsonProperty ("change")
   private String change;
   @JsonProperty ("changePercent")
   private String changePercent;
   @JsonProperty ("currency")
   private String currency;
   @JsonProperty ("direction")
   private String direction;
   @JsonProperty ("endDate")
   private String endDate;
   @JsonProperty ("finalTerms")
   private String finalTerms;
   @JsonProperty ("flagCode")
   private String flagCode;
   @JsonProperty ("hasInvestmentFees")
   private String hasInvestmentFees;
   @JsonProperty ("highestPrice")
   private String highestPrice;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("isin")
   private String isin;
   @JsonProperty ("issuerName")
   private String issuerName;
   @JsonProperty ("lastPrice")
   private String lastPrice;
   @JsonProperty ("lastPriceUpdated")
   private String lastPriceUpdated;
   @JsonProperty ("lowestPrice")
   private String lowestPrice;
   @JsonProperty ("marketPlace")
   private String marketPlace;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("numberOfPriceAlerts")
   private String numberOfPriceAlerts;
   @JsonProperty ("parity")
   private String parity;
   @JsonProperty ("positions")
   private List<Object> positions = null;
   @JsonProperty ("positionsTotalValue")
   private String positionsTotalValue;
   @JsonProperty ("priceAtStartOfYear")
   private String priceAtStartOfYear;
   @JsonProperty ("priceOneMonthAgo")
   private String priceOneMonthAgo;
   @JsonProperty ("priceOneWeekAgo")
   private String priceOneWeekAgo;
   @JsonProperty ("priceOneYearAgo")
   private String priceOneYearAgo;
   @JsonProperty ("priceSixMonthsAgo")
   private String priceSixMonthsAgo;
   @JsonProperty ("priceThreeMonthsAgo")
   private String priceThreeMonthsAgo;
   @JsonProperty ("priipDocumentUrl")
   private String priipDocumentUrl;
   @JsonProperty ("pushPermitted")
   private String pushPermitted;
   @JsonProperty ("quoteUpdated")
   private String quoteUpdated;
   @JsonProperty ("strikePrice")
   private String strikePrice;
   @JsonProperty ("tickerSymbol")
   private String tickerSymbol;
   @JsonProperty ("totalValueTraded")
   private String totalValueTraded;
   @JsonProperty ("totalVolumeTraded")
   private String totalVolumeTraded;
   @JsonProperty ("tradable")
   private String tradable;
   @JsonProperty ("underlyingCurrency")
   private String underlyingCurrency;
   @JsonProperty ("underlyingOrderbook")
   private UnderlyingOrderbook underlyingOrderbook;
   @JsonProperty ("warrantType")
   private String warrantType;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("callIndicator")
   public String getCallIndicator() {
      return callIndicator;
   }

   @JsonProperty ("callIndicator")
   public void setCallIndicator(String callIndicator) {
      this.callIndicator = callIndicator;
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

   @JsonProperty ("currency")
   public String getCurrency() {
      return currency;
   }

   @JsonProperty ("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty ("direction")
   public String getDirection() {
      return direction;
   }

   @JsonProperty ("direction")
   public void setDirection(String direction) {
      this.direction = direction;
   }

   @JsonProperty ("endDate")
   public String getEndDate() {
      return endDate;
   }

   @JsonProperty ("endDate")
   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   @JsonProperty ("finalTerms")
   public String getFinalTerms() {
      return finalTerms;
   }

   @JsonProperty ("finalTerms")
   public void setFinalTerms(String finalTerms) {
      this.finalTerms = finalTerms;
   }

   @JsonProperty ("flagCode")
   public String getFlagCode() {
      return flagCode;
   }

   @JsonProperty ("flagCode")
   public void setFlagCode(String flagCode) {
      this.flagCode = flagCode;
   }

   @JsonProperty ("hasInvestmentFees")
   public String getHasInvestmentFees() {
      return hasInvestmentFees;
   }

   @JsonProperty ("hasInvestmentFees")
   public void setHasInvestmentFees(String hasInvestmentFees) {
      this.hasInvestmentFees = hasInvestmentFees;
   }

   @JsonProperty ("highestPrice")
   public String getHighestPrice() {
      return highestPrice;
   }

   @JsonProperty ("highestPrice")
   public void setHighestPrice(String highestPrice) {
      this.highestPrice = highestPrice;
   }

   @JsonProperty ("id")
   public String getId() {
      return id;
   }

   @JsonProperty ("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty ("isin")
   public String getIsin() {
      return isin;
   }

   @JsonProperty ("isin")
   public void setIsin(String isin) {
      this.isin = isin;
   }

   @JsonProperty ("issuerName")
   public String getIssuerName() {
      return issuerName;
   }

   @JsonProperty ("issuerName")
   public void setIssuerName(String issuerName) {
      this.issuerName = issuerName;
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

   @JsonProperty ("marketPlace")
   public String getMarketPlace() {
      return marketPlace;
   }

   @JsonProperty ("marketPlace")
   public void setMarketPlace(String marketPlace) {
      this.marketPlace = marketPlace;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("numberOfPriceAlerts")
   public String getNumberOfPriceAlerts() {
      return numberOfPriceAlerts;
   }

   @JsonProperty ("numberOfPriceAlerts")
   public void setNumberOfPriceAlerts(String numberOfPriceAlerts) {
      this.numberOfPriceAlerts = numberOfPriceAlerts;
   }

   @JsonProperty ("parity")
   public String getParity() {
      return parity;
   }

   @JsonProperty ("parity")
   public void setParity(String parity) {
      this.parity = parity;
   }

   @JsonProperty ("positions")
   public List<Object> getPositions() {
      return positions;
   }

   @JsonProperty ("positions")
   public void setPositions(List<Object> positions) {
      this.positions = positions;
   }

   @JsonProperty ("positionsTotalValue")
   public String getPositionsTotalValue() {
      return positionsTotalValue;
   }

   @JsonProperty ("positionsTotalValue")
   public void setPositionsTotalValue(String positionsTotalValue) {
      this.positionsTotalValue = positionsTotalValue;
   }

   @JsonProperty ("priceAtStartOfYear")
   public String getPriceAtStartOfYear() {
      return priceAtStartOfYear;
   }

   @JsonProperty ("priceAtStartOfYear")
   public void setPriceAtStartOfYear(String priceAtStartOfYear) {
      this.priceAtStartOfYear = priceAtStartOfYear;
   }

   @JsonProperty ("priceOneMonthAgo")
   public String getPriceOneMonthAgo() {
      return priceOneMonthAgo;
   }

   @JsonProperty ("priceOneMonthAgo")
   public void setPriceOneMonthAgo(String priceOneMonthAgo) {
      this.priceOneMonthAgo = priceOneMonthAgo;
   }

   @JsonProperty ("priceOneWeekAgo")
   public String getPriceOneWeekAgo() {
      return priceOneWeekAgo;
   }

   @JsonProperty ("priceOneWeekAgo")
   public void setPriceOneWeekAgo(String priceOneWeekAgo) {
      this.priceOneWeekAgo = priceOneWeekAgo;
   }

   @JsonProperty ("priceOneYearAgo")
   public String getPriceOneYearAgo() {
      return priceOneYearAgo;
   }

   @JsonProperty ("priceOneYearAgo")
   public void setPriceOneYearAgo(String priceOneYearAgo) {
      this.priceOneYearAgo = priceOneYearAgo;
   }

   @JsonProperty ("priceSixMonthsAgo")
   public String getPriceSixMonthsAgo() {
      return priceSixMonthsAgo;
   }

   @JsonProperty ("priceSixMonthsAgo")
   public void setPriceSixMonthsAgo(String priceSixMonthsAgo) {
      this.priceSixMonthsAgo = priceSixMonthsAgo;
   }

   @JsonProperty ("priceThreeMonthsAgo")
   public String getPriceThreeMonthsAgo() {
      return priceThreeMonthsAgo;
   }

   @JsonProperty ("priceThreeMonthsAgo")
   public void setPriceThreeMonthsAgo(String priceThreeMonthsAgo) {
      this.priceThreeMonthsAgo = priceThreeMonthsAgo;
   }

   @JsonProperty ("priipDocumentUrl")
   public String getPriipDocumentUrl() {
      return priipDocumentUrl;
   }

   @JsonProperty ("priipDocumentUrl")
   public void setPriipDocumentUrl(String priipDocumentUrl) {
      this.priipDocumentUrl = priipDocumentUrl;
   }

   @JsonProperty ("pushPermitted")
   public String getPushPermitted() {
      return pushPermitted;
   }

   @JsonProperty ("pushPermitted")
   public void setPushPermitted(String pushPermitted) {
      this.pushPermitted = pushPermitted;
   }

   @JsonProperty ("quoteUpdated")
   public String getQuoteUpdated() {
      return quoteUpdated;
   }

   @JsonProperty ("quoteUpdated")
   public void setQuoteUpdated(String quoteUpdated) {
      this.quoteUpdated = quoteUpdated;
   }

   @JsonProperty ("strikePrice")
   public String getStrikePrice() {
      return strikePrice;
   }

   @JsonProperty ("strikePrice")
   public void setStrikePrice(String strikePrice) {
      this.strikePrice = strikePrice;
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

   @JsonProperty ("tradable")
   public String getTradable() {
      return tradable;
   }

   @JsonProperty ("tradable")
   public void setTradable(String tradable) {
      this.tradable = tradable;
   }

   @JsonProperty ("underlyingCurrency")
   public String getUnderlyingCurrency() {
      return underlyingCurrency;
   }

   @JsonProperty ("underlyingCurrency")
   public void setUnderlyingCurrency(String underlyingCurrency) {
      this.underlyingCurrency = underlyingCurrency;
   }

   @JsonProperty ("underlyingOrderbook")
   public UnderlyingOrderbook getUnderlyingOrderbook() {
      return underlyingOrderbook;
   }

   @JsonProperty ("underlyingOrderbook")
   public void setUnderlyingOrderbook(UnderlyingOrderbook underlyingOrderbook) {
      this.underlyingOrderbook = underlyingOrderbook;
   }

   @JsonProperty ("warrantType")
   public String getWarrantType() {
      return warrantType;
   }

   @JsonProperty ("warrantType")
   public void setWarrantType(String warrantType) {
      this.warrantType = warrantType;
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
