package entity;

public class Shipper {

    private String productName;

    private int quantity;

    private int weight;

    private String destination;

    private String deliveryDate;

    private String deliveryStatus;

    private String deliveryService;

    public Shipper(String productName, int quantity, int weight, String destination, String deliveryDate, String deliveryStatus, String deliveryService) {
        this.productName = productName;
        this.quantity = quantity;
        this.weight = weight;
        this.destination = destination;
        this.deliveryDate = deliveryDate;
        this.deliveryStatus = deliveryStatus;
        this.deliveryService = deliveryService;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(String deliveryService) {
        this.deliveryService = deliveryService;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", destination='" + destination + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", deliveryService='" + deliveryService + '\'' +
                '}';
    }
}
