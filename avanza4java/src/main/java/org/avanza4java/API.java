package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java;

import org.wTrader.utils.AvanzaAPI.HTTP.Responses.InstrumentInfo.Stock.StockInfo;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.Config.Constants;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.HTTPMethod;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Requests.Authentication.LoginRequest;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Requests.Authentication.TotpRequest;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Requests.Orders.DeleteOrder;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Requests.Orders.EditOrder;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Requests.Orders.OrderOptions;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Account.AccountOverview;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Account.Overview;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Authentication.LoginResponse;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Authentication.TotpResponse;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Charts.ChartData;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Deals.DealsAndOrders;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.HTTPResponse;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Insight.InsightReport;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.InstrumentInfo.InstrumentType;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.OrderBook.OrderBookInfo;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Orders.Order;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Positions.HeldPositions;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.Utils.totp.totp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.indexOfSubList;
import static java.util.Collections.singletonMap;

public class API {
   private final ApiClient apiClient;
   private String username;
   private String password;
   private String totp;
   private String totpSecret;
   private Map<String, String> headers = new HashMap<>();

   public API(String username, String password, String totp) {
      this.username = username;
      this.password = password;
      this.totp = totp;
      this.apiClient = CreateClient();
      this.totpSecret = getTotpSecret();
   }

   private ApiClient CreateClient() {
      return new ApiClient(username, password, totp);
   }

   public boolean login() {
      boolean loginSuccessful = false;
      LoginRequest loginRequest = new LoginRequest(Constants.maxInactiveMinutes, username, password);
      LoginResponse response = apiClient.request(
              HTTPMethod.POST,
              Collections.emptyMap(),
              loginRequest.toJSON(),
              Constants.AUTHENTICATION_PATH,
              LoginResponse.class).getBody();
      if (response.getTwoFactorLogin().getMethod() != null) {
         TotpRequest totpRequest = new TotpRequest();
         totpRequest.setMethod(response.getTwoFactorLogin().getMethod());
         totpRequest.setTotpSecret(totpSecret);
         HTTPResponse<TotpResponse> totpResponse = apiClient.request(
                 HTTPMethod.POST,
                 singletonMap(Constants.COOKIE, String.format("AZAMFATRANSACTION=%s", response.getTwoFactorLogin().getTransactionId())),
                 totpRequest.toJSON(),
                 Constants.TOTP_PATH,
                 TotpResponse.class);

         if (totpResponse.getBody() != null &&
             totpResponse.getBody().getAuthenticationSession() != null) {
            apiClient.setAuthenticated();
            this.headers.put(Constants.AUTHENTICATIONSESSION, totpResponse.getBody().getAuthenticationSession());
            this.headers.put(Constants.SECURITYTOKEN, totpResponse.getHeaders().get(Constants.SECURITYTOKEN));
            loginSuccessful = true;
         } else {
            throw new RuntimeException("Login not successful");
         }
      }
      return loginSuccessful;
   }

   public String getTotpSecret() {
      org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.Utils.totp.totp retVal = new totp(totp);
      return retVal.getTotpSecret();
   }

   public Overview getOverview() {
      return (apiClient.call(HTTPMethod.GET, headers, null,
                             Constants.OVERVIEW_PATH, Overview.class).getBody());
   }

   public AccountOverview getAccountOverview(String accountId) {
      return (apiClient.call(HTTPMethod.GET, headers, null,
                             Constants.ACCOUNT_OVERVIEW_PATH.replace("{0}", accountId), AccountOverview.class).getBody());
   }

   public DealsAndOrders getDealsAndOrders() {
      return (apiClient.call(HTTPMethod.GET, headers, null,
                             Constants.DEALS_AND_ORDERS_PATH, DealsAndOrders.class).getBody());
   }

   public HeldPositions getPositions() {
      return (apiClient.call(HTTPMethod.GET, headers, null,
                             Constants.POSITIONS_PATH, HeldPositions.class).getBody());
   }

   public Order placeOrder(OrderOptions orderOptions) {
      System.out.println(orderOptions.toJson());
      System.out.println(headers);
      return (apiClient.call(HTTPMethod.POST, headers, orderOptions.toJson(),
                             Constants.ORDER_PLACE_PATH, Order.class).getBody());
   }

   public Order editOrder(EditOrder editOrderOptions) {
      return (apiClient.call(HTTPMethod.PUT, headers, editOrderOptions.toJson(),
                             editOrderOptions.getEditOrderExtension(), Order.class).getBody());
   }

   public Order deleteOrder(DeleteOrder deleteOrderOptions) {
      return (apiClient.call(HTTPMethod.DELETE, headers, deleteOrderOptions.toJson(),
                             deleteOrderOptions.getDeleteOrderExtension(), Order.class).getBody());
   }
   public OrderBookInfo getOrderbookinfo(String orderbookId, InstrumentType instrumentType) {
      return (apiClient.call(HTTPMethod.GET, headers, null,
                             Constants.ORDERBOOK_PATH
                                     .replace("{0}", instrumentType.toString())
                                     .replace("{1}", orderbookId)
              , OrderBookInfo.class).getBody());
   }

   public InsightReport getInsightReport(String accountId, String timePeriod) {
      return (apiClient.call(HTTPMethod.GET, headers, null,
                             Constants.INSIGHTS_PATH
                                     .replace("{0}", timePeriod)
                                     .replace("{1}", accountId)
              , InsightReport.class).getBody());
   }

   public StockInfo getStockInfo(String tickerId, String instrumentType){
      return (apiClient.call(HTTPMethod.GET, headers, null,
                             Constants.INSTRUMENT_PATH
                                    .replace("{0}", instrumentType.toUpperCase())
                                    .replace("{1}", tickerId),
                             StockInfo.class
                            )).getBody();
   }

   public ChartData searchInstrument(String query, String instrumentType){
      return (apiClient.call(HTTPMethod.GET, headers, null,
                             Constants.SEARCH_PATH
                                     .replace("{0}", instrumentType.toUpperCase())
                                     .replace("{1}", query),
                             ChartData.class).getBody());
   }

}
