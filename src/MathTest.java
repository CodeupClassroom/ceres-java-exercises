public class MathTest {
    public static void main(String[] args) {
        System.out.println(Arithmetic.pi);
        System.out.println(Arithmetic.add(1, 2));

        System.out.println(Person.heart);
        // The default constructor
        Person fer = new Person("Fer", "Mendoza");
        // Assign values
        System.out.println(fer.sayHello());
        System.out.println("worldPopulation = " + Person.worldPopulation);

        Person daniel = new Person("Daniel", "F");
        System.out.println(daniel.sayHello());
        System.out.println("worldPopulation = " + Person.worldPopulation);

        Person michael = new Person("Michael", "McDonell");
        System.out.println(michael.sayHello());
        System.out.println("worldPopulation = " + Person.worldPopulation);
    }
}
