package entity;

public class Problem7 {
    //num7


     public static void permutations(char[] str, int j){
         if( j== str.length){
             System.out.println(str);
         }
         else {
             for (int i = j; i < str.length; i++) {
                 for (int k = 0; k < str.length-1; k++) {
                     char variable = str[i];
                     str[i] = str[k];
                     str[k] = variable;
                 }
                 permutations(str, j + 1);
                 for (int k = 0; k < str.length-1; k++) {
                     char variable = str[i];
                     str[i] = str[k];
                     str[k] = variable;
                 }
             }
         }

     }
}
