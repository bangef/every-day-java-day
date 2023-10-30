package learn_interface;

public class Avanza implements Car {

  @Override
  public boolean IsMaintance() {
    return false;
  }

  @Override
  public String getBrand() {
    return "Toyota-Avanza";
  }

  @Override
  public void drive() {
    System.out.println("Drive Avanza...");
  }

  @Override
  public int getTire() {
    return 4;
  }

}
