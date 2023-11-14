# Enum Class

## Pengertian Enum Class

- Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas.

- Misal, gender : male , female. Atau tipe customer: standard, premium, vip dan lain-lain.

- Dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nilai terbatas yang sudah ditentukan.

- Saat membuat enum class, secara otomatis dia akan meng-extedns class `java.lang.Enum`, oleh karena itu class enum tidak bisa extends class lain, namun masih tetap bisa implements interface.

## Enum Members

- Sama seperti class biasanya, di class enum pun kita bisa menambahkan members (field, method dan constructor).

- Khusus constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk di instansiasi secara bebas.

`Level.java`

```java
package learn.enum_class;

public enum Level {
  STANDARD("Standart Editiom"),
  PREMIUM("Premium Edition"),
  VIP("VIP Edition");

  private String description;

  Level(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

}
```

`Customer.java`

```java
package learn.enum_class;

public class Customer {
  private Level level;

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }
}
```

`App.java`

```java
package learn.enum_class;

public class App {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setLevel(Level.PREMIUM);
    System.out.printf("Level: %s%nDescription: %s%n", 
    customer.getLevel(),
    customer.getLevel().getDescription()
    );

    // Mencocokan apakah ada Level pada String tersebut
    Level standard = Level.valueOf("STANDARD");
    System.out.println(standard);

    // Menampilkan Enum Level ke dalam String
    String premiumString = Level.PREMIUM.name();
    System.out.println(premiumString);

    // Menambil semua nilai Level
    Level[] values = Level.values();
    System.out.println("Looping Level: ");
    for (Level level : values) {
      System.out.println(level.name());
    }
  }
}
```
