# Package java.util.function

## Pengertian Package `java.util.function`

- Saat Java 8 keluar dengan fitur Lambda nya

- Java juga menyedialan sebuah package baru bernama `java.util.function`.

- Package ini berisikan banyak sekali function interface yang bisa kita gunakan untuk kebutuhan membuat lambda.

- Dengan menggunakan interface-interface yang ada di package ini, kita mungkin tidak perlu lagi membuat sendiri functional interface secara manual.

## Interface Consumer

- Digunakan apabila hanya ingin menampung nilai dari parameter saja.

`ConsumerApp.java`

```java
import java.util.function.Consumer;

public class ConsumerApp {
  public static void main(String[] args) {
    /*
     * 1. Anonymouse class
     */
    Consumer<String> consumer1 = new Consumer<>() {
      @Override
      public void accept(String value) {
        System.out.println(value);
      }
    };

    /*
     * 2. Implement lambda expression
     */
    Consumer<String> consumer2 = value -> System.out.println(value);

    consumer1.accept("Eko");
    consumer2.accept("Eko");
  }
}

```

## Interface Functional`<T type, R return>`

- Apabila ingin menampung data dan mengembalikan nilainya.

`FunctionalApp.java`

```java
import java.util.function.Function;

public class FunctioanlApp {
  public static void main(String[] args) {
    /*
     * Dapat menggunakan imterface Function untuk menerima 2 parameter:
     * 1. untuk menerima data
     * 2. untuk mengembalikan nilai data
     */
    Function<String, String> functional = name -> name;
    System.out.println(functional.apply("Eko"));
  }
}

```

## Interface Predicate `<T type>`

- Apabila ingin mengembalikan nilai dengan tipe `boolean`.

`PredicateApp.java`

```java
import java.util.function.Predicate;

public class PredicateApp {
  public static void main(String[] args) {
    Predicate<String> predicate = (name) -> name.isEmpty();
    boolean isBlank = predicate.test("");
    System.out.println(isBlank);
    /*
     * Output:
     * true
     */
  }
}

```

## Interface Supplier`<T type>`

- Apabila ingin mengembalikan nilai tanpa harus mengirim ke parameter.

`SupplierApp.java`

```java
import java.util.function.Supplier;

public class SupplierApp {
  public static void main(String[] args) {
    Supplier<String> supplier = () -> "testing";
    System.out.println(supplier.get());
    /*
     * Output:
     * testing
     */
  }
}
```


