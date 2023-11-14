# Do While

- `do while loop` adalah perulangan yang mirip dengan `while`.

- Perbedaannya hanya pada pengecekan kondisi.

- Pengecekan kondisi di `while loop` dilakukan diawal sebelum perulangan dilakukan, sedangkan di `do while loop` dilakukan setelah perulangan dilakukan.

- Oleh karena itu dalam `do while loop` minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai `true`.

```java
int increment= 1; // create new varaible type int with value 1, this like init statement
final int LIMITING_NUMBER = 15; // create varibale constants as limiting number
do { // do first
    System.out.println("Number - " + increment); // print
    increment++;// increment as post statement. Increment plus one every loop
} while (increment <= LIMITING_NUMBER); // check condition
```
