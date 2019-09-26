import java.util.Scanner;

public class Person {
    static String heart = "is beating";
    public static long worldPopulation = 7_500_000_000L; // class property

    // define fields
    private String firstName;
    // visibility
    private String lastName;

    // define methods
    public String sayHello(){
        return String.format("Hello from %s %s!", firstName, lastName);
    }

    public Person(String fN, String lN){
        handlePerson();
        this.firstName = fN;
        this.lastName = lN;
    }

    private void handlePerson(){
        worldPopulation += 1;
//        System.out.println("A new person instance has been created");
    }

}
