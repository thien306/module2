
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Date>classOrder = new HashMap<>();
        classOrder.put("thien", new Date(2023, 8, 29, 8, 50, 6));
        classOrder.put("ali", new Date(2023, 8, 29, 8, 20, 5));
        classOrder.put("quoc", new Date(2023, 8, 29, 8, 10, 3));
        classOrder.put("tho", new Date(2023, 8, 29, 8, 40, 9));

        Set<String> keys = classOrder.keySet();
        Map<String, Integer> lateList = new HashMap<>();
        Date specificTime = new Date(2023, 8, 29, 8, 5);

        for (String key : keys) {
            Date studentTime = classOrder.get(key);
            if (classOrder.get(key).after(specificTime)) {
                int delayTime = studentTime.getMinutes() - specificTime.getMinutes();
                lateList.put(key,2000 * delayTime);
            }
        }
        System.out.println(lateList);
    }
}