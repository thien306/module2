package entity;

import java.util.Arrays;

public class Admin extends User {

    private Product[] listProduct = new Product[5];

    private Seller[] listSeller = new Seller[5];

    public Admin(long id, String name, String password, String userType) {
        super(id, name, password, userType);
    }

    public Product[] getListProduct() {
        return listProduct;
    }

    public void setListProduct(Product[] listProduct) {
        this.listProduct = listProduct;
    }

    public Seller[] getListSeller() {
        return listSeller;
    }

    public void setListSeller(Seller[] listSeller) {
        this.listSeller = listSeller;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "listProduct=" + Arrays.toString(listProduct) +
                ", listSeller=" + Arrays.toString(listSeller) +
                '}';
    }


    public void login(long id, String name, String password, String userType) {
        System.out.print("switch to admin dashboard page");
    }

    @Override
    public void loGin(long id, String name, String password, String userType) {

    }
}
