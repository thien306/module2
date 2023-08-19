package array_and_method.prictice;

import java.util.Scanner;

public class practiceThreeFindThelargestValueInaArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập một kích thức: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("kich thức không vượt quá 20");
            }
        } while (size >20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("danh sách tài sản: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 1; j < array.length; j++) {
            if (array[j]  > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.print("giá trị tài sản lớn nhất trong danh sách là: " + max + " tại vị trí " + index);
    }
}
