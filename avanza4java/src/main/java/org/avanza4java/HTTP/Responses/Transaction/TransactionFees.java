package org.avanza4java.HTTP.Responses.Transaction;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "commission",
        "fundOrderFee",
        "marketFees",
        "totalFees",
        "totalSum",
        "totalSumWithoutFees"
})
public class TransactionFees {

   @JsonProperty ("commission")
   private String commission;
   @JsonProperty ("fundOrderFee")
   private FundOrderFee fundOrderFee;
   @JsonProperty ("marketFees")
   private String marketFees;
   @JsonProperty ("totalFees")
   private String totalFees;
   @JsonProperty ("totalSum")
   private String totalSum;
   @JsonProperty ("totalSumWithoutFees")
   private String totalSumWithoutFees;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("commission")
   public String getCommission() {
      return commission;
   }

   @JsonProperty ("commission")
   public void setCommission(String commission) {
      this.commission = commission;
   }

   @JsonProperty ("fundOrderFee")
   public FundOrderFee getFundOrderFee() {
      return fundOrderFee;
   }

   @JsonProperty ("fundOrderFee")
   public void setFundOrderFee(FundOrderFee fundOrderFee) {
      this.fundOrderFee = fundOrderFee;
   }

   @JsonProperty ("marketFees")
   public String getMarketFees() {
      return marketFees;
   }

   @JsonProperty ("marketFees")
   public void setMarketFees(String marketFees) {
      this.marketFees = marketFees;
   }

   @JsonProperty ("totalFees")
   public String getTotalFees() {
      return totalFees;
   }

   @JsonProperty ("totalFees")
   public void setTotalFees(String totalFees) {
      this.totalFees = totalFees;
   }

   @JsonProperty ("totalSum")
   public String getTotalSum() {
      return totalSum;
   }

   @JsonProperty ("totalSum")
   public void setTotalSum(String totalSum) {
      this.totalSum = totalSum;
   }

   @JsonProperty ("totalSumWithoutFees")
   public String getTotalSumWithoutFees() {
      return totalSumWithoutFees;
   }

   @JsonProperty ("totalSumWithoutFees")
   public void setTotalSumWithoutFees(String totalSumWithoutFees) {
      this.totalSumWithoutFees = totalSumWithoutFees;
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
