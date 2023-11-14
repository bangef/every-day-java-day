# Scanner

## Pengertian Scanner Class

- Scanner sebenarnya bagian dari Java IO (Input Output).

- Class Scanner hadir sejak Java 5.

- Class Scanner adalah class yang bisa digunakan untuk membaca input, entah dari file, console dan lain - lain.

- Class Scanner ini cocok untuk dijadikan object untuk  membaca input user saat kita belajat membuat program Java menggunakan console / terminal.

- [Scanner (Java SE 14 &amp; JDK 14)](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Scanner.html)

## Implementasi `Scanner`

`App.java`

```java
package _08_scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    scannerImplementation();
    /*
     * Output:
     * Input next: dsadasdaasd as
     * dsadasdaasd
     * Input nextLine: asd asdasdas
     * asd asdasdas
     * Input nextInt: 12
     * 12
     * Input nextFloat: 12
     * 12.0
     */
  }

  public static void scannerImplementation() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Input next: ");
      String inputNext = scanner.next(); // hanya dapat menampung satu kata saja
      System.out.println(inputNext);
      scanner.nextLine();
      System.out.print("Input nextLine: ");
      String inputNextLine = scanner.nextLine(); // dapat menampung satubaris kalimat
      System.out.println(inputNextLine);
      System.out.print("Input nextInt: ");
      int inputNextInt = scanner.nextInt(); // dapat menampung tipe data integer, apabila dimasukan float atau double
                                            // hasil akan null
      System.out.println(inputNextInt);
      scanner.nextLine();
      System.out.print("Input nextFloat: ");
      float inputNextFloat = scanner.nextFloat(); // dapat menampung tipe data float dan integer namun akan di casting
                                                  // ke float hasil akhirnya
      System.out.println(inputNextFloat);

    } catch (InputMismatchException exception) {
      System.out.println(exception.getMessage());
    }
  }
}

```


