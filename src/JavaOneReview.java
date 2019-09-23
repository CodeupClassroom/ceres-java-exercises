public class JavaOneReview {

    public static void main(String[] args) {

    // ============================== Casting (especially numbers)

    /*

        Casting occurs when the type of a value becomes different than its original type.

        Casting will often occur when working with numbers and Java inheritance.
        We will see examples of Inheritance in Java II. Number types can cast to a larger
        number type (e.g. short to a long) or to a smaller type (e.g. long to a short).
        Going from larger number type to a smaller type is called "explicit" casting and
        requires the programmer to write extra syntax to indicate that this potentially risky
        operation is REALLY what we want to happen. Going the opposite direction is called
        "implicit" casting and does not require extra syntax.

        Helpful chart: https://www.w3schools.com/java/java_type_casting.asp

     */

//        int x = 1;
//        long y = x; // implicit casting
//        short z = (short) x; // explicit casting

//        Object ob = "Hello";
//        String st = (String) ob; // additional explicit cast example
//        System.out.println(st.length());

    // ============================== List of helpful built-in methods

    /*
        The String and primitive wrapper class (Integer, Byte, Character, etc.) methods
        The Scanner, Math class methods
     */


    // ============================== String manipulation practice

    /*
        - create your own examples of each of the curriculum Java string methods
        - create variations of the String exercises and bonuses
        - Google for more exercises
     */



    // ============================== Switch statements (how and why and when)

    /*
        Use the Switch case ONLY when checking for multiple possible values for a single given variable.
        In all other cases, use regular if/else if statements.
     */

    // The switch is only good for asking the question: does this value match any of these values/cases?
//    String someVal = "???";
//    switch(someVal) {
//      case possible1:
//          doThis();
//          break;
//      case possible2:
//          doThis();
//          break;
//      case possible3:
//          doThis();
//          break;
//      etc...
//      default:
//          otherwiseDoThis();
//    }


//        int userAge = 10;
//
//        if (userAge < 18) {
//            System.out.println("Hello young person!");
//        } else if (userAge > 18 && userAge < 21) {
//            System.out.println("Hello young adult!");
//        } else {
//            System.out.println("Hello older adult!");
//        }

//        int monthNum = 2;
//        String month;
//
//        switch(monthNum) {
//            case 1:
//               month = "January";
//                return
//            case 2:
//                month = "February";
//
//                ...
//
//        }
//
//


    // By contrast, an if / else if structure can ask multiple questions.


    // ============================== List of resources for Java
    /*
        - Java source code in the java.util and java.lang packages
        - Head First Java
        - The Oracle Java Docs:
            - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/package-summary.html
            - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/package-summary.html
        - StackOverFlow
        - Additional Resources: https://www.baeldung.com/java-blogs
        - Derek Banas on YouTube
     */


    // ============================== Working with imports (standard imports)

    /*
        most often from the classes and methods from the java.util package
        Additional external libraries (we will learn about a tool to easily install these later in the course)...
            Apache Commons https://commons.apache.org/
            Guava https://github.com/google/guava/wiki
    */

    // ============================== Essential Vocabulary

    /*
        - create your own word bank (start from curriculum)
        - expand your word bank with helpful tools and concepts for solving curriculum exercises
    */

    /*
        JRE
        JDK
        JVM
        Java Compiler
        JavaDoc
        Java Bytecode
        Java SE
        Java EE
        Runtime Error/Exception
        Compile Time Error
        Primitive Data Type
        Reference Data Type
        Method Overloading
        Identifier
        Casting (Explicit vs. Implicit)
        Boolean Expression
        Code Block
        Iteration
        Control Structure
        Mutable vs. Immutable
        Concatenation
        Method
        Method Overloading
        Recursion
        Parameter
     */

    // ============================== Recursion (when and why)

    /*

        Use recursion when it makes your code more easily readable than using a loop.
        Typically, you can use looping and recursion interchangeably.

     */

//        fizzBuzzLoop();
//        fizzBuzz(1);
    }

//    public static int fizzBuzz(int i) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (i % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (i % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(i);
//        }
//        if (i == 100) {
//            return 0;
//        } else {
//            return fizzBuzz(i + 1);
//        }
//    }

//    public static void fizzBuzzLoop() {
//        int i = 1;
//        while (true) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//            if (i == 100) {
//                break;
//            }
//            i++;
//        }
//    }




}
