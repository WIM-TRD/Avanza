package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.Index;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "change",
        "changePercent",
        "currency",
        "description",
        "flagCode",
        "highestPrice",
        "id",
        "lastPrice",
        "lastPriceUpdated",
        "lowestPrice",
        "name",
        "numberOfPriceAlerts",
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
        "title"
})
public class IndexInfo {

   @JsonProperty ("change")
   private String change;
   @JsonProperty ("changePercent")
   private String changePercent;
   @JsonProperty ("currency")
   private String currency;
   @JsonProperty ("description")
   private String description;
   @JsonProperty ("flagCode")
   private String flagCode;
   @JsonProperty ("highestPrice")
   private String highestPrice;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("lastPrice")
   private String lastPrice;
   @JsonProperty ("lastPriceUpdated")
   private String lastPriceUpdated;
   @JsonProperty ("lowestPrice")
   private String lowestPrice;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("numberOfPriceAlerts")
   private String numberOfPriceAlerts;
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
   @JsonProperty ("title")
   private String title;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

   @JsonProperty ("description")
   public String getDescription() {
      return description;
   }

   @JsonProperty ("description")
   public void setDescription(String description) {
      this.description = description;
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

   @JsonProperty ("id")
   public String getId() {
      return id;
   }

   @JsonProperty ("id")
   public void setId(String id) {
      this.id = id;
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

   @JsonProperty ("title")
   public String getTitle() {
      return title;
   }

   @JsonProperty ("title")
   public void setTitle(String title) {
      this.title = title;
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
