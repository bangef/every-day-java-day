# Properties Class

## Pengertian Properties Class

- Kebanyakan aplikasi Java akan menyimpan konfigurasi file dalam bentuk properties file.

- Properties file adalah file yang berisi key value yang dipisahkan dengan tanda sama dengan (=).

- Properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita.

- Properties Class adalah class yang bisa kita gunakan untuk mengambil atau menyimpan informasi ke file properties.

- [Properties (Java SE 14 &amp; JDK 14)](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Properties.html)

## Implementasi `Properties Class`

`App.java`

```java
package _16_properties;

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

```

 `_16_properties/application.properties`

```properties
#Komentar
#Mon Nov 13 07:37:42 WIB 2023
address.city=Depok
address.country=Indonesia
name.first=Ficri
name.last=Hanip
name.middle=D
```


