# While Loop

- `while loop` adalah versi perulangan yang lebih sederhana dibanding `for loop`.

- Di `while loop`, hanya terdapat kondisi perulangan, tanpa ada `init statement` dan `post statement`.

```java
int increment= 1; // create new varaible type int with value 1, this like init statement
final int LIMITING_NUMBER = 15; // create varibale constants as limiting number
while (increment <= LIMITING_NUMBER) { // conditions if incremenr lower or equal than LIMITING_NUMBER return true, otherwise return false to stop looping.
    System.out.println("Number - " + increment); // print 
    increment++;// increment as post statement. Increment plus one every loop
}
```
