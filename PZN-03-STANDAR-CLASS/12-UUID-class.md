# UUID Class

## Pengertian UUID Class

- Saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique, misal untuk kebutuhan data primary key misalnya.

- Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier.

- UUD adalah format standard untuk membuat unique value yang telah terjamin.

## Implementasi `UUID Class`

`App.java`

```java
package _12_UUID;

import java.util.UUID;

public class App {
  public static void main(String[] args) {
    /*
     * UUID Generate unique id, sample: d5a53ff4-81ed-43b3-b951-c9b4c4855f02
     */
    UUID randomUUIDOne = UUID.randomUUID();
    UUID randomUUIDTwo = UUID.randomUUID();
    UUID randomUUIDThree = UUID.randomUUID();

    /*
     * Convert from type UUID to String
     */
    String uuidOneToString = randomUUIDOne.toString();

    /*
     * CompareTo ini membandingkan apakah lebih kecil dari (-1),
     * sama dengan (0),
     * atau lebih dari (1)
     */
    int compareRandomUUID = randomUUIDOne.compareTo(randomUUIDTwo);

    StringBuilder builder = new StringBuilder();
    builder.append("=== UUID Class ===\n");
    builder.append("Random UUID 1: " + randomUUIDOne + "\n");
    builder.append("Random UUID 2: " + randomUUIDTwo + "\n");
    builder.append("Random UUID 3: " + randomUUIDThree + "\n");
    builder.append("To String : " + uuidOneToString + " -> class: " + uuidOneToString.getClass().getName());
    builder.append("Compere: randomUUIDOne With randomUUIDTwo -> " + compareRandomUUID);
    System.out.println(builder.toString());
    /*
     * Output:
     * === UUID Class ===
     * Random UUID 1: 34986f8b-d8de-4f32-bea0-bdd4b0ed78fd
     * Random UUID 2: ccd0322f-8165-403d-929f-1de202401612
     * Random UUID 3: 87816ffd-9abe-4826-b7c8-0468c4bbf8ea
     * To String : 34986f8b-d8de-4f32-bea0-bdd4b0ed78fd -> class:
     * java.lang.StringCompere: randomUUIDOne With randomUUIDTwo -> 1
     */
  }
}
```
