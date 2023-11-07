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
}
