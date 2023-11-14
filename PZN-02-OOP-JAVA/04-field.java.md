# Field

## Pengertian `Field`

- `Field`/`attribute`/`properties` adalah data yang bisa kita sisipkan di dalam Object.

- Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa aja yang dimiliki object tersebut di dalam deklarasi class-nya.

- Membuat field sama seperti membuat variable, namun ditempatkan di block class.

`App.java`

```java
public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person(); // Create instance object from class Person.
        Person person2;
        person2 = new Person(); // Different way create instance object from class Person.

        System.out.println(person); // print unique id from memory 
        System.out.println(person2);
    }
}
```

`Person.java`

```java
public class Person { // this is class Person
  String firstName; // deklaration varible with data type String
  String lastName; // deklaration varible with data type String
  final String Country = "Indonesia"; // key word final, like constant variables cannot be reassigned.
}
```

## Manipulasi data `fields`

- Fields yang ada di object, bisa kita manipulasi. Tergantung final atau bukan.

- Jika final, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah field nya.

- Untuk memanipulasi data field, sama seperti cara pada variable.

- Untuk mengakses field, kita butuh kata kunci `.` (titik) setelah nama object dan diikuti nama fieldsnya.

`App.java`

```java
public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person(); // Create instance object from class Person.
        System.out.println(person.firstName); // output ""
        person.firstName = "Bangef"; // reassigned value 
        System.out.println(person.firstName); // output Bangef
    }
}
```
