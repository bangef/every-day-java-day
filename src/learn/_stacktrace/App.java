package learn._stacktrace;

public class App {
  public static void main(String[] args) {
    try {
      sampleEror();
    } catch (RuntimeException exception) {
      exception.printStackTrace();
    }
  }

  public static void sampleEror() {
    try {
      String[] names = {
          "Andi", "Budi", "Caca"
      };
      System.out.println(names[100]);
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }
}
