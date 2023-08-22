import entity.Product;
import service.CategoryService;
import service.ProductService;
import service.UserService;

import java.util.Scanner;

import static service.UserService.isLoginSuccess;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int userChoice;
    static boolean isTurnOff = false;
    static final int USER_CHOOSE_LINE_1 = 1;
    static final int USER_CHOOSE_LINE_2 = 2;
    static final int USER_CHOOSE_LINE_3 = 3;

    public static void main(String[] args) {

//        entity.Category cateAo = new entity.Category(1, "ao");
//        Product ao = new Product(1, "ao phong",1700, "ao");
//        ProductService.addProduct(ao, 0);
//        Product aoMot = new Product(2, "ao ba lo" ,1200,"ao");
//        ProductService.addProduct(aoMot, 1);
//
//        entity.Category cateQuan = new entity.Category(2, "quan");
//        Product quan = new Product(1, "quan dai",1790, "quan");
//        ProductService.addProduct(quan, 0);
//        Product quanMot = new Product(2, "quan ngan" ,1500,"quan");
//        ProductService.addProduct(quanMot, 1);
//
//        CategoryService.addCategory((entity.Category) cateAo, 0);
//        CategoryService.addCategory((entity.Category) cateQuan, 1);

         //Gọi phương thức để hiển thị sản phẩm
//         ProductService.showallProduct();

        //Gọi phương thức để hiển thị danh mục
//        CategoryService.showAllCategory();

        //Gọi phương thức để hiển thị sản phẩm thuộc một danh mục cụ thể
//        ProductService.showAllProductByCateName("ao");

        //Gọi phương thức để xóa một sản phẩm
//        ProductService.deleteProduct(0);

        //Gọi phương thức để xóa một danh mục
//        CategoryService.deleteCategory(0);

        doRegisterAndLogin();
        ProductService.showallProduct();
        CategoryService.showAllCategory();
        UserService.login();

    }

    private static void doRegisterAndLogin() {
        displayWelcome();
        do {
            userChoice = input.nextInt();
            switch (userChoice) {
                case USER_CHOOSE_LINE_1: {
                    UserService.login();
                    break;
                }
                case USER_CHOOSE_LINE_2: {
                    System.out.print("Enter user type (Customer/Seller/Admin): ");
                    input.nextLine();
                    String userType = input.nextLine();

                    System.out.print("enter username: ");
                    String userName = input.nextLine();

                    System.out.println("enter password: ");
                    String password = input.nextLine();

                    UserService.register(userName, password, userType);
                    break;
                }
                case USER_CHOOSE_LINE_3: {
                    isTurnOff = true;
                    System.out.print("you have left shoPee");
                    break;
                }
                default: {
                    System.out.println("Your choice does not match!");
                }
            }
            if (isTurnOff) {
                break;
            }
            displayWelcome();
        } while (!isLoginSuccess);
    }

    private static void displayWelcome() {
        System.out.println("Welcome to shopPee");
        System.out.println("1. log in");
        System.out.println("2. register");
        System.out.println("3. TleAve shoPee");
        System.out.print("Enter (1-3) your choice: ");
    }
}