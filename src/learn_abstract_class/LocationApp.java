package learn_abstract_class;

public class LocationApp {
  public static void main(String[] args) {

    // Location location = new Location(); // error, karena abstract class hanya
    // bisa diturunkan bukan untuk di inisiate
    // langsung
    Location city = new City(); // Polymorphisme
  }
}
