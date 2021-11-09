import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        input.nextLine();
        
       for (int i = 0; i < n; i++) {
           String test = input.nextLine();
           char[] string = test.toCharArray();
           
           for (int j = 0; j < string.length; j++) {
               if (j % 2 == 0) {
                   System.out.print(string[j]);
               }
           }
           
           System.out.print(" ");
           
           for (int j = 0; j < s.length; j++) {
               if (j % 2 != 0) {
                   System.out.print(string[j]);
               }
           }
           System.out.println();
       } 
       
       input.close();
        
    }
}