package org.avanza4java.HTTP.Responses.Authentication;

import org.avanza4java.HTTP.Authentication.TwoFactorLogin;
import org.avanza4java.HTTP.Responses.HTTPResponse;

public class LoginResponse extends HTTPResponse {
   TwoFactorLogin twoFactorLogin;

   public TwoFactorLogin getTwoFactorLogin() {
      return twoFactorLogin;
   }
}
