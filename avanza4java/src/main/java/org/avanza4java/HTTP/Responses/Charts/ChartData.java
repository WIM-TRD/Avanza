package org.avanza4java.HTTP.Responses.Charts;

import com.fasterxml.jackson.annotation.*;
import org.avanza4java.HTTP.Responses.Account.Account;
import org.avanza4java.HTTP.Responses.Broker.BrokerTradeSummary;
import org.avanza4java.HTTP.Responses.Customer.Customer;
import org.avanza4java.HTTP.Responses.InstrumentInfo.Stock.TickSizeRule;
import org.avanza4java.HTTP.Responses.OrderBook.OrderBook;
import org.avanza4java.HTTP.Responses.Orders.Order;
import org.avanza4java.HTTP.Responses.Series.ComparisonSeries;
import org.avanza4java.HTTP.Responses.Series.DataSeries;
import org.avanza4java.HTTP.Responses.Transaction.HasInvestmentFees;
import org.avanza4java.HTTP.Responses.Transaction.LatestTrade;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "ceiling",
        "change",
        "changePercent",
        "comparisonName",
        "comparisonSeries",
        "dataSeries",
        "floor",
        "max",
        "min",

        "account",
        "brokerTradeSummary",
        "customer",
        "firstTradableDate",
        "hasInstrumentKnowledge",
        "hasInvestmentFees",
        "hasShortSellKnowledge",
        "lastTradableDate",
        "latestTrades",
        "marketMakerExpected",
        "marketTrades",
        "order",
        "orderDepthLevels",
        "orderDepthReceivedTime",
        "orderbook",
        "tickSizeRules",
        "untradableDates"
})
public class ChartData {

   @JsonProperty ("ceiling")
   private String ceiling;
   @JsonProperty ("change")
   private String change;
   @JsonProperty ("changePercent")
   private String changePercent;
   @JsonProperty ("comparisonName")
   private String comparisonName;
   @JsonProperty ("comparisonSeries")
   private List<ComparisonSeries> comparisonSeries = null;
   @JsonProperty ("dataSeries")
   private List<DataSeries> dataSeries = null;
   @JsonProperty ("floor")
   private String floor;
   @JsonProperty ("max")
   private String max;
   @JsonProperty ("min")
   private String min;

   @JsonProperty ("account")
   private Account account;
   @JsonProperty ("brokerTradeSummary")
   private BrokerTradeSummary brokerTradeSummary;
   @JsonProperty ("customer")
   private Customer customer;
   @JsonProperty ("firstTradableDate")
   private String firstTradableDate;
   @JsonProperty ("hasInstrumentKnowledge")
   private String hasInstrumentKnowledge;
   @JsonProperty ("hasInvestmentFees")
   private HasInvestmentFees hasInvestmentFees;
   @JsonProperty ("hasShortSellKnowledge")
   private String hasShortSellKnowledge;
   @JsonProperty ("lastTradableDate")
   private String lastTradableDate;
   @JsonProperty ("latestTrades")
   private List<LatestTrade> latestTrades = null;
   @JsonProperty ("marketMakerExpected")
   private String marketMakerExpected;
   @JsonProperty ("marketTrades")
   private String marketTrades;
   @JsonProperty ("order")
   private Order order;
   @JsonProperty ("orderDepthLevels")
   private List<Object> orderDepthLevels = null;
   @JsonProperty ("orderDepthReceivedTime")
   private String orderDepthReceivedTime;
   @JsonProperty ("orderbook")
   private OrderBook orderbook;
   @JsonProperty ("tickSizeRules")
   private List<TickSizeRule> tickSizeRules = null;
   @JsonProperty ("untradableDates")
   private List<Object> untradableDates = null;

   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("ceiling")
   public String getCeiling() {
      return ceiling;
   }

