# Mengubah Nama Test

## `@DisplayName("")`

- Kadang agak sulit membuat nama function yang merepresentasikan kasus test nya.

- Jika kita ingin menambahkan deskripsi untuk tiap test, kita bisa menggunakan annontation `@DisplayName`

- Dengan menggunakan annontation `@DisplayName`, kita bisa menambahkan deskripsi unit testnya.

`CalculatorTest.java`

```java
package latiha.unittesting.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Calculator")
class CalculatorTest {
  private Calculator calculator = new Calculator();

  @Test
  @DisplayName("Test Function Calculator.add(int, int) if success")
  void testAddSuccess() {
    int result = this.calculator.add(12, 12);
    assertEquals(24, result);
  }

  @Test
  @DisplayName("Test Function Calculator.divide(int, int) if success")
  void testDivideSuccess() {
    int result = this.calculator.divide(10, 2);
    assertEquals(5, result);
  }

  @Test
  @DisplayName("Test Function Calculator.divide(int, int) if failed and throws error")
  void testDivideFailed() {
    assertThrows(IllegalArgumentException.class, () -> {
      this.calculator.divide(0, 10);
    });
  }
}

```

- Outputnya akan merubah deskripsi namenya, seperti ini:

![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\07-display-name.png)

## `@DisplayNameGeneration("")`

-  JUnit mendukung pembuatan `@DisplayName` secara otomatis menggunakan generator.

- Yang perlu kita lakukan adalah membuat class turunan dari interface DisplayNameGenerator, lalu menambahkan annontation `@DisplayNameGeneration` di test class nya.

- Untuk menggunakan `@DisplayNameGeneration("")` kita dapat membuat sendiri penamaannya atau menggunakan class yang sudah disediakan. Seperti:
  
  - ReplaceUnderscores
  
  ```java
  @DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
  ```
  
  ![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\08-replace-underscores.png)
  
  - Standart
  
  ```java
  @DisplayNameGeneration(value = DisplayNameGenerator.Standard.class)
  ```
  
  ![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\09-standart.png)
  
  - Simple
  
  ```java
  @DisplayNameGeneration(value = DisplayNameGenerator.Simple.class)
  ```
  
  ![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\10-simple.png)
  
  - IndicativeSantance
  
  ```java
  @DisplayNameGeneration(value = DisplayNameGenerator.IndicativeSentences.class)
  ```

        ![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\11-indicative-sentance.png)

- - Custom
  
  `test/generator/SimpleDisplayNameGenerator.java`
  
  ```java
  package latiha.unittesting.app.generator;
  
  import java.lang.reflect.Method;
  
  import org.junit.jupiter.api.DisplayNameGenerator;
  
  public class SimpleDisplayNameGenerator implements DisplayNameGenerator {
  
    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
      return "Test " + testClass.getSimpleName();
    }
  
    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
      return "Test " + testClass.getSimpleName() + "." + testMethod.getName();
    }
  
    @Override
    public String generateDisplayNameForNestedClass(Class<?> testClass) {
      return null;
    }
  
  }
  ```
  
  ```java
  
  import latiha.unittesting.app.generator.SimpleDisplayNameGenerator;
  
  @DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
  ```
  
  ![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\12-custom.png)
