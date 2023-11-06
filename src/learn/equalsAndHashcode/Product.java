package learn.equalsAndHashcode;

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
