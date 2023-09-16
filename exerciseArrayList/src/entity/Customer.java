package entity;

public class Customer {
    private Cart cart;
    private String type;
    private long id;
    private String email;
    private int phoneNumber;
    private String username;
    private String password;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getInfo() {
        return String.format("%s,%s,%s\n",
                this.getId(),
                this.getUsername(),
                this.getPassword());
    }


    public void setCart(Cart cart) {
        this.cart = cart;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cart=" + cart +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
