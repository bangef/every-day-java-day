# Scope (Ruang Lingkup)

- Di java, variabel hanya diakses di dalam area dimana mereka dibuat.

- Hal ini disebut `scope`.

- Contoh, jika sebuah variable dibuat di `method`, `maka hanya bisa diakses di method tersebut`, atau `jika dibuat didalam block`, `maka hanya bisa diakses didalam block tersebut`.

```java
public class _14Scope{
  public static void main(String[] args) {
    int numbers = 15;
    if(numbers > 10){
      String output = "Iya benar.";
      System.out.println(numbers); // not error, couse call global variable
      {
        String hello = "Hellow".
        System.out.println(numbers); // still not error
        System.out.println(output);
        {}
      }
      System.out.println(hello); // error scope
    }else{
      String output = "Iya salah";
    }
    System.out.println(output); // error scope
  }
}
```
