using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        
        int num = int.Parse(Console.ReadLine());
        
        for (int i = 0; i < num; i++) {
            int n = int.Parse(Console.ReadLine());
            
            if (IsPrime(n))
                Console.WriteLine("Prime");
            else
                Console.WriteLine("Not prime");
            
        }
    }
    
    public static bool IsPrime(int n) {
        
        if (n < 2) return false;
            
        for (int j = 2; j * j <= n; j++) 
            if (n % j == 0) return false;                
        return true;
    }
}