import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.\n", pi);

        System.out.println("Give me a number:");
        int aNumber = input.nextInt();
        System.out.println(aNumber);

        System.out.println("Give me a number:");
        String s1 = input.nextLine();

        System.out.println("Give me a number:");
        String s2 = input.nextLine();

        System.out.println("Give me a number:");
        String s3 = input.nextLine();

        System.out.format("s1: %s%ns2: %s%ns3: %s%n", s1, s2, s3);

        System.out.println("Give me a sentence:");
        String sentence = input.next();
        System.out.println("sentence = " + sentence);

        System.out.println("Give me the length:");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("Give me the width:");
        int width = Integer.valueOf(input.nextLine());

        int area = length * width;
        int perimeter = (2*width) + (2*length);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }

}
