# Variabel

## Penjelasan Variabel

- Variabel adalah tempat untuk menyimpan data.

- Java adalah bahasa *static type*, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipe data seperti di bahasa pemrograman php atau javascript.

- Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya.

- Nama variable tidak boleh mengandung: 
  
  - whitespace (spasi, enter, tab).
  
  - Diawali dengan angka

```java
Sting name;
name = "Ficri Hanip";


int age = 30;
String address = "Indonesia";

System.out.println(name);
System.out.println(age);
System.out.println(address);
```

## Kata Kunci var

- Sejak versi java 10, Java mendukung pembuatan variabel dengan kata kunci `var`, sehingga kita tidak perlu menyebutkan tipe datanya.

- Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variabel, kita harus menginisiasi nilai dari variabel tersebut secara langsung.

```java
var fullName = "Joko Tri Handoko";
fullname = "Susilo Bambang Yudoyono";
fullName = 100; //error
System.out.println(fullName); // Susilo Bambang Yudoyonon
```

## Kata Kunci final

- Secara *default*, variabel di Java bisa diubah-ubah nilainya.

- Jika kita ingin membuat sebuah variabel yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunkaan kata kunci `final`.

- Istilah variabel seperti ini, banyak juga menyebutnya `konstan`.

- Kebiasaan menuliskan `konstan` adalah dengan `uppercase` dan `underscore`. Contoh `MAX_LENGTH`, `FULL_NAME`.

```java
// benar ✅
final String NAME;
NAME = "Usop";
// atau 
final String NAME = "Ussop";

// salah ❌
final String NAME = "Monkey D Luffy";
NAMAE = "Roger"; // error
```
