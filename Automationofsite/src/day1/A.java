package day1;

public class A extends Abstraction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A ob=new A();
ob.Addition();
ob.subtraction();
ob.division();
ob.digits();
	}
	public void Addition() {
		subtraction();
	}
	//1-Public Methods are available within the class
	//2-Public Methods are available for other classes within the package
	//3 Public Methods are available for classes of the other pakages
	
	private void subtraction() {
	System.out.println("This to print private method");	
	}
	//1- Private Methods are available within the same class only 
	//2- Private Methods are not available for other classes in the same package
	//3- Private Methods are not accessible for other classes in other packages
	
	protected void division() {
		
	}
	//1-Protected Methods are available within the same package
	//2-Protected Methods are available within same package
	//3-Protected Methods are not available for classes of other packages
	
	//Default Access
	void digits() {
	//1- Default methods have access within the class
	//2- Default methods are available within the same package
	//3-Default methods are not accessible for classes that are in other packages
		
		
		// Encapsulation:we call private method in public method of the same class
		//Global variable:we define them outside the method and use (this.d) to differentiate
		//global and local variable
	}
	@Override
	public void addition(int d) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float addition() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
