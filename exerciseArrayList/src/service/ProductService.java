package service;

import entity.Category;
import entity.Product;
import entity.User;
import entity.Variant;
import utils.ReadFile;
import utils.WriteFile;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

public class ProductService {
    private static final Scanner input = new Scanner(System.in);
    private static final List<Product> productList = new ArrayList<>(ReadFile.readProductList("src/data/product.csv"));
    private static final Map<Long, Long> currentProductIds = new HashMap<>();

    public void addProduct() {
        long productPrice;
        long categoryId;
        String productName;

        do {
            System.out.print("Enter new product name: ");
            productName = input.nextLine().trim();

            if (!Pattern.matches("^[\\p{L}\\s]*$", productName)) {
                System.out.print("Invalid input. Product name should contain only alphabetic characters and spaces.");
            } else if (productName.matches(".*\\d.*")) {
                System.out.println("Invalid input. Please enter a valid product name without numbers.");
            } else if (productName.trim().isEmpty()) {
                System.out.print("product name cannot be empty");
            }
        } while (!Pattern.matches("^[\\p{L}\\s]*$", productName));

        do {
            System.out.print("Enter price: ");
            while (!input.hasNextLong()) {
                System.out.print("Invalid input. Enter a positive integer for price: ");
                input.next();
            }
            productPrice = input.nextLong();
            input.nextLine();
        } while (productPrice <= 0);

        do {
            System.out.print("Enter category ID: ");
            while (!input.hasNextLong()) {
                System.out.print("Invalid input. Enter a positive integer for category ID: ");
                input.next();
            }
            categoryId = input.nextLong();
            input.nextLine();
        } while (categoryId <= 0);

        Category category = CategoryService.findCategoryById(categoryId);

        if (category != null) {
            long currentProductId = currentProductIds.getOrDefault(categoryId, 0L) + 1;
            currentProductIds.put(categoryId, currentProductId);

            Product newProduct = new Product(currentProductId, productName, productPrice, categoryId);
            productList.add(newProduct);
            WriteFile.writeCustomerFile("src/data/product.csv",productList);

            System.out.println("Product created successfully");
        } else {
            System.out.println("Product category not found. You need to create a category for the products to be linked.");
        }
    }

    public void createAVariantList() {
        if (!productList.isEmpty()) {
            for (Product product : productList) {
                List<Variant> variantList = Product.getVariants();
                assert variantList != null;
                variantList.clear();

                String[] size = {"S", "M", "L", "XL"};
                String[] color = {"black", "white", "red", "gray", "yellow", "blue"};

                int randomSizeAndColor = ThreadLocalRandom.current().nextInt(1, color.length);
                int variantId = 1;

                for (int sizeIndex = 0; sizeIndex < size.length; sizeIndex++) {
                    for (int colorIndex = 0; colorIndex < randomSizeAndColor; colorIndex++) {
                        Variant variant = new Variant(variantId, size[sizeIndex], color[colorIndex]);
                        variant.setVariantPrice(randomPriceForVariants());
                        variantList.add(variant);
                        variantId++;
                    }
                }
            }
        }
    }

    private long randomPriceForVariants() {
        return ThreadLocalRandom.current().nextLong(-10, 10);
    }

