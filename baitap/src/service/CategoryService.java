package service;

import entity.Category;

public class CategoryService {
    private static Category[] categoryList = new Category[5];

    public static void addCategory(Category category, int index) {
        categoryList[index] = category;
    }

    public static void showAllCategory() {
        for (int index = 0; index < categoryList.length; index++) {
            if ( categoryList[index] != null) {
                System.out.println(categoryList[index]);
            }
        }
        System.out.println();
    }

    public static void deleteCategory(int index) {
        categoryList[index] = null;
    }
}