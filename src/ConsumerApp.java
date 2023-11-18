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
    /*
     * Ouput:
     * Eko
     * Eko
     */
  }
}
