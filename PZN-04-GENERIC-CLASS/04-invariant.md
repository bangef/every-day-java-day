# Invariant

## Pengertian Invariant

- Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah invariant.

- Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)

- Artinya saat kita membuat object Contoh `<String>`, maka tidak sama dengan Contoh `<Object>`, begitupun sebaliknya, saat membuat object Conoth `<Object>`, maka tidak sama dengan Contoh `<String>`.

## Implementasi `invariant`

`App.java`

```java
package _03_invariant;

import _01_generic_class.MyData;

public class App {
  MyData<String> myDataOne = new MyData<>();
  MyData<Object> myDataOnePolymorp = myDataOne; // ERROR

  MyData<Integer> myDataTwo = new MyData<>();
  MyData<Object> myDataTwoPolymorp = myDataTwo; // ERROR
  /*
   * Invariant tidak boleh di subsitusi dengan (child or parent).
   */
}
```


