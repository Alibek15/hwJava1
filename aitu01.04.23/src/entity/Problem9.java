package entity;

public class Problem9 {
    //num9
    public static long findBinomCoefficient(int n, int k){
        if( n==k || k==0){
            return 1;
        }
        else {
            return findBinomCoefficient(n - 1, k - 1) + findBinomCoefficient(n - 1, k);
        }
    }
}
