# Equals Method

## Pengertian Equals Method

- Hal yang agak membingungkan di Java adalah, cara membandingkan object.

- Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator `==`, di java, operator `==` `hanya untuk mengecek data primitif`.

- Untuk `non primitif pengecekannya mengunakan method equals`.

- Dan secara default, method `equlas` itu akan membandingkan dua buah object secara kesamaan posisi object di memory, artinya jika kita membuat 2 object yang isi `fields` nya sama, tetap dianggap beda oleh method equals.

- Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut.

`Product.java`

```java
public class Product {
  private String name;
  private int quantity;

  public Product(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + quantity;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Product other = (Product) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (quantity != other.quantity)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Product [name=" + this.name + ", quantity=" + this.quantity + "]";
  }
}
```

`App.java`

```java
public class App {
  public static void main(String[] args) {
    Product productOne = new Product("TEST", 1);
    Product productTwo = new Product("TEST", 1);

    boolean isObjectEqualsOne = productOne.equals(productTwo);
    boolean isObjectEqualsTwo = productTwo.equals(productOne);
    boolean isObjectEqualsThree = productTwo == productOne;
    System.out.println(isObjectEqualsOne); // true
    System.out.println(isObjectEqualsTwo); // true
    System.out.println(isObjectEqualsThree); // false
  }
}
```
