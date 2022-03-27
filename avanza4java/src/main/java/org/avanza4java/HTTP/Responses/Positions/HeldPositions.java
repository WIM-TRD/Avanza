package org.avanza4java.HTTP.Responses.Positions;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "instrumentPositions",
        "totalBalance",
        "totalBuyingPower",
        "totalOwnCapital",
        "totalProfit",
        "totalProfitPercent"
})
public class HeldPositions {

   @JsonProperty ("instrumentPositions")
   private List<InstrumentPosition> instrumentPositions = null;
   @JsonProperty ("totalBalance")
   private String totalBalance;
   @JsonProperty ("totalBuyingPower")
   private String totalBuyingPower;
   @JsonProperty ("totalOwnCapital")
   private String totalOwnCapital;
   @JsonProperty ("totalProfit")
   private String totalProfit;
   @JsonProperty ("totalProfitPercent")
   private String totalProfitPercent;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("instrumentPositions")
   public List<InstrumentPosition> getInstrumentPositions() {
      return instrumentPositions;
   }

   @JsonProperty ("instrumentPositions")
   public void setInstrumentPositions(List<InstrumentPosition> instrumentPositions) {
      this.instrumentPositions = instrumentPositions;
   }

   @JsonProperty ("totalBalance")
   public String getTotalBalance() {
      return totalBalance;
   }

   @JsonProperty ("totalBalance")
   public void setTotalBalance(String totalBalance) {
      this.totalBalance = totalBalance;
   }

   @JsonProperty ("totalBuyingPower")
   public String getTotalBuyingPower() {
      return totalBuyingPower;
   }

   @JsonProperty ("totalBuyingPower")
   public void setTotalBuyingPower(String totalBuyingPower) {
      this.totalBuyingPower = totalBuyingPower;
   }

   @JsonProperty ("totalOwnCapital")
   public String getTotalOwnCapital() {
      return totalOwnCapital;
   }

   @JsonProperty ("totalOwnCapital")
   public void setTotalOwnCapital(String totalOwnCapital) {
      this.totalOwnCapital = totalOwnCapital;
   }

   @JsonProperty ("totalProfit")
   public String getTotalProfit() {
      return totalProfit;
   }

   @JsonProperty ("totalProfit")
   public void setTotalProfit(String totalProfit) {
      this.totalProfit = totalProfit;
   }

   @JsonProperty ("totalProfitPercent")
   public String getTotalProfitPercent() {
      return totalProfitPercent;
   }

   @JsonProperty ("totalProfitPercent")
   public void setTotalProfitPercent(String totalProfitPercent) {
      this.totalProfitPercent = totalProfitPercent;
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
