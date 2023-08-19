package class_and_object.practice.classbuildingQuadraticEquation;

import class_and_object.practice.rectangleClass.Rectangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("nhập hệ số bậc 2, a: ");
        double a = input.nextDouble();

        System.out.print("nhập hệ số bậc 1, b: ");
        double b = input.nextDouble();

        System.out.print("nhập hằng sô tự do, c: ");
        double c = input.nextDouble();

        QuadraticEquation  quadraticEquation = new QuadraticEquation(a, b, c);
    }
}
