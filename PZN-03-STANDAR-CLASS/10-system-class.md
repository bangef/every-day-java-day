# System Class

## Pengertian System Class

- Class System adalah class yang berisikan banyak *utility static method* di Java, contohnya sebelumnya kita sudah sering menggunakan method print milik field out di class System.

- [System (Java SE 14 &amp; JDK 14)](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/System.html)

## Method si System Class

| Method                    | Keterangan                                       |
| ------------------------- | ------------------------------------------------ |
| String getenv(key)        | Mendapatkan environment variable sistem operasi. |
| void exit(status)         | Menghentikan program Java                        |
| long currentTimeMilis()   | Mendapatkan waktu saat ini dalam milisecond      |
| long nanoTime()           | Mendapatkan waktu saat ini dalam milisecond      |
| void gc()                 | Menjalankan Java garbage collection              |
| ... dan masih banyak lagi |                                                  |

## Implemetasi `System Class`

`getenv(key)`

`App.java`

```java
package _10_system;

public class App {
  public static void main(String[] args) {
    Long currentTimeMiller = System.currentTimeMillis();
    System.out.println("Current Time Millis: " + currentTimeMiller);
    Long currentNanoTime = System.nanoTime();
    System.out.println("Current Time Millis: " + currentNanoTime);
    String userDomain = System.getenv("USERDOMAIN");
    System.out.println("User Domain: " + userDomain);
    System.gc();
    System.exit(0);
    System.out.println("ini tidak akan dijalankan!");
    /*
     * Output:
     * Current Time Millis: 1699662440641
     * Current Time Millis: 304185934215000
     * User Domain: DESKTOP-AKQOT4C
     */
  }
}
```


