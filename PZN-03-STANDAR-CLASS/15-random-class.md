# Random  Class

## Pengertian Random Class

- Random class adalah class yang bisa kita gunakan untuk meng-generate random number.

- [Random (Java SE 14 &amp; JDK 14)](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html)

## Implementasi `Random Class`

`App.java`

```javaag-0-1hf2uoo7aag-1-1hf2uoo7a
ag-0-1hf2uoo7apackage _15_random;

import java.util.Random;

public class App {
  public static final Random random = new Random();

  public static void main(String[] args) {
    randomNumber();
    /*
     * Output: bisa saja berubah karena di re-generate
     * 19
     * 18
     * 16
     * 16
     * 20
     * 11.462579
     * 22.194328
     * 24.496181
     * 11.672198
     * 13.990721
     * 11.834787787550448
     * 14.214010277941348
     * 23.295903315584795
     * 12.868006300417955
     * 17.635642336772033
     */
  }

  public static void randomNumber() {
    int origin = 10;
    int bound = 25;
    int limit = 5;
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < limit; i++) {
      builder.append(random.nextInt(origin, bound) + "\n");
    }

    for (int i = 0; i < limit; i++) {
      builder.append(random.nextFloat(origin, bound) + "\n");
    }

    for (int i = 0; i < limit; i++) {
      builder.append(random.nextDouble(origin, bound) + "\n");
    }

    System.out.println(builder.toString());
  }
}ag-1-1hf2uoo7a
```
