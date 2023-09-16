package Check;

import static service.CategoryService.input;

public class CheckPassword {

    public static String checkPassword() {
        int maxAttempt = 3;

        while (maxAttempt > 0) {
            System.out.print("|| Enter password: ");
            String password = input.nextLine();

            if (passwordIsValid(password)) {
                return password;
            }

            maxAttempt--;
            if (maxAttempt == 0) {
                System.out.print("Exceeded maximum login attempts. Exiting.");
                System.exit(1);
            }

        }
        return null;
    }

    private static boolean passwordIsValid(String password) {
        if (password.contains(" ")) {
            System.out.println("Password cannot contain spaces.");
            return false;
        } else if (password.trim().isEmpty()) {
            System.out.println("Password cannot be blank.");
            return false;
        } else if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long");
            return false;
        } else if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*$")) {
            System.out.println("Password must contain at least one uppercase letter, one lowercase letter, and one number");
            return false;
        }
        return true;
    }

}
