package _01_generic_class;

public class App {
  public static void main(String[] args) {
    /*
     * Contoh:
     * Bukan generic
     * 1. Akan ada kesulitan ketika getData, harus conversi dari Object ke String
     * terlebih dahulu.
     */
    BukanGeneric bukanGeneric = new BukanGeneric();
    bukanGeneric.setData("String");
    String valueDataBukanGeneric = (String) bukanGeneric.getData();
    System.out.println(valueDataBukanGeneric);
    /*
     * Output:
     * String
     */
    /*
     * Contoh:
     * Generic
     * 1. Harus meng-assign tipe data didalamnya, maka akan menjadi tipe data
     * tersebut
     */
    Generic<String> generic = new Generic<String>();
    generic.setData("Data ini tipe object String");
    String valueDataGeneric = generic.getData();
    System.out.println(valueDataGeneric);
    /*
     * Output:
     * Data ini tipe object String
     */

    MyData<String> myDataString = new MyData<>();
    MyData<Integer> myDataInteger = new MyData<>();
    MyData<Boolean> myDataBoolean = new MyData<>();

    myDataString.setData("Testing");
    myDataInteger.setData(1451);
    myDataBoolean.setData(false);

    String newMyDataString = myDataString.getData();
    Boolean newMyDataBoolean = myDataBoolean.getData();
    Integer newMyDataInteger = myDataInteger.getData();

    StringBuilder builder = new StringBuilder();
    builder.append("String: " + newMyDataString + "\n");
    builder.append("Boolean: " + newMyDataBoolean + "\n");
    builder.append("Integer: " + newMyDataInteger + "\n");
    /*
     * Output:
     * String: Testing
     * Boolean: false
     * Integer: 1451
     */

    MyMultipleData<String, Boolean> myMultipleDataOne = new MyMultipleData<>();
    MyMultipleData<Integer, Float> myMultipleDataTwo = new MyMultipleData<>();
    myMultipleDataOne.setData("String");
    myMultipleDataOne.setData2(true);
    builder.append("String, Boolean: " + myMultipleDataOne.getData() + "," + myMultipleDataOne.getData2());
    builder.append("\n");
    myMultipleDataTwo.setData(145);
    myMultipleDataTwo.setData2(145.2f);
    builder.append("Integer, Float: " + myMultipleDataTwo.getData() + "," + myMultipleDataTwo.getData2());
    System.out.println(builder.toString());
    /*
     * Output:
     * String, Boolean: String,true
     * Integer, Float: 145,145.2
     */
  }
}
