package service;

import entity.Product;
import entity.ProductTree;

import java.util.ArrayList;

public class ProductService {
    private static ArrayList<Product> productList = new ArrayList<Product>();

    public static void printProductList() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void addProductToList() {
        Product product = new Product(1, "ao thun nam", 10000);
        productList.add(product);
    }

    public static Product searchProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void addToTree() {
        ProductTree productTree = new ProductTree();
        for (Product product : productList) {
            if (productTree.getProduct() == null) {
                productTree.setProduct(product);
            } else if (productTree.getProduct().getPrice() < product.getPrice()) {
                ProductTree productTreeLeft = new ProductTree();
                productTree.setLeft(productTreeLeft);
            } else if (productTree.getProduct().getPrice() > product.getPrice()) {
                ProductTree productTreeRight = new ProductTree();
                productTree.setRight(productTreeRight);
            }
        }
    }
}
