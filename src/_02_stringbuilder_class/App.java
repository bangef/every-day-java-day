package _02_stringbuilder_class;

public class App {
  public static void main(String[] args) {
    stringBuilderImplementation();
    stringBufferImplementation();
  }

  public static void stringBuilderImplementation() {
    StringBuilder builder = new StringBuilder();
    builder.append("=== String Builder ===");
    builder.append("\n");
    builder.append("Ficri");
    builder.append(" ");
    builder.append("Hanip");
    builder.append("\n");
    builder.append("Capacity: ");
    builder.append(builder.capacity());
    builder.append("\n");
    System.out.println(builder.toString());
  }

  public static void stringBufferImplementation() {
    StringBuffer buffer = new StringBuffer();
    buffer.append("=== String Builder ===");
    buffer.append("\n");
    buffer.append("Alisa");
    buffer.append(" ");
    buffer.append("Putri");
    buffer.append(" ");
    buffer.append("Arlini");
    buffer.append("\n");
    buffer.append("Capacity: ");
    buffer.append(buffer.capacity());
    buffer.append("\n");
    System.out.println(buffer.toString());
  }
}
