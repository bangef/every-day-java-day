package _03_string_joiner;

import java.util.StringJoiner;

public class App {
  public static void main(String[] args) {
    String[] names = { "Anto", "Budi", "Ridwan", "Joko", "Dodo" };
    stringJoinerImplementation(names); // Names: Anto, Budi, Ridwan, Joko, Dodo.
  }

  public static void stringJoinerImplementation(String[] stringArray) {
    StringJoiner joiner = new StringJoiner(", ", "Names: ", ".");
    for (String string : stringArray) {
      joiner.add(string);
    }
    System.out.println(joiner.toString());
  }
}
