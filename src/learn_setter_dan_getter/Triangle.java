package learn_setter_dan_getter;

public class Triangle extends Shape {
  private float base;
  private float height;

  @Override
  public float getArea() {
    return 0.5f * this.base * this.height;
  }

  public float getBase() {
    return base;
  }

  public void setBase(float base) {
    this.base = base;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }
}
