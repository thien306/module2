package introduction_to_java.excercise;

import java.util.Scanner;

public class ExerciseThree_ReadNumbersIntoWords {
    public static void main(String[] args) {
        int number, tram, chuc, dv;
        Scanner input = new Scanner(System.in);

        System.out.print("input number to read: ");
        number = input.nextInt();

        if (number == 0) {

        }
        switch (number) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("father");
                break;
            case 4:
                System.out.print("fouf");
                break;
            case 5:
                System.out.print("year");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("ripe");
                break;
            case 10:
                System.out.print("ten");
                break;
            default:
                System.out.print("out of ability");
                break;
        }
    }
}
