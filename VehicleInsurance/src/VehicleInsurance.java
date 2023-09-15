import java.util.Scanner;

public class VehicleInsurance {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean exit = false;

        while(!exit) {
            System.out.println("\nEnter your vehicle type (car/truck/bus/motorcycle)");
            String type = scan.nextLine();

            int standard = 0;
            int premium = 0;
            int term = 0;

            switch (type) {

                case "car":
                    standard = 100;
                    premium = 250;
                    term = 12;
                    break;

                case "truck":
                    standard = 300;
                    premium = 450;
                    term = 12;
                    break;

                case "bus":
                    standard = 200;
                    premium = 350;
                    term = 12;
                    break;

                case "motorcycle":
                    System.out.println("Enter your motorcycle type: (1-low power ; 2-medium power ; 3-high power");
                    String motorCycleType = scan.nextLine();
                    int motorCycleInt = Integer.parseInt(motorCycleType);

                    switch (motorCycleInt) {

                        case 1:
                            standard = 50;
                            premium = 150;
                            term = 12;
                            break;

                        case 2:
                            standard = 100;
                            premium = 200;
                            term = 12;
                            break;

                        case 3:
                            standard = 200;
                            premium = 300;
                            term = 12;
                            break;

                        default:
                            System.out.println("Unknown motorcycle type");
                    }
                    break;

                default:
                    System.out.println("Unknown vehicle type");

            }


            System.out.println("The standard is $" + standard);
            System.out.println("The premium is $" + premium);
            System.out.println("Terms of validity: " + term + " months");
        }
              scan.close();
    }
}