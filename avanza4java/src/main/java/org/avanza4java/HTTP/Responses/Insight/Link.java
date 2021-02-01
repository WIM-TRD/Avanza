package org.avanza4java.HTTP.Responses.Insight;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "buyable",
        "flagCode",
        "linkDisplay",
        "orderbookId",
        "sellable",
        "shortLinkDisplay",
        "tradeable",
        "type",
        "urlDisplayName"
})
public class Link {

   @JsonProperty ("buyable")
   private String buyable;
   @JsonProperty ("flagCode")
   private String flagCode;
   @JsonProperty ("linkDisplay")
   private String linkDisplay;
   @JsonProperty ("orderbookId")
   private String orderbookId;
   @JsonProperty ("sellable")
   private String sellable;
   @JsonProperty ("shortLinkDisplay")
   private String shortLinkDisplay;
   @JsonProperty ("tradeable")
   private String tradeable;
   @JsonProperty ("type")
   private String type;
   @JsonProperty ("urlDisplayName")
   private String urlDisplayName;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("buyable")
   public String getBuyable() {
      return buyable;
   }

   @JsonProperty ("buyable")
   public void setBuyable(String buyable) {
      this.buyable = buyable;
   }

   @JsonProperty ("flagCode")
   public String getFlagCode() {
      return flagCode;
   }

   @JsonProperty ("flagCode")
   public void setFlagCode(String flagCode) {
      this.flagCode = flagCode;
   }

   @JsonProperty ("linkDisplay")
   public String getLinkDisplay() {
      return linkDisplay;
   }

   @JsonProperty ("linkDisplay")
   public void setLinkDisplay(String linkDisplay) {
      this.linkDisplay = linkDisplay;
   }

   @JsonProperty ("orderbookId")
   public String getOrderbookId() {
      return orderbookId;
   }

   @JsonProperty ("orderbookId")
   public void setOrderbookId(String orderbookId) {
      this.orderbookId = orderbookId;
   }

   @JsonProperty ("sellable")
   public String getSellable() {
      return sellable;
   }

   @JsonProperty ("sellable")
   public void setSellable(String sellable) {
      this.sellable = sellable;
   }

   @JsonProperty ("shortLinkDisplay")
   public String getShortLinkDisplay() {
      return shortLinkDisplay;
   }

   @JsonProperty ("shortLinkDisplay")
   public void setShortLinkDisplay(String shortLinkDisplay) {
      this.shortLinkDisplay = shortLinkDisplay;
   }

   @JsonProperty ("tradeable")
   public String getTradeable() {
      return tradeable;
   }

   @JsonProperty ("tradeable")
   public void setTradeable(String tradeable) {
      this.tradeable = tradeable;
   }

   @JsonProperty ("type")
   public String getType() {
      return type;
   }

   @JsonProperty ("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty ("urlDisplayName")
   public String getUrlDisplayName() {
      return urlDisplayName;
   }

   @JsonProperty ("urlDisplayName")
   public void setUrlDisplayName(String urlDisplayName) {
      this.urlDisplayName = urlDisplayName;
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

