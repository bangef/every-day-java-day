package learn.learn_setter_dan_getter;

public abstract class Shape {
  private String color;

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public abstract float getArea();
}
