package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.searchInfo;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "changeSinceOneDay",
        "changeSinceOneYear",
        "changeSinceThreeMonths",
        "id",
        "managementFee",
        "name",
        "risk",
        "riskLevel",
        "tickerSymbol",
        "tradable",
        "currency",
        "lastPrice",
        "changePercent",
        "flagCode"
})
public class TopHit {

   @JsonProperty ("changeSinceOneDay")
   private String changeSinceOneDay;
   @JsonProperty ("changeSinceOneYear")
   private String changeSinceOneYear;
   @JsonProperty ("changeSinceThreeMonths")
   private String changeSinceThreeMonths;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("managementFee")
   private String managementFee;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("risk")
   private String risk;
   @JsonProperty ("riskLevel")
   private String riskLevel;
   @JsonProperty ("tickerSymbol")
   private String tickerSymbol;
   @JsonProperty ("tradable")
   private String tradable;

   @JsonProperty ("currency")
   private String currency;
   @JsonProperty ("lastPrice")
   private String lastPrice;
   @JsonProperty ("changePercent")
   private String changePercent;
   @JsonProperty ("flagCode")
   private String flagCode;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("changeSinceOneDay")
   public String getChangeSinceOneDay() {
      return changeSinceOneDay;
   }

   @JsonProperty ("changeSinceOneDay")
   public void setChangeSinceOneDay(String changeSinceOneDay) {
      this.changeSinceOneDay = changeSinceOneDay;
   }

   @JsonProperty ("changeSinceOneYear")
   public String getChangeSinceOneYear() {
      return changeSinceOneYear;
   }

   @JsonProperty ("changeSinceOneYear")
   public void setChangeSinceOneYear(String changeSinceOneYear) {
      this.changeSinceOneYear = changeSinceOneYear;
   }

   @JsonProperty ("changeSinceThreeMonths")
   public String getChangeSinceThreeMonths() {
      return changeSinceThreeMonths;
   }

   @JsonProperty ("changeSinceThreeMonths")
   public void setChangeSinceThreeMonths(String changeSinceThreeMonths) {
      this.changeSinceThreeMonths = changeSinceThreeMonths;
   }

   @JsonProperty ("id")
   public String getId() {
      return id;
   }

   @JsonProperty ("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty ("managementFee")
   public String getManagementFee() {
      return managementFee;
   }

   @JsonProperty ("managementFee")
   public void setManagementFee(String managementFee) {
      this.managementFee = managementFee;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("risk")
   public String getRisk() {
      return risk;
   }

   @JsonProperty ("risk")
   public void setRisk(String risk) {
      this.risk = risk;
   }

   @JsonProperty ("riskLevel")
   public String getRiskLevel() {
      return riskLevel;
   }

   @JsonProperty ("riskLevel")
   public void setRiskLevel(String riskLevel) {
      this.riskLevel = riskLevel;
   }

   @JsonProperty ("tickerSymbol")
   public String getTickerSymbol() {
      return tickerSymbol;
   }

   @JsonProperty ("tickerSymbol")
   public void setTickerSymbol(String tickerSymbol) {
      this.tickerSymbol = tickerSymbol;
   }

   @JsonProperty ("tradable")
   public String getTradable() {
      return tradable;
   }

   @JsonProperty ("tradable")
   public void setTradable(String tradable) {
      this.tradable = tradable;
   }

   @JsonProperty ("currency")
   public String getCurrency() {
      return currency;
   }

   @JsonProperty ("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty ("lastPrice")
   public String getLastPrice() {
      return lastPrice;
   }

   @JsonProperty ("lastPrice")
   public void setLastPrice(String lastPrice) {
      this.lastPrice = lastPrice;
   }

   @JsonProperty ("changePercent")
   public String getChangePercent() {
      return changePercent;
   }

   @JsonProperty ("changePercent")
   public void setChangePercent(String changePercent) {
      this.changePercent = changePercent;
   }

   @JsonProperty ("flagCode")
   public String getFlagCode() {
      return flagCode;
   }

   @JsonProperty ("flagCode")
   public void setFlagCode(String flagCode) {
      this.flagCode = flagCode;
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