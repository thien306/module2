import service.CustomerService;
import service.ProductService;

public class Main {
    public static void main(String[] args) {

        ProductService.addProductToList();
        ProductService.addProductToList();

        CustomerService.register();
        CustomerService.printCustomerList();

        CustomerService.buyProduct();
        CustomerService.printCustomerList();


    }
}