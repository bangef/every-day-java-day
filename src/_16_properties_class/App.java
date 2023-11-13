package _16_properties_class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
  public static void main(String[] args) {
    /*
     * Path diambil dari folder terluar object
     */
    String pathFileProperties = "src/_16_properties/application.properties";
    try (FileInputStream inputStreamFile = new FileInputStream(pathFileProperties)) {
      Properties properties = new Properties();
      properties.load(inputStreamFile);
      System.out.println(properties.getProperty("name.first"));
      System.out.println(properties.getProperty("name.last"));

      try (FileOutputStream outputStream = new FileOutputStream(pathFileProperties)) {
        // properties.remove("hobby");
        properties.put("name.middle", "D");
        properties.store(outputStream, "Komentar");
      }
      /*
       * Menambahkan varaible ke dalam application.properties:
       * name.middle=D
       */
    } catch (IOException exception) {
      System.out.println(exception.getMessage());
    }
    /*
     * Output:
     * Ficri
     * Hanip
     */
  }
}
