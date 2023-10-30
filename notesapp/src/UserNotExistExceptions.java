
public class UserNotExistExceptions extends RuntimeException {
  @Override
  public String getMessage() {
    return "User not exist!";
  }
}
