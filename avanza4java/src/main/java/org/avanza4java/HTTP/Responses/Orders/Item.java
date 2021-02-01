package org.avanza4java.HTTP.Responses.Orders;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "brokerCode",
        "buyVolume",
        "netBuyVolume",
        "sellVolume"
})
public class Item {

   @JsonProperty("brokerCode")
   private String brokerCode;
   @JsonProperty("buyVolume")
   private String buyVolume;
   @JsonProperty("netBuyVolume")
   private String netBuyVolume;
   @JsonProperty("sellVolume")
   private String sellVolume;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty("brokerCode")
   public String getBrokerCode() {
      return brokerCode;
   }

   @JsonProperty("brokerCode")
   public void setBrokerCode(String brokerCode) {
      this.brokerCode = brokerCode;
   }

   @JsonProperty("buyVolume")
   public String getBuyVolume() {
      return buyVolume;
   }

   @JsonProperty("buyVolume")
   public void setBuyVolume(String buyVolume) {
      this.buyVolume = buyVolume;
   }

   @JsonProperty("netBuyVolume")
   public String getNetBuyVolume() {
      return netBuyVolume;
   }

   @JsonProperty("netBuyVolume")
   public void setNetBuyVolume(String netBuyVolume) {
      this.netBuyVolume = netBuyVolume;
   }

   @JsonProperty("sellVolume")
   public String getSellVolume() {
      return sellVolume;
   }

   @JsonProperty("sellVolume")
   public void setSellVolume(String sellVolume) {
      this.sellVolume = sellVolume;
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

