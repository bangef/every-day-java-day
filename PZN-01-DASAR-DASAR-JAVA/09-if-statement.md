# If Statement

- Dalam java, if adalah salah satu kata kunci atau *key word* yang digunakan untuk percabangan.

- Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi.

- Hampir di semua bahasa pemrograman mendukung if expression.

```java
public class _009IfStatement {
  public static void main(String[] args) {
    System.out.println(sampleIfStatement(-111));
  }

  public static String sampleIfStatement(int nilai){
    // Guard close
    if(nilai >= 80 && nilai <= 100) return "Anda Lulus";
    if(nilai >= 0 && nilai < 80) return "Anda Belum Lulus!";
    return "Masukan nilai dengan benar!";
  }
}
```

## Switch Statement

- Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan `==`.

- `switch` adalah statement percabangan yang sama dengan `if`, namun lebih sederhana cara pembuatannya.

- Kondisi di `switch statement` hanya untuk perbandingan `==` 

```java
public class _009IfStatement {
  public static void main(String[] args) {
    sampleSwtich("makanan");
    sampleSwtich("minuman");
    sampleSwtich("ngasal");
  }

  public static void sampleSwtich(String menu){
    switch (menu) {
      case "makanan":
        String[] makanan = {"Bakso Mbah Gendit", "Sayur Kol", "Telur Putuh Goreng", "Batagor"};
        for (String m : makanan) {
          System.out.println(m);
        }
        break;
      case "minuman":
        String[] minuman = {"Es Teh Manis", "Es Campur", "Infused Tea", "Coffee"};
        for (String m : minuman) {
          System.out.println(m);
        }
        break;
      default:
        System.out.println("Pilih menu dengan benar:\nmakanan atau minuman!";
    }
}
```

## Switch Lambda

- Di java versi 14, diperkenalkan `switch expression` dengan lambda.

- Ini lebih mempermudah saat penggunaan `switch expression` karena kita tidak perlu lagi menggunakan `kata kunci break`.

```java
public class _009IfStatement {
  public static void main(String[] args) {
    sampleSwitchLambda("makanan");
    sampleSwitchLambda("masdasd");
  }

  private static void sampleSwitchLambda(String menu){
    switch (menu) {
      case "makanan" -> {
        String[] makanan = {"Bakso Mbah Gendit", "Sayur Kol", "Telur Putuh Goreng", "Batagor"};
        for (String m : makanan) {
          System.out.println(m);
        }
      }
      case "minuman" -> {
        String[] minuman = {"Es Teh Manis", "Es Campur", "Infused Tea", "Coffee"};
        for (String m : minuman) {
          System.out.println(m);
        }
      }
      default -> System.out.println("Pilih menu dengan benar:\nmakanan atau minuman!");
    }
  } 
}
```

## Kata Kunci `yield`

- Di java versi 14, ada kata kunci baru yaitu `yield`, dimana kita menggunakan kata kunci `yield` untuk mengembalikan nilai pada `switch statement`.

- Ini sangat mempermudah kita ketika membutuhkan data berdasarkan kondisi switch statement.

```java
public class _009IfStatement {
  public static void main(String[] args) {
    sampleSwitchLambdaYield("makanan");
    sampleSwitchLambdaYield("masdasn");
  }

  private static void sampleSwitchLambdaYield(String menu){
    String result = switch (menu) {
      case "makanan":
        yield "Bakso Mbah Gendit";
      default:
        yield "kosong!";
    };
    System.out.println(result);
  }
}
```
