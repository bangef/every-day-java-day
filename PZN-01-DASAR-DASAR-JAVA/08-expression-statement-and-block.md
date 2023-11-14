# Expression, Statement and Block

## Expression

- Expression adalah konstruksi dari variable, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value.

- Expression adalah core component dari statement.

```java
public class _008ExpressionStatementAndBlocks {
  public static void main(String[] args) {
    expression();
  }

  private static void expression(){
    int variableInteger; // expression
    variableInteger = 100; // expression
    System.out.println("Sample expression: " + variableInteger); // argumen is a expression
  }
}
```

## Statement

- Statement bisa dibilang adalah kalimat lengkap dalam bahasa.

- Sebuah statement berisikan execution komplit, biiasanya diakhiri dengan titik koma.

- Ada beberpa jenis statement:
  
  - Assignment expression
  
  - Penggunaan `++` dan `--`
  
  - Method invocation
  
  - Object creation expression

```java
import java.util.Date;
public class _008ExpressionStatementAndBlocks {
  public static void main(String[] args) {
    statement();
  }

  private static void statement(){
    double aValue = 50.1920990; // assignment statement
    aValue++; // increment statement
    aValue--; // decrement statement
    System.out.println("Hello World!"); // method invocation statement
    Date date = new Date(); // object creation statement
  }
}
```

## Block

- Block adalah kumpulan statement yang terdiri dari nil atau lebih statement.

- Block diawali dan diakhiri dengan kurung kurawal {}.

```java
import java.util.Date;
public class _008ExpressionStatementAndBlocks { // sample block
  public static void main(String[] args) { // sample block
    block();
  }

  private static void block(){ // sample block
    double aValue = 50.1920990; // assignment statement
    aValue++; // increment statement
    aValue--; // decrement statement
    System.out.println("Hello World!"); // method invocation statement
    Date date = new Date(); // object creation statement
  }
}
```
