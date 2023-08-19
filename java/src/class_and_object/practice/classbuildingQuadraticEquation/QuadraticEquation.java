package class_and_object.practice.classbuildingQuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }
     public QuadraticEquation(double a, double b, double c) {
         this.a = a;
         this.b = b;
         this.c = c;

         if (a == 0) {
             if (b == 0) {
                 System.out.println("phương trình vô nghiệm");
             } else {
                 System.out.println("phương trình có nghiệm; " + "x = "  + (- c / b));
             }
             return;
         }
         double delta = b * b - 4 * a * c;

         if (delta > 0.0) {
             double r1 = (- b + Math.pow(delta, 0.5)) / (2.0 * a);
             double r2 = (- b - Math.pow(delta, 0.5)) / (2.0 * a);
             System.out.println("the equation has two roots: " + r1 + " and " + r2);
         } else if (delta == 0.0) {
             double r1 = -b / (2.0 * a);
             System.out.println("the equation has one roots: " + r1);
         } else {
             System.out.println("the equation has no real roots");
         }
     }
}
