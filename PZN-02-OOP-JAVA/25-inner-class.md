# Iner Class

## Pengertian Iner Class

- Di java, kita bisa membuat class didalam class, atau disebut dengan `Inner Class`.

- Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain.

- Misal kita perlu membuat class Employee, dimana membuatkan class Company, maka kita bisa membuat class Employee sebagai inner class Company.

- Cara membuat inner class, cukup membuatnya di dalam blok class outer class nya.



## Mengakses Outer Class

- Keuntungan saat ini membuat `inner class` adalah, `kemampuan untuk mengakses outer classnya`.

- `Inner class` bisa membaca semua `private member` yang ada di `outer class` - nya.

- Untuk mengakses object `outer class` nya, kita bisa menggunakan nama class outer nya diikuti dengan kata kunci `this`, misal `Company.this`.

- Dan untuk mengakses `super class outer class` - nya, kita bisa menggunakan nama class outernya diikuti dengan kata kunci super, misal `Company.super`.

`Company.java`

```java
package learn.inner_class;

public class Company {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public class Employee {
    private String name;

    public String getCompany() {
      return Company.this.name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }
  }
}
```

`CompanyApp.java`

```java
package learn.inner_class;

import learn.inner_class.Company.Employee;

public class CompanyApp {
  public static void main(String[] args) {
    Company company = new Company();
    company.setName("Different Creative");

    Employee employee = company.new Employee();
    employee.setName("Budi Sudarsono");

    System.out.println(employee.getCompany());
    System.out.println(employee.getName());
  }
}
```




