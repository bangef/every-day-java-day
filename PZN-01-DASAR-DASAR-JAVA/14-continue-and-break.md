# Break & Continue

- Pada `switch statement`, kita sudah mengenal kata kunci `break`, yaitu untuk menghentikan case dalam `switch`.

- Sama dengan pada perulangan, `break` juga digunakan untuk menghentikan seluruh perulangan.

- Namun berbeda dengan `continue`, `continue` digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya.

```java
for (int i = 1; i <= 100; i++) {
    if(i > 20) {
        break; // loop stopped
    }
System.out.println(i);
}
```

```java
int increment= 1; // create new varaible type int with value 1, this like init statement
final int LIMITING_NUMBER = 100; // create varibale constants as limiting number
while(increment <= LIMITING_NUMBER){
    if(increment % 2  == 1){
        increment++;
        continue; // loop jump to next loop
    }
System.out.println("Saya bilangan genap: " + increment);
increment++;
}
```
