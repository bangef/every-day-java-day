# Anonymous Class

- Anonymous class atau class tanpa nama.

- Adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi object-nya secara langsung.

- Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana kita membiuat anonymous class tersebut.

- `Anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau abstract class sederhana, tanpa harus membuat implementasi class nya`.

- Kekurangan dari `anonymouse class` adalah tidak dapat di `reusable`

`HelloWorld.java`

```java
package learn.anonymous_class;

public interface HelloWorld {
  void sayHello();

  void sayHello(String name);
}
```

`App.java`

```java
package learn.anonymous_class;

public class App {
  public static void main(String[] args) {

    HelloWorld english = new HelloWorld() {
      public void sayHello() {
        System.out.println("Hello");
      }

      public void sayHello(String name) {
        System.out.printf("Hello, my name is %s%n", name);
      }
    };

    HelloWorld bahasa = new HelloWorld() {
      public void sayHello() {
        System.out.println("Halo");
      }

      public void sayHello(String name) {
        System.out.printf("Halo, nama saya adalah %s%n", name);
      }
    };

    english.sayHello();
    english.sayHello("Andi");
    bahasa.sayHello();
    bahasa.sayHello("Budi");
  }
}
```


