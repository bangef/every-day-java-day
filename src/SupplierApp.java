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
