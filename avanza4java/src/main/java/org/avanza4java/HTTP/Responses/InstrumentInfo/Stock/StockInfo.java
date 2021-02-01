package org.avanza4java.HTTP.Responses.InstrumentInfo.Stock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.avanza4java.HTTP.Responses.Broker.BrokerTradeSummary;
import org.avanza4java.HTTP.Responses.Company.Company;
import org.avanza4java.HTTP.Responses.Company.CompanyReport;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "annualMeetings",
        "brokerTradeSummary",
        "buyPrice",
        "change",
        "changePercent",
        "company",
        "companyReports",
        "country",
        "currency",
        "dividends",
        "flagCode",
        "hasInvestmentFees",
        "highestPrice",
        "id",
        "isin",
        "keyRatios",
        "lastPrice",
        "lastPriceUpdated",
        "latestTrades",
        "loanFactor",
        "lowestPrice",
        "marketMakerExpected",
        "marketPlace",
        "marketTrades",
        "name",
        "numberOfOwners",
        "numberOfPriceAlerts",
        "orderDepthLevels",
        "orderDepthReceivedTime",
        "positions",
        "positionsTotalValue",
        "priceAtStartOfYear",
        "priceFiveYearsAgo",
        "priceOneMonthAgo",
        "priceOneWeekAgo",
        "priceOneYearAgo",
        "priceSixMonthsAgo",
        "priceThreeMonthsAgo",
        "priceThreeYearsAgo",
        "pushPermitted",
        "quoteUpdated",
        "relatedStocks",
        "sellPrice",
        "shortSellable",
        "superLoan",
        "tickerSymbol",
        "totalValueTraded",
        "totalVolumeTraded",
        "tradable"
})
public class StockInfo {

   @JsonProperty ("annualMeetings")
   private List<AnnualMeeting> annualMeetings = null;
   @JsonProperty ("brokerTradeSummary")
   private BrokerTradeSummary brokerTradeSummary;
   @JsonProperty ("buyPrice")
   private String buyPrice;
   @JsonProperty ("change")
   private String change;
   @JsonProperty ("changePercent")
   private String changePercent;
   @JsonProperty ("company")
   private Company company;
   @JsonProperty ("companyReports")
   private List<CompanyReport> companyReports = null;
   @JsonProperty ("country")
   private String country;
   @JsonProperty ("currency")
   private String currency;
   @JsonProperty ("dividends")
   private List<Dividend> dividends = null;
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
   @JsonProperty ("keyRatios")
   private KeyRatios keyRatios;
   @JsonProperty ("lastPrice")
   private String lastPrice;
   @JsonProperty ("lastPriceUpdated")
   private String lastPriceUpdated;
   @JsonProperty ("latestTrades")
   private List<Object> latestTrades = null;
   @JsonProperty ("loanFactor")
   private String loanFactor;
   @JsonProperty ("lowestPrice")
   private String lowestPrice;
   @JsonProperty ("marketMakerExpected")
   private String marketMakerExpected;
   @JsonProperty ("marketPlace")
   private String marketPlace;
   @JsonProperty ("marketTrades")
   private String marketTrades;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("numberOfOwners")
   private String numberOfOwners;
   @JsonProperty ("numberOfPriceAlerts")
   private String numberOfPriceAlerts;
   @JsonProperty ("orderDepthLevels")
   private List<OrderDepthLevel> orderDepthLevels = null;
   @JsonProperty ("orderDepthReceivedTime")
   private String orderDepthReceivedTime;
   @JsonProperty ("positions")
   private List<Object> positions = null;
   @JsonProperty ("positionsTotalValue")
   private String positionsTotalValue;
   @JsonProperty ("priceAtStartOfYear")
   private String priceAtStartOfYear;
   @JsonProperty ("priceFiveYearsAgo")
   private String priceFiveYearsAgo;
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
   @JsonProperty ("priceThreeYearsAgo")
   private String priceThreeYearsAgo;
   @JsonProperty ("pushPermitted")
   private String pushPermitted;
   @JsonProperty ("quoteUpdated")
   private String quoteUpdated;
   @JsonProperty ("relatedStocks")
   private List<RelatedStock> relatedStocks = null;
   @JsonProperty ("sellPrice")
   private String sellPrice;
   @JsonProperty ("shortSellable")
   private String shortSellable;
   @JsonProperty ("superLoan")
   private String superLoan;
   @JsonProperty ("tickerSymbol")
   private String tickerSymbol;
   @JsonProperty ("totalValueTraded")
   private String totalValueTraded;
   @JsonProperty ("totalVolumeTraded")
   private String totalVolumeTraded;
   @JsonProperty ("tradable")
   private String tradable;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("annualMeetings")
   public List<AnnualMeeting> getAnnualMeetings() {
      return annualMeetings;
   }

