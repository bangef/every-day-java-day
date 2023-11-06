package learn.finalClass;

public class App {
  public static void main(String[] args) {
    Facebook fb = new Facebook();
    fb.setName("Test");
    FakeFacebook fkfb = new FakeFacebook();
    // fkfb.setName("Test"); // error, couse not inherited
    System.out.println(fb);
    System.out.println(fkfb);
  }
}