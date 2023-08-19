import test.day;
import test.ThoiKhoaBieu;

import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        int result = calculateSum(5, 3);
        System.out.println("Kết quả là: " + result);
    }

    public static int calculateSum(int a, int b) {
        int sum = 0;
        for (int i = 0; i < a + b; i++) {
            sum += i;
        }
        return sum;
        Q1  ``1``
}