package entity;

public class Order {

    private long orderId;

    private String productName;

    private int quantity;

    private String massage;

    public Order(long orderId, String productName, int quantity, String massage) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.massage = massage;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", massage='" + massage + '\'' +
                '}';
    }
}
