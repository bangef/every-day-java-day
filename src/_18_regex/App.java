package _18_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam ornare est nibh, ac iaculis mauris faucibus at.";
    String name = "Eko Kurniawan Khanendy Programer Zaman Now";
    String regex = "[a-zA-Z]*[a][a-zA-Z]*";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    Matcher matcher2 = pattern.matcher(name);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
    /*
     * Output:
     * amet
     * adipiscing
     * Aliquam
     * ornare
     * ac
     * iaculis
     * mauris
     * faucibus
     * at
     */
    System.out.println();
    while (matcher2.find()) {
      System.out.println(matcher2.group());
    }
    /*
     * Output:
     * Kurniawan
     * Khanendy
     * Programer
     * Zaman
     */
  }
}
