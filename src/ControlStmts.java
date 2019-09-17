import java.util.Scanner;

public class ControlStmts {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(5 == 5);
        System.out.println(5 != 8);

        System.out.println("fer".length() <= "nando".length());

        System.out.println("fer".equalsIgnoreCase("FER"));
        System.out.println("fer".equals("fer"));


//        // login form username, password
//        System.out.println("Username:");
//        String username = input.nextLine();
//
//        System.out.println("Password:");
//        String password = input.nextLine();

//
//        if(username.isEmpty() || password.isEmpty()){
//            System.out.println("one of the fields are empty");
//        }else{
//            // Login
//            System.out.println( username.equalsIgnoreCase("fer") && password.equals("D0gs") );
//        }

        boolean hasGas = true;

        while(hasGas){

            System.out.println("Traffic light");
            String color = input.nextLine();

            switch (color){
                case "red":
                    System.out.println("stop");
                    break;
                case "yellow":
                    System.out.println("slow down");
                    break;
                case "green":
                    System.out.println("go");
                    break;
                default:
                    hasGas = false;
                    System.out.println("blink");
            }

        }

        hasGas = true;
        int km = 0;

        do{
            if(km == 5){
                hasGas = false;
                System.out.println("stopping");
            } else {
                System.out.println("driving");
            }
            km++;
        }while(hasGas);


        for(byte i = 1;i <= 10;i++){
            if(i == 5){
                continue;
            } else if (i == 8){
                break;
            }

            System.out.println("i = " + i);

        }


    }



}
