package org.avanza4java.HTTP.Responses.Company;

import com.fasterxml.jackson.annotation.*;
import org.avanza4java.HTTP.Responses.InstrumentInfo.Stock.Stock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "CEO",
        "chairman",
        "description",
        "id",
        "marketCapital",
        "marketCapitalCurrency",
        "name",
        "sector",
        "stocks",
        "totalNumberOfShares"
})
public class Company {

   @JsonProperty ("CEO")
   private String cEO;
   @JsonProperty ("chairman")
   private String chairman;
   @JsonProperty ("description")
   private String description;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("marketCapital")
   private String marketCapital;
   @JsonProperty ("marketCapitalCurrency")
   private String marketCapitalCurrency;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("sector")
   private String sector;
   @JsonProperty ("stocks")
   private List<Stock> stocks = null;
   @JsonProperty ("totalNumberOfShares")
   private String totalNumberOfShares;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("CEO")
   public String getCEO() {
      return cEO;
   }

   @JsonProperty ("CEO")
   public void setCEO(String cEO) {
      this.cEO = cEO;
   }

   @JsonProperty ("chairman")
   public String getChairman() {
      return chairman;
   }

   @JsonProperty ("chairman")
   public void setChairman(String chairman) {
      this.chairman = chairman;
   }

   @JsonProperty ("description")
   public String getDescription() {
      return description;
   }

   @JsonProperty ("description")
   public void setDescription(String description) {
      this.description = description;
   }

   @JsonProperty ("id")
   public String getId() {
      return id;
   }

   @JsonProperty ("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty ("marketCapital")
   public String getMarketCapital() {
      return marketCapital;
   }

   @JsonProperty ("marketCapital")
   public void setMarketCapital(String marketCapital) {
      this.marketCapital = marketCapital;
   }

   @JsonProperty ("marketCapitalCurrency")
   public String getMarketCapitalCurrency() {
      return marketCapitalCurrency;
   }

   @JsonProperty ("marketCapitalCurrency")
   public void setMarketCapitalCurrency(String marketCapitalCurrency) {
      this.marketCapitalCurrency = marketCapitalCurrency;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("sector")
   public String getSector() {
      return sector;
   }

   @JsonProperty ("sector")
   public void setSector(String sector) {
      this.sector = sector;
   }

   @JsonProperty ("stocks")
   public List<Stock> getStocks() {
      return stocks;
   }

   @JsonProperty ("stocks")
   public void setStocks(List<Stock> stocks) {
      this.stocks = stocks;
   }

   @JsonProperty ("totalNumberOfShares")
   public String getTotalNumberOfShares() {
      return totalNumberOfShares;
   }

   @JsonProperty ("totalNumberOfShares")
   public void setTotalNumberOfShares(String totalNumberOfShares) {
      this.totalNumberOfShares = totalNumberOfShares;
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