    public void showAllProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products");
        } else {
            for (Product product : productList) {
                System.out.print("ID: " + product.getId() + " - ");
                System.out.print("Name: " + product.getName() + " - ");
                System.out.print("Price: " + product.getPrice());
                System.out.println();
            }
        }
    }

    public void deleteProduct() {
        System.out.print("Enter product ID: ");
        Product checkProduct = findProducts();

        if (checkProduct == null) {
            System.out.println("No products found");
        } else {
            productList.remove(checkProduct);
            System.out.println("Product with ID " + checkProduct.getId() + " has been deleted.");
        }
    }

    public static Product findProducts() {
        while (true) {
            String search;
            do {
                System.out.print("Do you want to search by ID(id) or by name(name): ");
                search = input.nextLine();

                if (!search.equals("id") && !search.equals("name")) {
                    System.out.println("Invalid input. Please enter 'id' or 'name'.");
                }
            } while (!search.equals("id") && !search.equals("name"));

            try {
                if (search.equals("id")) {
                    long categoryIdToFind;
                    do {
                        System.out.print("Enter category ID: ");
                        while (!input.hasNextLong()) {
                            System.out.print("Invalid input. Enter a positive integer for category ID: ");
                            input.next();
                        }
                        categoryIdToFind = input.nextLong();
                        input.nextLine();
                    } while (categoryIdToFind <= 0);

                    System.out.print("Enter the product ID (or 0 to cancel): ");
                    long productIdToFind;

                    while (true) {
                        while (!input.hasNextLong()) {
                            System.out.print("Invalid input. Enter a positive integer for product  ID: ");
                            input.next();
                        }
                        productIdToFind = input.nextLong();
                        input.nextLine();

                        if (productIdToFind == 0) {
                            System.out.print("Cancelled. ");
                            return null;
                        }

                        if (productIdToFind > 0) {
                            break;
                        } else {
                            System.out.print("Invalid input. Enter a positive integer for product ID: ");
                        }
                    }

                    for (Product product : productList) {
                        if (product.getId() == productIdToFind && product.getCateId() == categoryIdToFind) {
                            System.out.println(product);
                            return product;
                        }
                    }
                    System.out.println("No products found with ID " + productIdToFind + " in category ID " + categoryIdToFind);

                } else if (search.equals("name")) {
                    System.out.print("Enter Category name: ");
                    String nameToFind = input.nextLine();
                    Category foundCategory = CategoryService.findCategoryByName(nameToFind);

                    if (foundCategory == null) {
                        System.out.println("Category not found.");
                        continue;
                    }

                    System.out.print("Enter product name (or 0 to cancel): ");
                    String name = input.nextLine();

                    if (name.equals("0")) {
                        System.out.println("Cancelled. ");
                        return null;
                    }

                    boolean productFound = false;
                    for (Product product : productList) {
                        if (product.getName().equalsIgnoreCase(name)) {
                            System.out.println(product);
                            productFound = true;
                            break;
                        }
                    }

                    if (!productFound) {
                        System.out.println("No products found with name " + name);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid product ID (or 0 to cancel): ");
            }
        }
    }

    public static int inputInt(Scanner input) {
        int number = 0;
        boolean validInput = false;

        do {
            if (input.hasNextInt()) {
                number = input.nextInt();
                validInput = true;
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                input.nextLine();
            }
        } while (!validInput);
        return number;
    }

    public void updateProduct() {
        Product checkProduct = findProducts();

        if (checkProduct == null) {
            System.out.println("Product not found");
        } else {
            System.out.print("Enter new price: ");
            long newPrice = inputInt(input);

            System.out.print("Enter new category ID: ");
            long newCateId = inputInt(input);

            String newName = null;
            boolean isNameUpdated = false;
            do {
                System.out.print("Enter new product name: ");
                input.nextLine();
                String userInput = input.nextLine().trim();

                if (userInput.isEmpty()) {
                    break;
                }

                if (!Pattern.matches("^[\\p{L}\\s]*$", userInput)) {
                        System.out.print("Invalid input. Product name should contain only alphabetic characters and spaces.");
                } else if (userInput.matches(".*\\d.*")) {
                    System.out.println("Invalid input. Please enter a valid product name without numbers.");
                } else if (userInput.trim().isEmpty()) {
                    System.out.print("Product name cannot be empty");
                } else {
                    isNameUpdated = true;
                    newName = userInput;
                    break;
                }
            } while (true);

            if (newPrice == -1 || newCateId == -1) {
                System.out.print("Invalid input. Please enter valid values.");
                return;
            }

            if (isNameUpdated) {
                checkProduct.setName(newName);
            }

            if (newCateId != checkProduct.getCateId()) {
                checkProduct.setCateId(newCateId);
                if (Product.getVariants() != null) {
                    Product.getVariants().clear();
                }
            }

            checkProduct.setPrice(newPrice);
            if (isNameUpdated) {
                System.out.println("Product has been updated");
            }
            productList.sort(Comparator.comparing(Product::getCateId));
        }
    }


    public void SearchProductCategories() {
        String search;
        do {
            System.out.print("Do you want to search by ID(id) or by name(name): ");
            search = input.nextLine();

            if (!search.equals("id") && !search.equals("name")) {
                System.out.println("Invalid input. Please enter 'id' or 'name'.");
            }
        } while (!search.equals("id") && !search.equals("name"));

        if (search.equals("id")) {
            System.out.print("Enter Category ID: ");
            long idToFind = input.nextLong();
            input.nextLine();
            Category foundCategory = CategoryService.findCategoryById(idToFind);

            if (foundCategory != null) {
                List<Product> productCategory = new ArrayList<>();
                for (Product product : productList) {
                    if (product.getCateId() == idToFind) {
                        productCategory.add(product);
                    }
                }
                if (productCategory.isEmpty()) {
                    System.out.println("No products found in this category.");
                } else {
                    for (Product product : productCategory) {
                        System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
                    }
                }
            } else {
                System.out.println("Category not found.");
            }
        } else if (search.equals("name")) {
            System.out.print("Enter Category name: ");
            String nameToFind = input.nextLine();
            Category foundCategory = CategoryService.findCategoryByName(nameToFind);

            if (foundCategory != null) {
                List<Product> productCategory = new ArrayList<>();
                for (Product product : productList) {
                    if (product.getCateId() == foundCategory.getId()) {
                        productCategory.add(product);
                    }
                }
                if (productCategory.isEmpty()) {
                    System.out.println("No products found in this category.");
                } else {
                    for (Product product : productCategory) {
                        System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
                    }
                }
            } else {
                System.out.println("Category not found.");
            }
        }
    }
}

