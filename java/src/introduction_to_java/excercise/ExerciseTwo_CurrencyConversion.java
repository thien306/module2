package introduction_to_java.excercise;

import java.util.Scanner;

public class ExerciseTwo_CurrencyConversion {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;

        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền USD: ");
        USD = sc.nextDouble();

        double quydoi = USD * 23000;
        System.out.printf("giá trị VND là: %.0f", quydoi);
    }
}
