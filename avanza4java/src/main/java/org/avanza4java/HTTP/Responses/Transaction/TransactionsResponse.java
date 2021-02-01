package org.avanza4java.HTTP.Responses.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.avanza4java.HTTP.Responses.Charts.ChartDatum;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "allTransactions",
        "chartData",
        "totalAll",
        "totalAutogiro",
        "totalDeposits",
        "totalWithdraws"
})
public class TransactionsResponse {

   @JsonProperty("allTransactions")
   private List<AllTransaction> allTransactions = null;
   @JsonProperty("chartData")
   private List<ChartDatum> chartData = null;
   @JsonProperty("totalAll")
   private String totalAll;
   @JsonProperty("totalAutogiro")
   private String totalAutogiro;
   @JsonProperty("totalDeposits")
   private String totalDeposits;
   @JsonProperty("totalWithdraws")
   private String totalWithdraws;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("allTransactions")
   public List<AllTransaction> getAllTransactions() {
      return allTransactions;
   }

   @JsonProperty("allTransactions")
   public void setAllTransactions(List<AllTransaction> allTransactions) {
      this.allTransactions = allTransactions;
   }

   @JsonProperty("chartData")
   public List<ChartDatum> getChartData() {
      return chartData;
   }

   @JsonProperty("chartData")
   public void setChartData(List<ChartDatum> chartData) {
      this.chartData = chartData;
   }

   @JsonProperty("totalAll")
   public String getTotalAll() {
      return totalAll;
   }

   @JsonProperty("totalAll")
   public void setTotalAll(String totalAll) {
      this.totalAll = totalAll;
   }

   @JsonProperty("totalAutogiro")
   public String getTotalAutogiro() {
      return totalAutogiro;
   }

   @JsonProperty("totalAutogiro")
   public void setTotalAutogiro(String totalAutogiro) {
      this.totalAutogiro = totalAutogiro;
   }

   @JsonProperty("totalDeposits")
   public String getTotalDeposits() {
      return totalDeposits;
   }

   @JsonProperty("totalDeposits")
   public void setTotalDeposits(String totalDeposits) {
      this.totalDeposits = totalDeposits;
   }

   @JsonProperty("totalWithdraws")
   public String getTotalWithdraws() {
      return totalWithdraws;
   }

   @JsonProperty("totalWithdraws")
   public void setTotalWithdraws(String totalWithdraws) {
      this.totalWithdraws = totalWithdraws;
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
