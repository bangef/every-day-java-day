# Method

- Method adalah block kode program yang akan berjalan saat kita panggil.

- Sebelumnya kita sudah menggunakan method `println()` untuk menampilkan tulisan di console.

- Untuk membuat method di Java, kita bisa menggunakan kata kunci `void`, lalu diikuti dengan nama method, kurung `( )` dan diakhiri dengan `block`.

- Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung ().

- Di bahasa pemrograman lain, method juga disebut dengan `function`.

```java
public class _13Method {
  public static void main(String[] args) {
    sayHello("Bangef"); // Hallo, perkenalkan saya Bangef
  }

  public static void sayHello(String name){
    System.out.println("Hallo, perkenalkan saya " + name);
  }
}
```

## Method Parameter

- Kita bisa mengirimkan informasi ke method yang ingin kita panggil.

- Untuk melkukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat.

- Cara membuat parameter sama seperti cara membuat variabel.

- Parameter ditempatkan di dalam kurung `()` dideklarasi method.

- Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma `,`.

```java
public class _13Method {
  public static void main(String[] args) {
    sayHello("Bangef"); // Hallo, perkenalkan saya Bangef
  }

  public static void sayHello(String name){ // parameter 
    System.out.println("Hallo, perkenalkan saya " + name);
  }
}
```

## Method Return Value

- Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah method mengembalikan nilai.

- Agar methdo bisa menghasilkan value, kita harus mengubah kata kunci `void` dengan tipe data yang dihasilkan.

- Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci `return`, lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method.

- Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu.

```java
public class _13Method {
  public static void main(String[] args) {
       System.out.println(returnSayHello("Ef"));
  }

  public static String returnSayHello(String name){ // method 
    return "Iya, salam kenal juga saya " + name;
  }
}
```

## Method Variable Argument

- Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti.

- Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method.

- Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih.

- Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter.

```java
public class _13Method {
  public static void main(String[] args) {
    printAssigment("Ficri Hanip", arrValues); // Maaf Ficri Hanip, anda belum lulus.
    printAssigment2("Ficri Hanip", 1,2,3,4,5); // Maaf Ficri Hanip, anda belum lulus.
  }

  // method variable arguments value before
  public static void printAssigment(String name, int [] values){
    int tempValue = 0;
    for (int i : values) {
      tempValue += i;
    }
    float finalResultValue = (float) tempValue / (float) values.length;
    String isPass = (finalResultValue > 8) ? "Selamat " + name + ", anda lulus." : "Maaf " + name + ", anda belum lulus.";
    System.out.println(isPass);
  }

  // method variable arguments value after
  public static void printAssigment2(String name, int... values){ // menambahkan titik tiga pada tipe data values
    int tempValue = 0;
    for (int i : values) {
      tempValue += i;
    }
    float finalResultValue = (float) tempValue / (float) values.length;
    String isPass = (finalResultValue > 8) ? "Selamat " + name + ", anda lulus." : "Maaf " + name + ", anda belum lulus.";
    System.out.println(isPass);
  }
}
```

## Method Overloading

- method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.

- Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda - beda, entah jumlah atau tipe data parameternya.

- Jika ada yang sama, maka program java kita akan error.

```java
public class _13Method {
  public static void main(String[] args) {
    sayHello();
    sayHello("Bangef");
    sayHello("Bangef", 25);
    }

  // method parameter or argument
  public static void sayHello(String name){ // method parameter
    System.out.println("Hallo, perkenalkan saya " + name);
  }

  // method overloading 
  public static void sayHello() {
    System.out.println("Hallo saya overloading parameter!");
  }

  // method overloading with 2 params
  public static void sayHello(String name, int year){
    System.out.println("Hallo, saya overloading parameter!");
    System.out.println("Nama" + name + ", umur" + year);
  }
}
```

## Recrusive Method

- Recrusive method adalah kemampuan method memanggil method dirinya sendiri.

- Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recrusive method, seperti contohnya kasus factorial.

```java
public class _13Method {
  public static void main(String[] args) {
    System.out.println(factorial(4);); // 24
  }

  // method recrusive factorial
  public static int factorial(int n){
    if(n == 1){
      return 1;
    }else{
      return n * factorial(n - 1);
    }
  }
}
```

### Problem dengan Recrusive

- Walaupun recrusive method itu sangat menarik, namun kita perlu berhati-hati.

- Jika recrusive terlalu dalam, maka akan ada kemungkinan terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java.

- Kenapa problem ini bisa terjadi ? karena ketika kita memanggil method, Java akan menyimpan dalam stack, jika method tersebut memanggil method lain, maka stack akan menumpuk terus dan jika terlalu dalam, maka stack akan terlalu besar dan bisa menyebabkan error StackOverflow.

```java
public class _13Method {
  public static void main(String[] args) {
    factorial(30000);
  }

  // problem method recrusive: stackoverflow
  public static int factorial(int n){
    if(n == 1){
      System.out.println("selesai");
      return 1;
    }else{
      System.out.println("value ke - " + n);
      return n * factorial(n - 1);
    }
  }
}
```
