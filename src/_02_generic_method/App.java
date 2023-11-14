package _02_generic_method;

import _02_generic_method.uitls.ArrayHelper;

public class App {
  public static void main(String[] args) {
    String[] names = { "Budi", "Andi", "Sudarsono" };
    Integer[] years = { 2001, 2002, 2003, 2004 };

    int lengthNames = ArrayHelper.<String>countLength(names); // cara pertama
    int lengthYears = ArrayHelper.countLength(years); // cara kedua
    System.out.println("Length of names : " + lengthNames);
    System.out.println("Length of years : " + lengthYears);
    /*
     * Output:
     * Length of names : 3
     * Length of years : 4
     */
  }
}
