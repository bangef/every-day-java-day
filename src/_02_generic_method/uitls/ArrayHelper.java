package _02_generic_method.uitls;

public class ArrayHelper {
  private ArrayHelper() {
  }

  public static <T> int countLength(T[] arrays) {
    return arrays.length;
  }
}
