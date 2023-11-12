package _10_system;

public class App {
  public static void main(String[] args) {
    Long currentTimeMiller = System.currentTimeMillis();
    System.out.println("Current Time Millis: " + currentTimeMiller);
    Long currentNanoTime = System.nanoTime();
    System.out.println("Current Time Millis: " + currentNanoTime);
    String userDomain = System.getenv("USERDOMAIN");
    System.out.println("User Domain: " + userDomain);
    System.gc();
    System.exit(0);
    System.out.println("ini tidak akan dijalankan!");
    /*
     * Output:
     * Current Time Millis: 1699662440641
     * Current Time Millis: 304185934215000
     * User Domain: DESKTOP-AKQOT4C
     */
  }
}