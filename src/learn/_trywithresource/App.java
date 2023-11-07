package learn._trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
  public static void main(String[] args) {
    // manualCloseResource();
    tryCatchResource();
  }

  public static void tryCatchResource() {
    try (BufferedReader reader = new BufferedReader(new FileReader("test.m"))) {
      while (true) {
        String text = reader.readLine();
        if (text == null) {
          break;
        }
        System.out.println(text);
      }
    } catch (IOException exeception) {
      exeception.printStackTrace();
    }
  }

  public static void manualCloseResource() {
    /**
     * Before use Try-catch-resource
     */
    BufferedReader reader = null;
    try {
      String path = "test.md";
      FileReader fileReader = new FileReader(path);
      reader = new BufferedReader(fileReader);

      while (true) {
        String text = reader.readLine();
        if (text == null) {
          break;
        }
        System.out.println(text);
      }
    } catch (IOException exception) {
      exception.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException exception) {
          exception.printStackTrace();
        }
      }
    }
  }
}
