package variable_hiding;

public class Child extends Parent {
  String name;

  @Override
  void doIt() {
    System.out.println("Iam from child!");
  }
}
