package entity;


public class Seller  {
    private long id;
    private long wallet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", wallet=" + wallet +
                '}';
    }
}
