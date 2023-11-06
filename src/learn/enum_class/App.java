package learn.enum_class;

public class App {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setLevel(Level.PREMIUM);
    System.out.printf("Level: %s%n", customer.getLevel());
    System.out.printf("Description: %s%n", customer.getLevel().getDescription());

    Level standard = Level.valueOf("STANDARD");
    System.out.println(standard);
    String premiumString = Level.PREMIUM.name();
    System.out.println(premiumString);
    Level[] values = Level.values();
    System.out.println("Looping Level: ");
    for (Level level : values) {
      System.out.println(level.name());
    }
  }
}
