package entity;

public class Problem4 {
    //num4
    public static Integer findFactorial(int n){
        if(n==2){
            return n;
        }
        else  return findFactorial(n-1)*n;
    }
}
