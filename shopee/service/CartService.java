package service;

import entity.Cart;

public class CartService {
    public static Cart createCart(){
        Cart cart = new Cart();
        cart.setId(1);
        cart.setTotalPrice(0);
        return cart;
    }
}
