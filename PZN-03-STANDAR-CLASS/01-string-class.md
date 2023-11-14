# String Class

## Pengertian Class

- Seperti yang pernah dibahas di materi Java Dasar, String adalah object, artinya dia memiliki representasi class nya.

- Ada banyak sekali method yang bisa kita gunakan di String, kita bisa melihat detail method apa saja yang tersedia dihalaman dokumentasi javadoc nya.

- [String (Java SE 19 &amp; JDK 19)](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/String.html)

## Beberapa method di String Class

| Method                     | Keterangan                                   |
| -------------------------- | -------------------------------------------- |
| `String toLowerCase()`     | Membuat string baru dengan format lower case |
| `String toUpperCase()`     | Membuat string baru dengan format upper case |
| `int length`               | Mendapatkan panjang string                   |
| `boolean startWith(value)` | Mengecek apakah dimulai dengan string value  |
| `boolean endWith(value)`   | Mengecek apakah diakhiri dengan string value |
| `String[] split(value)`    | Memotong string dengan string value          |

## Implementasi Code

### `toLowerCase()` && `toUpperCase()`

`App.java`

```java
package _01_string_class;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quam quisque id diam vel quam elementum pulvinar. In ornare quam viverra orci sagittis eu volutpat odio facilisis. Nulla at volutpat diam ut venenatis. Sed egestas egestas fringilla phasellus faucibus scelerisque. Non arcu risus quis varius quam quisque id diam. Turpis cursus in hac habitasse platea dictumst quisque. Massa tempor nec feugiat nisl pretium fusce id velit ut. Ullamcorper a lacus vestibulum sed arcu non. Diam in arcu cursus euismod quis viverra nibh cras. Varius sit amet mattis vulputate enim. Semper eget duis at tellus at. Lacus sed viverra tellus in hac habitasse platea dictumst vestibulum. Elit duis tristique sollicitudin nibh sit. Orci dapibus ultrices in iaculis nunc sed. Feugiat pretium nibh ipsum consequat nisl. A iaculis at erat pellentesque adipiscing commodo elit at imperdiet.";
    formatStringToLowerCase(text);
    formatStringToUpperCase(text);
  }

  public static void formatStringToLowerCase(String word) {
    String stringLower = word.toLowerCase();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("=== Format String To Lower Case ===\n");
    stringBuilder.append("before: \n\n");
    stringBuilder.append(word + "\n\n");
    stringBuilder.append("after: \n\n");
    stringBuilder.append(stringLower + "\n\n");
    stringBuilder.append("\n");
    System.out.println(stringBuilder.toString());
  }

  public static void formatStringToUpperCase(String word) {
    String stringUpper = word.toUpperCase();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("=== Format String To Upper Case ===\n");
    stringBuilder.append("before: \n\n");
    stringBuilder.append(word + "\n\n");
    stringBuilder.append("after: \n\n");
    stringBuilder.append(stringUpper + "\n\n");
    stringBuilder.append("\n");
    System.out.println(stringBuilder.toString());
  }
}
```

### `length()`

`App.java`

```java
package _01_string_class;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quam quisque id diam vel quam elementum pulvinar. In ornare quam viverra orci sagittis eu volutpat odio facilisis. Nulla at volutpat diam ut venenatis. Sed egestas egestas fringilla phasellus faucibus scelerisque. Non arcu risus quis varius quam quisque id diam. Turpis cursus in hac habitasse platea dictumst quisque. Massa tempor nec feugiat nisl pretium fusce id velit ut. Ullamcorper a lacus vestibulum sed arcu non. Diam in arcu cursus euismod quis viverra nibh cras. Varius sit amet mattis vulputate enim. Semper eget duis at tellus at. Lacus sed viverra tellus in hac habitasse platea dictumst vestibulum. Elit duis tristique sollicitudin nibh sit. Orci dapibus ultrices in iaculis nunc sed. Feugiat pretium nibh ipsum consequat nisl. A iaculis at erat pellentesque adipiscing commodo elit at imperdiet.";
    lengthOfString(text);
tringBuilder.toString());
  }

  public static void lengthOfString(String word) {
    int lengthString = word.length();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("=== Length of String ===\n");
    stringBuilder.append("length of string from parameter is a " + lengthString + "\n");
    System.out.println(stringBuilder.toString());
  }
}
```

