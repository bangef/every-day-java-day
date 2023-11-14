# String Builder dan String Buffer

## Pengertian Immutable String

- `String` adalah `tipe data immutable`, artinya `tidak bisa berubah isinya`, saat kita mengubah string. Sebenarnya yang dilakukan di Java adalah membuat String baru.

- Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan String, karena akan memakan memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan `StringBuffer` atau `StringBuilder`.

## Pengertian `StringBuffer` dan `StringBuilder`

- Kemampuan `StringBuffer` dan `StringBuilder` cukup sama, bisa digunakan untuk `memanipulasi String`.

- Yang `membedakan` adalah, `StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe`.

- Jika kita ingin `memanipulasi String secara pararel bersamaan` disarankan menggunakan `StringBuffer`, namun `jika tidak butuh pararel`, cukup gunakan `StringBuilder`.

- Karena `StringBuffer` dibuat agar `thread safe`, maka secara otomatis `performanya lebih lambat` dibandingkan `StringBuilder`.

- [StringBuilder (Java SE 14 &amp; JDK 14)](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuilder.html)

- [StringBuffer (Java SE 14 &amp; JDK 14)](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/StringBuffer.html)

## Implematasi StringBuilder dan StringBuffer

`App.java`

```java
package _02_stringbuilder_class;

public class App {
  public static void main(String[] args) {
    stringBuilderImplementation();
    stringBufferImplementation();
  }

  public static void stringBuilderImplementation() {
    StringBuilder builder = new StringBuilder();
    builder.append("=== String Builder ===");
    builder.append("\n");
    builder.append("Ficri");
    builder.append(" ");
    builder.append("Hanip");
    builder.append("\n");
    builder.append("Capacity: ");
    builder.append(builder.capacity());
    builder.append("\n");
    System.out.println(builder.toString());
  }

  public static void stringBufferImplementation() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("=== String Builder ===");
    buffer.append("\n");
    buffer.append("Alisa");
    buffer.append(" ");
    buffer.append("Putri");
    buffer.append(" ");
    buffer.append("Arlini");
    buffer.append("\n");
    buffer.append("Capacity: ");
    buffer.append(buffer.capacity());
    buffer.append("\n");
    System.out.println(buffer.toString());
  }
}
```


