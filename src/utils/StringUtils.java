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
