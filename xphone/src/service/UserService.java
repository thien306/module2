package service;

import ConstType.ConstRegex;
import entity.Account;
import regex.AcountService;
import regex.CheckEmail;
import regex.CheckName;
import service.constructor.AcountConstructor;
import java.util.Scanner;
public static AcountService acountService = new AcountServiceImpl();


public class UserService {
    private static Scanner input = new Scanner(System.in);
    private static void newRegister(String type) {
        System.out.print("Register");
        String email = getEmail;

    }

    private static String getEmail() {
        int key = -1;
        String email;
        do {
            email = isCheckEmailRegex("email");
            boolean isEmailExist = acountService.
        }
    }

    private static String isCheckEmailRegex(String message) {
        int key = -1;
        String number;
        do {
            showMessengerEnterInformation(message);
            number = input.nextLine().trim();
            if (isCheckEmailRegex(number)) {
                key = 0;
            } else {
                showMessengerEnterInformation("format");
            }
        } while (key != 0);
        return number;
    }

    private static void showMessengerEnterInformation(String message) {
        System.out.print("Enter information" + message);
    }
}