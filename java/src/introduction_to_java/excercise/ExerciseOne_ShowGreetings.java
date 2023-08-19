package introduction_to_java.excercise;

import java.util.Scanner;

public class ExerciseOne_ShowGreetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("hello: " + name);
    }
}
