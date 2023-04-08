package entity;

public class Problem3 {
    //num3
    public static String primeCheck(int n){
        if(n%(n/2)==0){
            return "Composite";
        }

         primeCheck(n-1);
       return "Prime";
    }
}
