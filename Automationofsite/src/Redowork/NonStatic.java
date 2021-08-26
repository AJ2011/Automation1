package Redowork;

public class NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub, We have to create the object of the class
		/*to call nonstatic method in static method,
		Nameoftheclass name of the object = new Constractor */
		NonStatic ob=new NonStatic(500);
		ob.MonthWithReturn(100000, 60000, "March");
		

	}
    public void ProfitOfCompany() {
	int Revenue=50000;
	int Expenses=30000;
	int Profit=Revenue-Expenses;
     System.out.println(Profit);
}
//2- Method with Arguments

	public void Month(int Revenue,int Expenses,String Month) {
	int Profit=Revenue-Expenses;
	System.out.println("Profit for the month "+Month+ "="+Profit);
	}
	
	
	//3-Method with Return Type
	public int MonthWithReturn(int Revenue,int Expenses,String Month) {
		int Profit=Revenue-Expenses;
		System.out.println("Profit for the month "+Month+ "="+Profit);
		return Profit;	
	
	}//How to create constructor
	public NonStatic(int d ) {
		System.out.println("This is Constructor d="+d);
	}
	
	
}
