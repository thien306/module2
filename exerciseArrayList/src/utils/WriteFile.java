package utils;

import entity.Product;
import entity.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeCustomerFile(String path, List<Product> list) {
        StringBuilder data = new StringBuilder();
        for (Product product : list) {
            data.append(product.getInfo());
        }
        writeFile(path, data.toString());
    }


    public static void writeUserFile(String path, List<User> list) {
        StringBuilder data = new StringBuilder();
        for (User user : list) {
            data.append(user.getInfo());
        }
        writeFile(path, data.toString());
    }
}
