# StackTraceElement Class

## Pengertian StackTraceElement Class

- Throwable memiliki method yang bernama `getStackTrace()`, dimana menghasilkan Array dari StackTraceElement Object.

- StackTraceElement berisikan informasi tentang, class, file bahkan baris lokasi terjadinya error.

- Classs StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi.

- Cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk memprint ke console detail error StackTraceElement nya.

`App.java`

```java
package learn._stacktrace;

public class App {
  public static void main(String[] args) {
    try {
      sampleEror();
    } catch (RuntimeException exception) {
      exception.printStackTrace();
    }
  }

  public static void sampleEror() {
    try {
      String[] names = {
          "Andi", "Budi", "Caca"
      };
      System.out.println(names[100]);
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }
}
```
