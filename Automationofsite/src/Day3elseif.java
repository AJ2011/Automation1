
public class Day3elseif {

	public static void main(String[] args) {
	
	//if a students gets
		int computer=90;
		int linux=80;
		int software=70;
		int Addition=computer+linux+software;
		int avg=Addition/3;
		System.out.println(avg);
		
		//how to print grade for the student according to the average value
		if(avg>=90 && avg<=100) {
			System.out.println("The grade for the student=A");
		}else if(avg>=80 && avg<=89) {
			System.out.println("The grade for the student=B");
	}else if (avg>=70 && avg<=79) {
		System.out.println("The grade for the student=C");
	}else if (avg>=60 && avg<=69){
		System.out.println("The grade for the student=D");
	}
	else {
		System.out.println("Better luck next time");
		
		
		//find the bigger number from three variables
		// we use nested if statement
		//2 back to back if statements
		
		int a=90;
		int b=60;
		int c=100;
		
		if(a>b) 
			if(a>c) {
				System.out.println("The bigger number is a");
				
			} else {
				System.out.println("the bigger number is c");
			} else if(c>b) {
				System.out.println("The bigger number is c");
			} else {
				System.out.println("The bigger number is b");
			}
		//print out the value with while loop 1 to 100
		/*int f=100;
		while(f>=1) {
		System.out.println(f);
		f--;*/
		
		//Do while loop
		/*int i=1000;
		do {
			System.out.println(i);
			i++;
		}while(i<=100);*/
	}
		
		
		
		
	}	
		
		
	
	}
	
	


				
				
			
		
		
		
	
	
	


