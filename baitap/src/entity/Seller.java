package entity;

public class Seller extends User {
    private long monthlySalary;

    public long wallet;


    public Seller(long id, String name, String password,long wallet, String userType) {
        super(id, name, password, userType);
        this.wallet = wallet;
    }


    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }

    public long getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(long monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "monthlySalary=" + monthlySalary +
                ", wallet=" + wallet +
                '}';
    }


    public void login(long id, String name, String password, String userType) {
        System.out.print("switch to dashboard");
    }

    @Override
    public void loGin(long id, String name, String password, String userType) {

    }

}
