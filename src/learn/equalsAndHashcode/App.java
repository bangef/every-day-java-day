package learn.equalsAndHashcode;

public class App {
  public static void main(String[] args) {
    Product productOne = new Product("Tetet", 1);
    Product productTwo = new Product("TEST", 1);
    System.out.println(productOne);
    System.out.println(productTwo);
    // boolean isObjectEqualsOne = productOne.equals(productTwo);
    // boolean isObjectEqualsTwo = productTwo.equals(productOne);
    // boolean isObjectEqualsThree = productTwo == productOne;
    // System.out.println(isObjectEqualsOne);
    // System.out.println(isObjectEqualsTwo);
    // System.out.println(isObjectEqualsThree);
  }
}