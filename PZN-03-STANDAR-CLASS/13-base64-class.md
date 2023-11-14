# Base64 Class

## Pengertian Base64 Class

- Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding base64.

- Buat programmer web pasti tahu tentang base64, yaitu encoding yang bisa dugunakan untuk mengubah binary data ke text yang aman.

- Aman disini bukan dari sisi security, tapu aman dari kesalahan parsing.

- [Base64 (Java SE 14 &amp; JDK 14)](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Base64.html)

## Implementasi `Base64 Class`

`App.java`

```java
package _13_base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsusum dolor amet";
    byte[] textBytes = text.getBytes(); // convert to array byte
    Encoder encoder = Base64.getEncoder(); // get encoder
    String encodedString = encoder.encodeToString(textBytes); // encode string
    System.out.println(encodedString); // print output

    Decoder decoder = Base64.getDecoder(); // get decoder
    byte[] byteDecoder = decoder.decode(encodedString); // decode from encoded string
    String decodeString = new String(byteDecoder); // convert to String, with inisiate object with constructor params
                                                   // byte
    System.out.println(decodeString); // print output
    /*
     * Output:
     * TG9yZW0gaXBzdXN1bSBkb2xvciBhbWV0
     * Lorem ipsusum dolor amet
     */
  }
}
```
