package entity;

public class Product {
    private String productName;

    private String address;

    private int phoneNumber;

    private String supplierEmail;

    public Product(String productName, String address, int phoneNumber, String supplierEmail) {
        this.productName = productName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.supplierEmail = supplierEmail;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", supplierEmail='" + supplierEmail + '\'' +
                '}';
    }
}
