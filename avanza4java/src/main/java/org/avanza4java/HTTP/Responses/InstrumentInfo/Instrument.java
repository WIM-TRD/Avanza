package org.avanza4java.HTTP.Responses.InstrumentInfo;

import com.fasterxml.jackson.annotation.*;
import org.avanza4java.HTTP.Responses.Outcome.Outcome;
import org.avanza4java.HTTP.Responses.Outcome.TotalOutcome;
import org.avanza4java.HTTP.Responses.Outcome.TotalOutcomeForUnknownDevelopments;
import org.avanza4java.HTTP.Responses.Positions.Position;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "instrumentDisplayName",
        "instrumentType",
        "outcome",
        "positions",
        "totalOutcome",
        "totalOutcomeForUnknownDevelopments",
        "unknownPositionDevelopments"
})
public class Instrument {

   @JsonProperty ("instrumentDisplayName")
   private String instrumentDisplayName;
   @JsonProperty ("instrumentType")
   private String instrumentType;
   @JsonProperty ("outcome")
   private Outcome outcome;
   @JsonProperty ("positions")
   private List<Position> positions = null;
   @JsonProperty ("totalOutcome")
   private TotalOutcome totalOutcome;
   @JsonProperty ("totalOutcomeForUnknownDevelopments")
   private TotalOutcomeForUnknownDevelopments totalOutcomeForUnknownDevelopments;
   @JsonProperty ("unknownPositionDevelopments")
   private List<Object> unknownPositionDevelopments = null;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("instrumentDisplayName")
   public String getInstrumentDisplayName() {
      return instrumentDisplayName;
   }

   @JsonProperty ("instrumentDisplayName")
   public void setInstrumentDisplayName(String instrumentDisplayName) {
      this.instrumentDisplayName = instrumentDisplayName;
   }

   @JsonProperty ("instrumentType")
   public String getInstrumentType() {
      return instrumentType;
   }

   @JsonProperty ("instrumentType")
   public void setInstrumentType(String instrumentType) {
      this.instrumentType = instrumentType;
   }

   @JsonProperty ("outcome")
   public Outcome getOutcome() {
      return outcome;
   }

   @JsonProperty ("outcome")
   public void setOutcome(Outcome outcome) {
      this.outcome = outcome;
   }

   @JsonProperty ("positions")
   public List<Position> getPositions() {
      return positions;
   }

   @JsonProperty ("positions")
   public void setPositions(List<Position> positions) {
      this.positions = positions;
   }

   @JsonProperty ("totalOutcome")
   public TotalOutcome getTotalOutcome() {
      return totalOutcome;
   }

   @JsonProperty ("totalOutcome")
   public void setTotalOutcome(TotalOutcome totalOutcome) {
      this.totalOutcome = totalOutcome;
   }

   @JsonProperty ("totalOutcomeForUnknownDevelopments")
   public TotalOutcomeForUnknownDevelopments getTotalOutcomeForUnknownDevelopments() {
      return totalOutcomeForUnknownDevelopments;
   }

   @JsonProperty ("totalOutcomeForUnknownDevelopments")
   public void setTotalOutcomeForUnknownDevelopments(TotalOutcomeForUnknownDevelopments totalOutcomeForUnknownDevelopments) {
      this.totalOutcomeForUnknownDevelopments = totalOutcomeForUnknownDevelopments;
   }

   @JsonProperty ("unknownPositionDevelopments")
   public List<Object> getUnknownPositionDevelopments() {
      return unknownPositionDevelopments;
   }

   @JsonProperty ("unknownPositionDevelopments")
   public void setUnknownPositionDevelopments(List<Object> unknownPositionDevelopments) {
      this.unknownPositionDevelopments = unknownPositionDevelopments;
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


