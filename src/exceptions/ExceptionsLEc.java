package exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionsLEc {

    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }

        if(indentationPreference.equals("-1")){
            throw new Exception("App is being updated at the moment");
        }

        return indentationPreference;
    }

    public static void main(String[] args) {

        try {
            getIndentationPreference();
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
//            e.printStackTrace();
        }

        int[] numbers = {1, 2, 3};
        try{
            System.out.println(numbers[999]);
        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("There was an error");
//            e.printStackTrace();
        }

//        System.out.println("numbers = " + Arrays.toString(numbers));

    }
}
