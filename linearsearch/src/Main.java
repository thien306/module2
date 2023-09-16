import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date();
        List<Integer> mang = new ArrayList<>();
        for(int i= 0; i<10000; i++){
            mang.add(i);
        }
        for (int index = 0; index < mang.size(); index++) {
            if (mang.get(index) == 9999) {
                System.out.println(index);
                break;
            }
            System.out.println(index);
        }
        Date date2 = new Date();
        long duration = date2.getTime() - date1.getTime();
        System.out.println(duration);
    }
}