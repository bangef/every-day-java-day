# Lambda Optional

## Pengertian Lambda Optional

- Di Java 8, java menyediakan sebuah class baru bernama Optional yang berada di package `java.util`.

- Class ini digunakan sebagai wrapper untuk value yang bisa bernilai null.

- Optional didesain agar kita lebih mudah ketika beroprasi dengan object yang bisa null.

- Karena NullPointerException adalah salah satu hal yang sering sekali ditemui oleh Programmer Java.

## Implementasi Lambda`Optional<T type>`

`LambdaOptional.java`

```java
import java.util.Optional;

public class LambdaOptionalApp {
  public static void main(String[] args) {
    String name1 = "FICRI HANIP";
    String name2 = null;
    sayHello(name1);
    sayHello(name2);
  }

  public static void sayHello(String name) {
    /*
     * 1. Dapat menjabarkan seperti ini
     */
    Optional<String> optionalName = Optional.ofNullable(name);
    Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
    optionalNameUpper.ifPresent(System.out::println);

    /*
     * 2. Atau chaning seperti ini
     */
    Optional.ofNullable(name)
        .map(String::toUpperCase)
        .ifPresentOrElse(
            value -> System.out.println("HELLO " + value),
            () -> System.out.println("HELLO DEFAULT_NAME"));
  }
}

```
