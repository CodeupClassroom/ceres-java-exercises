import java.util.Scanner;

public class ConsoleLec {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give me your name:");
        String name = input.nextLine();
        System.out.println("Give me your age:");
        byte age = input.nextByte();

        System.out.println("name = " + name);
        System.out.println("age = " + age);

        String company = "codeup";
        String cohort = "Ceres";

        System.out.println(company);
        System.out.print(cohort);

        System.out.format("\nHello %s, %s. Nice to see you.\n", cohort, company);
        System.out.println("Hello " + cohort + ", " + company + ". Nice to see you.");

        //Parsing values or getting the value of
        String piString = "3.1416";
        double pi = Double.valueOf(piString);
        double piParsed = Double.parseDouble(piString);
        // Now that they are doubles we can do math with them
        pi = pi *2;
        piParsed = piParsed *3;

        System.out.println("piParsed = " + pi);
        System.out.println("piParsed = " + piParsed);

    }

}
