package Service;

import entity.Admin;
import entity.Customer;
import entity.Seller;
import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    private static User[] users;
    public static List <User> userList;

    static {
        userList = new ArrayList<>();
    }

    public static void loopArray() {
        // cách 1
        for (int index = 0; index < users.length; index++) {
            System.out.println(users[index]);
        }
        //cách 2 for each
        for (User user : users) {
            System.out.println(user);
        }
    }

    public static void addListuser() {
        User user;
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (true) {
            String input = sc.nextLine();

            switch (input) {
                case "Customer": {
                    user = new Customer();
                    break;
                }
                case "Admin": {
                    user = new Admin();
                    break;
                }
                case "Seller": {
                    user = new Seller();
                    break;
                }
                case "EXIT": {
                    return;
                }
                default: {
                    user = new User();
                }
            }
            addInfoToUser(user, index);

            UserService.addToArray(user);
            index++;
        }
    }

    private static void addInfoToUser(User user, int id) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        user.setUsername(userName);
        String password = sc.nextLine();
        user.setPassword(password);
        user.setId(id);

        if(user instanceof Customer){
            long wallet = new Long(sc.nextLine());
            ((Customer) user).setWallet(wallet);
        } else if(user instanceof Seller){
            long salary = new Long(sc.nextLine());
            ((Seller) user).setSalary(salary);
        } else if (user instanceof Admin) {
            int phongId = new Integer(sc.nextLine());
            ((Admin) user).setPhongId(phongId);
        }
    }

    public static void addToArray(User user) {
        //users[index] = user;

        userList.add(user);
    }
}
