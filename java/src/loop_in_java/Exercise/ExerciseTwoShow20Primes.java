package loop_in_java.Exercise;

import java.util.Scanner;

public class ExerciseTwoShow20Primes {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        Scanner input = new Scanner(System.in);

        System.out.print(" nhập số nguyên tố cần in ra: ");
        int number = input.nextInt();

        System.out.print("các số nguyên tố là: ");
        while (count < number) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
