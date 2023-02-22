import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner sc=new Scanner(System.in)) {
            while (true) {
                System.out.println("---UNIT CONVERTER---");
                System.out.println("1.meters to feet");
                System.out.println("2.celsius to fahrenheit");
                System.out.println("3.kilograms to pounds");
                System.out.println("4.liters to US gallons(liquid)");
                System.out.print("Enter a number or q to quit:");
                if(sc.hasNextInt()) {
                    int input=InputControl.intLimitCheck(4,sc);
                    switch (input) {
                        case 1:
                            System.out.print("enter length in meters:");
                            double meters=InputControl.doubleInputCheck(sc);
                            double feet=meters*3.2808;
                            System.out.println("\nfeet: "+feet+"\n");
                            break;
                        case 2:
                            System.out.print("enter temperature in celsius:");
                            double celsius=InputControl.temperatureInputCheck(sc);
                            double fahrenheit=(celsius*1.8)+32;
                            System.out.println("\nfahrenheit: "+fahrenheit+"\n");
                            break;
                        case 3:
                            System.out.print("enter weight in kilograms:");
                            double kilograms=InputControl.doubleInputCheck(sc);
                            double pounds=kilograms*2.2046;
                            System.out.println("\npounds: "+pounds+"\n");
                            break;
                        case 4:
                            System.out.println("enter volume in liters:");
                            double cubicMeters=InputControl.doubleInputCheck(sc);
                            double gallons=cubicMeters*0.264172;
                            System.out.println("\ngallons: "+gallons+"\n");
                            break;
                    }
                }else{
                    if(sc.next().equalsIgnoreCase("q")){
                        break;
                    }else
                        System.out.println("\ninvalid input\n");
                }
            }
        }
    }
}