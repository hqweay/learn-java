package basic.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/16/20 6:12 PM
 */
public class DateTest {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date.toString());

    Calendar calendar = Calendar.getInstance();

    System.out.println(calendar.getWeekYear());
  }
}
