package _04_string_tokenizer;

import java.util.StringTokenizer;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet.";
    stringTokenizerImplementation(text);
    /*
     * Output:
     * Lorem
     * ipsum
     * dolor
     * sit
     * amet.
     */
  }

  public static void stringTokenizerImplementation(String text) {
    StringTokenizer tokenizer = new StringTokenizer(text, " ");

    while (tokenizer.hasMoreTokens()) {
      String token = tokenizer.nextToken();
      System.out.println(token);
    }
  }
}
