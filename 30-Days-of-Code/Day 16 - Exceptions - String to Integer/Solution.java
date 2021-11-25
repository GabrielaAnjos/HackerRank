import java.util.Scanner;
import java.lang.*;


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
            Integer integer = Integer.parseInt(S);
            System.out.println(integer);
            
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Bad String");
        }

        in.close();
    }
}
