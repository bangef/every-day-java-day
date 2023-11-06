package learn.enum_class;

public enum Level {
  STANDARD("Standart Editiom"),
  PREMIUM("Premium Edition"),
  VIP("VIP Edition");

  private String description;

  Level(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }

}
