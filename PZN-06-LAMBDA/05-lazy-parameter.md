# Lazy Parameter

## Pengertian Lazy Parameter

- Java tidak memiliki fitur parameter lazy seperti di bahasa pemrograman seperti Scala.

- Lazy parameter artinya, parameter tersebut hanya akan dieksekusi ketika diakses.

- Untungnya, dengan menggunakan Lambda, kita bisa membuat parameter layaknya lazy parameter.

## Implementasi `Lazy Parameter`

`LazyParameter.java`

```java
import java.util.function.Supplier;

public class LazyParameterApp {
  public static void main(String[] args) {
    testScore(60, getName());
    /*
     * Output:
     * getName() dipanggil
     * Coba lagi Tahun Depan!
     */
    testScore2(79, () -> getName());
    /*
     * Output:
     * Coba lagi Tahun Depan!
     */
  }

  /*
   * 2. Menerapkan Lazy Parameter, sehingga name tidak akan dipanggil apabila
   * tidak membutuhkan nilai name tersebut
   */
  private static void testScore2(int score, Supplier<String> name) {
    if (score >= 80) {
      System.out.println("Selamat " + name.get() + ", anda lulus!");
    }
    if (score < 80) {
      System.out.println("Coba lagi Tahun Depan!");
    }
  }

  /*
   * 1. Tidak menerapkan Lazy Parameter, sehingga name akan tetap dipanggil
   * biarpun tidak membutuhkan nilainya.
   */
  private static void testScore(int score, String name) {
    if (score >= 80) {
      System.out.println("Selamat " + name + ", anda lulus!");
    }
    if (score < 80) {
      System.out.println("Coba lagi Tahun Depan!");
    }
  }

  private static String getName() {
    System.out.println("getName() dipanggil");
    return "Eko";
  }
}

```
