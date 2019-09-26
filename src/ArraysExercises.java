import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));


        Person[] people = {
            new Person("Fred", "Smith"),
            new Person("Sally", "Smith"),
            new Person("John", "Smith")
        };

        people = addPerson(people, new Person("Cathy", "Smith"));

//        System.out.println(Arrays.toString(people));

        for (Person person : people) {
            System.out.println(person.sayHello());
        }


    }

    public static Person[] addPerson(Person[] people, Person p) {

        Person[] output = Arrays.copyOf(people, people.length + 1);

        // OR

//        Person[] output = new Person[people.length + 1];

//        for (int i = 0; i < people.length; i += 1) {
//            output[i] = people[i];
//        }

        output[output.length - 1] = p;

        return output;
    }

}
