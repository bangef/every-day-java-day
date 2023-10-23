public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Budi" , "Gany"); // Create instance object from class Person.
        Person person2;
        person2 = new Person("Bano", "Bolu"); // Different way create instance object from class Person.
        System.out.println(person.firstName); // output "null"
        person.firstName = "Bangef"; // reassigned value 
        person.sayHello("Alisa Putri Arlini"); // uise method sayHello with arguments String name in class person 
        System.out.println(person.firstName); // output Bangef
        System.out.println(person); // print unique id from memory 
        System.out.println(person2); // print unique id from memory 
        Person person3 = new Person(); 
        Person person4 = new Person("Ficri");
    }
}
