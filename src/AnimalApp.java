import learn_import.*;

public class AnimalApp {
  public static void main(String[] args) {
    Dog pitbull = new Dog("Pitbull");
    pitbull.bark();
    pitbull.sleep();
    pitbull.eat();

    Cat bengal = new Cat("Bengal");
    bengal.meow();
    bengal.eat();
    bengal.sleep();
  }
}
