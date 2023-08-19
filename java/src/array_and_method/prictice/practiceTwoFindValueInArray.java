package array_and_method.prictice;

import java.util.Scanner;

public class practiceTwoFindValueInArray {
    public static void main(String[] args) {
        String[] students = {"thien", "suong","thao","ngoc anh", "kim anh"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên hoc sinh: ");
        String input_names = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_names)) {
                System.out.println("vị trí của sinh viên trong danh sách " + input_names + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy" + input_names + "trong dannh sách");
        }
    }
}
