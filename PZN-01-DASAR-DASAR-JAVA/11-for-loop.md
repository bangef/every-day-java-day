# For Loop

- For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan.

- Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi.

## Sintaks Perualangan For

```java
for(init statement; condition; post statement){
    // block perulangan
}
```

- `init statement` akan dieksekusi hanya sekali di awal sebelum perulangan.

- `condition` akan dilakukan pengecekan dalam setiap perulangan, jika `true` perulangan akan dilakukan, jika `false` perulangan akan berhenti.

- `post statement` akan dieksekusi setiap kali diakhir perulangan.

- `Init statement`,  `condition` dan `post statement` tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi selalu bernilai `true`.

## Invinite Loop

- Jika tidak mengisikan `init statement`, `condition` dan `post statement` maka loop akan selalu bernilai `true` dan akan terjadi `invinite loop`.

```java
for(;;){
    System.out.println("Invinite Loop Warning!");
}
```
