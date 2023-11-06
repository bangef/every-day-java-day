package learn.statis.utils;

public class MathUtils {

  private MathUtils() {
  }

  public static int sum(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}
