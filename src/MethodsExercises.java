import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println("Please enter a number between 1 and 10");
//        int userNum = getInteger(1, 10);
        //
    }

    // with recursion
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) {
//            int userNum = sc.nextInt();
//            if (userNum >= min && userNum <= max) {
//                return userNum;
//            } else {
//                System.out.println("Invalid range");
//                return getInteger(min, max);
//            }
//        } else {
//            System.out.println("Invalid Input!");
//            return getInteger(min, max);
//        }
//    }
//

    // ============================== GET INT EXERCISE ===============================


    // ================== using a loop
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Please enter a number between " + min + " and " + max);
//            // the hasNextInt method will wait for input and check (return true) if valid
//            if (sc.hasNextInt()) {
//                int userNum = sc.nextInt(); // nextInt() can be used here instead of Integer.parseInt(sc.nextLine())
//                if (userNum >= min && userNum <= max) {
//                    return userNum;
//                }
//                System.out.println("Number out of range!");
//            } else {
//                System.out.println("Invalid input!");
//            }
//            sc.nextLine(); // needed to clear scanner of current input
//        }
//    }


// ================== using recursion
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number between " + min + " and " + max);
//        if (sc.hasNextInt()) {
//            int userNum = sc.nextInt();
//            if (userNum >= min && userNum <= max) {
//                return userNum;
//            } else {
//                System.out.println("Number out of range!");
//                return getInteger(min, max);
//            }
//        } else {
//            System.out.println("Invalid input!");
//            getInteger(min, max);
//        }
//        return 0;
//    }


// ================== using two methods with loops

    // get valid int
//    public static int getValidInt() {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            if (sc.hasNextInt()) {
//                return sc.nextInt();
//            } else {
//                System.out.println("Invalid input!");
//                sc.nextLine();
//            }
//        }
//    }


    // get valid int in range
/*    public static int getInteger(int min, int max) {
        while (true) {
            System.out.println("Please enter a number between " + min + " and " + max);
            int userNum = getValidInt();
            if (userNum >= min && userNum <= max) {
                return userNum;
            } else {
                System.out.println("Number out of range!");
            }
        }
    }*/


// ================== using two methods with recursion

//    // get valid int
//    public static int getValidInt() {
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) {
//            return sc.nextInt();
//        } else {
//            System.out.println("Invalid input!");
//            return getValidInt();
//        }
//    }
//
//    // get valid int in range
//    public static int getInteger(int min, int max) {
//        System.out.println("Please enter a number between " + min + " and " + max);
//        int userNum = getValidInt();
//        if (userNum >= min && userNum <= max) {
//            return userNum;
//        } else {
//            System.out.println("Number out of range!");
//            return getInteger(min, max);
//        }
//    }


// ================== using method overloading with recursion

    // get valid int
    public static int getInteger() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Invalid input!");
            return getInteger();
        }
    }

//    // get valid int in range
    public static int getInteger(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        int userNum = getInteger();
        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("Number out of range!");
            return getInteger(min, max);
        }
    }



    // ============================ ARITHMETIC EXERCISE ==============================

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }


    // Exercise 3
    public static long calculateFactorial(int arg) {
        long output = 1;
        for (int i = 1; i <= arg; i += 1) {
            output *= i;
        }
        return output;
    }

    public static void processFactorial() {
        boolean willContinue;
        do {
            System.out.println("Enter a number between 1 and 10");
            Scanner sc = new Scanner(System.in);
            int userInt = getInteger(1, 10);
            System.out.println("The factorial is: " + calculateFactorial(userInt));
            System.out.println("Do you wish to enter another number to calculate?");
            willContinue = sc.next().equals("y");
        } while(willContinue);
        System.out.println("Have a nice day!");
    }

    // Exercise 4
    public static int rollDie(int sides) {
        Random r = new Random();
        return r.nextInt(sides) + 1;
    }

    public static String rollDice(int sides) {
        return String.format("%d and %d", rollDie(sides), rollDie(sides));
    }

    public static void processDice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a number of sides for the dice");
        int sides = getInteger(1, 50);
        do {
            System.out.println("Rolling dice...");
            System.out.println("You rolled " + rollDice(sides));
            System.out.println("Do you wish to roll again [y/n]?");
        } while(sc.next().equals("y"));
    }


}
