package entity;

public class CartLineItem {
    private Product product;

    private long subtotal;


    public long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "CartLineItem{" +
                "product=" + product +
                ", subtotal=" + subtotal +
                '}';
    }
}
