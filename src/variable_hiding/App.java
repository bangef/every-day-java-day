package variable_hiding;

public class App {
  public static void main(String[] args) {
    Child c = new Child();
    c.name = "Eko";
    c.doIt();
    System.out.println(c.name);

    Parent p = (Parent) c;
    p.doIt();
    System.out.println(p.name);
  }
}
