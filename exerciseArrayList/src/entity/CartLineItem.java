package entity;

public class CartLineItem {
    private Product product;
    private long subtotal;

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "CartLineItem{" +
                "product=" + product +
                ", subtotal=" + subtotal +
                '}';
    }
}
