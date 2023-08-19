package service;

import entity.User;

import java.util.Scanner;

public class UserService {
    private static User[] usersList = new User[5];
    private static int count = 0;

    public static boolean isLoginSuccess = false;
    private static  Scanner input = new Scanner(System.in);

    public static void login() {
        System.out.print("Enter username: ");
        String userName = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        for (int index = 0;  index < count; index++) {
            if (usersList[index] != null &&
                    usersList[index].getName().equals(userName) &&
                    usersList[index].getPassword().equals(password)) {
                System.out.println("login successful");
                System.out.println();
                isLoginSuccess = true;
                return;
            }
        }
        System.out.print("login failed. Incorrect username of password.");
        System.out.println();
        isLoginSuccess = false;
    }

    public static void register(String name, String password, String userType) {
        String userNameNew = name;
        String passwordNew = password;
        User newUser = new User(userNameNew, passwordNew, userType) {
            @Override
            public void login(long id, String name, String password, String userType) {

            }

            @Override
            public void loGin(long id, String name, String password, String userType) {

            }
        };
        addUser(newUser,count);
        System.out.println("Sign Up Success");
        System.out.println();
    }

    public static void addUser(User user, int index) {
        usersList[index] = user;
        count++;
    }

    public static void showAllUser() {
        for (int index = 0; index < count; index++) {
            if (usersList[index] != null) {
                System.out.println(usersList[index]);
            }
        }
    }

    public static void deleteUser(int index) {
        usersList[index] = null;
    }

    public static void findUser(String name) {
        for (int index = 0; index < count; index++) {
            if (usersList[index].getName().equals(name)) {
                System.out.println("User found: ");
                System.out.println(usersList[index]);
                return;
            }
        }
        System.out.println("Seller not found with the given name.");
    }
    public static void loGIN(int index) {
        usersList[index].loGin(1,"thien","thien123","Admin");
    }
}
