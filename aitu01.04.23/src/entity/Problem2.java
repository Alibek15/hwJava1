package entity;

public class Problem2 {
    //num2
    public static double averageOfElem(int n, int[] arr){
        if(n==1){
            return arr[0];
        }
        else{
            return (arr[n-1] + averageOfElem(n-1,arr) * (n-1)) /n;
        }
    }
}
