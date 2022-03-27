package org.wTrader.utils.avanzaForJava.avanza4java.src.main.java.org.avanza4java.Utils.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
   public static String parseDate(Date date) {
      String retVal = "";
      LocalDateTime ldt = LocalDateTime.now();
      retVal = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.GERMANY).format(ldt);
      return retVal;
   }
}
