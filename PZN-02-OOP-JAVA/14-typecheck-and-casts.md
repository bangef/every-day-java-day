# Type Check & Casts

## Pengertian Type Check & Casts

- Sebelumnya kita sudah tau cara melakukan konversi tipe data `cast` di tipe `data primitif`.

- `Casts` juga bisa digunakan untuk `tipe data bukan primitf`.

- Namun agar aman, sebelum melakukan `casts`, pastikan kita melakukan `type check` (pengecekan tipe data), dengan menggunakan kata kunci `instanceof`.

- Hasil operator `instanceof` adalah `boolean`, `true` jika `tipe data` sesuai, `false` jika `tidak sesuai`.

`ManagerApp.java`

```java
package manager;

public class ManagerApp { // class main untuk execute Class Manager dan turunannya.
  public static void main(String[] args) {
    Employee employee = new Employee("Budi");
    employee.sayHello("Ficri Hanip");
    System.out.println();
    // VicePresident vp = new VicePresident("Lesmana");
    // vp.sayHello("Ari"); // object VicePresident mewarisi method dari sayHello
    // dari method parent Manager

    // /**
    // * POLYMORPHISME:
    // */
    // employee = new Manager("Sari");
    // employee.sayHello("Budi");

    // System.out.println();
    employee = new VicePresident("Sintia");
    employee.sayHello("Sri Asih");
    sayHello(employee);
  }

  public static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("I am VP, my name is " + vicePresident.name);
    } else if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("I am Manager, my name is " + manager.name);
    } else {
      System.out.println("I am Employee, my name is " + employee.name);
    }
  }
}
    }
  }
```