`startWith(String prefix)`

`App.java`

```java
package _01_string_class;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quam quisque id diam vel quam elementum pulvinar. In ornare quam viverra orci sagittis eu volutpat odio facilisis. Nulla at volutpat diam ut venenatis. Sed egestas egestas fringilla phasellus faucibus scelerisque. Non arcu risus quis varius quam quisque id diam. Turpis cursus in hac habitasse platea dictumst quisque. Massa tempor nec feugiat nisl pretium fusce id velit ut. Ullamcorper a lacus vestibulum sed arcu non. Diam in arcu cursus euismod quis viverra nibh cras. Varius sit amet mattis vulputate enim. Semper eget duis at tellus at. Lacus sed viverra tellus in hac habitasse platea dictumst vestibulum. Elit duis tristique sollicitudin nibh sit. Orci dapibus ultrices in iaculis nunc sed. Feugiat pretium nibh ipsum consequat nisl. A iaculis at erat pellentesque adipiscing commodo elit at imperdiet.";
    isStartWithText(text, "Lorem"); // sesitive-case
  }

  public static void isStartWithText(String text, String prefix) {
    boolean isStartWithPrefix = text.startsWith(prefix);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("=== is text start with ===\n");
    stringBuilder.append("is text start with prefix: " + isStartWithPrefix + "\n");
    System.out.println(stringBuilder.toString());
  }
}
```

`endWith(String prefix)`

`App.java`

```java
package _01_string_class;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quam quisque id diam vel quam elementum pulvinar. In ornare quam viverra orci sagittis eu volutpat odio facilisis. Nulla at volutpat diam ut venenatis. Sed egestas egestas fringilla phasellus faucibus scelerisque. Non arcu risus quis varius quam quisque id diam. Turpis cursus in hac habitasse platea dictumst quisque. Massa tempor nec feugiat nisl pretium fusce id velit ut. Ullamcorper a lacus vestibulum sed arcu non. Diam in arcu cursus euismod quis viverra nibh cras. Varius sit amet mattis vulputate enim. Semper eget duis at tellus at. Lacus sed viverra tellus in hac habitasse platea dictumst vestibulum. Elit duis tristique sollicitudin nibh sit. Orci dapibus ultrices in iaculis nunc sed. Feugiat pretium nibh ipsum consequat nisl. A iaculis at erat pellentesque adipiscing commodo elit at imperdiet.";
    isEndWith(text, "imperdiet."); // sensitive-case
  }

  public static void isEndWith(String text, String prefix) {
    boolean isEndWithPrefix = text.endsWith(prefix);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("=== is text end with ===\n");
    stringBuilder.append("is text end with prefix: " + isEndWithPrefix + "\n");
    System.out.println(stringBuilder.toString());
  }
}
```

`split(String delimeter)`

`App.java`

```java
package _01_string_class;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quam quisque id diam vel quam elementum pulvinar. In ornare quam viverra orci sagittis eu volutpat odio facilisis. Nulla at volutpat diam ut venenatis. Sed egestas egestas fringilla phasellus faucibus scelerisque. Non arcu risus quis varius quam quisque id diam. Turpis cursus in hac habitasse platea dictumst quisque. Massa tempor nec feugiat nisl pretium fusce id velit ut. Ullamcorper a lacus vestibulum sed arcu non. Diam in arcu cursus euismod quis viverra nibh cras. Varius sit amet mattis vulputate enim. Semper eget duis at tellus at. Lacus sed viverra tellus in hac habitasse platea dictumst vestibulum. Elit duis tristique sollicitudin nibh sit. Orci dapibus ultrices in iaculis nunc sed. Feugiat pretium nibh ipsum consequat nisl. A iaculis at erat pellentesque adipiscing commodo elit at imperdiet.";
    splitText(text, " ");
  }

  public static void splitText(String text, String delimeter) {
    String[] separeteText = text.split(delimeter);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("=== split ===\n");
    stringBuilder.append("before: \n");
    stringBuilder.append(text + "\n");
    stringBuilder.append("\n");
    stringBuilder.append("after: \n");
    int i = 0;
    for (String string : separeteText) {
      stringBuilder.append(++i + ". " + string + "\n");
    }
    stringBuilder.append("\n");
    System.out.println(stringBuilder.toString());
  }
}
```
