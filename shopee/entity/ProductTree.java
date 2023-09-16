package entity;

public class ProductTree {
    Product product;

    ProductTree left;

    ProductTree right;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductTree getLeft() {
        return left;
    }

    public void setLeft(ProductTree left) {
        this.left = left;
    }

    public ProductTree getRight() {
        return right;
    }

    public void setRight(ProductTree right) {
        this.right = right;
    }
}
