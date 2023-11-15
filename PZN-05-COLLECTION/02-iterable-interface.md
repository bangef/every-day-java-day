# Iterable Interface

- `Iterable` adalah parent untuk semua collection di Java, kecuali Map.

- Iterable sendiri sangat sederhana, hanya digunakan agar `mendukung for-each loop`.

- Karena semua collection pasti implement iterable, secara otomatis maka semua collection di Java mendukung perulangan for-each, jadi bukan cuma Array.

## Implementasi `Iterator` dan `Iterable`

```java
package _01_iterable;

import java.util.Iterator;
import java.util.List;

public class App {
  public static void main(String[] args) {
    /*
     * Sebelum ada Iterable, menggunakan Iterator
     * Inilah sebabnya dapat menggunakan for-Each
     */
    System.out.println("=== ITERABLE ===");
    Iterable<String> names = List.of("Andi", "Budi", "Jono");
    for (String name : names) {
      System.out.println(name);
    }
    /*
     * Output:
     * Andi
     * Budi
     * Jono
     */

    /*
     * Menggunakan Iterator
     */
    System.out.println("=== ITERATOR ===");
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    /*
     * === ITERATOR ===
     * Andi
    * Budi
     * Jono
     */
  }
}
```
