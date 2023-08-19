package Exercise;

import java.util.Scanner;

public class ExerciseOneDisplayImage {
    public static void main(String[] args) {
//        int choice = -1;
//        Scanner input = new Scanner(System.in);
//        System.out.println("menu");
//        System.out.println("1. Print the rectangle");
//        System.out.println("2. Print the square triangle");
//        System.out.println("3. Print isosceles triangle");
//        System.out.println("4. Exit");
//        System.out.print("Enter your choice: ");
//        choice = input.nextInt();

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }

        System.out.println( );
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }

        System.out.println( );
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println( );
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
