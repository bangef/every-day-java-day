# Array

## Deskripsi

- Array adalah tipe data yang berisikan kumpulan data yang sama.

- Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat.

- Cara kerja array:
  
  - Index adalah urutan posisi pada nilai masing-masing array.
  
  - Array dimulai dengan index ke - 0.
  
  - Setiap nilai nanti akan menempati masing masing index sesuai dengan urutan masing-masing nilai.

```java
public class _001Array extends Utils {
  public static void main(String[] args) {
    getSomeBorder("ARRAY");

    /**
     * 1. Array: dapat menampung lebih dari satu nilai, didalam java array tidak dapat diisikan berbeda tipe data 
     *    Dan harus ditentukan panjang arraynya. Untuk membuat array ada 2 cara deklarasi array -> baru di inisiasi
     *    atau deklarasi dan inisisi secara langsung.
     */
    String[] names = new String[3];
    names[0] = "Ficri Hanip";
    names[1] = "Alisa Putri";
    names[2] = "Joko Tarup";
    // names[3] = "Why not Error"; // error
    System.out.println(names[0]);
    System.out.println(names[1]);
    System.out.println(names[2]);
    // System.out.println(names[3]); // error

    /**
     * 2. Array Initializer: array yang langsung diinisiasikan nilainya ke dalam array
     */
    int[] ages = new int[]{
      20,12,45,12,12,4,5,31
    };

    int[] ages2 = {
      20,12,45,12,12,4,5,31
    };

    for (int i : ages) {
      System.out.println(i);
    }

    for (int i : ages2) {
      System.out.println(i);
    }

    getSomeBorder("ARRAY 2 DIMENSI");

    int[][] years = {
     { 20,12,45,12,12,4,5,31},
     { 20,12,45,12,12,4,5,31},
     { 20 },
    };

    for (int i = 0; i < years.length; i++) {
      System.out.println("Perulangan ke - " + (i + 1));
      for (int j = 0; j < years[i].length; j++) {
        System.out.println("value index of " + (j + 1) + " : " + years[i][j] );
      }
    }

    getSomeBorder("MENGHITUNG PANJANG ARRAY");
    System.out.println(names.length);
    System.out.println(ages.length);
    System.out.println(ages2.length);
  }
}
```

## Operasi di Array

| Operasi              | Keterangan              |
| -------------------- | ----------------------- |
| array[index]         | Mengambil data di array |
| array[index] = value | Mengubah data di array  |
| array.length         | Mengambil panjang array |

#### catatan sementara

javac -sourcepath <target-file-java> -d <target-output-file-java>
java ./bin/App.java
