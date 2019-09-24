import java.util.Scanner;

public class Person {
    static String heart = "is beating";    public static long worldPopulation = 7_500_000_000L; // class property

    // define fields
    public String firstName;
    // visibility
    public String lastName;

    // define methods
    public String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        System.out.println(Person.heart);
        // The default constructor
        Person fer = new Person();
        Person.worldPopulation += 1;
        // Assign values
        fer.firstName = "Fer";
        fer.lastName = "Mendoza";
        System.out.println(fer.sayHello());


        System.out.println("worldPopulation = " + worldPopulation);



    }

}
