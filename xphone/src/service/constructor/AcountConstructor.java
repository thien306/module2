package service.constructor;

import entity.Account;

public class AcountConstructor {
    private int id;

    private String email;

    private String fullName;

    private String password;

    private String type;

    public AcountConstructor withId(int id) {
        this.id = id;
        return this;
    }

    public AcountConstructor withEmail(String email) {
        this.email = email;
        return this;
    }

    public AcountConstructor withFullName(String name) {
        this.fullName = fullName;
        return this;
    }

    public AcountConstructor withPassword(String password) {
        this.password = password;
        return this;
    }

   public AcountConstructor withType(String type) {
        this.type = type;
        return this;
   }

    public Account consTructor() {
        return new Account(id, email, fullName, password, type);
    }
}
