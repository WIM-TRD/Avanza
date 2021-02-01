package org.avanza4java.HTTP.Responses.InstrumentInfo.Fund;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.avanza4java.HTTP.Responses.Company.FundCompany;
import org.avanza4java.HTTP.Responses.Positions.Position;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "NAV",
        "NAVLastUpdated",
        "administrators",
        "autoPortfolio",
        "buyFee",
        "buyable",
        "capital",
        "changeSinceOneDay",
        "changeSinceOneMonth",
        "changeSinceOneWeek",
        "changeSinceOneYear",
        "changeSinceSixMonths",
        "changeSinceThreeMonths",
        "changeSinceTurnOfTheYear",
        "description",
        "domicile",
        "fundCompany",
        "hasInvestmentFees",
        "id",
        "isin",
        "loanFactor",
        "managementFee",
        "name",
        "normanAmount",
        "numberOfOwners",
        "numberOfPriceAlerts",
        "otherFees",
        "positions",
        "positionsTotalValue",
        "prospectus",
        "relatedFunds",
        "risk",
        "riskLevel",
        "sellFee",
        "sellable",
        "startDate",
        "subCategory",
        "tradingCurrency",
        "type"
})
public class FundInfo {

   @JsonProperty ("NAV")
   private String nAV;
   @JsonProperty ("NAVLastUpdated")
   private String nAVLastUpdated;
   @JsonProperty ("administrators")
   private String administrators;
   @JsonProperty ("autoPortfolio")
   private String autoPortfolio;
   @JsonProperty ("buyFee")
   private String buyFee;
   @JsonProperty ("buyable")
   private String buyable;
   @JsonProperty ("capital")
   private String capital;
   @JsonProperty ("changeSinceOneDay")
   private String changeSinceOneDay;
   @JsonProperty ("changeSinceOneMonth")
   private String changeSinceOneMonth;
   @JsonProperty ("changeSinceOneWeek")
   private String changeSinceOneWeek;
   @JsonProperty ("changeSinceOneYear")
   private String changeSinceOneYear;
   @JsonProperty ("changeSinceSixMonths")
   private String changeSinceSixMonths;
   @JsonProperty ("changeSinceThreeMonths")
   private String changeSinceThreeMonths;
   @JsonProperty ("changeSinceTurnOfTheYear")
   private String changeSinceTurnOfTheYear;
   @JsonProperty ("description")
   private String description;
   @JsonProperty ("domicile")
   private String domicile;
   @JsonProperty ("fundCompany")
   private FundCompany fundCompany;
   @JsonProperty ("hasInvestmentFees")
   private String hasInvestmentFees;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("isin")
   private String isin;
   @JsonProperty ("loanFactor")
   private String loanFactor;
   @JsonProperty ("managementFee")
   private String managementFee;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("normanAmount")
   private String normanAmount;
   @JsonProperty ("numberOfOwners")
   private String numberOfOwners;
   @JsonProperty ("numberOfPriceAlerts")
   private String numberOfPriceAlerts;
   @JsonProperty ("otherFees")
   private String otherFees;
   @JsonProperty ("positions")
   private List<Position> positions = null;
   @JsonProperty ("positionsTotalValue")
   private String positionsTotalValue;
   @JsonProperty ("prospectus")
   private String prospectus;
   @JsonProperty ("relatedFunds")
   private List<RelatedFund> relatedFunds = null;
   @JsonProperty ("risk")
   private String risk;
   @JsonProperty ("riskLevel")
   private String riskLevel;
   @JsonProperty ("sellFee")
   private String sellFee;
   @JsonProperty ("sellable")
   private String sellable;
   @JsonProperty ("startDate")
   private String startDate;
   @JsonProperty ("subCategory")
   private String subCategory;
   @JsonProperty ("tradingCurrency")
   private String tradingCurrency;
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

   @JsonProperty ("NAVLastUpdated")
   public String getNAVLastUpdated() {
      return nAVLastUpdated;
   }

   @JsonProperty ("NAVLastUpdated")
   public void setNAVLastUpdated(String nAVLastUpdated) {
      this.nAVLastUpdated = nAVLastUpdated;
   }

   @JsonProperty ("administrators")
   public String getAdministrators() {
      return administrators;
   }

   @JsonProperty ("administrators")
   public void setAdministrators(String administrators) {
      this.administrators = administrators;
   }

   @JsonProperty ("autoPortfolio")
   public String getAutoPortfolio() {
      return autoPortfolio;
   }

   @JsonProperty ("autoPortfolio")
   public void setAutoPortfolio(String autoPortfolio) {
      this.autoPortfolio = autoPortfolio;
   }

   @JsonProperty ("buyFee")
   public String getBuyFee() {
      return buyFee;
   }

   @JsonProperty ("buyFee")
   public void setBuyFee(String buyFee) {
      this.buyFee = buyFee;
   }

   @JsonProperty ("buyable")
   public String getBuyable() {
      return buyable;
   }

   @JsonProperty ("buyable")
   public void setBuyable(String buyable) {
      this.buyable = buyable;
   }

   @JsonProperty ("capital")
   public String getCapital() {
      return capital;
   }

   @JsonProperty ("capital")
   public void setCapital(String capital) {
      this.capital = capital;
   }

   @JsonProperty ("changeSinceOneDay")
   public String getChangeSinceOneDay() {
      return changeSinceOneDay;
   }

