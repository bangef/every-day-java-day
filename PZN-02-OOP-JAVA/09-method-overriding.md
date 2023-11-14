# Method Overriding

- `Method overriding` adalah kemampuan mendeklarasikan ulang `method` di `child class`, yang sudah ada di `parent class`.

- Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child, `method yang di class parent tidak bisa diakses lagi`.

- Berbeda dengan `method overloading`, method ini adalah `mendeklarasikan method yang sama di class yang sama`. Sedangkan `method overriding` adalah kemampuan mendaklarasikan ulang `method` di `child class` dari `parent class`.

`VicePresident.java`

```java
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

`Manager.java`

```java
public class Manager { // Buat class Parent dengan nama Manager
  String name; // field atau attribut String dengan nama variable name

  Manager(String name) { // constructor class Manager denga params name
    this.name = name; // assign ke attribut name dengan nilai dari constructor argumentnya
  }

  void sayHello(String name) { // method sayHello dengan params String name
    System.out.println("Hello " + name + ", my name is " + this.name);
  }
}
```

`ManagerApp.java`

```java

```
