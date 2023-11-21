# Menonaktifkan Test

- Kadang ada kalanya kita ingin menonaktifkan unit test, misal karena terjadi error di unit test tersebut, dan belum bisa kita perbaiki.

- Sebenernya cara paling mudah untuk menonaktifkan unit test adalah dengan menghapus annontation `@Test`, namun jika kita lakukan itu, kita tidak bisa mendeteksi kalo ada unit test yang di `disabled`.

- Untuk menonaktifkan unit test secara benar, kita bisa menggunkan annontation `@Disabled`.

## Implementasi `@Disabled`

`test/CalculatorTest.java`

```java
package latiha.unittesting.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import latiha.unittesting.app.generator.SimpleDisplayNameGenerator;

// @DisplayName("Test Calculator")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
class CalculatorTest {
  private Calculator calculator = new Calculator();

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
    // Biarpun ada code dibawah ini tidak akan di check karna ada annotation @Disabled
    System.out.println("test coming soon!");
    int result = this.calculator.divide(10, 2);
    assertEquals(11, result);
  }
}
```

## Hasilnya

![](assets\13-disabled.png)
