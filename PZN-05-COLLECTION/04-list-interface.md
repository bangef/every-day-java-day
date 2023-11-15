# List Interface

## Pengertian List Interface

- List adalah struktur data collection yang memiliki sifat sebagai berikut:
  
  - Elemen di list bisa duplikat, artinya bisa memasukan data yang sama.
  
  - Data list berurutan sesuai dengan posisi kita memasukan data.
  
  - List memiliki index, sehingga kita bisa menggunakan index untuk mendapatkan elemen di list.
  
  - List hampir mirip dengan array, pembedanya hanya bersifat dynamic.

- Di Java ada beberapa implementasi List, dan kita bisa memilih sesuai dengan kebutuhan kita.

## Method di List

- AddAll

- replaceAll

- sort

- get

- set

- add

- remove

- indexOf

- lastIndexOf

- listIterator

- listIterator

- subList

- dll...

## ArrayList Class

- ArrayList adalah implementasi dari List menggunakan array.

- Default kapasitas array di ArrayList adalah 10

- Namun ketika kita memasukkan data dan array sudah penuh, maka secara otomatis ArrayList akan membuat array baru dengan kapasitas dengan kapasitas baru dengan ukuran kapasitas lama + data baru.

## LinkedList Class

- LinkedList adalah implementasi List dengan struktur data Double Linked List.

- Bagi yang sudah belajar tentang struktur data di sekolah / kmapus pasti tau apa itu double linked list.

## ArrayList VS LinkedList

| Operasi | ArrayList                                                        | LinkedList                                                             |
| ------- | ---------------------------------------------------------------- | ---------------------------------------------------------------------- |
| add     | Cepat jika kapasitas Array masih cukup, lambat jika sudah penuh. | Cepat karena hanya menambahkan node di akhir.                          |
| get     | Cepat karena tinggal gunakan index array                         | Lambat karena harus di cek dari node awal sampai ketemu index nya.     |
| set     | Cepat karena tinggal gunakan index array                         | Lambat karena harus di cek dari node awal sampai ketemu.               |
| remove  | Lambat karena harus menggeser data di belakang yang dihapus      | Cepat karena tinggal ubah prev dan next di node sebelah yang di hapus. |

- ArrayList baik digunakan apabila ada merubah data, hapus atau menambahkan data atau apabila ingin lebih memodifikasi data tersebut. LinkedList baik digunakan apabila mau menambahkan data dan iterasi data lebih cepat menggunakan LinkedList.

## Implementasi `ArrayList` dan `LinkedList`

`App.java`

```java
package _03_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<Integer> numbersArrayList = new ArrayList<>();
    List<Integer> numbersLinkedList = new LinkedList<>();
    numbersLinkedList.addAll(List.of(1, 2, 3, 4, 651, 21, 45, 1, 21, 54, 51, 21, 454, 12));
    Iterator<Integer> iterator = numbersLinkedList.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    numbersArrayList.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421));
    System.out.println(numbersArrayList.toString());

    int valueIndex2 = numbersArrayList.get(2);
    System.out.println(valueIndex2);

    numbersArrayList.set(2, 2);
    System.out.println(numbersArrayList.toString());
    Integer value = 2;

    numbersArrayList.remove(value); // hanya menjalankan sekali, apabila ada object yang sama maka tidak akan
                                    // dihapus
    System.out.println(numbersArrayList.toString());
    numbersArrayList.remove(2);
    System.out.println(numbersArrayList.toString());

    numbersArrayList.forEach((number) -> {
      if (number > 2) {
        System.out.println(number);
      }
    });
    /*
     * Output:
     * [1, 2, 3, 4, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421]
     * 3
     * [1, 2, 2, 4, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421]
     * [1, 2, 4, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421]
     * [1, 2, 5, 6, 7, 8, 9, 541, 12, 14, 121, 0, 21, 545, 41, 21, 45, 421]
     * 5
     * 6
     * 7
     * 8
     * 9
     * 541
     * 12
     * 14
     * 121
     * 21
     * 545
     * 41
     * 21
     * 45
     * 421
     */
  }
}
```
