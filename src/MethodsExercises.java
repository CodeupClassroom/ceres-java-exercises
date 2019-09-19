import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println("Please enter a number between 1 and 10");
//        int userNum = getInt(1, 10);
        //
    }

    // with recursion
//    public static int getInt(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) {
//            int userNum = sc.nextInt();
//            if (userNum >= min && userNum <= max) {
//                return userNum;
//            } else {
//                System.out.println("Invalid range");
//                return getInt(min, max);
//            }
//        } else {
//            System.out.println("Invalid Input!");
//            return getInt(min, max);
//        }
//    }
//

    // ============================== GET INT EXERCISE ===============================


    // ================== using a loop
//    public static int getInt(int min, int max) {
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
//    public static int getInt(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number between " + min + " and " + max);
//        if (sc.hasNextInt()) {
//            int userNum = sc.nextInt();
//            if (userNum >= min && userNum <= max) {
//                return userNum;
//            } else {
//                System.out.println("Number out of range!");
//                return getInt(min, max);
//            }
//        } else {
//            System.out.println("Invalid input!");
//            getInt(min, max);
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
/*    public static int getInt(int min, int max) {
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
//    public static int getInt(int min, int max) {
//        System.out.println("Please enter a number between " + min + " and " + max);
//        int userNum = getValidInt();
//        if (userNum >= min && userNum <= max) {
//            return userNum;
//        } else {
//            System.out.println("Number out of range!");
//            return getInt(min, max);
//        }
//    }


// ================== using method overloading with recursion

//    // get valid int
//    public static int getInt() {
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) {
//            return sc.nextInt();
//        } else {
//            System.out.println("Invalid input!");
//            return getInt();
//        }
//    }
//
////    // get valid int in range
//    public static int getInt(int min, int max) {
//        System.out.println("Please enter a number between " + min + " and " + max);
//        int userNum = getInt();
//        if (userNum >= min && userNum <= max) {
//            return userNum;
//        } else {
//            System.out.println("Number out of range!");
//            return getInt(min, max);
//        }
//    }



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





}
