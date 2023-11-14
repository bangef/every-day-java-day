# Perogram Hello World

- Untuk membuat program yang menampilkan output `Hello World!` menggunakan bahasa pemrograman Java. Yang dibutuhkan terlebih dahulu adalah membuat file dengan nama `HelloWorld.java`. Dan kode dibawah ini:

```java
// HelloWorld.java
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```

- Nama Class tidak boleh mengandung spasi.

- Nama class menurut kebiasaan programmer java harus diawali dengan huruf besar `HelloWorld`, dan nama File harus mengikuti nama class `HelloWorld.java`.

- Di Java adalah `Case Sensitive`

- `System.out.println()` adalah method di java untuk mencetak suatu nilai.

## Kompilasi File Java

- Apabila sudah selesai membuat kode diatas, perogram tersebut tidak bisa dijalankan langsung. Melainkan harus dicompile terlebih dahulu. Menggunakan perintah berikut:
  
  - Mengcompile terlebih dahulu dengan JDK dengan perintah java compiller nama file java:
    
    - `javac nama-file.java`
  
  - Merunning dengan JRE dengan perintah sebagai berikut:
    
    - `java nama-class`

![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-09-30-09-16-06-image.png)
