# Lambda di Collection

## Pengertian Lambda di Collection

- Saat fitur Lambda keluar di Java 8, ada banyak sekali default method yang ditambahkan ke Java.

- Beberapa ada default method yang banyak memanfaatkan fitur lambda.

- Di materi ini kita akan bahas beberapa method yang memanfaatkan Lambda.

## Implementasi Kode `consumer, predicate, biConsumer`

`LambdaCollectionApp.java`

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaCollectionApp {
  public static void main(String[] args) {
    /*
     * Imutable List
     */
    List<String> names = List.of("Irma", "Buid", "Juki");
    List<Integer> numbers = List.of(400, 200, 100);
    /*
     * 1. Cara pertama menggunakan anonymouse class
     */
    System.out.println("=== Anonymouse Class ===");
    names.forEach(new Consumer<String>() {
      @Override
      public void accept(String name) {
        System.out.println(name);
      }
    });
    numbers.forEach(new Consumer<Integer>() {
      @Override
      public void accept(Integer number) {
        System.out.println(number);
      }
    });

    /*
     * 2. Cara kedua menggunakan lamda
     */
    System.out.println("=== Lambda Collection ===");
    names.forEach(name -> System.out.println(name));
    numbers.forEach(number -> System.out.println(number));

    /*
     * 3. Cara ketiga menggunakan method reference
     */

    System.out.println("=== Method Reference ===");
    names.forEach(System.out::println);
    numbers.forEach(System.out::println);

    /*
     * Iretable List
     */
    List<Integer> numbersInteger = new ArrayList<>();
    numbersInteger.addAll(List.of(400, 545, 12, 4, 57, 2, 54));
    /*
     * 1. Menggunakan Anonymouse Class
     */
    System.out.println("=== Anonymouse Class ===");
    numbersInteger.removeIf(new Predicate<Integer>() {
      public boolean test(Integer number) {
        return number > 100;
      }
    });
    System.out.println(numbersInteger.toString());

    /*
     * 2. Menggunakan lambda
     */
    System.out.println("=== Method Reference ===");
    numbersInteger.removeIf(number -> number > 5);
    System.out.println(numbersInteger.toString());

    Map<String, String> mappedName = new HashMap<>();
    mappedName.put("first", "Ficri");
    mappedName.put("last", "Hanip");

    /*
     * 1. Menggunakan Anonymouse Class
     */
    System.out.println("=== Anonymouse Class ===");
    mappedName.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String key, String value) {
        System.out.println(key + " name : " + value);
      }
    });

    /*
     * 2. Menggunakan lambda
     */
    System.out.println("=== Method Reference ===");
    mappedName.forEach((key, value) -> System.out.println(key + " name : " + value));
  }
}
```