   @JsonProperty ("annualMeetings")
   public void setAnnualMeetings(List<AnnualMeeting> annualMeetings) {
      this.annualMeetings = annualMeetings;
   }

   @JsonProperty ("brokerTradeSummary")
   public BrokerTradeSummary getBrokerTradeSummary() {
      return brokerTradeSummary;
   }

   @JsonProperty ("brokerTradeSummary")
   public void setBrokerTradeSummary(BrokerTradeSummary brokerTradeSummary) {
      this.brokerTradeSummary = brokerTradeSummary;
   }

   @JsonProperty ("buyPrice")
   public String getBuyPrice() {
      return buyPrice;
   }

   @JsonProperty ("buyPrice")
   public void setBuyPrice(String buyPrice) {
      this.buyPrice = buyPrice;
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

   @JsonProperty ("company")
   public Company getCompany() {
      return company;
   }

   @JsonProperty ("company")
   public void setCompany(Company company) {
      this.company = company;
   }

   @JsonProperty ("companyReports")
   public List<CompanyReport> getCompanyReports() {
      return companyReports;
   }

   @JsonProperty ("companyReports")
   public void setCompanyReports(List<CompanyReport> companyReports) {
      this.companyReports = companyReports;
   }

   @JsonProperty ("country")
   public String getCountry() {
      return country;
   }

   @JsonProperty ("country")
   public void setCountry(String country) {
      this.country = country;
   }

   @JsonProperty ("currency")
   public String getCurrency() {
      return currency;
   }

   @JsonProperty ("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty ("dividends")
   public List<Dividend> getDividends() {
      return dividends;
   }

   @JsonProperty ("dividends")
   public void setDividends(List<Dividend> dividends) {
      this.dividends = dividends;
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

   @JsonProperty ("keyRatios")
   public KeyRatios getKeyRatios() {
      return keyRatios;
   }

   @JsonProperty ("keyRatios")
   public void setKeyRatios(KeyRatios keyRatios) {
      this.keyRatios = keyRatios;
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

   @JsonProperty ("latestTrades")
   public List<Object> getLatestTrades() {
      return latestTrades;
   }

   @JsonProperty ("latestTrades")
   public void setLatestTrades(List<Object> latestTrades) {
      this.latestTrades = latestTrades;
   }

   @JsonProperty ("loanFactor")
   public String getLoanFactor() {
      return loanFactor;
   }

   @JsonProperty ("loanFactor")
   public void setLoanFactor(String loanFactor) {
      this.loanFactor = loanFactor;
   }

   @JsonProperty ("lowestPrice")
   public String getLowestPrice() {
      return lowestPrice;
   }

   @JsonProperty ("lowestPrice")
   public void setLowestPrice(String lowestPrice) {
      this.lowestPrice = lowestPrice;
   }

   @JsonProperty ("marketMakerExpected")
   public String getMarketMakerExpected() {
      return marketMakerExpected;
   }

   @JsonProperty ("marketMakerExpected")
   public void setMarketMakerExpected(String marketMakerExpected) {
      this.marketMakerExpected = marketMakerExpected;
   }

   @JsonProperty ("marketPlace")
   public String getMarketPlace() {
      return marketPlace;
   }

   @JsonProperty ("marketPlace")
   public void setMarketPlace(String marketPlace) {
      this.marketPlace = marketPlace;
   }

   @JsonProperty ("marketTrades")
   public String getMarketTrades() {
      return marketTrades;
   }

   @JsonProperty ("marketTrades")
   public void setMarketTrades(String marketTrades) {
      this.marketTrades = marketTrades;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("numberOfOwners")
   public String getNumberOfOwners() {
      return numberOfOwners;
   }

   @JsonProperty ("numberOfOwners")
   public void setNumberOfOwners(String numberOfOwners) {
      this.numberOfOwners = numberOfOwners;
   }

   @JsonProperty ("numberOfPriceAlerts")
   public String getNumberOfPriceAlerts() {
      return numberOfPriceAlerts;
   }

   @JsonProperty ("numberOfPriceAlerts")
   public void setNumberOfPriceAlerts(String numberOfPriceAlerts) {
      this.numberOfPriceAlerts = numberOfPriceAlerts;
   }

   @JsonProperty ("orderDepthLevels")
   public List<OrderDepthLevel> getOrderDepthLevels() {
      return orderDepthLevels;
   }

   @JsonProperty ("orderDepthLevels")
   public void setOrderDepthLevels(List<OrderDepthLevel> orderDepthLevels) {
      this.orderDepthLevels = orderDepthLevels;
   }

   @JsonProperty ("orderDepthReceivedTime")
   public String getOrderDepthReceivedTime() {
      return orderDepthReceivedTime;
   }

   @JsonProperty ("orderDepthReceivedTime")
   public void setOrderDepthReceivedTime(String orderDepthReceivedTime) {
      this.orderDepthReceivedTime = orderDepthReceivedTime;
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

   @JsonProperty ("priceFiveYearsAgo")
   public String getPriceFiveYearsAgo() {
      return priceFiveYearsAgo;
   }

   @JsonProperty ("priceFiveYearsAgo")
   public void setPriceFiveYearsAgo(String priceFiveYearsAgo) {
      this.priceFiveYearsAgo = priceFiveYearsAgo;
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

   @JsonProperty ("priceThreeYearsAgo")
   public String getPriceThreeYearsAgo() {
      return priceThreeYearsAgo;
   }

   @JsonProperty ("priceThreeYearsAgo")
   public void setPriceThreeYearsAgo(String priceThreeYearsAgo) {
      this.priceThreeYearsAgo = priceThreeYearsAgo;
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

   @JsonProperty ("relatedStocks")
   public List<RelatedStock> getRelatedStocks() {
      return relatedStocks;
   }

   @JsonProperty ("relatedStocks")
   public void setRelatedStocks(List<RelatedStock> relatedStocks) {
      this.relatedStocks = relatedStocks;
   }

   @JsonProperty ("sellPrice")
   public String getSellPrice() {
      return sellPrice;
   }

   @JsonProperty ("sellPrice")
   public void setSellPrice(String sellPrice) {
      this.sellPrice = sellPrice;
   }

   @JsonProperty ("shortSellable")
   public String getShortSellable() {
      return shortSellable;
   }

   @JsonProperty ("shortSellable")
   public void setShortSellable(String shortSellable) {
      this.shortSellable = shortSellable;
   }

   @JsonProperty ("superLoan")
   public String getSuperLoan() {
      return superLoan;
   }

   @JsonProperty ("superLoan")
   public void setSuperLoan(String superLoan) {
      this.superLoan = superLoan;
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

   @JsonAnyGetter
   public Map<String, Object> getAdditionalProperties() {
      return this.additionalProperties;
   }

   @JsonAnySetter
   public void setAdditionalProperty(String name, Object value) {
      this.additionalProperties.put(name, value);
   }

}
