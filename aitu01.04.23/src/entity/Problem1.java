package entity;

public class Problem1 {
    //num1
    public static int findMin(int n, int[] arr) {


        if (n == 1) {
            return arr[0];
        }


        if (findMin(n - 1, arr) < arr[n - 1]) {
            return findMin(n - 1, arr);
        } else {
            return arr[n - 1];

        }


    }
}
