package service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class DefaultHandlingCode {

    public static int getMaxIdDefault(List<Integer> listIdDefault) {
        int max = listIdDefault.get(0);
        for (int index = 1; index < listIdDefault.size(); index++) {
            if (max < listIdDefault.get(index)) {
                max = listIdDefault.get(index);
            }
        }
        return max;
    }

    public static boolean writeDefaultId(int id, String path) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(path, true);
            bw = new BufferedWriter(fw);
            bw.write(String.valueOf(id));
            bw.newLine();
        } catch (Exception e) {
            return false;
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (Exception e) {
                    return false;
                }
            } if ( fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }
}
