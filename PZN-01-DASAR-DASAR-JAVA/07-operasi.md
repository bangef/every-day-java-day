# Operasi

## Operasi Aritmatika

- Di dalam java sama saja dengan bahasa pemrograman lain terdapat 5 operator artimatika:
  
  - (`+`) Tambah
  
  - (`-`) Kurang
  
  - (`*`) Kali
  
  - (`/`) Bagi
  
  - (`%`) Sisa bagi

```java
public class OperandAritmatika {
    public static void main(String[] args){
        final int a = 100;
        final int b = 140;
        System.out.println(pertambahan(a,b));
        System.out.println(pengurangan(a,b));
        System.out.println(perkalian(a,b));
        System.out.println(pembagian(a,b));
    }

    public static int pertambahan(int a, int b){
        return a + b;
    }

    public static int perngurangan(int a, int b){
        return a - b;
    }

    public static int perkalian(int a, int b){
        return a * b;
    }

    public static double pembagian(int a, int b){
        return a / b;
    }

    public static int pembagian(int a, int b){
        return a % b;
    }
}
```

## Augmented Assignment

- adalah operasi ke dirinya sendiri. Sama saja dengan Operasi Aritmatika, Operasi ini memiliki 5 jenis:
  
  - `a += 10`
  
  - `a -= 10`
  
  - `a *= 10`
  
  - `a /= 10`
  
  - `a %= 10`

```java
public class AugmentedAssignment {
    public static void main(String[] args){
        int a = 50;

        a += 10;
        System.out.println(a);
        a -= 10;
        System.out.println(a);
        a *= 10;
        System.out.println(a);
        a /= 10;
        System.out.println(a);
        a %= 10;
        System.out.println(a);

    }
}
```

## Unary Operator

- Adalah operasi dengan hanya satu operand, yaitu satu input. Diantaranya:
  
  - `++` - `a = a + 1`
  
  - `--` - `a = a - 1`
  
  - `-` - `negative`
  
  - `!` - `Boolean kebalik`, jika nilai awal `true` apabila ada `!` didepan variable maka akan berubah menjadi `false`

```java
public class UnaryOperand{
    public static void main(String[] args){
      int a = 7;
      boolean checkBoolean = true;

      // ditambahkan langsung.
      System.out.println(++a);
      // ditambahkan setalah baris berikutnya.
      System.out.println(a++);
       // dikurangkan langsung.                        
      System.out.println(--a);
       // dikurangkan setalah baris berikutnya.
      System.out.println(a--);
      // membuat nilai positif menjadi negatif
      System.out.println(-a);
      // membuat nilai positif menjadi positif (default value)
      System.out.println(a);
      // membalikan keadaan value boolean
      System.out.println(!checkBoolean);
  }
}
```

## Operasi Perbandingan

- Operasi perbandingan adalah operasi untuk membandingkan dua buah data.

- Operasi perbandingan adalah operasi yang menghasilkan nilai boolean (`benar` atau `salah`).

- Jika hasil operasinya adalah benar, maka nilanya adalah `true`.

- Jika hasil operasinya adalah salah, maka nilainya adalah `false`.

- Operasi Perbandingan ada beberapa jenis, diantaranya:
  
  - `>` -  Lebih dari
  
  - `<` - Kurang dari
  
  - `=` - Sama dengan
  
  - `!=` - Tidak sama dengan
  
  - `<=` - Kurang dari atau sama dengan
  
  - `>=` - Lebih dari atau sama dengan

```java
public class ComparisonOperand(){
    public static void main(String[] args){
        final int a = 300;
        final int b = 200;
        System.out.println(simulationComparisonOperan(">", a, b));
        System.out.println(simulationComparisonOperan("<", a, b));
        System.out.println(simulationComparisonOperan(">=", a, b));
        System.out.println(simulationComparisonOperan(">=", a, b));
        System.out.println(simulationComparisonOperan("==", a, b));
        System.out.println(simulationComparisonOperan("!=", a, b));
    }

    public static String simulationComparisonOperan(String typeOperand, int firstValue, int secondValue){
        switch(typeOperand){
            case ">":
            case "<":
                boolean isBigger = firstValue > secondValue;
                if(isBigger) return "First value bigger than Second value";
                return "First value lowwer than Second value";
            case ">=":
            case "<=":
                boolean isBiggerOrEqual = firstValue >= secondValue;
                if(isBiggerOrEqual) return "First value bigger or equal than Second value";
                return "First value lowwer or equal than Second value";
            case "==":
            case "!=":
                boolean isEqual = firstValue == secondValue;
                if(isEqual) return "First value equal than Second value";
                return "First value not equal than Second value";
            default:
                return "tidak ada tipe operasi!";
        }
    }
}
```

