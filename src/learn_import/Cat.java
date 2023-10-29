package learn_import;

public class Cat extends Animal {
  private String name;

  public Cat(String name) {
    this.name = name;
  }

  public void meow() {
    System.out.println("Meow...");
  }
}
