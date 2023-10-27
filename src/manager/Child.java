package manager;

public class Child extends Parent {
  String name;

  @Override
  void doIt() {
    System.out.println("Do it from child!");
  }
}
