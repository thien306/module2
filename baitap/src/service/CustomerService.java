package service;

import entity.Customer;

public class CustomerService {
    private static Customer[] customerList = new Customer[5];
    private static int customerCount = 0;

    public static void addCustomer(Customer customer, int index) {
        customerList[index] = customer;
        customerCount++;
    }

    public static void ShowAllCustomer() {
        for (int index = 0; index < customerCount; index++) {
            if (customerList[index] != null) {
                System.out.println(customerList[index]);
            }
        }
    }

    public static void deleteCustomer(int index) {
        customerList[index] = null;
        customerCount--;
    }

    public static void findCustomer(String name) {
        for (int index = 0; index < customerCount; index++) {
            if (customerList[index].getName().equals(name)) {
                System.out.println("find customers: ");
                System.out.println(customerList[index]);
                return;
            }
        }
        System.out.println("Can't find customer information.");
    }
}
