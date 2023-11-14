# Super Keyword

- Kadang kita ingin `mengakses method yang terdapat di class parent` yang sudah terlanjur kita override di class child.

- Untuk `mengakses method milik class parent`, kita bisa menggunakan `kata kunci super` Sederhanaya, `super digunakan untuk mengakses class parent`.

- Tidak hanya method, field milik parent class pun kita bisa akses menggunakan `kata kunci super`.
  
  `Shape.java`

```java
public class Shape {
  int getCorner() {
    return 0;
  }
}
```

`Rectangle.java`

```java
public class Rectangle extends Shape {
  @Override
  int getCorner() {
    return 4;
  }

  int getParentCorner() {
    return super.getCorner();
  }
}
```

`ShapeApp.java`

```java

```
