package entity;

import java.util.Objects;

public class Problem8 {
    //num8
    public static Boolean isConsistDigit(String s){
        if(Objects.nonNull(s.length())){
            return true;
        }
        else {
            if (Character.isDigit(s.charAt(0))) {
                return isConsistDigit(s.substring(1));
            } else {
                return false;
            }
        }
    }
}
