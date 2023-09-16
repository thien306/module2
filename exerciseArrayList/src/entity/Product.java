package entity;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private static List<Variant> variantList = new ArrayList<>();
    private long Id;
    private String name;
    private long price;
    private int quantity;
    private long cateId;
    private long variantId;

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s\n",
                this.getId(),
                this.getName(),
                this.getPrice(),
                this.getQuantity(),
                this.getCateId());
    }

    public Product(long id, String name, long price, int quantity, long cateId) {
        Id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.cateId = cateId;
    }
    public Product(long id, String name, long price, long cateId) {
        Id = id;
        this.name = name;
        this.price = price;
        this.cateId = cateId;
    }

    public Product(List<Variant> variantList, long id, String name, long price, int quantity, long cateId) {
        this.variantList = variantList;
        Id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.cateId = cateId;
    }

    public Product(long productId, String productName, double productPrice) {
        Id = productId;
        this.name = productName;
        this.price = (long) productPrice;
    }

    public static List<Variant> getvariantList() {
        return variantList;
    }

    public static List<Variant> getVariants() {
        return null;
    }


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getCateId() {
        return cateId;
    }

    public void setCateId(long cateId) {
        this.cateId = cateId;
    }

    public long getVariantId() {
        return variantId;
    }
    public void setVariants(List<Variant> variantList) {
        this.variantList = variantList;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", cateId=" + cateId +
                ", variantList=" + variantList +
                '}';
    }

}

