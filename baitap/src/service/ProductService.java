package service;


import entity.Product;

public class ProductService {
    private static Product[] productList = new Product[5];
    private static int count = 0;
    public static void addProduct(Product product, int index) {
        productList[index] = product;
        count++;
    }

    public static void showAllProduct() {
        for (int index = 0; index < count; index++) {
            if (productList[index] != null) {
                System.out.println(productList[index]);
            }
        }
    }

    public static void showAllProductsByCategoryName(String cateName) {
        for (int index = 0; index < count; index++) {
            Product tempProduct = productList[index];
            if(tempProduct.getCateName().equals(cateName)) {
                System.out.println(tempProduct);
            }
        }
    }

    public static void deleteProduct(int index) {
        productList[index] = null;
        count--;
    }

    public static void showAllProductByCateName(String ao) {
    }

    public static void showallProduct() {
    }
}
