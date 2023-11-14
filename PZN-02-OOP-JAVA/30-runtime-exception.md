# Runtime Exception

## Pengertian Runtime Exception

- Runtime Exception adalah jenis exception yang tidak wajib di tangkap menggunakan `try-catch`.

- Kompiler Java tidak akan protes walaupun kita tidak menggunakan `try-catch` ketika kita memanggil method yang bisa menyebabkan `runtime exception`.

- Untuk membuat class runtime exception, kita wajib meng-extends class RuntimeException.

- Ada banyak di Java yang merupakan runtime exception, seperti NullPointerException, IllegalArgumentException, dll.

`errors/BlankException.java`

```java
package learn._exception.errors;

public class BlankException extends RuntimeException {
  public BlankException(String message) {
    super(message);
  }
}
```

`utils/ValidationUtil.java`

```java
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
      throw new ValidationThrowable("Password tidak bo    leh kosong");
    }
  }
  // mehod static untuk execute RuntimeException
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
```

`App.java`

```java
package learn._exception;

import learn._exception.errors.BlankException;
import learn._exception.errors.ValidationThrowable;
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
```

## Perlu diperhatikan

- Walaupun runtime exception tidak wajib di `try-catch`, tapi ada baiknya kita tetap melakukan `try-catch`.

- Karena jika terjadi runtime exception, yang ditakutkan adalah program kita berhenti.
