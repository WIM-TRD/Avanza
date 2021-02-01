package org.avanza4java.HTTP.Responses.InstrumentInfo.Fund;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "NAV",
        "buyFee",
        "buyTradeDate",
        "buyVisibleDate",
        "id",
        "loanFactor",
        "managementFee",
        "minStartAmount",
        "name",
        "otherFees",
        "otherOrderDescription",
        "positionValue",
        "positionVolume",
        "prospectus",
        "sellFee",
        "sellTradeDate",
        "sellVisibleDate",
        "stopTime",
        "tradable",
        "type"
})
public class Fund {

   @JsonProperty ("NAV")
   private String nAV;
   @JsonProperty ("buyFee")
   private String buyFee;
   @JsonProperty ("buyTradeDate")
   private String buyTradeDate;
   @JsonProperty ("buyVisibleDate")
   private String buyVisibleDate;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("loanFactor")
   private String loanFactor;
   @JsonProperty ("managementFee")
   private String managementFee;
   @JsonProperty ("minStartAmount")
   private String minStartAmount;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("otherFees")
   private String otherFees;
   @JsonProperty ("otherOrderDescription")
   private String otherOrderDescription;
   @JsonProperty ("positionValue")
   private String positionValue;
   @JsonProperty ("positionVolume")
   private String positionVolume;
   @JsonProperty ("prospectus")
   private String prospectus;
   @JsonProperty ("sellFee")
   private String sellFee;
   @JsonProperty ("sellTradeDate")
   private String sellTradeDate;
   @JsonProperty ("sellVisibleDate")
   private String sellVisibleDate;
   @JsonProperty ("stopTime")
   private String stopTime;
   @JsonProperty ("tradable")
   private String tradable;
   @JsonProperty ("type")
   private String type;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("NAV")
   public String getNAV() {
      return nAV;
   }

   @JsonProperty ("NAV")
   public void setNAV(String nAV) {
      this.nAV = nAV;
   }

   @JsonProperty ("buyFee")
   public String getBuyFee() {
      return buyFee;
   }

   @JsonProperty ("buyFee")
   public void setBuyFee(String buyFee) {
      this.buyFee = buyFee;
   }

   @JsonProperty ("buyTradeDate")
   public String getBuyTradeDate() {
      return buyTradeDate;
   }

   @JsonProperty ("buyTradeDate")
   public void setBuyTradeDate(String buyTradeDate) {
      this.buyTradeDate = buyTradeDate;
   }

   @JsonProperty ("buyVisibleDate")
   public String getBuyVisibleDate() {
      return buyVisibleDate;
   }

   @JsonProperty ("buyVisibleDate")
   public void setBuyVisibleDate(String buyVisibleDate) {
      this.buyVisibleDate = buyVisibleDate;
   }

   @JsonProperty ("id")
   public String getId() {
      return id;
   }

   @JsonProperty ("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty ("loanFactor")
   public String getLoanFactor() {
      return loanFactor;
   }

   @JsonProperty ("loanFactor")
   public void setLoanFactor(String loanFactor) {
      this.loanFactor = loanFactor;
   }

   @JsonProperty ("managementFee")
   public String getManagementFee() {
      return managementFee;
   }

   @JsonProperty ("managementFee")
   public void setManagementFee(String managementFee) {
      this.managementFee = managementFee;
   }

   @JsonProperty ("minStartAmount")
   public String getMinStartAmount() {
      return minStartAmount;
   }

   @JsonProperty ("minStartAmount")
   public void setMinStartAmount(String minStartAmount) {
      this.minStartAmount = minStartAmount;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("otherFees")
   public String getOtherFees() {
      return otherFees;
   }

   @JsonProperty ("otherFees")
   public void setOtherFees(String otherFees) {
      this.otherFees = otherFees;
   }

   @JsonProperty ("otherOrderDescription")
   public String getOtherOrderDescription() {
      return otherOrderDescription;
   }

   @JsonProperty ("otherOrderDescription")
   public void setOtherOrderDescription(String otherOrderDescription) {
      this.otherOrderDescription = otherOrderDescription;
   }

   @JsonProperty ("positionValue")
   public String getPositionValue() {
      return positionValue;
   }

   @JsonProperty ("positionValue")
   public void setPositionValue(String positionValue) {
      this.positionValue = positionValue;
   }

   @JsonProperty ("positionVolume")
   public String getPositionVolume() {
      return positionVolume;
   }

   @JsonProperty ("positionVolume")
   public void setPositionVolume(String positionVolume) {
      this.positionVolume = positionVolume;
   }

   @JsonProperty ("prospectus")
   public String getProspectus() {
      return prospectus;
   }

   @JsonProperty ("prospectus")
   public void setProspectus(String prospectus) {
      this.prospectus = prospectus;
   }

   @JsonProperty ("sellFee")
   public String getSellFee() {
      return sellFee;
   }

   @JsonProperty ("sellFee")
   public void setSellFee(String sellFee) {
      this.sellFee = sellFee;
   }

   @JsonProperty ("sellTradeDate")
   public String getSellTradeDate() {
      return sellTradeDate;
   }

   @JsonProperty ("sellTradeDate")
   public void setSellTradeDate(String sellTradeDate) {
      this.sellTradeDate = sellTradeDate;
   }

   @JsonProperty ("sellVisibleDate")
   public String getSellVisibleDate() {
      return sellVisibleDate;
   }

   @JsonProperty ("sellVisibleDate")
   public void setSellVisibleDate(String sellVisibleDate) {
      this.sellVisibleDate = sellVisibleDate;
   }

   @JsonProperty ("stopTime")
   public String getStopTime() {
      return stopTime;
   }

   @JsonProperty ("stopTime")
   public void setStopTime(String stopTime) {
      this.stopTime = stopTime;
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

