# Setter dan Getter

## Pengertian Encapsulation

- `encapsulation` artinya memastikan data sensitif sebuah `object` tersembunyi dari `akses luar`.

- Hal ini bertujuan agar kita bisa `menjaga agar data sebuah object tetap baik dan valid`.

- Untuk mencapai ini, biasanya kita akan membuat semua `field` menggunakan `access modifier private`, sehingga `tidak bisa diakses` atau diubah `dari luar`.

- Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut.

## Pengertian Setter dan Getter

- Di java, proses `encapsulation` sudah dibuat standarisasinya, dimana kita bisa menggunakan `Getter` dan `Setter` method.

- `Getter` adalah function yang dibuat untuk mengambil data field.

- `Setter` adalah function yang dibuat untuk mengubah data field.

## Best Practice Membuat Getter dan Setter Method

| Tipe Data | Getter Method | Setter Method          |
|:---------:|:-------------:|:----------------------:|
| boolean   | isXxx()       | setXxx(boolean value)  |
| primitif  | getXxx()      | setXxx(primitif value) |
| Object    | getXxx()      | setXxx(Object value)   |

`Shape.java`

```java
package learn_setter_dan_getter;

public abstract class Shape {
  private String color;

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public abstract float getArea();
}
```

`Triangle.java`

```java
package learn_setter_dan_getter;

public class Triangle extends Shape {
  private float base;
  private float height;

  @Override
  public float getArea() {
    return 0.5f * this.base * this.height;
  }

  public float getBase() {
    return base;
  }

  public void setBase(float base) {
    this.base = base;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }
}
```

`App.java`

```java
package learn_setter_dan_getter;

public class App {
  public static void main(String[] args) {

    Triangle triangle = new Triangle();
    triangle.setBase(1.5f);
    triangle.setHeight(5);
    float areaTriangle = triangle.getArea();
    System.out.println(areaTriangle + " CM");
  }
}

```
