package Check;

import emun.UserRole;
import entity.User;

import static service.UserService.userList;

public class CheckId {
    public static long getMaxClientId() {
        long maxClientId = 0;
        for (User user : userList) {
            if (user.getRole() == UserRole.client && user.getId() > maxClientId) {
                maxClientId = user.getId();
            }
        }
        return maxClientId;
    }

    public static long getMaxStaffId() {
        long maxStaffId = 0;
        for (User user : userList) {
            if (user.getRole() == UserRole.staff && user.getId() > maxStaffId) {
                maxStaffId = user.getId();
            }
        }
        return maxStaffId;
    }
}
