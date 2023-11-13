package _14_objects_class;

import java.util.Date;
import java.util.Objects;

public class App {
  public static void main(String[] args) {
    Date date = new Date();
    validateObject(date);
    validateObject(date, null);
  }

  /*
   * Cek validasi apabila tidak menggunakan Objects Class
   */
  public static void validateObject(Date date) {
    if (date != null) {
      System.out.println(date.toString());
    }
    if (date != null) {
      System.out.println(date.hashCode());
    }
  }

  public static void validateObject(Date date, Object test) {
    String toString = Objects.toString(date);
    int hashCode = Objects.hashCode(date);
    System.out.println(toString);
    System.out.println(hashCode);
  }
}
