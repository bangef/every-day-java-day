# Membatalkan Test

- Kadang kita ingin membatalkan unit test ketika kondisi tertentu terjadi.

- Untuk membatalkan, kita bisa menggunakan `exception TestAbortedException`.

- Jika JUnit mendapatkan `exception TestAbortedException`, secara `otomatis test tersebut akan dibatalkan`.

## Implementasi `Throw TestAbortedException`

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
import org.opentest4j.TestAbortedException;

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

  @Test
  void test_aborted_exception() {
    String profile = System.getenv("NUMBER_OF_PROCESSORS");
    if (profile.equalsIgnoreCase("8")) {
      throw new TestAbortedException();
    }
    System.out.println("test aborted exception!");
  }
}
```

## Hasilnya

![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\16-hasil-testabortedexception.jpg)
