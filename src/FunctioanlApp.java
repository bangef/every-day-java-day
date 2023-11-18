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
