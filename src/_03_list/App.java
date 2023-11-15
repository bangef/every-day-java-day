package _03_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<Integer> numbersArrayList = new ArrayList<>();
    List<Integer> numbersLinkedList = new LinkedList<>();
    numbersLinkedList.addAll(List.of(1, 2, 3, 4, 651, 21, 45, 1, 21, 54, 51, 21, 454, 12));
    Iterator<Integer> iterator = numbersLinkedList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    numbersArrayList.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421));
    System.out.println(numbersArrayList.toString());

    int valueIndex2 = numbersArrayList.get(2);
    System.out.println(valueIndex2);

    numbersArrayList.set(2, 2);
    System.out.println(numbersArrayList.toString());
    Integer value = 2;

    numbersArrayList.remove(value); // hanya menjalankan sekali, apabila ada object yang sama maka tidak akan
                                    // dihapus
    System.out.println(numbersArrayList.toString());
    numbersArrayList.remove(2);
    System.out.println(numbersArrayList.toString());

    numbersArrayList.forEach((number) -> {
      if (number > 2) {
        System.out.println(number);
      }
    });
    /*
     * Output:
     * [1, 2, 3, 4, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421]
     * 3
     * [1, 2, 2, 4, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421]
     * [1, 2, 4, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421]
     * [1, 2, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421]
     * 5
     * 6
     * 7
     * 8
     * 9
     * 541
     * 12
     * 14
     * 121
     * 21
     * 545
     * 41
     * 21
     * 45
     * 421
     */
  }
}