package learn._exception.errors;

public class ValidationThrowable extends Throwable {
  /*
   * Hal ini dapat di refactoring hanya dengan membuat constructor super dengan
   * validation(String message) dengan default pesannya
   */
  // private String message;

  // @Override
  // public String getMessage() {
  // return "Lempar error";
  // }

  public ValidationThrowable(String message) {
    super(message);
  }
}
