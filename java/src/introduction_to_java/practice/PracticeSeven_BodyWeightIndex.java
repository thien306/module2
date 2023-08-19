package introduction_to_java.practice;

import java.util.Scanner;

public class PracticeSeven_BodyWeightIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("you weight (in kilogram): ");
        weight = sc.nextDouble();

        System.out.print("you height (in meter): ");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s","bmi", "Interpretation\n");

        if (bmi < 18) {
            System.out.printf("%-20s%s", bmi, "underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20s%s", bmi, "normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20s%s", bmi, "overweight");
        } else  {
            System.out.printf("%-20s%s", bmi, "obese");
        }
    }
}