   @JsonProperty ("ceiling")
   public void setCeiling(String ceiling) {
      this.ceiling = ceiling;
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

   @JsonProperty ("comparisonName")
   public String getComparisonName() {
      return comparisonName;
   }

   @JsonProperty ("comparisonName")
   public void setComparisonName(String comparisonName) {
      this.comparisonName = comparisonName;
   }

   @JsonProperty ("comparisonSeries")
   public List<ComparisonSeries> getComparisonSeries() {
      return comparisonSeries;
   }

   @JsonProperty ("comparisonSeries")
   public void setComparisonSeries(List<ComparisonSeries> comparisonSeries) {
      this.comparisonSeries = comparisonSeries;
   }

   @JsonProperty ("dataSeries")
   public List<DataSeries> getDataSeries() {
      return dataSeries;
   }

   @JsonProperty ("dataSeries")
   public void setDataSeries(List<DataSeries> dataSeries) {
      this.dataSeries = dataSeries;
   }

   @JsonProperty ("floor")
   public String getFloor() {
      return floor;
   }

   @JsonProperty ("floor")
   public void setFloor(String floor) {
      this.floor = floor;
   }

   @JsonProperty ("max")
   public String getMax() {
      return max;
   }

   @JsonProperty ("max")
   public void setMax(String max) {
      this.max = max;
   }

   @JsonProperty ("min")
   public String getMin() {
      return min;
   }

   @JsonProperty ("min")
   public void setMin(String min) {
      this.min = min;
   }

   @JsonProperty ("account")
   public Account getAccount() {
      return account;
   }

   @JsonProperty ("account")
   public void setAccount(Account account) {
      this.account = account;
   }

   @JsonProperty ("brokerTradeSummary")
   public BrokerTradeSummary getBrokerTradeSummary() {
      return brokerTradeSummary;
   }

   @JsonProperty ("brokerTradeSummary")
   public void setBrokerTradeSummary(BrokerTradeSummary brokerTradeSummary) {
      this.brokerTradeSummary = brokerTradeSummary;
   }

   @JsonProperty ("customer")
   public Customer getCustomer() {
      return customer;
   }

   @JsonProperty ("customer")
   public void setCustomer(Customer customer) {
      this.customer = customer;
   }

   @JsonProperty ("firstTradableDate")
   public String getFirstTradableDate() {
      return firstTradableDate;
   }

   @JsonProperty ("firstTradableDate")
   public void setFirstTradableDate(String firstTradableDate) {
      this.firstTradableDate = firstTradableDate;
   }

   @JsonProperty ("hasInstrumentKnowledge")
   public String getHasInstrumentKnowledge() {
      return hasInstrumentKnowledge;
   }

   @JsonProperty ("hasInstrumentKnowledge")
   public void setHasInstrumentKnowledge(String hasInstrumentKnowledge) {
      this.hasInstrumentKnowledge = hasInstrumentKnowledge;
   }

   @JsonProperty ("hasInvestmentFees")
   public HasInvestmentFees getHasInvestmentFees() {
      return hasInvestmentFees;
   }

   @JsonProperty ("hasInvestmentFees")
   public void setHasInvestmentFees(HasInvestmentFees hasInvestmentFees) {
      this.hasInvestmentFees = hasInvestmentFees;
   }

   @JsonProperty ("hasShortSellKnowledge")
   public String getHasShortSellKnowledge() {
      return hasShortSellKnowledge;
   }

   @JsonProperty ("hasShortSellKnowledge")
   public void setHasShortSellKnowledge(String hasShortSellKnowledge) {
      this.hasShortSellKnowledge = hasShortSellKnowledge;
   }

   @JsonProperty ("lastTradableDate")
   public String getLastTradableDate() {
      return lastTradableDate;
   }

   @JsonProperty ("lastTradableDate")
   public void setLastTradableDate(String lastTradableDate) {
      this.lastTradableDate = lastTradableDate;
   }

   @JsonProperty ("latestTrades")
   public List<LatestTrade> getLatestTrades() {
      return latestTrades;
   }

   @JsonProperty ("latestTrades")
   public void setLatestTrades(List<LatestTrade> latestTrades) {
      this.latestTrades = latestTrades;
   }

   @JsonProperty ("marketMakerExpected")
   public String getMarketMakerExpected() {
      return marketMakerExpected;
   }

   @JsonProperty ("marketMakerExpected")
   public void setMarketMakerExpected(String marketMakerExpected) {
      this.marketMakerExpected = marketMakerExpected;
   }

   @JsonProperty ("marketTrades")
   public String getMarketTrades() {
      return marketTrades;
   }

   @JsonProperty ("marketTrades")
   public void setMarketTrades(String marketTrades) {
      this.marketTrades = marketTrades;
   }

   @JsonProperty ("order")
   public Order getOrder() {
      return order;
   }

   @JsonProperty ("order")
   public void setOrder(Order order) {
      this.order = order;
   }

   @JsonProperty ("orderDepthLevels")
   public List<Object> getOrderDepthLevels() {
      return orderDepthLevels;
   }

   @JsonProperty ("orderDepthLevels")
   public void setOrderDepthLevels(List<Object> orderDepthLevels) {
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

   @JsonProperty ("orderbook")
   public OrderBook getOrderbook() {
      return orderbook;
   }

   @JsonProperty ("orderbook")
   public void setOrderbook(OrderBook orderbook) {
      this.orderbook = orderbook;
   }

   @JsonProperty ("tickSizeRules")
   public List<TickSizeRule> getTickSizeRules() {
      return tickSizeRules;
   }

   @JsonProperty ("tickSizeRules")
   public void setTickSizeRules(List<TickSizeRule> tickSizeRules) {
      this.tickSizeRules = tickSizeRules;
   }

   @JsonProperty ("untradableDates")
   public List<Object> getUntradableDates() {
      return untradableDates;
   }

   @JsonProperty ("untradableDates")
   public void setUntradableDates(List<Object> untradableDates) {
      this.untradableDates = untradableDates;
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
