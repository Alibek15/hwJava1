package entity;

public class Problem10 {
    //num 10
    public static Integer findGcd(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return findGcd(b % a, a);
        }
    }
}
