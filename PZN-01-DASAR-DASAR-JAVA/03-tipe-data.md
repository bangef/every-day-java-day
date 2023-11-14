# Tipe Data Java

## Tipe Data Number

- `Integer Number` 
  
  Adalah bilangan bulat

- `Floating Point Number`
  
  Adalah bilangan pecahan atau desimal

### Integer Number

| Tipe Data | Kapasitas                  |                           | Ukuran  | Nilai Awal |
| --------- | -------------------------- | ------------------------- | ------- | ---------- |
|           | **Min**                    | **Max**                   |         |            |
| byte      | -128                       | 127                       | 1 byte  | 0          |
| short     | -32,768                    | 32,767                    | 2 bytes | 0          |
| int       | -2,147,483,648             | 2,147,483,647             | 4 bytes | 0          |
| long      | -9,233,372,036,854,775,808 | 9,233,372,036,854,775,807 | 8 bytes | 0          |

- Contoh penulisan `Integer Number`:

```java
// TipeDataNumber.java
public class TipeDataNumber {
  public static void main(String[] args){
    byte iniByte = 100; 
    short iniShort = 10_000;
    int iniInt = 1_000_000_000;
    long iniLong = 1_000_000_000_000_000_000L;

    System.out.println("-----------------------------------");
    System.out.println("Ini adalah angka byte: " + iniByte);
    System.out.println("Ini adalah angka short: " + iniShort);
    System.out.println("Ini adalah angka Int: " + iniInt);
    System.out.println("Ini adalah angka long: " + iniLong);
  }
}
// Output: 
/*
-----------------------------------
Ini adalah angka byte: 100      
Ini adalah angka short: 10000   
Ini adalah angka Int: 1000000000
Ini adalah angka long: 1000000000000000000
*/
```

- Untuk `long` dibelakang nilai dapat ditambahkan `l` atau `L`.

- Lalu di Java terbaru untuk format nol agar mudah tebaca dapat menggunakan *underscores* `_`.

### Floating Point Number

| Tipe Data | Kapasitas |          | Ukuran  | Nilai Awal |
| --------- | --------- | -------- | ------- | ---------- |
|           | **Min**   | **Max**  |         |            |
| float     | 3.4e-038  | 3.4e+038 | 4 byte  | 0.0        |
| double    | 1.7e-308  | 1.7e+308 | 8 bytes | 0.0        |

- Contoh penulisan `Floating Point Number`:

```java
public class TipeDataNumber {
  public static void main(String[] args){
    float iniFloat = 54.454_5F;
    double iniDouble = 54.454_554_541_005;

    System.out.println("-----------------------------------");
    System.out.println("Ini adalah tipe angka float: " + iniFloat);
    System.out.println("Ini adalah tipe angka double: " + iniDouble);
  }
}
```

### Kode: Literals

- untuk membuat angka dengan pecahan 16 `(Hexa Decimal)` dan `(Binary)`. Dapat melakukan kode seperti di bawah ini:
  
  - Hexa Decimal, dapat diawali dengan `0x` didepannya.

```java
int iniHexaDecimal = 0xffffff;
```

- - Binary, dapat diawali dengan `0b` didepannya.

```java
int iniBinary = 0b01010101;
```

### Kode: Underscores

- Untuk memudahkan dalam format rupiah kita dapat menggunakan `_`, contoh:

```java
long balance = 1_000_000_000_000;
int sum = 60_000_000;
```

### Konversi Tipe Data Number

#### widening casting (otomatis)

- Dalam hal ini widening casting dilakukan secara otomatis contoh urutanya seperti ini: `byte -> short -> int -> long -> float -> double`. Contoh penulisan kode:

```java
byte iniByte = 10;
short iniShort = iniByte;
int iniInt = iniShort;
long iniLong = iniInt;
float iniFloat = iniLong;
double iniDouble = iniFloat;
```

#### Narrowing Casting (manual)

- Dalam hal ini Narrowing Casting adalah memaksa untuk merubah tipe data tersebut contoh urutannya adalah kebalikan dari `widening casting`: `double -> float -> long -> int -> short -> byte`. Contoh penulisan kode:

```java
double iniDouble = 10.2;
float iniFloat = (float) iniDouble;
long iniLong = (long) iniFloat;
int iniInt = (int) iniLong;
short iniShort = (short) iniInt;
byte iniByte = (byte) iniByte;
```

- Perhatikan juga nilai maksimal kapasitas dari masing-masing tipe datanya, apabila lebih dari maksimal kapasitas dari tipe datanya akan terjadi yang namanya `number overflow`. Contoh:

```java
int iniInt = 1000;
byte iniByte = (byte) iniInt;
```

- Kode diatas akan mengakibatkan `number overflow` yaitu `byte` yang hanya menampung nilai min -128 dan max 127 harus menkonversi nilai int yang memiliki nilai `1000`. Ketika sudah mencapai 127 maka akan diulang lagi ke awal yaitu -128 begitu terus sampa mecapai 1000.

## Tipe Data Character

- Tipe Data ini adalah data Character (huruf) di Java direpresentasikan oleh tipe char.

- Untuk membuat data char di Java, kita bisa menggunakan tanda `''` atau `petik satu` diawalan dan diakhiran karakter.

- *Default nilai* tipe data char adalah `0`.

```java
char f = 'F';
char i = 'I';
char k = 'K';
char r = 'R';


// Cetak "FIKRI"
System.out.print(f);
System.out.print(i);
System.out.print(k);
System.out.print(r);
System.out.print(i);
```

## Tipe Data Boolean

- Tipe data boolean adalah tipe data yang memiliki 2 nilai, yaitu `true` dan `false`.

- Tipe data boolean di Java direpresentasikan dengan kata kunci `boolean`.

- Nilai `true` direpresentasikan dengan kata kunci `true`.

- Nilai `false` direpresentasikan dengan kata kunci `false`.

- *Default value* untuk `boolean` adalah `false`.

```java
// SCOPE Method main()
boolean benar = true;
boolean salah = false;


System.out.println(benar); //true
System.out.println(salah); //false 
```

## Tipe Data String

- Tipe data `String` adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.

- Di Java, tipe data String direpresentasikan dengan kata kunci `String`.

- Untuk membuat String di Java, kita menggunakan karakter `" "` atau `petik dua`sebelum dan setelah teksnya.

- *Default value* untuk `String` adalah `null`.

```java
String firstName = "Ficri";
String lastName = "Hanip";

String fullName = firstName + " " + lastName;

System.out.println(firstName);
System.out.println(lastName);
System.out.println(fullName);
```
