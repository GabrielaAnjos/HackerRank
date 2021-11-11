import java.io.*;
import java.util.*;
import java.math.*;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int i = 0; i < arr.length / 2; i++){
            int newArr = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = newArr;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}