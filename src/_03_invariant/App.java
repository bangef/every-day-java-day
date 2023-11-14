package _03_invariant;

import _01_generic_class.MyData;

public class App {
  MyData<String> myDataOne = new MyData<>();
  MyData<Object> myDataOnePolymorp = myDataOne; // ERROR

  MyData<Integer> myDataTwo = new MyData<>();
  MyData<Object> myDataTwoPolymorp = myDataTwo; // ERROR
  /*
   * Invariant tidak boleh di subsitusi dengan (child or parent).
   */
}
