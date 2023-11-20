# Pengenakan JUnit

- JUnit adalah test framework yang paling populer di Java

- Saat ini bersi terbari JUnit adalah versi 5

- JUnit 5 membutuhkan Java minimal versi 8

## Menambahkan JUnit Versi 5 ke dalam Project

- Buat project seperti biasa dengan command berikut:

```shell
mvn archetyoe:generate
maven-archetype-quickstart
# isikan groupid, artifcat, version, package dll.
```

- Tambahkan dependency terbaru dari JUnit versi 5 serta ubah `maven.compiler.source` atau `maven.compiler.target` diatas `versi` 8

- Tambahkan dependency `org.junit.jupiter` versi `5.10.1` dan tambahkan `<scope>test</scope>`. Didalam `<dependency>...</dependency>`.

- Hapus file `test` yang ada di dalam scope test project.

![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\06-junit-setting.png)

## Implementasi Simple Test Junit 5

`main/Calculator.java`

```java
package latiha.unittesting.app;

public class Calculator {
  public int add(int numberOne, int numberTwo) {
    return numberOne + numberTwo;
 }
}
```

`test/CalculatorTest.java`

```java
package latiha.unittesting.app;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  private Calculator calculator = new Calculator();

  @Test
  public void testAddSuccess() {
    int result = this.calculator.add(12, 12);
  }
}
```
