import service.Dictionary;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        int choice = 0;
        String keyword = null;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("-----------");
            System.out.println("menu");
            System.out.println("1. add words");
            System.out.println("2. delete words ");
            System.out.println("3. word lookup");
            System.out.println("4. print keyword list");
            System.out.println("5. print out word count");
            System.out.println("6. delete all keywords");
            System.out.println("7. exit");

            System.out.print("choose an option(1 - 7): ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("add words.");
                    dictionary.addWords();
                    break;
                case 2:
                    System.out.println("Deleting words.");
                    dictionary.deleteWord(null);
                    break;
                case 3:
                    System.out.println("Looking up a word.");
                    dictionary.wordLookup();
                    break;
                case 4:
                    System.out.println("Printing keyword list.");
                    dictionary.printResults();
                    break;
                case 5:
                    System.out.println("Printing out word count.");
                    dictionary.quantity();
                    break;
                case 6:
                    System.out.println("Deleting all keywords.");
                    dictionary.deleteAll();
                    break;
                case 7:
                    System.out.println(" Exiting the program.");
                    break;
                default:
                    System.out.print("Invalid option. Please choose again.");
            }
        } while (choice != 7);
        input.close();
    }
}
