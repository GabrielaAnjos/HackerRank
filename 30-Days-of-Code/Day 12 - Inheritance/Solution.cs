using System;
using System.Linq;

class Person{
	protected string firstName;
	protected string lastName;
	protected int id;
	
	public Person(){}
	public Person(string firstName, string lastName, int identification){
			this.firstName = firstName;
			this.lastName = lastName;
			this.id = identification;
	}
	public void printPerson(){
		Console.WriteLine("Name: " + lastName + ", " + firstName + "\nID: " + id); 
	}
}

class Student : Person {
    int[] testScores;  
  
    public Student(string firstName, string lastName, int id, int[] testScores) : base(firstName, lastName, id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.testScores = testScores;
    }
    
    public char Calculate() {
        int total = 0;
        
        foreach (int testScore in testScores)
            total += testScore;
            
        int avg = total / testScores.Length;
        
        if (avg < 40) return 'T';
        else if (avg < 55) return 'D';
        else if (avg < 70) return 'P';
        else if (avg < 80) return 'A';
        else if (avg < 90) return 'E';
        else return 'O';
        
    }
    
}

class Solution {