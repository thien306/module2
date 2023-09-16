package service;

import emun.UserRole;
import entity.User;
import utils.ReadFile;
import utils.WriteFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Check.CheckId.*;
import static Check.CheckPassword.checkPassword;
import static Check.CheckUserName.checkUsername;


public class UserService {
    private static final String PATH = "src/data/user.csv";
    private static final Scanner input = new Scanner(System.in);
    public static final List<User> userList = new ArrayList<>(ReadFile.readUserList(PATH));
    private static long currentStaffId = getMaxStaffId() + 1;
    private static long currentClientId = getMaxClientId() + 1;

    public static void register() {
        try {
            do {
                String role = decentralization();
                if (role == null) {
                    continue;
                }

                long userId = 0;
                if (UserRole.fromString(role) == UserRole.client) {
                    userId = currentClientId++;
                } else if (UserRole.fromString(role) == UserRole.staff) {
                    userId = currentStaffId++;
                }

                String username = checkUsername();
                String password = checkPassword();

                userList.add(new User(username, password, UserRole.fromString(role)));
                WriteFile.writeUserFile(PATH, userList);
                System.out.println("|*| =] Account registration successful [= |*|");
                break;
            } while (true);
        } catch (Exception e) {
            System.out.print("Registration failed: " + e.getMessage());
        }
    }

    private static String decentralization() {
        System.out.println("User Registration >");
        System.out.print("Please enter the permissions you want: (staff or client): ");
        String role = input.nextLine();
        if (!role.equals("staff") && !role.equals("client")) {
            System.out.print("[ Invalid permissions. Please enter 'staff' or 'customer' ]==> ");
            return null;
        }
        return role;
    }

    public static UserRole login() {
        UserRole userRole = null;
        boolean loggedIn = false;
        do {
            System.out.println("User Login.");

            System.out.print("Enter your username: ");
            String username = input.nextLine();

            System.out.print("Enter your password: ");
            String password = input.nextLine();

            for (User user : userList) {
                if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                    System.out.println("Logged in successfully. Welcome, " + user.getUserName() + "!");
                    System.out.println();
                    userRole = user.getRole();
                    loggedIn = true;
                    break;
                }
            }
            if (!loggedIn) {
                System.out.println("Login unsuccessful. Please check your username and password.");
            }
        } while (!loggedIn);
        return userRole;
    }
}

