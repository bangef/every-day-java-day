# Import

## Pengertian Import

- `import` adalah kemampuan untuk menggunakan class yang berada di package yang berbeda.

- Syarat class yang bisa digunakan jika `package` nya berbeda adalah `class` yang harus `public`.

`src/learn_import/Animal.java`

```java
package learn_import;

public class Animal {
  public void sleep() {
    System.out.println("Sleeping...");
  }

  public void eat() {
    System.out.println("Eating...");
  }

  public void poop() {
    System.out.println("Pooping...");
  }
}
```

`src/learn_import/Cat.java`

```java
package learn_import;

public class Cat extends Animal {
  private String name;

  public Cat(String name) {
    this.name = name;
  }

  public void meow() {
    System.out.println("Meow...");
  }
}
```

`src/learn_import/Dog.java`

```java
package learn_import;

public class Dog extends Animal {
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public void bark() {
    System.out.println("Barking...");
  }
}
```

`src/AnimalApp.java`

```java
import learn_import.Cat; // this how to can we import the class
import learn_import.Dog; 

public class AnimalApp {
  public static void main(String[] args) {
    Dog pitbull = new Dog("Pitbull");
    pitbull.bark();
    pitbull.sleep();
    pitbull.eat();

    Cat bengal = new Cat("Bengal");
    bengal.meow();
    bengal.eat();
    bengal.sleep();
  }
}
```

## Import Semua Package

- Untuk meng-`import` semua class di dalam sebuah package, dapat menggunakan tanda bintang atau `*`. misal ingin mengimport semua class yang ada di direktori `leran_import` dapat menggunakan seperti ini:

```java
import learn_import.*;
```

## Default Import

- Secara `default`, semua `class` yang ada di package `java.lang` sudah `auto import`. Jadi tidak perlu melakukan `import secara manual`.

- Contoh class, diantaranya:
  
  - `String`
  
  - `Integer`
  
  - `Long`
  
  - `Boolean`
  
  - dll.
  
  Terdapat di package `java.lang`. Oleh karena itu, kita tidak perlu meng-import nya secara manual.
