# Generic Method

## Pengertian Generic Method

- Generic Parameter type tidak hanya bisa digunakan pada class atau interface.

- Kita juga bisa menggunakan generic parameter type di method.

- Generic parameter type yang kita deklarasikan di method, hanya bisa diakses di method tersebut, tidak bisa digunakan di luar method.

- Ini cocok jika ingin membuat generic method, tanpa harus mengubah deklarasi class.

## Implementas `Generic Class`

`utils/ArrayHelper.java`

```java
package _02_generic_method.uitls;

public class ArrayHelper<T> {
  private ArrayHelper() {
  }

  public static <T> int countLength(T[] arrays) {
    return arrays.length;
  }
}
```

`App.java`

```java
package _02_generic_method;

import _02_generic_method.uitls.ArrayHelper;

public class App {
  public static void main(String[] args) {
    String[] names = { "Budi", "Andi", "Sudarsono" };
    Integer[] years = { 2001, 2002, 2003, 2004 };
 
    int lengthNames = ArrayHelper.<String>countLength(names); // cara pertama
    int lengthYears = ArrayHelper.countLength(years); // cara kedua
    System.out.println("Length of names : " + lengthNames);
    System.out.println("Length of years : " + lengthYears);
    /*
     * Output:
     * Length of names : 3
     * Length of years : 4
     */
  }
}
```


