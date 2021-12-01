import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int iDay = in.nextInt();
        int iMonth = in.nextInt();
        int iYear = in.nextInt();
        
        int fDay = in.nextInt();
        int fMonth = in.nextInt();
        int fYear = in.nextInt();
        
        int fine = 0;
        
        if (iYear == fYear) {
            if (iMonth > fMonth) {
                fine = (iMonth - fMonth) * 500;
            } else if (iMonth == fMonth && iDay > fDay){
                fine = (iDay - fDay) * 15;
            } 
        } else if (iYear > fYear) fine = 10000;
        
        System.out.println(fine);
    }
}