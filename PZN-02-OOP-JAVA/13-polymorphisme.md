# Polymorphism

## Pengertian Polymorphism

- `Polymorphisme` berasal dari bahasa Yunani yang berarti `banyak bentuk`.

- Dalam OOP, `Polymorphism` adalah `kemampuan sebuah object berubah bentuk menjadi bentuk lain`.

- `Polymorphism` erat hubungannya dengan `inhertitence`.

`Employee.java`

```java
package manager;

public class Employee {
  String name;

  Employee(String name) {
    this.name = name;
  }

  void sayHello(String name) {
    System.out.println("Hello " + name + ", my name " + this.name + " iam employee");
  }
}
```

`Manager.java`

```java
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
```

`VicePresident.java`

```java
package manager;

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
```

`ManagerApp.java`

```java
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
```
