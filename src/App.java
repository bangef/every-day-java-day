public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person(); // Create instance object from class Person.
        Person person2;
        person2 = new Person(); // Different way create instance object from class Person.

        System.out.println(person); // print unique id from memory 
        System.out.println(person2);
    }
}
