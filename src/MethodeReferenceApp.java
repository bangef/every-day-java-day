
import java.util.function.Predicate;

import utils.StringUtils;

public class MethodeReferenceApp {

  public static void main(String[] args) {
    /*
     * 1. Version Anonymouse Class
     */
    Predicate<String> predicateIsLowerCaseOne = new Predicate<String>() {
      @Override
      public boolean test(String word) {
        return StringUtils.isLowerCase(word);
      }
    };

    /*
     * 2. Version Lambda Expression
     */
    Predicate<String> predicateIsLowerCaseTwo = word -> StringUtils.isLowerCase(word);

    /*
     * 3. Version Method References
     */
    Predicate<String> predicateIsLowerCaseThree = StringUtils::isLowerCase;

    System.out.println(predicateIsLowerCaseOne.test("testtet"));
    System.out.println(predicateIsLowerCaseTwo.test("JNKJnNJN"));
    System.out.println(predicateIsLowerCaseThree.test("asdasd"));

    /*
     * 4. excute run() di class App
     */
    App app = new App();
    app.run();
  }
}

class App {
  public void run() {
    /*
     * Method Reference Non Static, yang methodnnya berada di dalam class tersebut.
     */
    Predicate<String> predicateIsLowerCaseOne = this::isLowerCase;
    System.out.println(predicateIsLowerCaseOne.test("testtet"));
    System.out.println(predicateIsLowerCaseOne.test("JNKJnNJN"));
  }

  public boolean isLowerCase(String value) {
    for (Character character : value.toCharArray()) {
      if (!Character.isLowerCase(character)) {
        return false;
      }
    }
    return true;
  }
}
