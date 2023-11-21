# Pengenalan Software Testing

- Software testing adalah salah sati disiplin ilmu dalam software engineering.

- Tujuan utama dari software testing adalah memastikan kualitas kode dan aplikasi kita baik

- Ilmu untuk software testing sendri sangatlah luas, pada materi ini kita hanya akan fokus ke unit testing.

## Test Pyramid

![](assets\01-test-pyramid.png)

- Makin keatas makin lambat dalam hal testing dan makin memakan biaya.

- Bagian Unit test adalah bagian yang harus dibuat sebanyak banyaknya karena faktor murah serta cepat dalam hal testing dan simple.

- Bagian service test adalah bagian test di level service dimana pengetesannya ditengah tidak terlalu lambat serta juga tidak terlalu cepat. Serta tidak terlalu murah serta tidak terlalu mahal. 

- Bagian terakhir yaitu bagian end-to-end test paling lambat dan paling mahal.

## Contoh High Level Architecture Aplikasi

![](F:\JAVA\01-MATERI\PZN-08-UNIT-TEST\assets\02-sample-architecture.png)

## UI / End to End Test `(Contoh test ketika aplikasi sudah di deploy dan pengetesan langsung dengan user)`

![](assets\03-end-to-end-test.png)

## Service Test `(Contoh test menggunakan Potman, Insomnia)`

![](assets\04-service-test.png)

## Unit Test

![](assets\05-unit-test.png)

## Unit Test

- Unit test akan fokus menguji bagian kode program terkecil, biasanya menguji sebuah method

- Unit test biasanya dibuat kecil dan cepat, oleh karena itu biasanya kadang kode unit test lebih banyak dari kode program aslinya, karena semua skenario pengujian akan dicoba di unit test.

- Unit test bisa digunakan sebagai cara untuk meningkatkan kualitas kode program kita.

- 
