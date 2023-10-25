public class Shape {
  private float height, width, length;

  public Shape(float height, float width, float length) {
    this.height = height;
    this.width = width;
    this.length = length;
  }

  public Shape(float length) {
    this.length = length;
  }

  int getCorner() {
    return 0;
  }
}
