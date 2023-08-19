package loop_in_java.Exercise;

import java.util.Scanner;

public class ExerciseThreePrimesLessThan100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        if (number < 2) {
            System.out.print(number + " is not a prime ");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " is a prime");
                for (int j = number + 1; j < 100; j++) {
                     i = 2;
                     check = true;
                    while (i <= Math.sqrt(j)) {
                        if (j % i == 0) {
                            check = false;
                            break;
                        }
                        i++;
                    }
                    if (check) {
                        System.out.print(j + ", ");
                    }
                }
            } else {
                System.out.println(number + "is not a prime");
            }
        }
    }
}