package class_and_object.practice.rectangleClass;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);


        System.out.println("you Rectangle \n" + rectangle.display());
        System.out.println("perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.print("Area of the Rectangle: " + rectangle.getArea());
    }
}
