import emun.UserRole;
import entity.CartItem;
import service.*;

import java.util.Scanner;

import static service.CartService.createCartItem;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println(" =<*>==//^-_ XPHONE _-^\\==<*>=");
            System.out.println("|| 1 || =[==> register");
            System.out.println("|| 2 || =[==> Login");
            System.out.println("|| 3 || =[==> Exit");
            System.out.print("Enter your choice || 1 <-> 3 || = ");

            choice = inputInt(input);
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("[ register ]=> ");
                    UserService.register();
                    break;
                case 2:
                    System.out.print("[ login ]=> ");
                    UserRole userRole = UserService.login();
                    if (userRole.equals(UserRole.client)) {
                        CartService cartService = new CartService();
                        cartMenu(input);
                    }
                    if (userRole.equals(UserRole.manage)) {
                        return;
                    }
                    if (userRole.equals(UserRole.staff)) {
                        while (true) {
                            System.out.println("Please select an option: ");
                            System.out.println("|| 1 || =[==> Product Menu");
                            System.out.println("|| 2 || =[==> Category Menu");
                            System.out.println("|| 3 || =[==> Exit");
                            System.out.print("Enter your choice || 1 <-> 3 || = ");

                            int menuSelection = inputInt(input);
                            input.nextLine();

                            switch (menuSelection) {
                                case 1:
                                    System.out.print("[ Product Menu ]");
                                    ProductService productService = new ProductService();
                                    productMenu(productService, input);
                                    break;
                                case 2:
                                    System.out.print("[ Category Menu ]");
                                    CategoryService categoryService = new CategoryService();
                                    categoryMenu(categoryService, input);
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.print("Invalid option. Please choose again.");
                            }
                            if (menuSelection == 3) {
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("[ Exit the program ]");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option");
            }
        } while (choice != 3);
        input.close();
    }

    public static int inputInt(Scanner input) {
        int number = 0;
        boolean validInput = false;

        do {
            if (input.hasNextInt()) {
                number = input.nextInt();
                validInput = true;
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                input.nextLine();
            }
        } while (!validInput);
        return number;
    }

    public static void productMenu(ProductService productService, Scanner input) {
        int choice;

        do {
            System.out.println();
            System.out.println(" =<*>==//^-_PRODUCT MENU _-^\\==<*>=");
            System.out.println("1. add Product");
            System.out.println("2. show all products");
            System.out.println("3. update product");
            System.out.println("4. delete product");
            System.out.println("5. find Products by Id");
            System.out.println("6. find Products by category");
            System.out.println("7. Back to Main Menu");
            System.out.println("8. exit");

            System.out.print("Choose an option (1-8): ");
            choice = inputInt(input);
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("add Product. ");
                    productService.addProduct();
                    break;
                case 2:
                    System.out.println("show all products. ");
                    productService.showAllProducts();
                    break;
                case 3:
                    System.out.println("update product. ");
                    productService.updateProduct();
                    break;
                case 4:
                    System.out.println("delete product. ");
                    productService.deleteProduct();
                    break;
                case 5:
                    System.out.println("find Products by Id. ");
                    ProductService.findProducts();
                    break;
                case 6:
                    System.out.println("find Products by category. ");
                    productService.SearchProductCategories();
                    break;
                case 7:
                    System.out.println("Returning to main menu.");
                    return;
                case 8:
                    System.out.print("Exiting the program. ");
                    break;
                default:
                    System.out.print("Invalid option. Please choose again.");
            }
        } while (choice != 8);
    }


    public static void categoryMenu(CategoryService categoryService, Scanner input) {
        int choice;

        do {
            System.out.println();
            System.out.println(" =<*>==//^-CATEGORY MENU _-^\\==<*>=");
            System.out.println("1. Add Category");
            System.out.println("2. Show All Categories");
            System.out.println("3. find category");
            System.out.println("4. Delete Category");
            System.out.println("5. Update catalog");
            System.out.println("6. Back to Main Menu");
            System.out.println("7. exit");

            System.out.print("Choose an option (1-7): ");
            choice = inputInt(input);
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("add category. ");
                    categoryService.addCategory();
                    break;
                case 2:
                    System.out.println("show all category. ");
                    categoryService.showAllCategory();
                    break;
                case 3:
                    System.out.println("Search category. ");
                    categoryService.searchCategory();
                    break;

                case 4:
                    System.out.println("delete category. ");
                    categoryService.deleteCategory();
                    break;
                case 5:
                    System.out.println("Update catalog. ");
                    categoryService.updateCatalog();
                    break;
                case 6:
                    System.out.println("Returning to main menu.");
                    return;
                case 7:
                    System.out.println("Exiting the program ");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (choice != 7);
    }

    private static void cartMenu(Scanner input) {
        int choice;

        do {
            System.out.println();
            System.out.println(" =<*>==//^-CART MENU _-^\\==<*>=");
            System.out.println("1. create shopping cart");
            System.out.println("2. add product to cart");
            System.out.println("3. Find products by Id");
            System.out.println("4. Remove product from cart");
            System.out.println("5. Product listIn cart");
            System.out.println("6. total cart value");
            System.out.println("7. Back to Main Menu");
            System.out.println("8. exit");


            System.out.print("Choose an option (1 - 8): ");
            choice = inputInt(input);
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("create shopping cart.");
                    CartService.createCart();
                    break;
                case 2:
                    System.out.println("Add product to cart");
                    CartItem item = createCartItem(input);
                    CartService.addProductToCart(item);
                    break;
                case 3:
                    System.out.println("Find products by Id");
                    System.out.print("Enter product ID: ");
                    long productId = input.nextLong();
                    input.nextLine();
                    CartService.displayProductDetailsById(productId);
                    break;
                case 4:
                    System.out.println(" Remove product from cart");
                    CartService.RemoveProductFromCart();
                    break;
                case 5:
                    System.out.println("Product listIn cart");
                    CartService.productListInCart();
                    break;
                case 6:
                    System.out.println("total cart value");
                    CartService.totalCartValue();
                    break;
                case 7:
                    System.out.println("Returning to main menu.");
                    return;
                case 8:
                    System.out.println("Exiting the program ");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (choice != 8);
    }
}

