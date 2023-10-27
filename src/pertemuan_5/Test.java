package pertemuan_5; // penulisan package harus lowwercase, apabila ada spasi bisa menggunakan underscore

class Bicycle { // penulisan class biasakan menggunakan Huruf awalan Besar dan dilanjutkan
                // dengan camleCase, sample: MonkeyDLuffy, ini dinamakan UpperCamalCase
                // didalam satu file apabila mempunyai lebih dari 1 class, maka hanya 1 class
                // yang dapat memiliki class public dan yang merepresentasikan dengan nama
                // filenya
                // Contoh disini menggunakan nama file Test.java maka yang dapat menggunakan
                // akses modifier public class hanya class Test

  // the Bicycle class has two fields
  public int gear;
  public int speed;

  // the Bicycle class has one constructor
  public Bicycle(int gear, int speed) { // Nama constructor harus sama persis dengan nama class dan case sensitive
    this.gear = gear;
    this.speed = speed;
  }

  // the Bicycle class has three methods
  public void applyBrake(int decrement) {
    speed -= decrement;
  }

  public void speedup(int increment)

  {
    speed += increment;
  }

  // toString() method to print info of Bicycle
  @Override // dan berikan deklarasi kalau ini adalah method yang di override dari class
            // parentnya
  public String toString() { // penilisan method ini salah harusnya toString()
    return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
  }
}

class MountainBike extends Bicycle { // Penamaan class harus UpperCamelCase

  // the MountainBike subclass adds one more field
  public int seatHeight;

  // the MountainBike subclass has one constructor
  public MountainBike(int gear, int speed, int startHeight) {
    // invoking base-class (Bicycle) constructor
    super(gear, speed);
    seatHeight = startHeight;
  }

  // the MountainBike subclass adds one more method
  public void setHeight(int newValue) {
    seatHeight = newValue;
  }

  // overriding tostring() method
  // of Bicycle to print more infor

  @Override // dan berikan deklarasi kalau ini adalah method yang di override dari class
  // parentnya
  public String toString() { // penilisan method ini salah harusnya toString()
    String toStringValue = super.toString(); // Buat lokal variable agar code mudah dibaca
    return (toStringValue + "\nseat height is " + seatHeight);
  }
}

// driver class
public class Test {
  public static void main(String args[]) {
    MountainBike mb = new MountainBike(3, 100, 25);
    System.out.println(mb.toString()); // dapat menggunakan seperti ini
    System.out.println();
    System.out.println(mb); // atau cukup hanya seperti ini
  }
}