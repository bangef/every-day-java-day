public class Person { // this is class Person
  String firstName; // deklaration varible with data type String
  String lastName; // deklaration varible with data type String
  final String Country = "Indonesia"; // key word final, like constant variables cannot be reassigned.

  /**
   * Varible shadowing adalah ketika penamaan variable sama maka variable terakhir
   * yang menjadi nilainya.
   * Contoh semisal constructor disini memiliki params firstName dan lastName
   * sedangkan attributnya juga memiliki penamaan variable
   * yang sama maka harus nilainya akan mengambil yang masih dalam satu scope.
   * dalam kasus ini firstname dan last name
   * Hasilnya akan "null"
   * 
   * @param firstName
   * @param lastName
   */
  Person(String firstName, String lastName) { // constructors are magic methods, each constructor will be executed when
                                              // starting an object.
    this.firstName = firstName; // fill in the attribute values ​​of this class, namely firstname and lastname,
                                // from the arguments
    this.lastName = lastName;
  }

  Person(String firstName) { // constructor method overloading dimana method dapat dibuat ulang namun harus
                             // dibedakan parameternya, maka dari itu disini hanya ada satu parameter.
    this(firstName, null); // Memanggil constructor pertama dengan 2 params, yang pertama bernilai dan yang
                           // kedua null
  }

  Person() {
    this(null);// Memanggil constructor kedua dengan 1 params, yang kedua null
  } // Sama juga dengan ini method constructor overloading dimana parameternya
    // kosong!

  void sayHello() {
    this.sayHello("Default Name"); // Kata kunci this digunakan untuk merujuk ke object yang ada saat ini disini.
                                   // Contoh sayHello dengan parameter name berada di dalam class ini maka kita
                                   // dapat menggunakan keyword this agar dapat memudahkan pembacaan code.
  }

  void sayHello(String name) { // method void not return any
    String result = String.format("Hello %s, nama saya %s.", name, this.firstName); // create variable with type string
                                                                                    // and use method buldin
                                                                                    // String.format
    System.out.println(result); // printout result from output variable
  }
}
