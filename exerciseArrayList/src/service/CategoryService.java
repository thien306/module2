package service;

import entity.Category;

import java.util.*;

public class CategoryService {
    public static Scanner input = new Scanner(System.in);
    private static final List<Category> categoryList = new ArrayList<>();
    private static long currentCategoryId = 1;


    public void addCategory() {
        long categoryId = currentCategoryId;
        String categoryName;

        do {
            System.out.print("Enter category name: ");
            categoryName = input.nextLine();

            if (categoryName.matches(".*\\d.*")) {
                System.out.println("Invalid input. Please enter a valid category name without numbers.");
            } else if (categoryName.trim().isEmpty()) {
                System.out.print("Category name cannot be empty");
            } else if (categoryNameExists(categoryName)) {
                System.out.println("Category name already exists. Please choose another name.");
            } else {
                Category newCategory = new Category(categoryId, categoryName);
                categoryList.add(newCategory);
                currentCategoryId++;
                System.out.println("Added category successfully");
                return;
            }
        } while (true);
    }

    public void showAllCategory() {
        if (categoryList.isEmpty()) {
            System.out.println("No categories found");
        } else {
            System.out.println("Categories:");
            categoryList.sort(Comparator.comparing(Category::getId));
            for (Category category : categoryList) {
                System.out.println(category);
            }
        }
    }

    public static Category findCategoryById(long id) {
        for (Category category : categoryList) {
            if (category.getId() == id) {
                System.out.println("Category ID: " + category.getId() + " - ");
                System.out.println("Category Name: " + category.getName() + ".");
                return category;
            }
        }
        return null;
    }

    public static Category findCategoryByName(String nameToFind) {
        for (Category category : categoryList) {
            if (Objects.equals(category.getName(), nameToFind)) {
                System.out.println(category);
                return category;
            }
        }
        return null;
    }

    public void deleteCategory() {
        System.out.print("Enter ID to delete category: ");
        long id = input.nextLong();
        input.nextLine();
        Category checkCategory = findCategoryById(id);

        if (checkCategory == null) {
            System.out.println("Category not found");
        } else {
            categoryList.remove(checkCategory);
            System.out.println("Delete category successfully");
        }
    }

    public void updateCatalog() {
        System.out.print("Enter ID to edit category: ");
        long id = input.nextLong();
        input.nextLine();
        Category categoryToEdit = findCategoryById(id);

        if (categoryToEdit == null) {
            System.out.print("Category not found");
        } else {
            System.out.println("Current category information: " + categoryToEdit);
            System.out.print("Enter new name: ");
            String newName = input.nextLine().trim();

            if (newName.isEmpty()) {
                System.out.print("Category name cannot be empty.");
            } else if (categoryNameExists(newName)) {
                System.out.print("Category name already exists. Please choose another name.");
            } else {
                categoryToEdit.setName(newName);
                System.out.println("Category updated successfully.");
            }
        }
    }

    private boolean categoryNameExists(String newName) {
        for (Category category : categoryList) {
            if (category.getName().equalsIgnoreCase(newName)) {
                return true;
            }
        }
        return false;
    }

    public void searchCategory() {
        String searchType;
        long idToFind;
        String nameToFind;
        do {
            System.out.print("Do you want to search by ID(id) or by name(name): ");
            searchType = input.nextLine();

            if (!searchType.equals("id") && !searchType.equals("name")) {
                System.out.println("Invalid input. Please enter 'id' or 'name'.");
            }
        } while (!searchType.equals("id") && !searchType.equals("name"));

        if (searchType.equals("id")) {
            System.out.print("Enter Category ID: ");
            idToFind = input.nextLong();
            input.nextLine();
            CategoryService.findCategoryById(idToFind);
        } else {
            System.out.print("Enter Category name: ");
            nameToFind = input.nextLine();
            CategoryService.findCategoryByName(nameToFind);
        }
    }

}
