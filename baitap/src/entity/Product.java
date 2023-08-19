package entity;

public class Product {
    private long id;
    private String productName;

    private long price;

    private String cateName;
    public Product(long id, String name, long price) {
        this.id = id;
        this.productName = name;
        this.price = price;

    }

    public Product(long id, String productName, long price, String cateName) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.cateName = cateName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price =" + price +
                ", cateName='" + cateName + '\'' +
                '}';
    }
}
