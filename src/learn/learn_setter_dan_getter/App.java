package learn.learn_setter_dan_getter;

public class App {
  public static void main(String[] args) {

    Triangle triangle = new Triangle();
    triangle.setBase(1.5f);
    triangle.setHeight(5);
    float areaTriangle = triangle.getArea();
    System.out.println(areaTriangle + " CM");
  }
}
