package org.avanza4java.Config;

public class Constants {
   public static final String AVANZA_BASE = "https://www.avanza.se/";
   public static final String POSITIONS_PATH = "/_mobile/account/positions";
   public static final String OVERVIEW_PATH = "/_mobile/account/overview";
   public static final String ACCOUNT_OVERVIEW_PATH = "/_mobile/account/{0}/overview";
   public static final String DEALS_AND_ORDERS_PATH = "/_mobile/account/dealsandorders";
   public static final String WATCHLISTS_PATH = "/_mobile/usercontent/watchlist";
   public static final String WATCHLISTS_ADD_DELETE_PATH = "/_api/usercontent/watchlist/{0}/orderbooks/{1}";
   public static final String STOCK_PATH = "/_mobile/market/stock/{0}";
   public static final String FUND_PATH = "/_mobile/market/fund/{0}";
   public static final String CERTIFICATE_PATH = "/_mobile/market/certificate/{0}";
   public static final String INSTRUMENT_PATH = "/_mobile/market/{0}/{1}";
   public static final String ORDERBOOK_PATH = "/_mobile/order/{0}?orderbookId={1}";
   public static final String ORDERBOOK_LIST_PATH = "/_mobile/market/orderbooklist/{0}";
   public static final String CHARTDATA_PATH = "/_mobile/chart/orderbook/{0}";
   public static final String ORDER_PLACE_DELETE_PATH = "/_api/order";
   public static final String ORDER_EDIT_PATH = "/_api/order/{0}/{1}";
   public static final String ORDER_GET_PATH = "/_mobile/order/{0}";
   public static final String SEARCH_PATH = "/_mobile/market/search/{0}";
   public static final String AUTHENTICATION_PATH = "/_api/authentication/sessions/usercredentials";
   public static final String TOTP_PATH = "/_api/authentication/sessions/totp";
   public static final String INSPIRATION_LIST_PATH = "/_mobile/marketing/inspirationlist/{0}";
   public static final String TRANSACTIONS_PATH = "/_mobile/account/transactions/{0}";
   public static final String INSIGHTS_PATH = "/_cqbe/insights/?timePeriod={0}&accountIds={1}";

   public static final String STOCK = "stock";
   public static final String FUND = "fund";
   public static final String BOND = "bond";
   public static final String OPTION = "option";
   public static final String FUTURE_FORWARD = "future_forward";
   public static final String CERTIFICATE = "certificate";
   public static final String WARRANT = "warrant";
   public static final String ETF = "exchange_traded_fund";
   public static final String INDEX = "index";
   public static final String PREMIUM_BOND = "premium_bond";
   public static final String SUBSCRIPTION_OPTION = "subscription_option";
   public static final String EQUITY_LINKED_BOND = "equity_linked_bond";
   public static final String CONVERTIBLE = "convertible";

   public static final String TODAY = "TODAY";
   public static final String ONE_MONTH = "ONE_MONTH";
   public static final String THREE_MONTHS = "THREE_MONTHS";
   public static final String ONE_WEEK = "ONE_WEEK";
   public static final String THIS_YEAR = "THIS_YEAR";
   public static final String ONE_YEAR = "ONE_YEAR";
   public static final String FIVE_YEARS = "FIVE_YEARS";

   public static final String HIGHEST_RATED_FUNDS = "HIGHEST_RATED_FUNDS";
   public static final String LOWEST_FEE_INDEX_FUNDS = "LOWEST_FEE_INDEX_FUNDS";
   public static final String BEST_DEVELOPMENT_FUNDS_LAST_THREE_MONTHS = "BEST_DEVELOPMENT_FUNDS_LAST_THREE_MONTHS";
   public static final String MOST_OWNED_FUNDS = "MOST_OWNED_FUNDS";

   public static final String OPTIONS = "options";
   public static final String FOREX = "forex";
   public static final String DEPOSIT_WITHDRAW = "deposit-withdraw";
   public static final String BUY_SELL = "buy-sell";
   public static final String DIVIDEND = "dividend";
   public static final String INTEREST = "interest";
   public static final String FOREIGN_TAX = "foreign-tax";

   public static final String ACCOUNTS = "accounts";
   public static final String QUOTES = "quotes";
   public static final String ORDERDEPTHS = "orderdepths";
   public static final String TRADES = "trades";
   public static final String BROKERTRADESUMMARY = "brokertradesummary";
   public static final String POSITIONS = "positions";
   public static final String ORDERS = "orders";
   public static final String DEALS = "deals";

   public static final String TWOWAYFACTORACTIVATION = "twoFactorActivation";
   public static final String TWOWAYFACTORLOGIN = "twoFactorLogin";
   public static final String TOTP = "TOTP";

   public static final String COOKIE = "Cookie";
   public static final String AUTHENTICATIONSESSION = "X-authenticationSession";
   public static final String SECURITYTOKEN = "X-SecurityToken";
   public static final String REGISTRATIONCOMPLETE = "registrationComplete";
   public static final String CUSTOMERID = "customerId";
   public static final String PUSHSUBSCRIPTIONID = "pushSubscriptionId";
   public static final String TRANSACTIONID = "pushSubscriptionId";
   public static final String METHOD = "method";

   public static int maxInactiveMinutes = 30;
}
