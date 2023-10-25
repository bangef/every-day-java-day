public class ShapeApp {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();

    int rectangleCorner = rectangle.getCorner();
    int rectangleParentCorner = rectangle.getParentCorner();

    System.out.println(rectangleCorner);
    System.out.println(rectangleParentCorner);
  }
}
