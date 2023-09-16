package floatingBubbleSortAlgorithm;

import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");

        int size = input.nextInt();
        int[] List = new int[size];
        System.out.print("Enter " + List.length + " values: ");
        for (int i = 0; i < List.length; i++) {
            List[i] = input.nextInt();
        }
        System.out.print("Your input list: ");
        for (int index : List) {
            System.out.print(index + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(List);

        System.out.print("\nSorted list: ");
        for (int num : List) {
            System.out.print(num + "\t");
        }
    }

    public static void bubbleSortByStep(int[] List) {
        boolean needNextPass = true;
        for (int k = 1; k < List.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < List.length - k; i++) { // Sửa điều kiện lặp
                if (List[i] > List[i + 1]) {
                    System.out.println("Swap " + List[i] + " with " + List[i + 1]);
                    int temp = List[i];
                    List[i] = List[i + 1];
                    List[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Array may be sorted, next pass not needed");
            }
            System.out.print("List after pass " + k + ": ");
            for (int i : List) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}

