package _17_arrays_class;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    int[] numbers = { 20, 11, 24, 16, 18 };
    int lengthOfNewArray = 4;
    int[] copyNumbers = Arrays.copyOf(numbers, lengthOfNewArray);
    System.out.println(Arrays.toString(copyNumbers));
    /*
     * Output:
     * [20, 11, 24, 16]
     */
  }
}
