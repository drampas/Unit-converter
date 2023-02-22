import java.util.Scanner;

public class InputControl {

    //using a limit in case I want to add more options in the menu
    public static int intLimitCheck(int limit,Scanner sc){
        while(true) {
            if(sc.hasNextInt()) {
                int input = sc.nextInt();
                if (input <= limit && input > 0) {
                    return input;
                }else {
                    System.out.print("please enter a number between 1 and " + limit + ":");
                }
            } else {
                System.out.print("please enter a number:");
                sc.next();//clearing the scanner in case the input is a string
            }

        }
    }
    public static double doubleInputCheck(Scanner sc){
        while(true) {
            if(sc.hasNextDouble()) {
                double d=sc.nextDouble();
                if (d > 0) {
                    return d;
                } else {
                    System.out.print("please enter a valid number:");
                }
            }else{
                System.out.print("please enter a number:");
                sc.next();
            }
        }
    }
    //making sure the temperature is not bellow absolute zero
    public static double temperatureInputCheck(Scanner sc){
        while(true) {
            if(sc.hasNextDouble()) {
                double d=sc.nextDouble();
                if (d > -273.15) {
                    return d;
                } else {
                    System.out.print("please enter a valid number:");
                }
            }else{
                System.out.print("please enter a number:");
                sc.next();
            }
        }
    }
}
