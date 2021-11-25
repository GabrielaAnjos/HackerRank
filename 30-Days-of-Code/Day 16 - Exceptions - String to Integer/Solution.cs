using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution
{
    public static void Main(string[] args)
    {
        string S = Console.ReadLine();
        
        try {
            int i = int.Parse(S);
            Console.WriteLine(i);
            
        } catch (FormatException e) {
            Console.WriteLine("Bad String");
        }
    }
}
