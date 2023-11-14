# Static Keyword

## Pengertian Static Keyword

- Sebelumnya kita sudah sering melihat kata kunci `static`, namun belum pernah kita bahas.

- Dengan menggunakan kata kunci `static`, kita bisa membuat `field`, method atau `class bisa diakses langsung tanpa melalui object nya`.

- Perlu diingat, `static` hanya bisa mengakses `static lainnya`.

## Static Dapat Digunakan di

- `field` atau `variable`, artinya field tersebut bisa diakses langsung tanpa membuat object terlebih dahulu.

`Constants.java`

```java
package learn.statis;

public class Constants {

  private Constants() {
  }

  public static final float PI = 3.14f;
  public static final String APPLICATION = "Belajar Java OOP";
}
```

- `method` atau disebut `class method`, artinya method tersebut bisa diakses langsung tanpa membuat object terlebih dahulu.

`utils/MathUtils.java`

```java
package learn.statis.utils;

public class MathUtils {

  private MathUtils() {
  }

  public static int sum(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}
```

- `block`, `static block` akan otomatis dieksekusi ketika sebuah class di load.

`Applications.java`

```java
package learn.statis;

public class Application {
  private Application() {
  }

  public static final int PROCESSORS;

  static {
    PROCESSORS = Runtime.getRuntime().availableProcessors();
  }
}
```

- `inner class`, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object outer class terlebih dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi object outer class nya.

`Country.java`

```java
package learn.statis;

public class Country {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static class Province {
    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
```

`App.java`

```java
package learn.statis;

// import learn.statis.utils.MathUtils;
import static learn.statis.utils.MathUtils.sum;
import static learn.statis.Application.PROCESSORS;

public class App {

  public static void main(String[] args) {
    /**
     * Static field
     */
    System.out.printf("Phi: %s%n", Constants.PI);
    System.out.printf("String: %s%n", Constants.APPLICATION);
    /**
     * Static method
     */
    // System.out.printf("Hasil dari 1 + 2 + 3 + 4 adalah %s%n", MathUtils.sum(1, 2,
    // 3, 4));
    System.out.printf("Hasil dari 1 + 2 + 3 + 4 adalah %s%n", sum(1, 2, 3, 4));
    /**
     * Static Inner Class
     */
    Country.Province province = new Country.Province();
    province.setName("Jawa Barat");
    System.out.printf(province.getName());
    /**
     * Static Block
     */
    // System.out.printf("Static Block - Processors: %s%n", Application.PROCESSORS);
    System.out.printf("Static Block - Processors: %s%n", PROCESSORS);
  }
}
```
