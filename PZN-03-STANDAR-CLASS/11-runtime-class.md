# Runtime Class

## Pengertian Runtime Class

- Ketika aplikasi Java berjalan, kita bisa melihat informasi environment temoat aplikasi java berjalan.

- Informasi itu terdapat di class Runtime

- Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa mengakses object tersebut menggunakan static method getRuntime() milik class Runtime.

## Method di `Runtime Class`

| Method                    | Keterangan                                                                                  |
| ------------------------- | ------------------------------------------------------------------------------------------- |
| int availableProcessors() | Mendapatkan jumlah core cpu                                                                 |
| long freeMemory()         | Mendapatkan jumlah memory bebas di JVM                                                      |
| long totalMemory()        | Mendapatkan jumlah total memory di JVM                                                      |
| long maxMemory()          | Mendapatkan jumlah maksimum memory di JVM                                                   |
| void gc()                 | Menjalankan garbage collector untuk menghilangkan data di memory yang sudah tidak terpakai. |

## Implementasi `Runtime Class`

 `App.java`

```java
package _11_runtime;

public class App {
  public static void main(String[] args) {
    Runtime runtime = Runtime.getRuntime();
    int availableProcessors = runtime.availableProcessors();
    long freeMemory = runtime.freeMemory();
    long maxMemory = runtime.maxMemory();
    long totalMemory = runtime.totalMemory();
    StringBuilder builder = new StringBuilder();
    builder.append("=== Runtime Class ===\n");
    builder.append("Available Processors:\t" + availableProcessors + "\n");
    builder.append("Free Memory:\t" + freeMemory + "\n");
    builder.append("Total Memory:\t" + totalMemory + "\n");
    builder.append("Max Memory:\t" + maxMemory + "\n");
    System.out.println(builder.toString());
    /*
     * Output:
     * === Runtime Class ===
     * Available Processors: 8
     * Free Memory: 249097536
     * Total Memory: 251658240
     * Max Memory: 3999268864
     */
  }
}
```
