import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("D:\\codegym\\modul 2\\file\\Data/file.txt");
            pw.println("hello");
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}