# Variable Hiding

## Pengertian Variable Hiding

- `Variable hiding` merupakan masalah yang terjadi ketika kita membuat `nama field sama di class child dengan nama field class parent`.

- Tidak ada yang namanya `field overriding`, ketika kita `buat ulang nama field di class, itu berarti variable hiding.`

- Untuk mengatasi `variable hiding`, caranya kita bisa menggunakan `super keyword`.

- Yang membedakan `variable hiding`, caranya kita bisa mengguanakan `super keyword`.

- Saat `object di casts`, `method` akan tetap mengakses `method overriding`, `namun variable akan mengakses variable yang ada di class nya`.

`Parent.java`

```java
package variable_hiding;

public class Parent {
  String name;

  void doIt() {
    System.out.println("Iam from parent!");
  }
}
```

`Child.java`

```java
package variable_hiding;

public class Child extends Parent {
  String name;

  @Override
  void doIt() {
    System.out.println("Iam from child!");
  }
}

```

`App.java`

```java
package variable_hiding;

public class App {
  public static void main(String[] args) {
    Child c = new Child();
    c.name = "Eko";
    c.doIt(); // Iam from child!
    System.out.println(c.name); // Eko

    Parent p = (Parent) c;
    p.doIt(); // Iam from child!
    System.out.println(p.name); // null
  }
}

```
