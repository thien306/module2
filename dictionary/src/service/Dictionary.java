package service;

import java.util.*;



public class Dictionary {
    private Map<String, String> dictionary = new TreeMap<>();

    static Scanner input = new Scanner(System.in);

    // Thêm từ
    public void addWords() {
        System.out.print("Enter the keyword you want to add: ");
        String keyword = input.nextLine();
        System.out.print("Enter the meaning of the keyword: ");
        String means = input.nextLine();
        this.dictionary.put(keyword, means);
    }

    // Xóa từ
    public String deleteWord(String keyword) {
        return this.dictionary.remove(keyword);
    }

    // Tra từ
    public String wordLookup() {
        System.out.print("Enter the keyword you want to look up: ");
        String keyword = input.nextLine();

        String result = this.dictionary.get(keyword);
        if (result != null) {
            System.out.println("Meaning: " + result);
        } else {
            System.out.println("Keyword not found.");
        }
        return result;
    }

    // In danh sách từ khóa
    public void printResults() {
        Set<String> keywords = this.dictionary.keySet();
        for (String keyword : keywords) {
            System.out.println("Keyword: " + keyword + ", Meaning: " + this.dictionary.get(keyword));
        }
    }

    // In số lượng từ
    public int quantity() {
        int count = this.dictionary.size();
        System.out.println("The number of keywords is " + count);
        return count;
    }

    // Xóa tất cả từ
    public void deleteAll() {
        this.dictionary.clear();
        System.out.println("All keywords have been deleted.");
    }
}
