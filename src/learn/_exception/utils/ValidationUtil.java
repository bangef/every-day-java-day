package learn._exception.utils;

import learn._exception.LoginRequest;
import learn._exception.errors.BlankException;
import learn._exception.errors.ValidationThrowable;

public class ValidationUtil {
  private ValidationUtil() {
  }

  public static void validate(LoginRequest loginRequest) throws ValidationThrowable, NullPointerException {
    if (loginRequest.getUsername() == null) {
      throw new NullPointerException("Username tidak boleh null");
    }

    if (loginRequest.getUsername().isBlank()) {
      throw new ValidationThrowable("Username tidak boleh kosong");
    }

    if (loginRequest.getPassword() == null) {
      throw new NullPointerException("Password tidak boleh null");
    }

    if (loginRequest.getPassword().isBlank()) {
      throw new ValidationThrowable("Password tidak boleh kosong");
    }
  }

  public static void validateRuntime(LoginRequest loginRequest) {
    if (loginRequest.getUsername() == null) {
      throw new NullPointerException("Username tidak boleh null");
    }

    if (loginRequest.getUsername().isBlank()) {
      throw new BlankException("Username tidak boleh kosong");
    }

    if (loginRequest.getPassword() == null) {
      throw new NullPointerException("Password tidak boleh null");
    }

    if (loginRequest.getPassword().isBlank()) {
      throw new BlankException("Password tidak boleh kosong");
    }
  }
}