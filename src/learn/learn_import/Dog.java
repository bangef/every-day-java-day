package learn.learn_import;

public class Dog extends Animal {
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public void bark() {
    System.out.println("Barking...");
  }
}