## Operasi Boolean

- adalah operasi yang dimana mengembalikan nilai `boolean` bisa `true` bisa `false`.

- Operasi boolean ada 3 jenis, diantaranya:
  
  - `&&` - Dan
  
  - `||` - Atau
  
  - `!` - Kebalikan

- Operasi `dan` atau `&&`:

| Nilai 1 | Operasi | Nilai 2 | Hasil |
| ------- | ------- | ------- | ----- |
| true    | &&      | true    | true  |
| true    | &&      | false   | false |
| false   | &&      | true    | false |
| false   | &&      | false   | false |

- Nilai `dan` harus memiliki `nilai true untuk kedua` nilai yang sedang dioperasikan.

- Operasi `atau` atau `||`:

| Nilai 2 | Operasi | Nilai 2 | Hasil |
| ------- | ------- | ------- | ----- |
| true    |         | \|      | true  |
| true    |         | \|      | false |
| false   |         | \|      | true  |
| false   |         | \|      | false |

- Nilai `atau` harus memiliki setidaknya 1 nilai true dari nilai yang sedang dioperasikan.

- Operasi `!`:

| Operator | Nilai | Hasil |
| -------- | ----- | ----- |
| !        | true  | false |
| !        | false | true  |

```java
public class _007BooleanOperand extends Utils{
  public static void main(String[] args) {
    getSomeBorder("Operasi Dan");
    boolean dan1 = true && true;
    boolean dan2 = true && false;
    boolean dan3 = false && true;
    boolean dan4 = false && false;
    System.out.println(dan1);
    System.out.println(dan2);
    System.out.println(dan3);
    System.out.println(dan4);

    getSomeBorder("Operasi Atau");
    boolean atau1 = true || true;
    boolean atau2 = true || false;
    boolean atau3 = false || true;
    boolean atau4 = false || false;
    System.out.println(atau1);
    System.out.println(atau2);
    System.out.println(atau3);
    System.out.println(atau4);

    getSomeBorder("Operasi !");
    boolean not1 = !true;
    boolean not2 = !false;
    System.out.println(not1);
    System.out.println(not2);

    getSomeBorder("Program Sederhana Penilaian");
    Course course = new Course();
    course.setNilaiPelajaran(70,78,79,80,90,50);
    course.setNilaiAbsensi('h', 'i', 'h', 'h', 'h','h');
    String reportNilai = course.cetakNilai();
    System.out.println(reportNilai);
  }

}

// Buatlah program input nilai dengan input absen. Apabila nilai dari rata-rata mencapai nilai 75 keatas maka lulus.
// Namun apabila nilai 75 kebawah maka diaggap gagal.
class Course{
  private char[] nilaiAbsensi;
  private int[] nilaiPelajaran;

  public void setNilaiAbsensi(char... nilaiAbsensi){
    this.nilaiAbsensi = nilaiAbsensi;
  }
  
  public void setNilaiPelajaran(int... nilaiPelajaran){
    this.nilaiPelajaran = nilaiPelajaran;
  }

  public char[] getNilaiAbsensi(){
    return this.nilaiAbsensi;
  }

  public int[] getNilaiPelajaran(){
    return this.nilaiPelajaran;
  }

  private double rataRataNilaiPelajaran(){
    double results = 0;
    for (int i : this.nilaiPelajaran) {
      results += i;
    }
    return results / this.nilaiPelajaran.length;
  };

  private double rataRataNilaiAbsensi(){
    double results = 0;
    for (char i : this.nilaiAbsensi) {
      if(i == 'h') results += 1;
      if(i == 'i') results += 0.5;
    }
    return results / this.nilaiAbsensi.length;
  };

  public String cetakNilai(){
    double nilaiRataRataPelajaran = this.rataRataNilaiPelajaran();
    double nilaiRataRataAbsensi = this.rataRataNilaiAbsensi();
    boolean isBiggerOrEqualsThan60 = nilaiRataRataPelajaran >= 60;
    boolean isBiggerOrEqualsThan0_8 = nilaiRataRataAbsensi >= 0.8;
    if(isBiggerOrEqualsThan60 && isBiggerOrEqualsThan0_8 ) return "Selamat anda lulus";
    return "Maaf, anda belum lulus";
  }
}

```
