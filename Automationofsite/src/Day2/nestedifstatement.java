package Day2;

public class nestedifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find bigger number from 3 variables
		
		int a=90;
		int b=60;
		int c=120;
		if (a>b) 
			if (a>c) {
				System.out.println("The bigger number is a");
			} else {
				System.out.println("The bigger number is c");
			} else if (c>b) {
				System.out.println("The bigger number is c");
			} else {
				System.out.println("The bigger number is b");
				
				
				
			}
		}

	}


