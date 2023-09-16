package entity;

public class Variant {
    private long variantId;

    private String size;

    private String color;

    private long variantPrice;

    public Variant(long variantId, String size, String color) {
        this.variantId = variantId;
        this.size = size;
        this.color = color;
    }

    public long getVariantId() {
        return variantId;
    }

    public void setVariantId(long variantId) {
        this.variantId = variantId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getVariantPrice() {
        return variantPrice;
    }

    public void setVariantPrice(long variantPrice) {
        this.variantPrice = variantPrice;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "variantId=" + variantId +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", variantPrice=" + variantPrice +
                '}';
    }
}
