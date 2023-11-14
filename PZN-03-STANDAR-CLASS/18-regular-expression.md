# Regular Expression

## Pengertuan Regular Expression atau Regex

- Regular Expression atau disingkat *regex* adalah cara untuk melakukan pola pencarian.

- Biasanya dilakukan untuk pencarian dalam String.

- Secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah di text editor atau di aplikasi word.

- Regex adalah pencarian yang lebih advanced dibanding pencarian text biasanya, misal kita ingin mencari semua kata yang mengandung diawali huruf a dan diakhiri huruf a, dan lain-lain.

## Regex Package

- Java sudah menyediakan package java.util.regex yang berisikan utilitas untuk melakukan proses regular expression.

- Secara garis besar terdapat 2 class yang kita gunakan, yaitu Pattren class dan Matcher class.

- Pattren class adalah representasi hasil kompilasi dari pola regular expression yang kita buat.

- Matcher class adalah engine untuk melakukan pencarian dari pattern yan sudah kita buat.

## Implementasi `Pattren` dan `Matcher`

`App.java`

```java
package _18_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ornare est nibh, ac iaculis mauris faucibus at.";
    String name = "Eko Kurniawan Khanendy Programer Zaman Now";
    String regex = "[a-zA-Z]*[a][a-zA-Z]*";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    Matcher matcher2 = pattern.matcher(name);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
    /*
     * Output:
     * amet
     * adipiscing
     * Aliquam
     * ornare
     * ac
     * iaculis
     * mauris
     * faucibus
     * at
     */
    System.out.println();
    while (matcher2.find()) {
      System.out.println(matcher2.group());
    }
    /*
     * Output:
     * Kurniawan
     * Khanendy
     * Programer
     * Zaman
     */
  }
}
```


