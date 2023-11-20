# Sebelum dan Sesudah Test

## Pengertian Sebelum dan Sesudah Test

- Kadang kita ingin menjalankan kode yang sama sebelum dan setelah eksekusi unit test.

- Hal ini sebenarnya bisa dilakukan secara manual di function @Test nya, namun hal ini akan membuat kode duplikat banyak sekali.

- JUnit memiliki annontation `@BeforeEach` dan `@AfterEach`.

- `@BeforeEach` digunakan untuk menandai function yang akan dieksekusi sebelum unit test dijalankan.

- `@AfterEach` digunakan untuk menandai function yang akan dieksekusi setelah unit test dijalankan.

- Ingat, bahwa ini akan selalu dieksekusi setiap kali untuk function @Test, bukan sekali untuk class test saja.

## Implementasi `@BeforeEach` dan `@AfterEach`

`test/CalculatorTest.java`

```java
package latiha.unittesting.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import latiha.unittesting.app.generator.SimpleDisplayNameGenerator;

// @DisplayName("Test Calculator")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
class CalculatorTest {
  private Calculator calculator = new Calculator();

  @BeforeEach
  void setUp() {
    System.out.println("Before run");
  }

  @AfterEach
  void tearDown() {
    System.out.println("After run");
  }

  @Test
  // @DisplayName("Test Function Calculator.add(int, int) if success")
  void test_add_success() {
    int result = this.calculator.add(12, 12);
    assertEquals(24, result);
  }

  @Test
  // @DisplayName("Test Function Calculator.divide(int, int) if success")
  void test_divide_success() {
    int result = this.calculator.divide(10, 2);
    assertEquals(5, result);
  }

  @Test
  // @DisplayName("Test Function Calculator.divide(int, int) if failed and throws
  // error")
  void test_divide_failed() {
    assertThrows(IllegalArgumentException.class, () -> {
      this.calculator.divide(0, 10);
    });
  }

  @Test
  @Disabled
  void coming_soon_test() {
    // Biarpun ada code dibawah ini tidak akan di check karna ada annotation
    // @Disabled
    System.out.println("test coming soon!");
    int result = this.calculator.divide(10, 2);
    assertEquals(11, result);
  }
}
```

## Hasilnya

![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\14-beforeeach-aftereach.jpg)

- Hasilnya method `setUp()` dan `tearDown()` akan selalu dijalankan apabila meng-test semua test yang ada didalam class tersebut.

- Scopenya hanya berlaku di dalam class itu sendiri untuk class lain tidak terpengaruh.

## Sebelum dan Setelah Semua Unit Test

- `@BeforeEach` dan `@AfterEach` akan dieksekusi setiap kali function `@Test` jalan.

- Namun kadang kita ingin melakukan sesuatu sebelum semua unit test berjalan, atau setelah semua unit test berjalan.

- Ini bisa dilakukan menggunakan annontation `@BeforeAll` dan `@AfterAll`.

- Namun hanya `static function` yang bisa menggunakan `@BeforeAll` dan `@AfterAll`.

## Implementasi `@BeforeAll` dan `@AfterAll`

`test/CalculatorTest.java`

```java
package latiha.unittesting.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import latiha.unittesting.app.generator.SimpleDisplayNameGenerator;

// @DisplayName("Test Calculator")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
class CalculatorTest {
  private Calculator calculator = new Calculator();

  @BeforeAll
  public static void beforeAll() {
    System.out.println("Before all");
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("After all");
  }

  @BeforeEach
  void setUp() {
    System.out.println("Before run");
  }

  @AfterEach
  void tearDown() {
    System.out.println("After run");
  }

  @Test
  // @DisplayName("Test Function Calculator.add(int, int) if success")
  void test_add_success() {
    int result = this.calculator.add(12, 12);
    assertEquals(24, result);
  }

  @Test
  // @DisplayName("Test Function Calculator.divide(int, int) if success")
  void test_divide_success() {
    int result = this.calculator.divide(10, 2);
    assertEquals(5, result);
  }

  @Test
  // @DisplayName("Test Function Calculator.divide(int, int) if failed and throws
  // error")
  void test_divide_failed() {
    assertThrows(IllegalArgumentException.class, () -> {
      this.calculator.divide(0, 10);
    });
  }

  @Test
  @Disabled
  void coming_soon_test() {
    // Biarpun ada code dibawah ini tidak akan di check karna ada annotation
    // @Disabled
    System.out.println("test coming soon!");
    int result = this.calculator.divide(10, 2);
    assertEquals(11, result);
  }
}
```

## Hasilnya

![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\15-hasil-beforeall-afterall.jpg)
