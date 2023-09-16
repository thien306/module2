package entity;

public class Storage {

    private int id;

    private int productId;

    private int value;

    public Storage(int id, int productId, int value) {
        this.id = id;
        this.productId = productId;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "id=" + id +
                ", productId=" + productId +
                ", value=" + value +
                '}';
    }
}
