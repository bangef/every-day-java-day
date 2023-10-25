public class Rectangle extends Shape {
  @Override
  int getCorner() {
    return 4;
  }

  int getParentCorner() {
    return super.getCorner();
  }
}
