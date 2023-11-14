# Arrays Class

## Pengertian Arrays Class

- Arrays class adalah class yang berisikan static method yang bisa kita gunkaan untuk memanipulasi data array, seperti pencarian dan pengurutan

- [Arrays (Java SE 14 &amp; JDK 14)](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html)

## Method di Arrays Class

| Method                     | Keterangan                        |
| -------------------------- | --------------------------------- |
| binarySearch(array, value) | Mencari value di array            |
| copyOf(...)                | Menyalin data array               |
| equals(array1, array2)     | Membandingkan array1 dan array2   |
| sort(array)                | Mengurutkan array                 |
| toString(array)            | Mengembalikan representasi string |
| ... dan masih banyak       |                                   |

## Implementasi `Arrays Class`

### `binarySearch(int[] numbers, int key)`,`sort(int[] numbers)` dan `toString(int[] numbers)`

`App.java`

```java

package _17_arrays_class;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    int[] numbers = { 20, 11, 24, 16, 18 };
    print(numbers);
    Arrays.sort(numbers);
    print(numbers);
    isNumberExist(numbers, 12);
    isNumberExist(numbers, 24);
    /*
     * output:
     * [20, 11, 24, 16, 18]
     * [11, 16, 18, 20, 24]
     * 12 not exist in arrays [11, 16, 18, 20, 24]
     * 24 exist in arrays [11, 16, 18, 20, 24]
     */
  }
  // Arrays.toString(int[] numbers);
  public static void print(int[] numbers) {
    System.out.println(Arrays.toString(numbers));
  }

  public static void isNumberExist(int[] numbers, int key) {
    int numberExist = Arrays.binarySearch(numbers, key);
    StringBuilder builder = new StringBuilder();
    builder.append(key + " ");
    if (numberExist < 0) {
      builder.append("not exist ");
    }
    if (numberExist >= 0) {
      builder.append("exist ");
    }
    builder.append("in arrays " + Arrays.toString(numbers));
    System.out.println(builder.toString());
  }
}


```

### `equals(int[] arrayNumbers1, int[] arrayNumbers2)`

`App.java`

```java
package _17_arrays_class;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    int[] numbers = { 20, 11, 24, 16, 18 };
    int[] numbers2 = { 11, 20, 18, 24, 16 };
    int[] numbers3 = { 11, 20, 18, 24, 16 };
    Arrays.sort(numbers);
    Arrays.sort(numbers2);
    isArrayEquals(numbers, numbers2);
    isArrayEquals(numbers3, numbers);
    /*
     * Output:
     * equals!
     * not, equals!
     */
  }

  /*
   * urutan-nya juga menjadi faktor persamaannya.
   */
  public static void isArrayEquals(int[] numbers1, int[] numbers2) {
    boolean isNumbersEqual = Arrays.equals(numbers1, numbers2);
    if (isNumbersEqual) {
      System.out.println("equals!");
    }
    if (!isNumbersEqual) {
      System.out.println("not, equals!");
    }
  }
}
```

### `copyOf(int[] numbers, int newLength)`

`App.java`

```java
package _17_arrays_class;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    int[] numbers = { 20, 11, 24, 16, 18 };
    int lengthOfNewArray = 4;
    int[] copyNumbers = Arrays.copyOf(numbers, lengthOfNewArray);
    System.out.println(Arrays.toString(copyNumbers));
    /*
     * Output:
     * [20, 11, 24, 16]
     */
  }
}

```
