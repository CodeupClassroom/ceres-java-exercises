import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

        int x = 0;
//        do{
//            System.out.println(x);
//            x += 2;
//        }while(x <= 100);
//
//        for(x = 0; x <= 100; x += 2){
//            System.out.println(x);
//        }

        x = 100;
//        do{
//            System.out.println(x);
//            x -= 5;
//        }while(x >= -10);

//        for(x = 100;x >= -10;x -= 5){
//            System.out.println(x);
//        }

//        long y = 2;
//        do{
//            System.out.println(y);
//            y = y * y;
//        }while(y <= 1000000);

//        for(long y = 2; y <= 1000000; y = y * y){
//            System.out.println(y);
//        }
//
//        for(x = 1; x <= 100; x++){
//            if((x % 3 == 0) && (x % 5 == 0)){
//                System.out.println(x+"FizzBuzz");
//            } else if(x % 3 == 0){
//                System.out.println(x+"Fizz");
//            } else if(x % 5 == 0){
//                System.out.println(x+"Buzz");
//            } else {
//                System.out.println(x);
//            }
//        }

        String yesNo = "Y";

        while(yesNo.equalsIgnoreCase("y")){
            System.out.println("What number would you like to go up to?");
            int answer = Integer.parseInt(input.nextLine());
            System.out.println("Here is your table!");

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for(int counter = 1; counter <= answer; counter++){
                System.out.println(String.format("%-6d | %-7d | %-6d", counter, (int) Math.pow(counter, 2), (int) Math.pow(counter, 3)));
            }

            System.out.println("Would you like to test another number Y/N");
            yesNo = input.nextLine();
        }

        System.out.println("Ok, have a good day");

    }
}