   @JsonProperty ("changeSinceOneDay")
   public void setChangeSinceOneDay(String changeSinceOneDay) {
      this.changeSinceOneDay = changeSinceOneDay;
   }

   @JsonProperty ("changeSinceOneMonth")
   public String getChangeSinceOneMonth() {
      return changeSinceOneMonth;
   }

   @JsonProperty ("changeSinceOneMonth")
   public void setChangeSinceOneMonth(String changeSinceOneMonth) {
      this.changeSinceOneMonth = changeSinceOneMonth;
   }

   @JsonProperty ("changeSinceOneWeek")
   public String getChangeSinceOneWeek() {
      return changeSinceOneWeek;
   }

   @JsonProperty ("changeSinceOneWeek")
   public void setChangeSinceOneWeek(String changeSinceOneWeek) {
      this.changeSinceOneWeek = changeSinceOneWeek;
   }

   @JsonProperty ("changeSinceOneYear")
   public String getChangeSinceOneYear() {
      return changeSinceOneYear;
   }

   @JsonProperty ("changeSinceOneYear")
   public void setChangeSinceOneYear(String changeSinceOneYear) {
      this.changeSinceOneYear = changeSinceOneYear;
   }

   @JsonProperty ("changeSinceSixMonths")
   public String getChangeSinceSixMonths() {
      return changeSinceSixMonths;
   }

   @JsonProperty ("changeSinceSixMonths")
   public void setChangeSinceSixMonths(String changeSinceSixMonths) {
      this.changeSinceSixMonths = changeSinceSixMonths;
   }

   @JsonProperty ("changeSinceThreeMonths")
   public String getChangeSinceThreeMonths() {
      return changeSinceThreeMonths;
   }

   @JsonProperty ("changeSinceThreeMonths")
   public void setChangeSinceThreeMonths(String changeSinceThreeMonths) {
      this.changeSinceThreeMonths = changeSinceThreeMonths;
   }

   @JsonProperty ("changeSinceTurnOfTheYear")
   public String getChangeSinceTurnOfTheYear() {
      return changeSinceTurnOfTheYear;
   }

   @JsonProperty ("changeSinceTurnOfTheYear")
   public void setChangeSinceTurnOfTheYear(String changeSinceTurnOfTheYear) {
      this.changeSinceTurnOfTheYear = changeSinceTurnOfTheYear;
   }

   @JsonProperty ("description")
   public String getDescription() {
      return description;
   }

   @JsonProperty ("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty ("domicile")
   public String getDomicile() {
      return domicile;
   }

   @JsonProperty ("domicile")
   public void setDomicile(String domicile) {
      this.domicile = domicile;
   }

   @JsonProperty ("fundCompany")
   public FundCompany getFundCompany() {
      return fundCompany;
   }

   @JsonProperty ("fundCompany")
   public void setFundCompany(FundCompany fundCompany) {
      this.fundCompany = fundCompany;
   }

   @JsonProperty ("hasInvestmentFees")
   public String getHasInvestmentFees() {
      return hasInvestmentFees;
   }

   @JsonProperty ("hasInvestmentFees")
   public void setHasInvestmentFees(String hasInvestmentFees) {
      this.hasInvestmentFees = hasInvestmentFees;
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

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("normanAmount")
   public String getNormanAmount() {
      return normanAmount;
   }

   @JsonProperty ("normanAmount")
   public void setNormanAmount(String normanAmount) {
      this.normanAmount = normanAmount;
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

   @JsonProperty ("otherFees")
   public String getOtherFees() {
      return otherFees;
   }

   @JsonProperty ("otherFees")
   public void setOtherFees(String otherFees) {
      this.otherFees = otherFees;
   }

   @JsonProperty ("positions")
   public List<Position> getPositions() {
      return positions;
   }

   @JsonProperty ("positions")
   public void setPositions(List<Position> positions) {
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

   @JsonProperty ("prospectus")
   public String getProspectus() {
      return prospectus;
   }

   @JsonProperty ("prospectus")
   public void setProspectus(String prospectus) {
      this.prospectus = prospectus;
   }

   @JsonProperty ("relatedFunds")
   public List<RelatedFund> getRelatedFunds() {
      return relatedFunds;
   }

   @JsonProperty ("relatedFunds")
   public void setRelatedFunds(List<RelatedFund> relatedFunds) {
      this.relatedFunds = relatedFunds;
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

   @JsonProperty ("sellFee")
   public String getSellFee() {
      return sellFee;
   }

   @JsonProperty ("sellFee")
   public void setSellFee(String sellFee) {
      this.sellFee = sellFee;
   }

   @JsonProperty ("sellable")
   public String getSellable() {
      return sellable;
   }

   @JsonProperty ("sellable")
   public void setSellable(String sellable) {
      this.sellable = sellable;
   }

   @JsonProperty ("startDate")
   public String getStartDate() {
      return startDate;
   }

   @JsonProperty ("startDate")
   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   @JsonProperty ("subCategory")
   public String getSubCategory() {
      return subCategory;
   }

   @JsonProperty ("subCategory")
   public void setSubCategory(String subCategory) {
      this.subCategory = subCategory;
   }

   @JsonProperty ("tradingCurrency")
   public String getTradingCurrency() {
      return tradingCurrency;
   }

   @JsonProperty ("tradingCurrency")
   public void setTradingCurrency(String tradingCurrency) {
      this.tradingCurrency = tradingCurrency;
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

