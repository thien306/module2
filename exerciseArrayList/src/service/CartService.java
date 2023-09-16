package service;

import entity.Cart;
import entity.CartItem;
import entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartService {
    private static final Scanner input = new Scanner(System.in);
    private static final List<CartItem> cartList = new ArrayList<>();
    public static void createCart() {
        new Cart();
    }

    public static void addProductToCart(CartItem item) {
        if (cartList.contains(item)) {
            cartList.get(cartList.indexOf(item)).setQuantity(item.getQuantity());
        } else {
            cartList.add(item);
        }
    }

    public static void displayProductDetailsById(long productId) {
        boolean found = false;
        for (CartItem item : cartList) {
            if (item.getProduct().getId() == productId) {
                System.out.println(item);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found in the cart");
        }
    }

    public static void RemoveProductFromCart() {
        System.out.print("Enter product ID to remove: ");
        long id = input.nextLong();
        input.nextLine();

        displayProductDetailsById(id);

        System.out.print("Do you want to remove this product from the cart? (yes/no): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            boolean removed = cartList.removeIf(item -> item.getProduct().getId() == id);
            if (removed) {
                System.out.println("Product removed from the cart successfully");
            } else {
                System.out.println("Product was not removed from the cart");
            }
        } else {
            System.out.println("Product was not removed from the cart");
        }
    }

    public static void productListInCart() {
        if (cartList.isEmpty()) {
            System.out.println("There are no products in the cart");
        } else {
            System.out.println("Products in the cart: ");
            for (CartItem item : cartList) {
                System.out.println(item);
            }
        }
    }

    public static void totalCartValue() {
        long sum = 0;
        for (CartItem item : cartList) {
            sum += (long) item.getPrice();
        }
        System.out.println("Total cart value: " + sum);
    }

    public static CartItem createCartItem(Scanner input) {
        System.out.print("Enter product ID: ");
        long productId = input.nextLong();
        input.nextLine();

        System.out.print("Enter product name: ");
        String productName = input.nextLine();

        System.out.print("Enter product price: ");
        double productPrice = input.nextDouble();
        input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        Product product = new Product(productId, productName, productPrice);
        return new CartItem(product, quantity);
    }
}
