public class ManagerApp { // class main untuk execute Class Manager dan turunannya.
  public static void main(String[] args) {
    Manager manager = new Manager("Budi");
    manager.sayHello("Anto");

    VicePresident vp = new VicePresident("Lesmana");
    vp.sayHello("Ari"); // object VicePresident mewarisi method dari sayHello dari method parent Manager
  }
}
