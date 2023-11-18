public class SimpleActionApp {
  public static void main(String[] args) {
    /*
     * 1. Implementasi 1
     */
    // SimpleAction simpleAction = new SimpleAction() {
    // @Override
    // public String action() {
    // return "Eko";
    // }
    // };

    // SimpleAction simpleAction2 = () -> {
    // return "Eko";
    // };
    // System.out.println(simpleAction.action());
    // System.out.println(simpleAction2.action());

    /*
     * 2. Implementasi 2
     */
    SimpleAction simpleAction1 = new SimpleAction() {
      @Override
      public String action(String name) {
        return name;
      }
    };

    /*
     * Ada beberapa macam cara penulisan lambda, diantaranya:
     * simpleAction2 memberikan data-type pada paramsnya, dan dibungkus dengan
     * kurung buka dan tutup.
     * simpleAction3 hanya paramsnya saja, tidak dengan data-typenya, dan dibungkus
     * kurung buka dan tutup.
     * simpleAction4 hanya paramsnya saja, tidak perlu untuk membungkus dengan
     * kurung buka dan tutup apabila parameter hanya satu saja.
     */
    SimpleAction simpleAction2 = (String name) -> name;
    SimpleAction simpleAction3 = (name) -> name;
    SimpleAction simpleAction4 = name -> name;

    System.out.println(simpleAction1.action("Eko"));
    System.out.println(simpleAction2.action("Eko"));
    System.out.println(simpleAction3.action("Eko"));
    System.out.println(simpleAction4.action("Eko"));

  }
}