package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private long id;

    private long price;


    private long totalPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }


    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<CartLineItem> getCartLineItems() {
        return cartLineItems;
    }

    private List<CartLineItem> cartLineItems =new ArrayList<>();

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }
}



