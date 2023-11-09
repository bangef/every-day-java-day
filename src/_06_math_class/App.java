package _06_math_class;

public class App {
  public static void main(String[] args) {
    mathImplementatioin();
  }

  public static void mathImplementatioin() {
    final int RANDOM_INTEGER = 12;

    double resultPow = Math.pow(RANDOM_INTEGER, 2);
    int resultSqrt = (int) Math.sqrt(resultPow);

    StringBuilder builder = new StringBuilder();
    builder.append("=== Math Class ===");
    builder.append("\n");
    builder.append(RANDOM_INTEGER + " power of 2: " + resultPow);
    builder.append("\n");
    builder.append("The root of " + resultPow + " is " + resultSqrt);
    builder.append("\n");

    System.out.println(builder.toString());
  }
}
