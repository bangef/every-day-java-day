package learn._exception;

import learn._exception.errors.BlankException;
import learn._exception.utils.ValidationUtil;

public class App {
  public static void main(String[] args) {
    LoginRequest lr = new LoginRequest("", "ga kosong!");
    try {
      ValidationUtil.validateRuntime(lr);
      // multiple try-catch version 1
      // } catch (ValidationThrowable exception) {
      // System.out.println(exception.getMessage());
      // } catch (NullPointerException exception) {
      // System.out.println(exception.getMessage());
      // }
      // multiple try-catch version 2
      // } catch (ValidationThrowable | NullPointerException | BlankException
      // exception) {
    } catch (NullPointerException | BlankException exception) {
      System.out.println(exception.getMessage());
    } finally {
      System.out.println("Selalu di eksekusi!");
    }
  }
}
