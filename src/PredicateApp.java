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
