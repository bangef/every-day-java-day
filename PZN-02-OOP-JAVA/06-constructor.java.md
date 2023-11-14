# Constructor

## Pengertian Constructor

- Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung `()`.

- Di dalam class java, kita bisa membuat `constructor`, `constructor` adalah method yang akan dipanggil saat pertama kali Object dibuat.

- Mirip seperti di method, kita bisa memberi parameter pada constructor.

- Nama constructor harus sama dengan nama `class`, dan tidak membutuhkan kata kunci `void` atau `return value`.

 `Person.java`

```java
public class Person { // this is class Person
  String firstName; // deklaration varible with data type String
  String lastName; // deklaration varible with data type String
  final String Country = "Indonesia"; // key word final, like constant variables cannot be reassigned.

  Person(String firstName, String lastName){ // constructors are magic methods, each constructor will be executed when starting an object.
    this.firstName = firstName; // fill in the attribute values ​​of this class, namely firstname and lastname, from the arguments
    this.lastName = lastName;
  }

  void sayHello(String name){ // method void not return any 
    String result = String.format("Hello %s, nama saya %s.", name, this.firstName); // create variable with type string and use method buldin String.format
    System.out.println(result); // printout result from output variable
  }
}
```

## Constructor Overloading

- Sama seperti di method, di constructor pun kita bisa melakukan overloading.

- Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda atau jumlah parameter harus berbeda.

`Person.java`

```java
  Person(String firstName, String lastName){ // constructors are magic methods, each constructor will be executed when starting an object.
    this.firstName = firstName; // fill in the attribute values ​​of this class, namely firstname and lastname, from the arguments
    this.lastName = lastName;
  }

  Person(String firstName){ // constructor method overloading dimana method dapat dibuat ulang namun harus dibedakan parameternya, maka dari itu disini hanya ada satu parameter.
    this.firstName = firstName;
  }

  Person(){} // Sama juga dengan ini method constructor overloading dimana parameternya kosong!
```

```java
Person personOne = new Person("Ficri", "Hanip");
Person personTwo = new Person("Ficri");
Person personThree = new Person();
```

## Memanggil constructor lain

- Constructor bisa memanggil constructor lain.

- Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan.

- Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata kunci this.

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
```
