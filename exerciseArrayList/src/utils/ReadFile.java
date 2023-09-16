package utils;

import emun.UserRole;
import entity.Customer;
import entity.Product;
import entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static List<String> readFile(String path) {
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return strings;
    }

    public static List<Product> readProductList(String path) {
        List<String> strings = readFile(path);
        List<Product> productList = new ArrayList<>();
        String[] info;
        for (String str : strings) {
            info = str.split(",");
            productList.add(new Product(Long.parseLong(info[0]),info[1],Long.parseLong(info[2]),Integer.parseInt(info[3]),Long.parseLong(info[4])));
        }
        return productList;
    }

    public static List<User> readUserList(String path) {
        List<String> customerList = readFile(path);
        List<User> userList = new ArrayList<>();
        String[] info;
        for (String str : customerList) {
            info = str.split(",");

            userList.add(new User(info[0],info[1], UserRole.valueOf(info[2])));
        }
        return userList;
    }
}
