package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.Authentication;

import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Authentication.TwoFactorLogin;
import org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.HTTP.Responses.HTTPResponse;

public class LoginResponse extends HTTPResponse {
   TwoFactorLogin twoFactorLogin;

   public TwoFactorLogin getTwoFactorLogin() {
      return twoFactorLogin;
   }
}
