package _09_date_and_calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date); // mendapatkan tanggal dan waktu sekarang.
    System.out.println(date.getTime()); // mendapatkan millisecond tanggal dan waktu sekarang.

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 1998);
    calendar.set(Calendar.MONTH, Calendar.MARCH); // bulan diawali dengan january index ke - 0
    calendar.set(Calendar.DAY_OF_MONTH, 5);

    Date date2 = calendar.getTime();
    System.out.println(date2);
    /*
     * Output:
     * Fri Nov 10 10:10:04 WIB 2023
     * 1699585804420
     * Thu Mar 05 10:10:04 WIB 1998
     */

    getCurrentAge();
    /*
     * Output:
     * Enter u're Birth Day (sample: 12 or 30): 5
     * Enter u're Birth Month (sample for january: 1): 3
     * Enter u're Birth Year (sample: 1995): 1998
     * U're current age is 25 year, 8 month, 5 day.
     */
  }

  // buatkan program berapa umur anda dari sekarang
  public static void getCurrentAge() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter u're Birth Day (sample: 12 or 30): ");
    int inputDayBirth = scanner.nextInt();
    System.out.print("Enter u're Birth Month (sample for january: 1): ");
    int inputMonthBirth = scanner.nextInt();
    System.out.print("Enter u're Birth Year (sample: 1995): ");
    int inputYearBirth = scanner.nextInt();
    scanner.close();
    Calendar curCalendar = Calendar.getInstance();
    int resultYear = curCalendar.get(Calendar.YEAR) - inputYearBirth;
    int resultMonth = (curCalendar.get(Calendar.MONTH) + 1) - inputMonthBirth;
    int resultDay = curCalendar.get(Calendar.DAY_OF_MONTH) - inputDayBirth;
    StringBuilder builder = new StringBuilder();
    builder.append("U're current age is ");
    builder.append(resultYear + " year, ");
    builder.append(resultMonth + " month, ");
    builder.append(resultDay + " day.");
    System.out.println(builder.toString());
  }
}
