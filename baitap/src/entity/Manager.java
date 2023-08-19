package entity;


import java.util.Stack;

public class Manager extends User {

    private String staff;

    private long revenue;
    public Manager(long id, String name, String password, String staff, long revenue, String userType) {
        super(id, name, password, userType);
        this.staff = staff;
        this.revenue = revenue;
    }


    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "staff='" + staff + '\'' +
                ", revenue=" + revenue +
                '}';
    }


    public void login(long id, String name, String password, String userType) {
        System.out.print("switch to the admin dashboard");
    }

    @Override
    public void loGin(long id, String name, String password, String userType) {

    }
}