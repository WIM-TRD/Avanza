package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.searchInfo;

import com.fasterxml.jackson.annotation.*;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.InstrumentType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "instrumentType",
        "numberOfHits",
        "topHits"
})
public class Hit {

   @JsonProperty ("instrumentType")
   private String instrumentType;
   @JsonProperty ("numberOfHits")
   private String numberOfHits;
   @JsonProperty ("topHits")
   private List<TopHit> topHits = null;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("instrumentType")
   public String getInstrumentType() {
      return instrumentType;
   }

   @JsonProperty ("instrumentType")
   public void setInstrumentType(String instrumentType) {
      this.instrumentType = instrumentType;
   }

   @JsonProperty ("numberOfHits")
   public String getNumberOfHits() {
      return numberOfHits;
   }

   @JsonProperty ("numberOfHits")
   public void setNumberOfHits(String numberOfHits) {
      this.numberOfHits = numberOfHits;
   }

   @JsonProperty ("topHits")
   public List<TopHit> getTopHits() {
      return topHits;
   }

   @JsonProperty ("topHits")
   public void setTopHits(List<TopHit> topHits) {
      this.topHits = topHits;
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