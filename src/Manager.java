public class Manager { // Buat class Parent dengan nama Manager
  String name; // field atau attribut String dengan nama variable name

  Manager(String name) { // constructor class Manager denga params name
    this.name = name; // assign ke attribut name dengan nilai dari constructor argumentnya
  }

  void sayHello(String name) { // method sayHello dengan params String name
    System.out.println("Hello " + name + ", my name is " + this.name);
  }
}
