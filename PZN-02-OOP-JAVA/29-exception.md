# Exception

## Pengertian Exception

- Saat kita membuat aplikasi, kita tidak akan terhindar degan namanya error.

- Di Java, `error direpresentasikan dengan istilah exception`, dan semua direpresentasikan dalam bentuk `class exception`.

- Kita bisa menggunakan `class exception` sendiri, atau menggunakan yang sudah disediakan oleh Java.

- Jika kita ingin membuat `exception`, maka kita harus membuat `class` yang `extends class Throwable` atau turunan-turunannya.

## Membuat Exception

- `Exception` biasanya terjadi di `method`, ketika kita membuat `exception` di sebuah `method`, maka `method` tersebut harus ditandai dengan `kata kunci thrown` diikuti dengan `class exception` nya.

- Jika `method` tersebut bisa menimbulkan `lebih dari satu jenis exception`, kita bisa menambahkan lebih dari `satu class exception`.

- Di dalam kode program kita, untuk membuat `exception` kita cukup menggunakan `kata kunci throw`, diikuti degan object exception nya.

`errors/ValidationThrowable.java`

```java
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
```

`utils/ValidationUtil.java`

```java
package learn._exception.utils;

import learn._exception.LoginRequest;
import learn._exception.errors.ValidationThrowable;

public class ValidationUtil {
  private ValidationUtil() {
  }

  public static void validate(LoginRequest loginRequest) throws ValidationThrowable {
    if (loginRequest.getUsername() == null) {
      throw new ValidationThrowable("Username tidak boleh null");
    }

    if (loginRequest.getUsername().isBlank()) {
      throw new ValidationThrowable("Username tidak boleh kosong");
    }

    if (loginRequest.getPassword() == null) {
      throw new ValidationThrowable("Password tidak boleh null");
    }

    if (loginRequest.getPassword().isBlank()) {
      throw new ValidationThrowable("Password tidak boleh kosong");
    }
  }
}
```

`LoginRequest.java`

```java
package learn._exception;

public class LoginRequest {
  private String username;
  private String password;

  public LoginRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return this.username;
  }

  public String getPassword() {
    return this.password;
  }
}
```

## Try Catch

- Saat kita memanggil sebuah `fucntion` yang bisa menyebabkan `exception`, maka kita wajib menggunakan `try-catch expression` di Java.

- Ini gunanya agar kita bisa menangkap `exception` yang terjadi, karena jika tidak ditangkap, lalu terjadi `exception`, maka secara otomatis `program kita akan berhenti`.

- Cara menggunakan `try-catch expression` di java sangat mudah, di `block try`, kita tinggal panggil method yang bisa menyebabkan exception, dan di `block catch`, kita bisa melakukan sesuatu juga terjadi exception.

`App.java`

```java
package learn._exception;

import learn._exception.errors.ValidationThrowable;
import learn._exception.utils.ValidationUtil;

public class App {
  public static void main(String[] args) {
    LoginRequest lr = new LoginRequest("budi", "ga kosong!");
    try {
      ValidationUtil.validate(lr);
    } catch (ValidationThrowable e) {
      System.out.println(e.getMessage());
    }
  }
}
```

## Try-catch multiple catch

`error/ValidationUtil.java`

```java
package learn._exception.utils;

import learn._exception.LoginRequest;
import learn._exception.errors.ValidationThrowable;

public class ValidationUtil {
  private ValidationUtil() {
  }
  // Menambahkan 1 lagi exception.
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
}
```

`App.java`

```java
package learn._exception;

import learn._exception.errors.ValidationThrowable;
import learn._exception.utils.ValidationUtil;
import learn.abstractClass.Cat;

public class App {
  public static void main(String[] args) {
    LoginRequest lr = new LoginRequest(null, "ga kosong!");
    try {
      ValidationUtil.validate(lr);
      // multiple try-catch version 1
      // } catch (ValidationThrowable exception) {
      // System.out.println(exception.getMessage());
      // } catch (NullPointerException exception) {
      // System.out.println(exception.getMessage());
      // }
      // multiple try-catch version 2
    } catch (ValidationThrowable | NullPointerException exception) {
      System.out.println(exception.getMessage());
    }
  }
}
```

## Finally Keyword

- Dalam `try-catch`, kita bisa menambahkan `block finally`.

- Block `finally` ini adalah `block` dimana akan selalu dieksekusi baik terjadi exception ataupun tidak.

- Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di block try kita ingin membaca file, kita wajib menutup koneksi ke file tersebut, biar tidak menggantung di memory.

`App.java`

```java
package learn._exception;

import learn._exception.errors.ValidationThrowable;
import learn._exception.utils.ValidationUtil;

public class App {
  public static void main(String[] args) {
    LoginRequest lr = new LoginRequest("admin", "ga kosong!");
    try {
      ValidationUtil.validate(lr);
      // multiple try-catch version 1
      // } catch (ValidationThrowable exception) {
      // System.out.println(exception.getMessage());
      // } catch (NullPointerException exception) {
      // System.out.println(exception.getMessage());
      // }
      // multiple try-catch version 2
    } catch (ValidationThrowable | NullPointerException exception) {
      System.out.println(exception.getMessage());
    } finally {
      System.out.println("Selalu di eksekusi!");
    }
  }
}
```
