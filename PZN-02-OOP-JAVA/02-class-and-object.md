# Class and Object

## Bagaimana membuat class di Java

- Untuk membuat class, kita bisa menggunakan `kata kunci` `class`.

- Penamaan class biasa menggunakan format `UpperCamelCase`, maksudnya adalah gunakan huruf besar disetiap kata - katanya.

## Bagaimana membuat object di java

- Object adalah hasil `instansiasi` dari sebuah `class`.

- Untuk membuat object kita bisa menggunakan kata kunci `new` dan diikuti dengan nama `class` dan kurung `()`.

`class Person`

```java
public class Person { // this is class Person
}
```

`class App`

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
