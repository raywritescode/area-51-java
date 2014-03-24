// NowCalendar.java
// Ray Santos
// 23 March 2014

import java.util.*;
import java.text.DateFormatSymbols;

public class NowCalendar
{
   public static void main(String[] args)
   {
      GregorianCalendar now = new GregorianCalendar();
      int month = now.get(Calendar.MONTH);
      int weekday = now.get(Calendar.DAY_OF_WEEK);

      System.out.printf("Current month = %d\n", month + 1);
      System.out.printf("Current weekday = %d\n", weekday);

      int firstDayOfWeek = now.getFirstDayOfWeek();
      System.out.printf("First day of week is %d\n", firstDayOfWeek);

      String[] weekdayShortNames = new DateFormatSymbols().getShortWeekdays();
      System.out.printf("Weekday short name is %s", weekdayShortNames[weekday]);

   }
} // end class
