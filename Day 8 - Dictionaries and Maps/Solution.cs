using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        
        var n = int.Parse(Console.ReadLine());
        Dictionary<string, int> phoneBook = new Dictionary<string, int>();
        string inputName;
        
        for (int i = 0; i < n; i++){
            var contactArr = Console.ReadLine().Split(' ');
            var name = contactArr[0];
            var phone = int.Parse(contactArr[1]);
            phoneBook.Add(name, phone);
        }
        
        while ((inputName = Console.ReadLine()) != null){
            if (phoneBook.ContainsKey(inputName)){
                var phoneNumber = phoneBook[inputName];
                Console.WriteLine($"{inputName}={phoneNumber}");
            } else {
                Console.WriteLine("Not found");
            }
        }
        
    }
}
 