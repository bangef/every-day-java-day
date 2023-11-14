# Tipe Data Bukan Primitif

## Deskripsi

- Tipe data primitf adalah tipe data bawaan di dalam bahasa pemrograman. Tipe dara primitf tidak bisa diubah lagi.

- Tipe data number, char, boolean adalah tipe data primit. Tipe data primitif selalu memiliki *default value*.

- Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki *default value* dan bisa bernilai `null`.

- Tipe data bukan primitif bisa memiliki method/function.

- Di Java, semua tipe data primitif memiliki represetasi tipe data bukan primitif nya.

```java
public class TipeDataBukanPrimitif extends Utils {
  public static void main(String[] args) {

    /**
     * 1. String, Boolean, Byte, Short, Int, Long, Float, Double. Adalah jenis tipe data bukan primitif. Ciri-ciri dari tipe data yang bukan primitf adalah memiliki method didalamnya.
     */
    String name = "Ficri Hanip";
    Boolean benar = true;
    Byte iniByte = 120;
    Short iniShort = 10_000;
    Integer iniInt  = 1_000_000;
    Long iniLong = 1_000_000_000L;

    Float iniFloat = 15.151F;
    Double iniDouble = 15.15144;
    getSomeBorder("TIPE DATA BUKAN PRIMITIF");
    System.out.println("1. String: " + name);
    System.out.println("2. Boolean: " + benar);
    System.out.println("3. Byte: " + iniByte);
    System.out.println("4. Short: " + iniShort);
    System.out.println("5. Integer: " + iniInt);
    System.out.println("6. Long: " + iniLong);
    System.out.println("8. Float: "+ iniFloat);
    System.out.println("9. Double: "+ iniDouble);
  }
}
```

## Konversi Tipe Data Bukan Primitif

- Untuk konversi dari `bukan primitif` ke `primitif` dengan `tipe data yang sama` maka dapat langsung dikonvert secara otomatis, dan begitu juga sebaliknya.

```java
public class TipeDataBukanPrimitif extends Utils {
  public static void main(String[] args) {
    /**
     * 2. Konversi dari tipe data bukan primitif ke tipe data primitif
     *  - Untuk merubah tipe data bukan primitf ke bukan primitf adalah dengan mengassign susai dengan tipe data yang sama.
     *  - Apabila tipe datanya berbeda maka dibutuhkan bantuan method
     */
    int iniIntPrimitif = iniInt;
    float iniFloatPrimitf = iniFloat;

  }
}
```

- Namun untuk konversi dari `bukan primitif` ke `primitif` dengan `tipe data yang berbeda` , dan begitu juga sebaliknya.

```java
public class TipeDataBukanPrimitif extends Utils {
  public static void main(String[] args) {
    /**
     * 2. Konversi dari tipe data bukan primitif ke tipe data primitif
     *  - Untuk merubah tipe data bukan primitf ke bukan primitf adalah dengan mengassign susai dengan tipe data yang sama.
     *  - Apabila tipe datanya berbeda maka dibutuhkan bantuan method
     */
    int iniIntPrimitif = iniInt;
    float iniFloatPrimitf = iniFloat;

    int iniIntPrimitifDariByte = iniByte.intValue();
    short iniShortPrimitifDariByte = iniByte.shortValue();
    getSomeBorder("KONVERSI TIPE DATA");
    System.out.println("1. Integer to int: " + iniIntPrimitif);
    System.out.println("2. Float to float: " + iniFloatPrimitf);
    System.out.println("3. Byte to int: " + iniIntPrimitifDariByte);
    System.out.println("4. Byte to short: " + iniShortPrimitifDariByte);
  }
}
```
