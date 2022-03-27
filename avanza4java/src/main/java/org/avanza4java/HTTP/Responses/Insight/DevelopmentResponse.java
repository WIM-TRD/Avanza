package org.avanza4java.HTTP.Responses.Insight;

import com.fasterxml.jackson.annotation.*;
import org.avanza4java.HTTP.Responses.Charts.ChartDatum;
import org.avanza4java.HTTP.Responses.InstrumentInfo.Instrument;
import org.avanza4java.HTTP.Responses.Transaction.OtherTransactions;
import org.avanza4java.HTTP.Responses.Transaction.TransactionsResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "chartData",
        "hasUnusedInstrument",
        "instruments",
        "fromDate",
        "otherTransactions",
        "totalDevelopment",
        "transactionsResponse"
})
public class DevelopmentResponse {

   @JsonProperty ("chartData")
   private List<ChartDatum> chartData = null;
   @JsonProperty ("hasUnusedInstrument")
   private String hasUnusedInstrument;
   @JsonProperty ("instruments")
   private List<Instrument> instruments = null;
   @JsonProperty ("fromDate")
   private String fromDate;
   @JsonProperty ("otherTransactions")
   private OtherTransactions otherTransactions;
   @JsonProperty ("totalDevelopment")
   private TotalDevelopment totalDevelopment;
   @JsonProperty ("transactionsResponse")
   private TransactionsResponse transactionsResponse;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("chartData")
   public List<ChartDatum> getChartData() {
      return chartData;
   }

   @JsonProperty ("chartData")
   public void setChartData(List<ChartDatum> chartData) {
      this.chartData = chartData;
   }

   @JsonProperty ("hasUnusedInstrument")
   public String getHasUnusedInstrument() {
      return hasUnusedInstrument;
   }

   @JsonProperty ("hasUnusedInstrument")
   public void setHasUnusedInstrument(String hasUnusedInstrument) {
      this.hasUnusedInstrument = hasUnusedInstrument;
   }

   @JsonProperty ("instruments")
   public List<Instrument> getInstruments() {
      return instruments;
   }

   @JsonProperty ("instruments")
   public void setInstruments(List<Instrument> instruments) {
      this.instruments = instruments;
   }

   @JsonProperty ("fromDate")
   public String getFromDate() {
      return fromDate;
   }

   @JsonProperty ("fromDate")
   public void setFromDate(String fromDate) {
      this.fromDate = fromDate;
   }

   @JsonProperty ("otherTransactions")
   public OtherTransactions getOtherTransactions() {
      return otherTransactions;
   }

   @JsonProperty ("otherTransactions")
   public void setOtherTransactions(OtherTransactions otherTransactions) {
      this.otherTransactions = otherTransactions;
   }

   @JsonProperty ("totalDevelopment")
   public TotalDevelopment getTotalDevelopment() {
      return totalDevelopment;
   }

   @JsonProperty ("totalDevelopment")
   public void setTotalDevelopment(TotalDevelopment totalDevelopment) {
      this.totalDevelopment = totalDevelopment;
   }

   @JsonProperty ("transactionsResponse")
   public TransactionsResponse getTransactionsResponse() {
      return transactionsResponse;
   }

   @JsonProperty ("transactionsResponse")
   public void setTransactionsResponse(TransactionsResponse transactionsResponse) {
      this.transactionsResponse = transactionsResponse;
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

