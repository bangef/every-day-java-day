public class Rectangle extends Shape {
  public Rectangle(float length) {
    super(length);
  }

  @Override
  int getCorner() {
    return 4;
  }

  int getParentCorner() {
    return super.getCorner();
  }
}
