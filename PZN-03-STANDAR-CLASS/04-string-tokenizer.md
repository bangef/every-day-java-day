# StringTokenizer Class

## Pengertian `StringTokenizer`

- StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau string yang lebih kecil.

- Kita dapat memotong String dengan delimeter yang kita mau.

- Perbedaan dengan split split lebih boros memory karen apabila filenya besar maka akan dimasukan semua ke dalam memory. Namun apabila menggunakan `StringTokenizer` kita dapat memberilan kondisi sebagai `lazy load`.

- [StringTokenizer (Java SE 14 &amp; JDK 14)](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/StringTokenizer.html)

## Implementasi `StringTokenizer`

`App.java`

```java
package _04_string_tokenizer;

import java.util.StringTokenizer;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet.";
    stringTokenizerImplementation(text);
    /*
     * Output:
     * Lorem
     * ipsum
     * dolor
     * sit
     * amet.
     */
  }

  public static void stringTokenizerImplementation(String text) {
    StringTokenizer tokenizer = new StringTokenizer(text, " ");

    while (tokenizer.hasMoreTokens()) {
      String token = tokenizer.nextToken();
      System.out.println(token);
    }
  }
}

```


