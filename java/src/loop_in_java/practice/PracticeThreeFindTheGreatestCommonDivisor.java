package practice;

import java.util.Scanner;

public class PracticeThreeFindTheGreatestCommonDivisor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = input.nextInt();

        System.out.print("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}
