package Redowork;

public class IfElseIfStatementCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Computer=90;
		int Linux=80;
		int Software=70;
		int Addition=Computer+Linux+Software;
		int Avg=Addition/3;
		System.out.println(Avg);
		
		//Print the grade for Student according to Average marks
		//if you put 2 condition
		
		if (Avg>=90 && Avg <=100) {
			System.out.println("The grade for the Student=A");
		} else if(Avg>=80 && Avg<=89) {
			System.out.println("The grade for the Student=B");
		} else if(Avg>=70 && Avg<=79) {
			System.out.println("The grade of the Student=C");
		} else if(Avg>=60 && Avg<=69) {
		System.out.println("The grade of the Student=D");
		} else {
			System.out.println("Better luck next time");
			
			}
		//Find the bigger number from 3 variables, Nested if Statement
		
		int d=90;
		int s=60;
		int h=100;
	
		//if d>s, if its true it will be executed,if not it will skip the code
		//if d>s and it is true then s is out of race, compare d with h
		if (d>s) 
		if (d>h) {
		System.out.println("The bigger number is d");//if it is false then h is greater
		
		} else {
		System.out.println("The bigger number is h");//if d>s is false then s>d,d is out
		
		} else if(h>s) {
			System.out.println("The bigger number is h");
			
		} else {
			System.out.println("The bigger number is s");//change the number & print value
		}
		
		
		
		
		
		
		
 
	}
	
	
	
	
	

}
