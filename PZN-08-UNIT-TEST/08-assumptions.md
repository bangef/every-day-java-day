# Menggunakan Assumptions

## Pengertian Assumptions

- Sebelumnya kita sudah tahu jika ingin membatalkan test, kita bisa menggunakan `exception TestAbortException`.

- Namun sebenarnya ada cara yang lebih mudah, yaitu dengan menggunakan Assumptions.

- Penggunaan Assumptions mirip seperti Assertions, jika nilainya tidak sama. maka function Assumptions akan throw TestAbortException, sehingga secara otomatis akan membatalkan unit test yang sedang berjalan.

- [Assumptions (JUnit 5.0.0 API)](https://junit.org/junit5/docs/5.0.0/api/org/junit/jupiter/api/Assumptions.html)

## Implementasi `assumeTrue()`

`test/CalculatorTest.java`

```java
package latiha.unittesting.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

// @DisplayName("Test Calculator")
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
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

  @Test
  void test_aborted_exception() {
    final String NUMBER_OF_PROCESSORS = System.getenv("NUMBER_OF_PROCESSORS");
    if (NUMBER_OF_PROCESSORS.equalsIgnoreCase("8")) {
      throw new TestAbortedException();
    }
    System.out.println("test aborted exception!");
  }

  @Test
  void test_assumption() {
    final String NUMBER_OF_PROCESSORS = System.getenv("NUMBER_OF_PROCESSORS");
    boolean isNumberOfProcessorsEqualsEight = NUMBER_OF_PROCESSORS.equals("8");
    assumeTrue(!isNumberOfProcessorsEqualsEight);
  }
}
```

## Hasilnya

![](.\assets\17-hasil-assum-true.jpg)
