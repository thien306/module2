public class Main {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        int min;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        int pox, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pox = i;
            while (pox > 0 && x < array[pox - 1]) {
                array[pox] = array[pox - 1];
                pox--;
            }
            array[pox] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(array);

        System.out.print("Mảng sau khi sắp xếp bằng Bubble Sort: ");
        for (int num : array) {
            System.out.print(num + " ");

        }
        int[] array2 = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(array2);

        System.out.println();
        System.out.print("Mảng sau khi sắp xếp bằng selectionSort: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }

        int[] array3 = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(array3);

        System.out.println();
        System.out.print("Mảng sau khi sắp xếp bằng insertionSort: ");
        for (int num : array3) {
            System.out.print(num + " ");
        }
    }

}