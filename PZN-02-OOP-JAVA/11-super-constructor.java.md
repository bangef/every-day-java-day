# Super Constructor

## Pengertian Super Constructor

- Tidak hanya untuk `mengakses method` atau `field` yang ada di `parent class`, `kata kunci super` juga bisa digunakan untuk `mengakses constructor`.

- Namun `syaratnya` untuk `mengakses parent constructor`, kita harus `mengaksesnya di dalam class child constructor`.

- Jika sebuah `class parent` tidak memiliki `constructor` yang tidak ada `parameter-nya` (tidak memiliki default constructor), maka class child wajib mengakses constructor class parent tersebut.

`Shape.java`

```java
public class Shape {
  private float height, width, length;

  public Shape(float height, float width, float length) {
    this.height = height;
    this.width = width;
    this.length = length;
  }

  public Shape(float length) {
    this.length = length;
  }

  int getCorner() {
    return 0;
  }
}

```

`ShapeApp.java`

```java
public class ShapeApp {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(12.0F);

    int rectangleCorner = rectangle.getCorner();
    int rectangleParentCorner = rectangle.getParentCorner();

    System.out.println(rectangleCorner);
    System.out.println(rectangleParentCorner);
  }
}

```

`Rectangle.java`

```java
public class Rectangle extends Shape {
  public Rectangle(float length) {
    super(length);
  }

  @Override
  int getCorner() {
    return 4;
  }

  int getParentCorner() {
    return super.getCorner();
  }
}

```


