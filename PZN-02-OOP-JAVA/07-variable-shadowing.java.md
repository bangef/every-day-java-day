# `Variable Shadowing` dan Kata Kunci `this`

## Pengertian `Variable Shadowing`

- Variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama di scope yang menutupi variable dengan nama yang sama di scope diatasnya.

- Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama attribut di class.

- Saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa diakses.

`Person.java`

```java
/**
   * Varible shadowing adalah ketika penamaan variable sama maka variable terakhir yang menjadi nilainya.
   * Contoh semisal constructor disini memiliki params firstName dan lastName sedangkan attributnya juga memiliki penamaan variable 
   * yang sama maka harus nilainya akan mengambil yang masih dalam satu scope. dalam kasus ini firstname dan last name
   * Hasilnya akan "null"
   */
  Person(String firstName, String lastName){ // constructors are magic methods, each constructor will be executed when starting an object.
    firstName = firstName; // fill in the attribute values ​​of this class, namely firstname and lastname, from the arguments
    lastName = lastName;
  }
```

## Pengertian Kata Kunci `this`

- Saat kita membuat kode di dalam block constructor atau method di dalam class, kita bisa menggunakan kata kunci `this` untuk `mengakses object saat ini`.

- Misal kadang kita butuh mengakses sebuah `field` yang namanya sama dengan parameter method, hal ini tidak bisa dilakukan jika langsung menyebut nama field, kita bisa mengakses nama field tersebut dengan kata kunci `this`.

- `this` juga tidak hanya digunakan untuk mengakses field miliki object saat ini, namun juga bisa digunakan untuk mengakses method.

- `this` bisa digunakan untuk mengatasi masalah variable shadowing.

`Person.java`

```java
 Person(String firstName, String lastName){ // constructors are magic methods, each constructor will be executed when starting an object.
    this.firstName = firstName; // fill in the attribute values ​​of this class, namely firstname and lastname, from the arguments
    this.lastName = lastName;
  }

  Person(String firstName){ // constructor method overloading dimana method dapat dibuat ulang namun harus dibedakan parameternya, maka dari itu disini hanya ada satu parameter.
    this(firstName, null); // Memanggil constructor pertama dengan 2 params, yang pertama bernilai dan yang kedua null
  }

  Person(){
    this(null);// Memanggil constructor kedua dengan 1 params, yang kedua null
  } // Sama juga dengan ini method constructor overloading dimana parameternya kosong!

  void sayHello(){
    this.sayHello("Default Name"); // Kata kunci this digunakan untuk merujuk ke object yang ada saat ini disini. Contoh sayHello dengan parameter name berada di dalam class ini maka kita dapat menggunakan keyword this agar dapat memudahkan pembacaan code.
  }
```
