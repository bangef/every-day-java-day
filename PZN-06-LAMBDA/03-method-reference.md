# Method Reference

## Pengertian Method Reference

- Kadang saat membuat lambda, isi lambda hanya mengakses method lain atau mengakses method yang ada di parameter method lambda nya.

- Kita bisa mempersingkat pembuatan lambda tersebut dengan method reference.

## Implementas Methode Reference

`MethodReference.java`

```java
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
  }
}
```

`utils/StringUtils.java`

```java
package utils;

public class StringUtils {
  private StringUtils() {
  }

  public static boolean isLowerCase(String word) {
    for (char character : word.toCharArray()) {
      if (!Character.isLowerCase(character)) {
        return false;
      }
    }
    return true;
  }
}
```

## Method Reference Non Static

### Implemenstasi Kode

`App.java`

```java
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
    for (char character : value.toCharArray()) {
      if (!Character.isLowerCase(character)) {
        return false;
      }
    }
    return true;
  }
}
```
