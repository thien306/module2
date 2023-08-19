package service;

import entity.Seller;
import entity.User;

public  class SellerService {
    private static Seller[] sellersList = new Seller[5];

    private static int sellerCount = 0;

    public static void addSeller(Seller seller, int index) {
        sellersList[index] = seller;
    }

    public static void deleteSeller(int index) {
        sellersList[index] = null;
        sellerCount--;
    }

    public static void showAllSeller() {
        for (int index = 0; index < sellerCount; index++) {
            if (sellersList[index] != null) {
                System.out.println(sellersList[index]);
            }
        }
    }

    public static void findSeller(String name  ) {
        for (int index = 0; index < sellerCount; index++) {
            if (sellersList[index].getName().equals(name)) {
                System.out.println("find a seller:");
                System.out.println(sellersList[index]);
                return;
            }
        }
        System.out.println("No seller found.");
    }
}
