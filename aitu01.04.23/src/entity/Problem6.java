package entity;

public class Problem6 {
    //num6
    public static Integer powRecursion(int a, int n){
        if(n==0){
            return a=1;
        }
        else if(n==1){
            return a;
        }
        else if(n==2){
            return a*a;
        }
        else {
            return powRecursion(a,n-1)*a;
        }


    }
}
