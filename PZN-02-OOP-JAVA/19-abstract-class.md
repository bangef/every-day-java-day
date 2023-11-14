# Abstract Class

## Pengertian Abstract Class

- Saat kita membuat `class`, kita bisa menjadikan sebuah `class` sebagai `abstract class`.

- `Abstract class` artinya, `class` tersebut tidak bisa dibuat sebagai `object secara langsung`, hanya bisa `diturunkan`.

- Untuk membuat sebuah `class` menjadi `abstract`, kita bisa menggunakan `kata kunci abstract` sebelum `kata kunci class`.

- Dengan demikian `abstract class` bisa digunakan sebagai `kontrak` untuk `class child`.

- `Abstract class` sama saja dengan `class` biasa.

`Location.java`

```java
package learn_abstract_class;

public abstract class Location {
  String name;
}
```

`City.java`

```java
package learn_abstract_class;

public class LocationApp {
  public static void main(String[] args) {

    // Location location = new Location(); // error, karena abstract class hanya
    // bisa diturunkan bukan untuk di inisiate
    // langsung
    Location city = new City(); // Polymorphisme
  }
}

}
```

`LocationApp.java`

```java
package learn_abstract_class;

public class LocationApp {
  public static void main(String[] args) {

    // Location location = new Location(); // error, karena abstract class hanya
    // bisa diturunkan bukan untuk di inisiate
    // langsung

  }
}
```

## Abstract Method

- Saat kita membuat `class yang abstract`, kita bisa membuat `abstract method` juga di dalam `class abstract` tersebut.

- Saat kita membuat sebuah `abstract method`, kita `tidak boleh membuat block method` untuk method tersebut.

- Artinya, `abstract method` wajib di `override` di `class child`.

- `Abstract method` tidak boleh memiliki `access modifier private`.

`Animal.java`

```java
package learn_abstract_class;

public abstract class Animal {
  String name; // attribut name

  public abstract void run(); // abstract method hanya dapat di declare dan tidak dapat diisikan logicnya
}
```

`Cat.java`

```java
package learn_abstract_class;

public class Cat extends Animal {
  @Override
  public void run() {
    System.out.println("I am a cat");
  }
}
```

`AnimalApp.java`

```java
package learn_abstract_class;

public class AnimalApp {
  public static void main(String[] args) {
    Animal animal = new Cat(); // polymorphisme, merubah bentuk class
    animal.run();
  }
}
```

## Mengapa Harus Menggunakan Abstarct Class

- Abstract Class biasnya digunakan sebagai class induk dari class-class yang lain. Class anak akan membuat versi konkrit dari abstract class.

- Lalu alasan kenapa menggunakan Abstract Class, dapat dilihat disini:

`Database.java`

```java
class Database {
  String getTableName(){
    return null;
  }
}
```

`MySQLDatabase.java`

```java
class MySQLDatabase extends Database {
  @override
  String getTableName(){
    return this.sql("SELECT table_name FROM database.tabel")
  }
}
```

`App.java`

```java
public class App{
    public static void main(String[] Args){
        Database db = new Database();
    }
}
```

- Pada `App.java`, Menginstance class Database. Ini dapat berhasil atau valid, tapi sebenarnya objek `db` tidak dapat digunakan. Saat memenggil method `getTableName()` si class `Database` akan bingung. Mengapa ? karena belum jelas, bagaimana metode untuk mengambil nama table di database.

- Dapat di refactor agar dapat menjadi `abstract calss` seperti ini:

`Database.java`

```java
public abstract class Database{
    String databaseName;
    abstract void setDatabaseName();
    abstract String getDatabaseName();
    abstract String getTableName();
}
```

`MySQLDatabase.java`

```java
class MySQLDatabase extends Database {

  @override
  void setDatabaseName(String databaseName){
    this.databaseName = databaseName;
  }

  @override
  String getDatabaseName(){
    return this.databaseName;
  }

  @override
  String getTableName(){
    return this.sql("SELECT table_name FROM database.tabel");
  }


}
```

`App.java`

```java
public class App{
    public static void main(String[] Args){
        Database db = new MySQLDatabase();
    }
}
```

## Perbedaan Antara Abstract Class dan Interface

- Abstract Class dapat membuat properti atau field sedangkan di interface hanya dapat buat konstanta saja.

- Abstract Class dapat implementasikan kode method seperti class biasa, sedangkan di interface harus menggunakan `default`.

- Abstract Class dapat memiliki member `private` dan `protected` sedangkan interface harus public semua.

- Abstract Class diimplementasikan dengan pewarisan (`extends`) sedangkan interface menggunkan `implements`
