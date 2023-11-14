# HashCode

## Pengertian HashCode

- Method `hashCode` adalah method representasi `object` kita, mirip `toString` yang merupakan representasi `String`, `hashCode` adalah representasi `integer`.

- `HashCode` sangat bermanfaat untuk membuat struktur data `unique` seperti `HashMap`, `Set`, dan lain-lain. Karena cukup menggunakan `hashCode method` untuk mendapatkan identitas unique object kita.

- Secara default `hashCode` akan mengembalikan nilai `integer` sesuai `data` di `memory`, namun kita bisa `meng-overridenya` jika kita ingin.

## Kontrak HashCode Method

- `Tidak mudah meng-ovveride method hashCode`, karena ada `kontraknya`:
  
  - Sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer yang sama.
  
  - Jika ada 2 object yang sama jika dibadndingkan menggunakan method equals, maka nilai hashCodenya juga harus sama.
  
  - Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah integer sekitar 2 milyar.

`Product.java`

```java
package learn_equals_and_hashcode;

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
    System.out.println(name.hashCode());
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
    return "Product [name=" + this.name + ", quantity=" + this.quantity + "\nnamehashCode: " + this.name.hashCode()
        + "]";
  }
}

```

`App.java`

```java
package learn_equals_and_hashcode;

public class App {
  public static void main(String[] args) {
    Product productOne = new Product("Tetet", 1);
    Product productTwo = new Product("TEST", 1);
    System.out.println(productOne);
    System.out.println(producEqualsThree);
  }
}
```
