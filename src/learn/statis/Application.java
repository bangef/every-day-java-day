package learn.statis;

public class Application {
  private Application() {
  }

  public static final int PROCESSORS;

  static {
    PROCESSORS = Runtime.getRuntime().availableProcessors();
  }
}
