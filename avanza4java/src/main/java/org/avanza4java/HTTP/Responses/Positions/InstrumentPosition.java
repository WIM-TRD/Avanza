package org.avanza4java.HTTP.Responses.Positions;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "instrumentType",
        "positions",
        "todaysProfitPercent",
        "totalProfitPercent",
        "totalProfitValue",
        "totalValue"
})
public class InstrumentPosition {

   @JsonProperty("instrumentType")
   private String instrumentType;
   @JsonProperty("positions")
   private List<Position> positions = null;
   @JsonProperty("todaysProfitPercent")
   private String todaysProfitPercent;
   @JsonProperty("totalProfitPercent")
   private String totalProfitPercent;
   @JsonProperty("totalProfitValue")
   private String totalProfitValue;
   @JsonProperty("totalValue")
   private String totalValue;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("instrumentType")
   public String getInstrumentType() {
      return instrumentType;
   }

   @JsonProperty("instrumentType")
   public void setInstrumentType(String instrumentType) {
      this.instrumentType = instrumentType;
   }

   @JsonProperty("positions")
   public List<Position> getPositions() {
      return positions;
   }

   @JsonProperty("positions")
   public void setPositions(List<Position> positions) {
      this.positions = positions;
   }

   @JsonProperty("todaysProfitPercent")
   public String getTodaysProfitPercent() {
      return todaysProfitPercent;
   }

   @JsonProperty("todaysProfitPercent")
   public void setTodaysProfitPercent(String todaysProfitPercent) {
      this.todaysProfitPercent = todaysProfitPercent;
   }

   @JsonProperty("totalProfitPercent")
   public String getTotalProfitPercent() {
      return totalProfitPercent;
   }

   @JsonProperty("totalProfitPercent")
   public void setTotalProfitPercent(String totalProfitPercent) {
      this.totalProfitPercent = totalProfitPercent;
   }

   @JsonProperty("totalProfitValue")
   public String getTotalProfitValue() {
      return totalProfitValue;
   }

   @JsonProperty("totalProfitValue")
   public void setTotalProfitValue(String totalProfitValue) {
      this.totalProfitValue = totalProfitValue;
   }

   @JsonProperty("totalValue")
   public String getTotalValue() {
      return totalValue;
   }

   @JsonProperty("totalValue")
   public void setTotalValue(String totalValue) {
      this.totalValue = totalValue;
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

