# Pengelan Java

## Sejarah Java

- Java adalah bahasa pemrograman yang dibuat oleh `Jemes Gosling` saat bekerja di `Sun Microsystem`.

- Java dirilis ke public tahun 1995.

- Java adalah bahasa pemrograman berorientasi objek `(oop)` dan mendukung pengelolaan memori secara otomatis.

- Saat ini perusahaan `Sun Microsystem` telah dibeli oleh `Oracle`.

- Java terkenal dengan `write once`, `run everyware`. Karena binary perogram Java digenerate secara independen dan bisa dijalankan Java Virtual Mecine (`JVM`) yang terinstall di berbagai sistem operasi.

## Teknologi Java

- Java Standard Edition (`common used`)

- Java Enterprise Edition

- Java Micro Edition

## Vesi Java

- Java *Long Time System* (`LTS`) biasa diupdate di 3 tahun sekali mulai dari Java versi 11.

- Java update *realese* setiap 6 bulan seklali, untuk ditahun 2023, terakhir ada di Java versi 21.

- Untuk Java LTS akan di support terus oleh java oleh sebab itu tidak perlu khawatir apabila java mengelurakan release-an terbaru.

## Kenapa Belajar Java

- Java adalah pemrograman populer.

- Banyak perusahaan yang membutuhkan pemrograman java.

## Dimana Java Banyak Digunakan ?

- Backend,  banyak perusahaan besar saat ini menggunakan Java sebagai aplikasi backend nya seperti Twitter, Netflix, Spotify, Amazon, Alibaba, Blibli dan lain-lain.

- Big Data, teknologi-teknologi big data yang saat ini populer, kebanyakan adalah teknologi Java, Seperti Apache Hadoop, Elasticsearch, Apache Cassandra, Apache Spark, Apache Kafka, dan lain-lain.

- Android, di android kita bisa menggunakan Java dan kotlin untuk membuat aplikasinya.

## JRE dan JDK

- `JRE` akronim dari `Java Runtime Environment`.

- `JDK` akronim dari `Java Development Kit`.

- Didalam `JDK` sudah termasuk `JRE`.

- Jika ingin melakukan `development` maka dibutuhkan `JDK`, nahh ketika aplikasi sudah jadi dan di `compile` maka kita membutuhkan `JRE` untuk `running` aplikasi java.

- `JRE` biasanya berjalan di `server production` dideploy ke `production` baru dijalankan menggunakan `JRE`. 

## Java Virtual Mecine (JVM)

- Java sendiri hanyalah bahasa pemrograman, otak dibalik teknologi Java sebenarnya sebuah teknologi yang disebut Java Virtual Machine.

- Java Virtual Machine merupakan program yang digunakan untuk mengeksekusi binary file Java mengadopsi teknologi JVM, seperti Kotlin, Scala, Groovy dan lain-lain.

- Dengan begitu, banyak bahasa pemrograman yang lebih canggih dari Java, namun mereka tetap jalan di JV, yang sudah terbukti stabil dan bagus.

## Proses Development Program Java

![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-09-30-08-09-52-image.png)

- JDK -> compile -> file.java -> file.class -> JRE -> running file.class -> compreess -> file.jar.

- `JDK` akan mencompile kode Java (file.java), dan akan menjadi `binary` Java Binary (file.class).

- `JRE` hanya dapat membaca Java Binary (file.class), dan dapat meng-execute Java Binary (file.class) tersebut.

- Java juga dapat mengarcive atau menyatukan banyak file dengan satu format yaitu `Java Arcive (file.jar)`, File ini juga dapat di running langsung di `JRE`.

## Penginstallan JDK

- Untuk penginstallan JDK ada bisa banyak cara, bisa di `OpenJDK` ini adalah JDK yang Open Source tidak perlu memikirkan bagaimana lisensinya.

- Selain `OpenJDK` ada juga beberapa yaitu : 
  
  - `OracleJDK` dari Oracle
  
  - `zulu` dari Azul 
  
  - `Amazon Correto` dari Amazon

- Untuk link tersedia dapat ke link dibawah ini :
  
  - OpenJDK : [https://jdk.java.net](https://jdk.java.net)
  
  - OracleJDK: [Java Downloads | Oracle Indonesia](https://www.oracle.com/id/java/technologies/downloads/)
  
  - Amazon Correto: https://aws.amazon.com/id/correto/
  
  - Zulu : https://azul.com/donwloads/zulu-community/

## Setting Path

### Windows

- Apabila sudah download dapat membuat folder `Java` di direktori `C:\Program Files` .
  
  ![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-09-30-08-30-41-image.png)

- Lalu ekstract file zip dan pindahkan ke folder `JAVA` yang ada di direktori `C:\Progtam Files`.
  
  ![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-09-30-08-32-04-image.png)

- Setalah itu `setting environment variable`, di `setting -> find setting -> "edit environment variables for your account"`.
  
  ![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-09-30-08-38-17-image.png)

- Lalu, ke arah `System variables` . Dan buat variable baru dengan nama variable `JAVA_HOME` dengan klik tombol `new` dan arahkan `variable value` ke path direktori `C:\Program Files\Java\jdk-19`, Lalu klik tombol `OK`.
  
  ![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-09-30-08-42-01-image.png)

- Setelah itu, klik `path`.
  
  ![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-09-30-08-42-45-image.png)

- Dan klik tombol `New` , dan tambahkan variable yang sudah kita buat sebelumnya dan tambahkan `\bin` agar terarahkan ke folder bin yang ada di `C:\Program Files\Java\jdk-19`.
  
  ![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-09-30-08-45-16-image.png)

- Selanjutnya verifikasi penginstallan apakah sudah terinstall atau belum. Dengan membuka terminal `CMD` dan mengeksekusi perintah atau command :
  
  - `java --version`
  
  - `javac --version`
  
  ![](C:\Users\ficrihnp\AppData\Roaming\marktext\images\2023-09-30-08-47-04-image.png)

### Linux

menyusul

### Mac

menyusul
