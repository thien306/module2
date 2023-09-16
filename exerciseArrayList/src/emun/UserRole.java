package emun;

public enum UserRole {
    manage,

    staff,


    client;

    public static UserRole fromString(String roleInput) throws Exception {
        try {
            UserRole userRole = null;
            if (roleInput != null) {
                userRole = valueOf(roleInput);
            }
            return userRole;
        } catch (Exception e) {
            throw new Exception("Invalid role. Please select either ADMIN or CUSTOMER.");
        }
    }

}


