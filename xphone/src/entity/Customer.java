package entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {

//    public static List<Oder> OrderHistory = new ArrayList<>();
    private String customerName;

    private String CustomersAddress;

    private int phoneNumber;

    private String customerEmail;

    public Customer(String customerName, String customersAddress, int phoneNumber, String customerEmail) {
        this.customerName = customerName;
        CustomersAddress = customersAddress;
        this.phoneNumber = phoneNumber;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomersAddress() {
        return CustomersAddress;
    }

    public void setCustomersAddress(String customersAddress) {
        CustomersAddress = customersAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", CustomersAddress='" + CustomersAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }
}
