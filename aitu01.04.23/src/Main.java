import entity.*;

import java.util.Objects;
import java.util.Scanner;

public class Main {







    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int a = scanner.nextInt();
        int n = scanner.nextInt();
       ;*/



        /*if(isConsistDigit(str).equals(true)){
            System.out.println("YES");
        }
        else System.out.println("NO");*/
       /* int num = scanner.nextInt();
        System.out.println(fib(num));*/
      /*  int n = scanner.nextInt();
        int k= scanner.nextInt();
        System.out.println(findGcd(n,k));
        System.out.println(n%k);*/

       /* for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }*/


        boolean flag = true;

        while (flag == true) {
            System.out.println("""
                    MAIN MENU:(CHOOSE PROBLEM)
                    1. Problem1
                    2. Problem2
                    3. Problem3
                    4. Problem4
                    5. Problem5
                    6. Problem6
                    7. Problem7
                    8. Problem8
                    9. Problem9
                    10. Problem10
                    11. EXIT
                    """);
            int choose = scanner.nextInt();

            if (choose == 1) {
                System.out.println("Enter the number");
                int n = scanner.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the array with " + n + " elements!");
                for (int i = 0; i < n; i++) {
                    int num = scanner.nextInt();
                    arr[i] = num;
                }
                int answer1 = Problem1.findMin(n, arr);
                System.out.println("ANSWER FOR PROBLEM NUM " + choose + " is " + answer1);

            }
            if (choose == 2) {
                System.out.println("Enter the number");
                int n = scanner.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the array with " + n + " elements!");
                for (int i = 0; i < n; i++) {
                    int num = scanner.nextInt();
                    arr[i] = num;
                }
                Double answer2 = Problem2.averageOfElem(n, arr);
                System.out.println("Average element is " + answer2);
            }
            if (choose == 3) {
                System.out.println("Enter the number ");
                int n = scanner.nextInt();
                String answer3 = Problem3.primeCheck(n);
                System.out.println("The number is " + answer3);
            }
            if (choose == 4) {
                System.out.println("Enter the number ");
                int n = scanner.nextInt();
                Integer answer4 = Problem4.findFactorial(n);
                System.out.println("The factorial is " + answer4);
            }
            if (choose == 5) {
                System.out.println("Enter the number ");
                int n = scanner.nextInt();
                Integer answer5 = Problem5.fib(n);
                System.out.println("The fibonacci number is " + answer5);
            }
            if (choose == 6) {
                System.out.println("Enter the 2 numbers ");
                int n = scanner.nextInt();
                int a = scanner.nextInt();
                Integer answer6 = Problem6.powRecursion(a, n);
                System.out.println("Answer: " + answer6);
            }
            if (choose == 7) {
                System.out.println("Enter symbols ");
                String str = scanner.nextLine();
                char[] value = str.toCharArray();
                Problem7.permutations(value, 0);
            }
            if (choose == 8) {
                System.out.println("Enter string ");
                String str = scanner.nextLine();
                var answer8 = Problem8.isConsistDigit(str);
                System.out.println("Asnwer " + answer8);
            }
            if (choose == 9) {
                System.out.println("Enter the 2 numbers ");
                Integer n = scanner.nextInt();
                Integer k = scanner.nextInt();
                var answer9 = Problem9.findBinomCoefficient(n,k);
                System.out.println("Answer: " + answer9);
            }
            if (choose == 10) {
                System.out.println("Enter the 2 numbers ");
                Integer a = scanner.nextInt();
                Integer b = scanner.nextInt();
                Integer answer10 = Problem10.findGcd(a,b);
                System.out.println("Answer: " + answer10);
            }
            if (choose == 11) {
                flag = false;

            } else if (choose > 11) {
                System.out.println("Wrong value entered: code error 403");
            }
        }
        System.exit(0);
    }
}