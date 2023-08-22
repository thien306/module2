package entity;

public class Customer extends User{
    private long wallet;

    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }
}
