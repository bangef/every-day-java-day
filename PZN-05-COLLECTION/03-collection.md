# Collection Interface

- Selain `Iterable interface`, parent class semua collection di Java adalah `Collection`.

- Kalo `Iterable interface` digunakan sebagai `kontrak` untuk meng-iterasi data secara sequential.

- `Collection` merupakan `kontrak` untuk `memanipulasi data collection`, seperti menambah, menghapus dan mengecek isi data collection.

- Tidak ada `direct implementation` untuk `Collection`, karena `collection` nanti akan dibagi lagi menjadi `List`, `Set` dan `Queue`.

## Implementasi `Collection` di Collection

```java
package _02_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Collection<String> names = new ArrayList<>();
    names.add("Andi");// menambahkan collection
    names.add("Budi");// menambahkan collection
    names.add("Caca");// menambahkan collection
    System.out.println(names.toString());

    names.addAll(List.of("Dedi", "Erlangs"));// menambahkan banyak collection secara langsung
    System.out.println(names.toString());

    int lengthNames = names.size();
    System.out.println(lengthNames); // jumalah panjang/banyak collection

    names.remove("Andi"); // hapus isi dari collection dengan spesifik
    System.out.println(names.toString());

    boolean isContainAndi = names.contains("Andi"); // Apakah names mengandung "Andi"
    System.out.println(isContainAndi);

    boolean isContains = names.containsAll(List.of("Dedi", "Erlangs")); // Apakah name mengandung diantaranya "Dedi", "Erlangs"
    System.out.println(isContains);

    names.clear(); // hapus semua isi collection
    System.out.println(names.toString());

    /*
     * Output:
     * [Andi, Budi, Caca]
     * [Andi, Budi, Caca, Dedi, Erlangs]
     * 5
     * [Budi, Caca, Dedi, Erlangs]
     * false
     * true
     * []
     */
  }
}
```
