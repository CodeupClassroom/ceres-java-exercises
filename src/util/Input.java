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
        System.out.println("Give me a number: ");
        return Integer.parseInt(this.scanner.nextLine());
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
        System.out.println(prompt);
        return Double.parseDouble(this.scanner.nextLine());
    }

}
