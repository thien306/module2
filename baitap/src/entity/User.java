package entity;

public abstract class User {
    private long id;

    private String name;

    private String password;

    private String userType;


    public User(long id, String name, String password, String userType) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.userType = userType;

    }

    public User(String name, String password, String userType) {
        this.name = name;
        this.password = password;
        this.userType = userType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }


    public abstract void loGin(long id, String name, String password, String userType);

    public static class Customer extends User {
        public Customer(long id, String name, String password) {
            super(id, name, password, "Customer");
        }

        @Override
        public void login(long id, String name, String password, String userType) {

        }

        @Override
        public void loGin(long id, String name, String password, String userType) {

        }
    }

    public class Seller extends User {
        public Seller(long id, String name, String password) {
            super(id, name, password, "Seller");
        }


        @Override
        public void loGin(long id, String name, String password, String userType) {

        }

        @Override
        public void login(long id, String name, String password, String userType) {
        }
    }

    public abstract void login(long id, String name, String password, String userType);
    }

