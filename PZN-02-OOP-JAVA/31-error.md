# Error

## Pengertian Error

- Error adalah jenis exception yang terakhir.

- Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di `try-catch`.

- Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di `try-catch`.

- Artinya, direkomendasikan untuk mematikan aplikasi.

- Contoh, misal jika diawal aplikasi kita  tidak bisa terkoneksi ke database, direkomendasikan untuk membuat exception jenis Error, dan menghentikan aplikasi.

`errors/DatabaseError.java`

```java
package learn._error.error;

public class DatabaseError extends Error {
  public DatabaseError(String message) {
    super(message);
  }
}
```

`DatabaseApp.java`

```java
package learn._error;

import learn._error.error.DatabaseError;

public class DatabaseApp {
  public static void main(String[] args) {
    /**
     * Untuk case apabila exceptionnya Error, maka dapat dieksekusi tanpa try-catch
     * guna langsung menghentikan aplikasi.
     * 
     */
    connectDatabase(null, null);
  }

  public static void connectDatabase(String username, String password) {
    if (username == null || password == null) {
      throw new DatabaseError("Username atau password tidak boleh null");
    }
  }
```
