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
