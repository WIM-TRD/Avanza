package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Company;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "eventDate",
        "reportType"
})
public class CompanyReport {

   @JsonProperty ("eventDate")
   private String eventDate;
   @JsonProperty ("reportType")
   private String reportType;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("eventDate")
   public String getEventDate() {
      return eventDate;
   }

   @JsonProperty ("eventDate")
   public void setEventDate(String eventDate) {
      this.eventDate = eventDate;
   }

   @JsonProperty ("reportType")
   public String getReportType() {
      return reportType;
   }

   @JsonProperty ("reportType")
   public void setReportType(String reportType) {
      this.reportType = reportType;
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
