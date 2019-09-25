package oop;

public class PersonTest {
    public static void main(String[] args) {
        Person fer = new Person("fer");
        System.out.println("fer.getName() = " + fer.getName());
        fer.setName("Fernando");
        System.out.println("fer.getName() = " + fer.getName());
        System.out.println("fer.getName() = " + fer.getName());


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        System.out.println("person1 = " + person1);
//        System.out.println("person2 = " + person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

        
    }
}
