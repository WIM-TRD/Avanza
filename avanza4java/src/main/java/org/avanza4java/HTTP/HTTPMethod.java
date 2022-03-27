package org.avanza4java.HTTP;

public class HTTPMethod {
   public static final HTTPMethod GET = new HTTPMethod("GET");
   public static final HTTPMethod POST = new HTTPMethod("POST");
   public static final HTTPMethod HEAD = new HTTPMethod("HEAD");
   public static final HTTPMethod OPTIONS = new HTTPMethod("OPTIONS");
   public static final HTTPMethod PUT = new HTTPMethod("PUT");
   public static final HTTPMethod DELETE = new HTTPMethod("DELETE");
   public static final HTTPMethod TRACE = new HTTPMethod("TRACE");
   private String method = "";

   public HTTPMethod(String method) {
      this.method = method;
   }

   public String getHttpMethod() {
      return method;
   }
}
