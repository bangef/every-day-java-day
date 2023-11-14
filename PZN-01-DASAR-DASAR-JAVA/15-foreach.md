# Foreach

- Kadang kita bisa mengakses data array menggunakan perulangan.

- Mengakses data array menggunakan perulangan sangat bertele - tele, kita harus membuat counter lalu mengakses array menggunakan counter yang kita buat.

- Namun untungnya, di java terdapat perulangan `foreach`, yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis.

```java
public class _12Foreach {
  public static void main(String[] args) {
    String[] arrStrings = new String[]{"Test1", "Test2", "Test3", "Test4"};
    for (String string : arrStrings) {
      System.out.println(string);
    }
  }
}
```
