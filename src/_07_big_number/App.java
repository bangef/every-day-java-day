package _07_big_number;

import java.math.BigDecimal;
import java.math.BigInteger;

public class App {
  public static void main(String[] args) {
    bigInteger();
    /*
     * Output:
     * === Big Integer Class ===
     * BigIntegerOne: 100000000000000000000000000000000000000
     * BigIntegerTwo: 100000000000000000000000000000000000
     * Add BigInteger: 100100000000000000000000000000000000000
     * Subtract BigInteger: 99900000000000000000000000000000000000
     * Multiply BigInteger:
     * 10000000000000000000000000000000000000000000000000000000000000000000000000
     * Divide BigInteger: 1000
     * Modulo BigInteger: 0
     */
    bigDecimal();
    /*
     * Output:
     * === Big Decimal Class ===
     * BigDecimalOne: 100.4244545545455455555
     * BigDecimalTwo: 91.424454554545545555554654
     * Add BigDecimal: 191.848909109091091111054654
     * Subtract BigDecimal: 8.999999999999999999945346
     * Multiply BigDecimal: 9181.2509815870736586131790875863499358270402970
     */
  }

  public static void bigInteger() {
    BigInteger bigIntegerOne = new BigInteger("100000000000000000000000000000000000000");
    BigInteger bigIntegerTwo = new BigInteger("100000000000000000000000000000000000");
    BigInteger resultAddBigIntegerNumber = bigIntegerOne.add(bigIntegerTwo);
    BigInteger resultSubtarctBigIntegerNumber = bigIntegerOne.subtract(bigIntegerTwo);
    BigInteger resultMultiplyBigIntegerNumber = bigIntegerOne.multiply(bigIntegerTwo);
    BigInteger resultDivideBigIntegerNumber = bigIntegerOne.divide(bigIntegerTwo);
    BigInteger resultModBigIntegerNumber = bigIntegerOne.mod(bigIntegerTwo);

    StringBuilder builder = new StringBuilder();
    builder.append("=== Big Integer Class ===");
    builder.append("\n");
    builder.append("BigIntegerOne: " + bigIntegerOne);
    builder.append("\n");
    builder.append("BigIntegerTwo: " + bigIntegerTwo);
    builder.append("\n");
    builder.append("Add BigInteger: " + resultAddBigIntegerNumber + "\n");
    builder.append("Subtract BigInteger: " + resultSubtarctBigIntegerNumber + "\n");
    builder.append("Multiply BigInteger: " + resultMultiplyBigIntegerNumber + "\n");
    builder.append("Divide BigInteger: " + resultDivideBigIntegerNumber + "\n");
    builder.append("Modulo BigInteger: " + resultModBigIntegerNumber + "\n");

    System.out.println(builder.toString());
  }

  public static void bigDecimal() {
    BigDecimal bigDecimalOne = new BigDecimal("100.4244545545455455555");
    BigDecimal bigDecimalTwo = new BigDecimal("91.424454554545545555554654");
    BigDecimal resultAddBigDecimalNumber = bigDecimalOne.add(bigDecimalTwo);
    BigDecimal resultSubtarctBigDecimalNumber = bigDecimalOne.subtract(bigDecimalTwo);
    BigDecimal resultMultiplyBigDecimalNumber = bigDecimalOne.multiply(bigDecimalTwo);
    // BigDecimal resultDivideBigDecimalNumber =
    // bigDecimalOne.divide(bigDecimalTwo);

    StringBuilder builder = new StringBuilder();
    builder.append("=== Big Decimal Class ===");
    builder.append("\n");
    builder.append("BigDecimalOne: " + bigDecimalOne);
    builder.append("\n");
    builder.append("BigDecimalTwo: " + bigDecimalTwo);
    builder.append("\n");
    builder.append("Add BigDecimal: " + resultAddBigDecimalNumber + "\n");
    builder.append("Subtract BigDecimal: " + resultSubtarctBigDecimalNumber + "\n");
    builder.append("Multiply BigDecimal: " + resultMultiplyBigDecimalNumber + "\n");
    // builder.append("Divide BigDecimal: " + resultDivideBigDecimalNumber + "\n");

    System.out.println(builder.toString());
  }
}