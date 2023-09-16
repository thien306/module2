import java.util.Scanner;

import static ConstType.ConstTypeProject.TYPE_USER;
import static service.UserService.newRegister;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println(" =<*>==//^-_ MENU _-^\\==<*>=");
            System.out.println("|| 1 || = Register");
            System.out.println("|| 2 || = Login");
            System.out.println("|| 3 || = Purchase");
            System.out.println("|| 0 || = Exit");
            System.out.print("Enter your choice (0 - 3): ");

            choice = inputInt(input);

            switch (choice) {
                case 1:
                    newRegister(TYPE_USER);
                    break;
                case 2:
//                        login();
                    break;
                case 3:
//                        purchase();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        input.close();
    }

    private static int inputInt(Scanner input) {
        int number = 0;
        boolean validInput = false;

        do {
            if (input.hasNextInt()) {
                number = input.nextInt();
                validInput = true;
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                input.nextLine();
            }
        } while (!validInput);

        return number;
    }


}
