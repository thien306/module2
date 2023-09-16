package service;

import entity.Cart;
import entity.CartLineItem;
import entity.Customer;
import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static List<Customer> customers = new ArrayList<>();

    public static void register(){
        Cart cart = CartService.createCart();
        Customer customer = new Customer();
        customer.setCart(cart);
        customer.setId(1);
        customer.setUsername("Kietlonn");
        customer.setPassword("1");
        customers.add(customer);
    }

    //inDanh sách khách hàng
    public static void printCustomerList(){
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }

    //mua Sản phẩm
    public static void buyProduct(){
        int productId = 1;
        int quantity = 2;

        Product product = ProductService.searchProductById(productId);
        CartLineItem cartLineItem = new CartLineItem();
        cartLineItem.setProduct(product);
        cartLineItem.setSubtotal(quantity * product.getPrice());

        int customerId = 1;
        Customer customer = findByCustomerId(customerId);
        Cart cart = customer.getCart();
        List<CartLineItem> cartLineItems = cart.getCartLineItems();

        long total = cart.getTotalPrice() + quantity * product.getPrice();
        cart.setTotalPrice(total);
        cartLineItems.add(cartLineItem);
    }

    //tìm theo Id khách hàng
    public static Customer findByCustomerId(int customerId){
        for(Customer customer : customers){
            if(customer.getId() == customerId){
                return customer;
            }
        }
        return null;
    }
}
