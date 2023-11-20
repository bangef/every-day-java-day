# Assertions

- Saat membuat test, kita harus memastikan bahwa test tersebut sesuai dengan ekspektasi yang kita inginkan.

- Jika manual, kita bisa melakukan pengecekan `if else`, namun itu tidak direkomendasikan

- Junit memiliki fitur untuk melakukan `assertions`, yaitu memastikan bahwa unit test sesuai dengan kondisi yang kita inginkan

- Assertions di JUnit di representasikan dalam class Assertions, dan di dalamnya terdapat banyak sekali fucntion static

- [Assertions (JUnit 5.10.1 API)](https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html)

## `assertEquals(Ekspektasi Result, Result)`

- `assertEquals(Parameter 1, Parameter 2)` - memiliki 2 parameter yang mana:
  
  - Parameter 1: Ekspektasi dari hasil yang diharapkan.
  
  - Parameter 2: Hasil dari program yang dijalankan atau yang sudah dieksusi.

`test/CalculatorTest.java`

```java
@Test
  public void testAddSuccess() {
    int result = this.calculator.add(12, 12);
    assertEquals(24, result);
  }
```

## Mengagalkan Test

- Kadang dalam membuat unit test, kita tidak hanya ingin mengetest kasus sukses atau gagal

- Ada kalanya kita ingin mengetes sebuah exception misalnya

- Assertions juga bisa digunakan untuk mengecek apakah sebuaj exception terjadi.

- Kita dapat memanfaatkan `asserThrows()`

## `assertThrows(Ekspektasi Error, Eksekusi Program)`

- `assertThrows(Parameter 1, Parameter 2)` - memiliki 2 parameter yang mana:
  
  - Parameter 1: Ekspektasi error yang diharapkan contohnya `IllegalArgumentException.class`.
  
  - Parameter 2: Program yang ingin dijalankan, contoh: `() -> this.calculator.divide(10, 0)`. Yang dieksekusi haruslah mendapatkan error agar test dinyatakan berhasil, apabila tidak maka dinyatakan tidak berhasil.

`main/Calculator.java`

```java
  public int divide(int numberOne, int numberTwo) {
    if (numberOne == 0 || numberTwo == 0) {
      throw new IllegalArgumentException("Can not divide by zero");
    }
    return numberOne / numberTwo;
  }
```

`test/CalculatorTest.java`

```java
  @Test
  void testDivideFailed() {
    assertThrows(IllegalArgumentException.class, () -> {
      this.calculator.divide(0, 10);
    });
  }
```
