package Check;

import entity.User;

import static service.CategoryService.input;
import static service.UserService.userList;

public class CheckUserName {
    public static String checkUsername() {

        int limitedNumberOfTimes = 3;
        String username = null;

        while (limitedNumberOfTimes > 0) {
            System.out.print("|| Enter username: ");
            username = input.nextLine();

            if (isValidName(username)) {
                break;
            } else {
                limitedNumberOfTimes--;
                if (limitedNumberOfTimes == 0) {
                    System.out.print("Maximum number of entries exceeded. Escaping.");
                    System.exit(1);
                }
            }
        }

        for (User user : userList) {
            if (user.getUserName().equals(username)) {
                System.out.print("Username is already taken, please enter another one");
                return null;
            }
        }
        return username;
    }

    private static boolean isValidName(String username) {
        if (username.contains(" ")) {
            System.out.println("Username cannot contain spaces.");
            return false;
        }

        if (username.trim().isEmpty()) {
            System.out.println("Registration cannot be blank.");
            return false;
        }

        if (!username.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("Username cannot contain special characters.");
            return false;
        }

        if (isNumeric(username)) {
            System.out.print("Username cannot contain numbers. ");
            return false;
        }

        if (username.length() < 6 || username.length() > 20) {
            System.out.print("Username must be between 6 and 20 characters long.");
            return false;
        }
        return true;
    }

    private static boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }

}
