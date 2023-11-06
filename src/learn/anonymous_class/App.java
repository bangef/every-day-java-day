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
