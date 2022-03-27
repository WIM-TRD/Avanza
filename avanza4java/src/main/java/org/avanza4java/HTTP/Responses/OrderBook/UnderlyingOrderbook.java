package org.avanza4java.HTTP.Responses.OrderBook;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "change",
        "changePercent",
        "currency",
        "flagCode",
        "highestPrice",
        "id",
        "lastPrice",
        "lastPriceUpdated",
        "lowestPrice",
        "name",
        "tickerSymbol",
        "totalVolumeTraded",
        "type",
        "updated"
})
public class UnderlyingOrderbook {

   @JsonProperty ("change")
   private String change;
   @JsonProperty ("changePercent")
   private String changePercent;
   @JsonProperty ("currency")
   private String currency;
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
   @JsonProperty ("tickerSymbol")
   private String tickerSymbol;
   @JsonProperty ("totalVolumeTraded")
   private String totalVolumeTraded;
   @JsonProperty ("type")
   private String type;
   @JsonProperty ("updated")
   private String updated;
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

   @JsonProperty ("tickerSymbol")
   public String getTickerSymbol() {
      return tickerSymbol;
   }

   @JsonProperty ("tickerSymbol")
   public void setTickerSymbol(String tickerSymbol) {
      this.tickerSymbol = tickerSymbol;
   }

   @JsonProperty ("totalVolumeTraded")
   public String getTotalVolumeTraded() {
      return totalVolumeTraded;
   }

   @JsonProperty ("totalVolumeTraded")
   public void setTotalVolumeTraded(String totalVolumeTraded) {
      this.totalVolumeTraded = totalVolumeTraded;
   }

   @JsonProperty ("type")
   public String getType() {
      return type;
   }

   @JsonProperty ("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty ("updated")
   public String getUpdated() {
      return updated;
   }

   @JsonProperty ("updated")
   public void setUpdated(String updated) {
      this.updated = updated;
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

