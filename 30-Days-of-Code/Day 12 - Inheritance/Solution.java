import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] scores;
    
    public Student(String firstName, String lastName, int idNum, int[] scores){
    super(firstName, lastName, idNum);
    
    this.scores = scores;
    
    
}

public char calculate() {
    int avg = 0;
    
    for (int i = 0; i < scores.length; i++)
        avg += scores[i];
    
    avg = avg / scores.length;
    
    if (avg < 40) return 'T';
    else if (avg < 55) return 'D';
    else if (avg < 70) return 'P';
    else if (avg < 80) return 'A';
    else if (avg < 90) return 'E';
    else return 'O';
    
}
}

class Solution {