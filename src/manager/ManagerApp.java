package manager;

public class ManagerApp { // class main untuk execute Class Manager dan turunannya.
  public static void main(String[] args) {
    Employee manager = new Employee("Budi");
    manager.sayHello("Ficri Hanip");

    VicePresident vp = new VicePresident("Lesmana");
    vp.sayHello("Ari"); // object VicePresident mewarisi method dari sayHello dari method parent Manager

    /**
     * POLYMORPHISME:
     */
    manager = new Manager("Sari");
    manager.sayHello("Budi");

    manager = new VicePresident("Sintia");
    manager.sayHello("Sri Asih");
  }
}
