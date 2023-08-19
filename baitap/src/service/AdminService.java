package service;

import entity.Product;
import entity.Seller;

public  class AdminService {
    private static Seller[] sellersList = new Seller[5];
    private static Product[] ProductManagement = new Product[5];
    private static int sellerCount = 0;
    private static int productCount = 0;

    public static void addSeller(Seller seller, int index) {
        sellersList[index] = seller;
        sellerCount++;
    }

    public static void addProduct(Product product, int index) {
        ProductManagement[index] = product;
        productCount++;
    }

    public static void showallSeller() {
        for (int index = 0; index < sellerCount; index++) {
            if (sellersList[index] != null) {
                System.out.println(sellersList[index]);
            }
        }
    }

    public static void showallProduct() {
        for (int index = 0; index < productCount; index++) {
            if (ProductManagement[index] != null) {
                System.out.println(ProductManagement[index]);
            }
        }
    }

    public static void deleteSeller(int index) {
        sellersList[index] = null;
        sellerCount--;
    }

    public static void deleteProduct(int index) {
        ProductManagement[index] = null;
        productCount--;
    }

    public static void findSeller(String name) {
        for (int index = 0; index < sellerCount; index++) {
            if (sellersList[index].getName().equals(name)) {
                System.out.println("User found: ");
                System.out.println(sellersList[index]);
            }
        }
        System.out.println("Seller not found with the given name.");
    }

    public static void findProduct(String name) {
        for (int index = 0; index < productCount; index++) {
            if (ProductManagement[index].getCateName().equals(name)) {
                System.out.println("find products: ");
                System.out.println(ProductManagement[index]);
            }
        }
        System.out.println("No products found with the given name.");
    }
//    public void payWage(long salary, String name) {
//        for (int index = 0; index < sellersList.length; index++) {
//            if (sellersList[index].getName().equals(name)) {
//                sellersList[index].setWallet(sellersList[index].getWallet() + salary);
//                System.out.printf(String.valueOf(sellersList[index].getWallet()));
//            } else {
//                return;
//            }
//        }
//    }
}



