package latiha.unittesting.app;

public class Calculator {
  public int add(int numberOne, int numberTwo) {
    return numberOne + numberTwo;
  }

  public int divide(int numberOne, int numberTwo) {
    if (numberOne == 0 || numberTwo == 0) {
      throw new IllegalArgumentException("Can not divide by zero");
    }
    return numberOne / numberTwo;
  }
}
