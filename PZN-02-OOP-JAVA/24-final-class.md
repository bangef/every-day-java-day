# Final Class

- Sebelumnya kita pernah menggunakan kata kunci `final` di Java.

- Jika digunakan di `variable`, `maka variable tersebut tidak bisa berubah lagi datanya`.

- `Final` pun bisa `digunakan di class`, dimana jika kita menggunakan kata kunci `final` sebelumnya `class`, maka kita menandakan bahwa `class` tersebut `tidak bisa diwariskan lagi`.

- Secara otomatis semua class childnya akan error.

`SocialMedia.java`

```java
package learn.finalClass;

public class SocialMedia {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
```

`Facebook.java`

```java
package learn.finalClass;

final class Facebook extends SocialMedia {

}
```

`FakeFacebook.java`

```java
package learn.finalClass;

public class FakeFacebook extends Facebook { // error, becouse the final class not inherited

}
```

`App.java`

```java

```
