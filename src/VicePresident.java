public class VicePresident extends Manager { // class child VicePresident yang inheritance atau mewaris class parent
                                             // Manager
  VicePresident(String name) { // constructor
    super(name);
  }

  @Override
  void sayHello(String name) { // method sayHello dengan params String name
    System.out.println("Hello " + name + ", I am Vice President and my name is " + this.name);
  }
}