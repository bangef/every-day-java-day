# Inheritance (Pewarisan)

- `Inheritance` atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lainnya.

- Berbeda dengan `c++` satu parent dapat mempunyai 2 class. Di java tidak dapat seperti itu satu parent hanya dapat mempunyai 1 class saja.

- Dalam artian, kita bisa membuat class `parent` dan class `child`.

- Class `child`, hanya bisa punya satu class `Parent`. Namun satu class `parent` bisa punya banyak class `child`.

- Saat sebuah class diturunkan, maka semua `field` dan `method` yang ada di class `Parent` secara otomatis akan dimiliki oleh class Child.

- Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci `extends` lalu diikuti dengan nama class parentnya.

`Manager.java`

```java
public class Manager { // Buat class Parent dengan nama Manager 
  String name; // field atau attribut String dengan nama variable name

  Manager(String name){ // constructor class Manager denga params name
    this.name = name; // assign ke attribut name dengan nilai dari constructor argumentnya
  }

  void sayHello(String name){ // method sayHello dengan params String name
    System.out.println("Hello " + name + ", my name is "+ this.name);
  }
}
```

`VicePresident.java`

```java
public class VicePresident extends Manager { // class child VicePresident yang inheritance atau mewaris class parent Manager
  VicePresident(String name){ // constructor
    super(name);
  }
}
```

`ManagerApp.java`

```java
public class ManagerApp { // class main untuk execute Class Manager dan turunannya.
  public static void main(String[] args) {
    Manager manager = new Manager("Budi");
    manager.sayHello("Anto");

    VicePresident vp = new VicePresident("Lesmana");
    vp.sayHello("Ari"); // object VicePresident mewarisi method dari sayHello dari method parent Manager
  }
}
```
