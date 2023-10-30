package learn_interface;

public interface Car extends HasBrand, IsMaintanance {
  void drive();

  int getTire();

  default boolean isBig() {
    return false;
  }
}
