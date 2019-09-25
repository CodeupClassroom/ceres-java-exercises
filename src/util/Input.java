package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Type something: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Type y/n or yes/no");
        String answer = this.scanner.nextLine();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.println("Give me a number: ");
        int number = Integer.parseInt(this.scanner.nextLine());
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
        System.out.println("Give me a decimal: ");
        double number = Double.parseDouble(this.scanner.nextLine());
        if(number >= min && number <= max){
            return number;
        } else {
            System.out.println("Out of range");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Give me a decimal: ");
        return Double.parseDouble(this.scanner.nextLine());
    }

}
