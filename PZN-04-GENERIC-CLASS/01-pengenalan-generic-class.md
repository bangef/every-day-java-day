# Pengenalan Generic

## Pengertian Pengenalan Generic

- Generic adalah kemampuan menambahkan parameter type saat membuat class atau method.

- Berbeda dengan tipe data yang bisa kita gunakan di class di function, generic memungkinkan kita bisa mengubah-ubah bentuk tipe data sesui dengan yang kita mau.

## Manfaat Generic

- Pengecekan ketika proses kompilasi.

- Tidak perlu manual menggunakan pengecekan tipe data dan konversi tipe data.

- Memudahkan programmer membuat kode program yang generic sehingga bisa digunakan oleh berbagai tipe data.

## Kode Bukan Generic

`BukanGeneric.java`

```java
package _01_generic_class;

public class BukanGeneric {
  private Object data;

  public Object getData() {
    return this.data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
```

`Generic.java`

```java
package _01_generic_class;

public class Generic<T> {
  private T data;

  public T getData() {
    return this.data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
```

`App.java`

```java
package _01_generic_class;

public class App {
  public static void main(String[] args) {
    /*
     * Contoh:
     * Bukan generic
     * 1. Akan ada kesulitan ketika getData, harus conversi dari Object ke String
     * terlebih dahulu.
     */
    BukanGeneric bukanGeneric = new BukanGeneric();
    bukanGeneric.setData("String");
    String valueDataBukanGeneric = (String) bukanGeneric.getData();
    System.out.println(valueDataBukanGeneric);
    /*
     * Output: 
     * String
     */
    /*
     * Contoh:
     * Generic
     * 1. Harus meng-assign tipe data didalamnya, maka akan menjadi tipe data tersebut
     */
    Generic generic = new Generic<String>();
    generic.setData("Data ini tipe object String");
    String valueDataGeneric = generic.getData();
    System.out.println(valueDataGeneric);
    /*
     * Output:
     * Data ini tipe object String
     */
  }
}
```


