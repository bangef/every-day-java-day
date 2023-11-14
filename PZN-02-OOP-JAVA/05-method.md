# Method

## Pengertian Method

- Selain menambahkan `field`, kita juga bisa menambahkan `method` ke `object`.

- Cara dengan mendeklarsikan `method` tersebut di dalam block class.

- Sama seperti method biasanya, kita juga bisa menambahkan `return value`, `parameter` dan `method overloading` di `method` yang ada di dalam block class. 

- Untuk mengakses `method` tersebut, kita bisa menggunakan tanda titik (`.`) dan diikuti dengan nama methodnya. Sama seperti mengakses field.

`App.java`

```java
public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person(); // Create instance object from class Person.
        Person person2;
        person2 = new Person(); // Different way create instance object from class Person.
        System.out.println(person.firstName); // output "null"
        person.firstName = "Bangef"; // reassigned value 
        person.sayHello("Alisa Putri Arlini"); // uise method sayHello with arguments String name in class person 
        System.out.println(person.firstName); // output Bangef
        System.out.println(person); // print unique id from memory 
        System.out.println(person2); // print unique id from memory 
    }
}
```

`Person.java`

```java
public class Person { // this is class Person
  String firstName; // deklaration varible with data type String
  String lastName; // deklaration varible with data type String
  final String Country = "Indonesia"; // key word final, like constant variables cannot be reassigned.

  void sayHello(String name){ // method void not return any 
    String result = String.format("Hello %n, nama saya %n.", name, this.firstName); // create variable with type string and use method buldin String.format
    System.out.println(result); // printout result from output variable
  }
}
```
