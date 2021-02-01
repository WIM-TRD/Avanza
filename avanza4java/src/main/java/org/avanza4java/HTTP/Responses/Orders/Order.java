package org.avanza4java.HTTP.Responses.Orders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.avanza4java.HTTP.Responses.Account.AccountSimple;
import org.avanza4java.HTTP.Responses.OrderBook.OrderBook;
import org.avanza4java.HTTP.Responses.Transaction.TransactionFees;

@JsonInclude (JsonInclude.Include.NON_NULL)
@JsonPropertyOrder ({
        "account",
        "deletable",
        "marketTransaction",
        "messages",
        "modifyAllowed",
        "orderDateTime",
        "orderId",
        "orderbook",
        "orderCondition",
        "orderType",
        "price",
        "rawStatus",
        "requestId",
        "status",
        "statusDescription",
        "sum",
        "transactionFees",
        "type",
        "validUntil",
        "visibleOnAccountDate",
        "volume"
})
public class Order {

   @JsonProperty ("account")
   private AccountSimple account;
   @JsonProperty ("deletable")
   private String deletable;
   @JsonProperty ("marketTransaction")
   private String marketTransaction;
   @JsonProperty ("messages")
   private List<String> messages = null;
   @JsonProperty ("modifyAllowed")
   private String modifyAllowed;
   @JsonProperty ("orderDateTime")
   private String orderDateTime;
   @JsonProperty ("orderId")
   private String orderId;
   @JsonProperty ("orderbook")
   private OrderBook orderbook;
   @JsonProperty ("orderCondition")
   private String orderCondition;
   @JsonProperty ("orderType")
   private String orderType;
   @JsonProperty ("price")
   private String price;
   @JsonProperty ("rawStatus")
   private String rawStatus;
   @JsonProperty ("requestId")
   private String requestId;
   @JsonProperty ("status")
   private String status;
   @JsonProperty ("statusDescription")
   private String statusDescription;
   @JsonProperty ("sum")
   private String sum;
   @JsonProperty ("transactionFees")
   private TransactionFees transactionFees;
   @JsonProperty ("type")
   private String type;
   @JsonProperty ("validUntil")
   private String validUntil;
   @JsonProperty ("visibleOnAccountDate")
   private String visibleOnAccountDate;
   @JsonProperty ("volume")
   private String volume;
   @JsonIgnore
   private Map<String, Object> additionalProperties = new HashMap<String, Object>();

   @JsonProperty ("account")
   public AccountSimple getAccount() {
      return account;
   }

   @JsonProperty ("account")
   public void setAccount(AccountSimple account) {
      this.account = account;
   }

   @JsonProperty ("deletable")
   public String getDeletable() {
      return deletable;
   }

   @JsonProperty ("deletable")
   public void setDeletable(String deletable) {
      this.deletable = deletable;
   }

   @JsonProperty ("marketTransaction")
   public String getMarketTransaction() {
      return marketTransaction;
   }

   @JsonProperty ("marketTransaction")
   public void setMarketTransaction(String marketTransaction) {
      this.marketTransaction = marketTransaction;
   }

   @JsonProperty ("messages")
   public List<String> getMessages() {
      return messages;
   }

   @JsonProperty ("messages")
   public void setMessages(List<String> messages) {
      this.messages = messages;
   }

   @JsonProperty ("modifyAllowed")
   public String getModifyAllowed() {
      return modifyAllowed;
   }

   @JsonProperty ("modifyAllowed")
   public void setModifyAllowed(String modifyAllowed) {
      this.modifyAllowed = modifyAllowed;
   }

   @JsonProperty ("orderDateTime")
   public String getOrderDateTime() {
      return orderDateTime;
   }

   @JsonProperty ("orderDateTime")
   public void setOrderDateTime(String orderDateTime) {
      this.orderDateTime = orderDateTime;
   }

   @JsonProperty ("orderId")
   public String getOrderId() {
      return orderId;
   }

   @JsonProperty ("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty ("orderbook")
   public OrderBook getOrderbook() {
      return orderbook;
   }

   @JsonProperty ("orderbook")
   public void setOrderbook(OrderBook orderbook) {
      this.orderbook = orderbook;
   }

   @JsonProperty ("orderCondition")
   public String getOrderCondition() {
      return orderCondition;
   }

   @JsonProperty ("orderCondition")
   public void setOrderCondition(String orderCondition) {
      this.orderCondition = orderCondition;
   }

   @JsonProperty ("orderType")
   public String getOrderType() {
      return orderType;
   }

   @JsonProperty ("orderType")
   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   @JsonProperty ("price")
   public String getPrice() {
      return price;
   }

   @JsonProperty ("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty ("rawStatus")
   public String getRawStatus() {
      return rawStatus;
   }

   @JsonProperty ("rawStatus")
   public void setRawStatus(String rawStatus) {
      this.rawStatus = rawStatus;
   }

   @JsonProperty ("requestId")
   public String getRequestId() {
      return requestId;
   }

   @JsonProperty ("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty ("status")
   public String getStatus() {
      return status;
   }

   @JsonProperty ("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty ("statusDescription")
   public String getStatusDescription() {
      return statusDescription;
   }

   @JsonProperty ("statusDescription")
   public void setStatusDescription(String statusDescription) {
      this.statusDescription = statusDescription;
   }

   @JsonProperty ("sum")
   public String getSum() {
      return sum;
   }

   @JsonProperty ("sum")
   public void setSum(String sum) {
      this.sum = sum;
   }

   @JsonProperty ("transactionFees")
   public TransactionFees getTransactionFees() {
      return transactionFees;
   }

   @JsonProperty ("transactionFees")
   public void setTransactionFees(TransactionFees transactionFees) {
      this.transactionFees = transactionFees;
   }

   @JsonProperty ("type")
   public String getType() {
      return type;
   }

   @JsonProperty ("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty ("visibleOnAccountDate")
   public String getVisibleOnAccountDate() {
      return visibleOnAccountDate;
   }

   @JsonProperty ("visibleOnAccountDate")
   public void setVisibleOnAccountDate(String visibleOnAccountDate) {
      this.visibleOnAccountDate = visibleOnAccountDate;
   }
   @JsonProperty("validUntil")
   public String getValidUntil() {
      return validUntil;
   }

   @JsonProperty("validUntil")
   public void setValidUntil(String validUntil) {
      this.validUntil = validUntil;
   }

   @JsonProperty("volume")
   public String getVolume() {
      return volume;
   }

   @JsonProperty("volume")
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
