package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.Stock;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "flagCode",
        "id",
        "lastPrice",
        "name",
        "priceOneYearAgo"
})
public class RelatedStock {

   @JsonProperty ("flagCode")
   private String flagCode;
   @JsonProperty ("id")
   private String id;
   @JsonProperty ("lastPrice")
   private String lastPrice;
   @JsonProperty ("name")
   private String name;
   @JsonProperty ("priceOneYearAgo")
   private String priceOneYearAgo;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("flagCode")
   public String getFlagCode() {
      return flagCode;
   }

   @JsonProperty ("flagCode")
   public void setFlagCode(String flagCode) {
      this.flagCode = flagCode;
   }

   @JsonProperty ("id")
   public String getId() {
      return id;
   }

   @JsonProperty ("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty ("lastPrice")
   public String getLastPrice() {
      return lastPrice;
   }

   @JsonProperty ("lastPrice")
   public void setLastPrice(String lastPrice) {
      this.lastPrice = lastPrice;
   }

   @JsonProperty ("name")
   public String getName() {
      return name;
   }

   @JsonProperty ("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty ("priceOneYearAgo")
   public String getPriceOneYearAgo() {
      return priceOneYearAgo;
   }

   @JsonProperty ("priceOneYearAgo")
   public void setPriceOneYearAgo(String priceOneYearAgo) {
      this.priceOneYearAgo = priceOneYearAgo;
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

