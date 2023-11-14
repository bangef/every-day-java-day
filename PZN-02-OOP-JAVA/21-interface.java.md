# Interface

![Memahami Interface dalam OOP Java](https://www.petanikode.com/img/java/oop/interface/interface.png)

![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-10-30-11-12-51-image.png)

![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-10-30-11-13-10-image.png)

## Pengertian Interface

- Sebelumnya kita sudah tahu bahwa `abstract class` bisa kita gunakan sebagai `kontrak` untuk `class child`nya.

- Namun sebenarnya yang `lebih tepat untuk kontrak adalah interface`.

- Jangan salah sangka bahwa `interface disini bukanlah User Interface`.

- Interface mirip seperti `abstract class` yang `membedakan adalah di interface semua method otomatis abstract, tidak memiliki block`.

- Di `interface` kita tidak boleh memiliki `field`, kita hanya boleh memiliki `constant` (field yang tidak bisa diubah).

- Untuk mewariskan interface, kita tidak menggunakan `kata kunci extends`, melainkan `implements`.

`Car.java`

```java
package learn_interface;

public interface Car {
  void drive();

  int getTire();
}
```

`Avanza.java`

```java
package learn_interface;

public class Avanza implements Car {

  @Override
  public void drive() {
    System.out.println("Drive Avanza...");
  }

  @Override
  public int getTire() {
    return 4;
  }
}
```

`App.java`

```java
package learn_interface;

public class App {
  public static void main(String[] args) {
    Avanza avanza = new Avanza();
    System.out.println(avanza.getTire());
    avanza.drive();
  }
}
```

## Interface Inheritance

- Sebelumnya kita sudah tahu kalo di Java, `child class` hanya bisa punya `1 class parent`.

- Namun berbeda dengan `interface`, sebuah `child class bisa implement lebih dari 1 interface`.

- Bahkan `interface` pun `bisa implement interface lain, bisa lebih dari 1`. Namun jika interface ingin mewarisi interface lain, kita menggunakan `kata kunci extends`, bukan `implements`.

`HasBrand.java`

```java
package learn_interface;

public interface HasBrand {
  String getBrand();
}
```

`Car.java`

```java
package learn_interface;

public interface Car extends HasBrand {
  void drive();

  int getTire();
}
```

`Avanza.java`

```java
package learn_interface;

public class Avanza implements Car {

  @Override
  public String getBrand() {
    return "Toyota";
  }

  @Override
  public void drive() {
    System.out.println("Drive Avanza...");
  }

  @Override
  public int getTire() {
    return 4;
  }

}
```

`App.java`

```java
package learn_interface;

public class App {
  public static void main(String[] args) {
    Avanza avanza = new Avanza();
    System.out.println(avanza.getTire());
    avanza.drive();
  }
}
```

## Multiple Interface Inheritance

![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-10-30-11-14-47-image.png)

`IsMaintanance.java`

```java
package learn_interface;

public interface IsMaintanance {
  boolean IsMaintance();
}
```

`HasBrand.java`

```java
package learn_interface;

public interface HasBrand {
  String getBrand();
}
```

`Car.java`

```java
package learn_interface;

public interface Car extends HasBrand {
  void drive();

  int getTire();
}
```

`Avanza.java`

```java
package learn_interface;

public class Avanza implements Car, IsMaintanance {

  @Override
  public boolean IsMaintance() {
    return false;
  }

  @Override
  public String getBrand() {
    return "Toyota-Avanza";
  }

  @Override
  public void drive() {
    System.out.println("Drive Avanza...");
  }

  @Override
  public int getTire() {
    return 4;
  }

}
```

- `Class avanza` dapat meng-`implement lebih dari 2 interface`.

`App.java`

```java
package learn_interface;

public class App {
  public static void main(String[] args) {
    Avanza avanza = new Avanza();
    System.out.println(avanza.getTire());
    avanza.drive();
  }
}
```

## Default Method

- Sebelumnya kita tahu bahwa di `Interface`, kita `tidak bisa membuat konkrit yang memiliki block method`.

- Namun `sejak versi Java 8`, ada fitur `default method` di `interface`.

- Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement interface tersebut.

- Ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak karena harus meng-*override* method tersebut.

- Degan menggunakan default method, kita bisa menambahkan konkrit method di interface.

`IsMaintanance.java`

```java
package learn_interface;

public interface IsMaintanance {
  boolean IsMaintance();
}
```

`HasBrand.java`

```java
package learn_interface;

public interface HasBrand {
  String getBrand();
}
```

`Car.java`

```java
package learn_interface;

public interface Car extends HasBrand, IsMaintanance {
  void drive();

  int getTire();

  default boolean isBig() {
    return false;
  }
}
```

- Dalam Interface dapat juga meng-implements lebih dari satu inteface. Dan dapat juga membuat konkrit method dengan syarat harus menyertakan kata kunci `default` pada method-nya.

`Avanza.java`

```java
package learn_interface;

public class Avanza implements Car{

  @Override
  public boolean IsMaintance() {
    return false;
  }

  @Override
  public String getBrand() {
    return "Toyota-Avanza";
  }

  @Override
  public void drive() {
    System.out.println("Drive Avanza...");
  }

  @Override
  public int getTire() {
    return 4;
  }

}
```

`App.java`

```java
package learn_interface;

public class App {
  public static void main(String[] args) {
    Avanza avanza = new Avanza();
    System.out.println(avanza.getTire());
    avanza.drive();
  }
}
```
