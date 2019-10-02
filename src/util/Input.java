package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    private String getString(){
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        if(prompt.isEmpty()){
            System.out.println("Type something: ");
        } else {
            System.out.println(prompt);
        }
        return getString();
    }



    public boolean yesNo(){
        System.out.println("Type y/n or yes/no");
        String answer = this.scanner.nextLine();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        int number = getInt();
        if(number >= min && number <= max){
            return number;
        } else {
            System.out.println("Out of range");
            return getInt(min, max);
        }
    }

    public int getInt(){
        try{
            return Integer.valueOf(getString("Give me a number: "));
        }catch(NumberFormatException e){
            System.out.println("That is not a number");
            // sends an email to the admin with the problem and it's details
            //e.printStackTrace();
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        double number = getDouble("Give me a decimal");
        if(number >= min && number <= max){
            return number;
        } else {
            System.out.println("Out of range");
            return getDouble(min, max);
        }
    }

    public double getDouble(String prompt){
        try {
            return Double.parseDouble(getString(prompt));
        }catch(NumberFormatException e){
            System.out.println("That is not a decimal");
            return getDouble(prompt);
        }
    }

}
