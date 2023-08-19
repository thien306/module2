package service;

import entity.Manager;

public class ManagerService {
    private static Manager[] managersList = new Manager[5];

    private static int managersCount = 0;

    public static void addManagers(Manager manager, int index) {
        managersList[index] = manager;
        managersCount++;
    }

    public static void showAllManagers() {
        for (int index = 0; index < managersCount; index++) {
            if (managersList[index] != null) {
                System.out.println(managersList[index]);
            }
        }
    }

    public static void deleteManagers(int index) {
        managersList[index] = null;
    }

    public static void findManager(String name) {
        for (int index = 0; index < managersCount; index++) {
            if (managersList[index].getName().equals(name)) {
                System.out.println("information found: ");
                System.out.println(managersList[index]);
                return;
            }
        }
        System.out.println("No information found");
    }
}
