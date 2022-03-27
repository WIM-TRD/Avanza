package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Transaction;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "buyer",
        "cancelled",
        "dealTime",
        "matchedOnMarket",
        "price",
        "seller",
        "volume"
})
public class LatestTrade {

   @JsonProperty ("buyer")
   private String buyer;
   @JsonProperty ("cancelled")
   private String cancelled;
   @JsonProperty ("dealTime")
   private String dealTime;
   @JsonProperty ("matchedOnMarket")
   private String matchedOnMarket;
   @JsonProperty ("price")
   private String price;
   @JsonProperty ("seller")
   private String seller;
   @JsonProperty ("volume")
   private String volume;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("buyer")
   public String getBuyer() {
      return buyer;
   }

   @JsonProperty ("buyer")
   public void setBuyer(String buyer) {
      this.buyer = buyer;
   }

   @JsonProperty ("cancelled")
   public String getCancelled() {
      return cancelled;
   }

   @JsonProperty ("cancelled")
   public void setCancelled(String cancelled) {
      this.cancelled = cancelled;
   }

   @JsonProperty ("dealTime")
   public String getDealTime() {
      return dealTime;
   }

   @JsonProperty ("dealTime")
   public void setDealTime(String dealTime) {
      this.dealTime = dealTime;
   }

   @JsonProperty ("matchedOnMarket")
   public String getMatchedOnMarket() {
      return matchedOnMarket;
   }

   @JsonProperty ("matchedOnMarket")
   public void setMatchedOnMarket(String matchedOnMarket) {
      this.matchedOnMarket = matchedOnMarket;
   }

   @JsonProperty ("price")
   public String getPrice() {
      return price;
   }

   @JsonProperty ("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty ("seller")
   public String getSeller() {
      return seller;
   }

   @JsonProperty ("seller")
   public void setSeller(String seller) {
      this.seller = seller;
   }

   @JsonProperty ("volume")
   public String getVolume() {
      return volume;
   }

   @JsonProperty ("volume")
   public void setVolume(String volume) {
      this.volume = volume;
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
