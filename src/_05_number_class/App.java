package _05_number_class;

public class App {
  public static void main(String[] args) {
    numberImplementation();
    /*
     * Output:
     * === Number ===
     * before convert:
     * 1000 , type: java.lang.Integer
     * 3.14 , type: java.lang.Float
     * 2023 , type: java.lang.String
     * after convert:
     * 1000.0 , type: java.lang.Double
     * 3.140000104904175 , type: java.lang.Double
     * 2023 , type: java.lang.Integer
     */
  }

  public static void numberImplementation() {
    Integer intValue = 1000;
    Float floatValue = 3.14F;
    String stringValue = "2023";

    /*
     * Convert to non-primitif
     */
    Double integerToDoubleNonPrimitif = intValue.doubleValue();
    Double floatToDoubleNonPrimitif = floatValue.doubleValue();
    Integer stringToIntegerNonPrimitf = Integer.valueOf(stringValue);

    StringBuilder builder = new StringBuilder();
    builder.append("=== Number ===");
    builder.append("\n");
    builder.append("before convert: ");
    builder.append("\n");
    builder.append(intValue + " , type: " + intValue.getClass().getName());
    builder.append("\n");
    builder.append(floatValue + " , type: " + floatValue.getClass().getName());
    builder.append("\n");
    builder.append(stringValue + " , type: " + stringValue.getClass().getName());
    builder.append("\n");
    builder.append("after convert: ");
    builder.append("\n");
    builder.append(integerToDoubleNonPrimitif + " , type: " + integerToDoubleNonPrimitif.getClass().getName());
    builder.append("\n");
    builder.append(floatToDoubleNonPrimitif + " , type: " + floatToDoubleNonPrimitif.getClass().getName());
    builder.append("\n");
    builder.append(stringToIntegerNonPrimitf + " , type: " + stringToIntegerNonPrimitf.getClass().getName());
    builder.append("\n");

    System.out.println(builder.toString());
  }
}
