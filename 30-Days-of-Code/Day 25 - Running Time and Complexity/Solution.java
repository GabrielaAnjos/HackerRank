import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);;
        
        int num = in.nextInt();
    
    for (int i = 0; i < num; i++) {
        int n = in.nextInt();
        
        int flag = 0;
                
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                flag = 1;
                break;
            }
        }
        
        if (flag == 1 || n == 1) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime");      
        }   
    }
    }
}