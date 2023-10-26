package manager;

public class Manager extends Employee { // Buat class Parent dengan nama Manager
  Manager(String name) {
    super(name);
  }

  @Override
  void sayHello(String name) { // method sayHello dengan params String name
    System.out.println("Hello " + name + ", my name is " + this.name);
  }
}
