package regex;

import ConstType.ConstRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckName {
    private static boolean isMameRegex(String validate, String type) {
        Pattern pattern = Pattern.compile(type);
        Matcher matcher = pattern.matcher(validate);
        return matcher.matches();
    }

    public static boolean isName(String validate, String type) {
        if (validate.isEmpty()) {
            return false;
        }
        if (!isMameRegex(validate, type)) {
            return false;
        }
        return true;
    }
}
