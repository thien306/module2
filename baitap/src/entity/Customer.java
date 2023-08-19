package entity;

public class Customer extends User {
    private String phoneNumber;

    private String addRess;

    private String purchaseHistory;

    public Customer(long id, String name, String password, String phoneNumber, String addRess, String purchaseHistory, String userType) {
        super(id, name, password, userType);
        this.addRess = addRess;
        this.phoneNumber = phoneNumber;
        this.purchaseHistory = purchaseHistory;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public String getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", addRess='" + addRess + '\'' +
                ", purchaseHistory='" + purchaseHistory + '\'' +
                '}';
    }

    @Override
    public void loGin(long id, String name, String password, String userType) {

    }

    public void login(long id, String name, String password, String userType) {
        System.out.print("switch to home page");
    }
}
