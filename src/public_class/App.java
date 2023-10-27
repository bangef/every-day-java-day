package public_class;

class Animal {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println("Now i want sleep...");
  }
}

class Dog extends Animal {
  private String typeAnimal;

  public Dog(String name, String typeAnimal) {
    super(name);
    this.typeAnimal = typeAnimal;
  }

  public void bark() {
    System.out.println("UGUGUGUGUGUU....");
  }
}

public class App {
  public static void main(String[] args) {
    Dog pitbull = new Dog("Jonss", "Karnivora");
    pitbull.bark();
    pitbull.sleep();
  }
}
