package Redowork;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfitOfCompany();
		ProfitOfCompany();
		ProfitOfCompany();//we can call our method as much time we want
		
		Month(150000, 70000, "January");
		Month(170000, 60000, "Feburary");
		Month(200000, 100000, "March");
		
		int ProfitOfMarch=MonthWithReturn(250000, 150000, "March");
		System.out.println(ProfitOfMarch);
		

	}
	//Calculate the profit of the company Profit=Revenue-Expenses//
//1- Method without Arguments
	public static void ProfitOfCompany() {
		int Revenue=50000;
		int Expenses=30000;
		int Profit=Revenue-Expenses;
	System.out.println(Profit);//we have to call our method to the main method to execute
	
	
	
	} //2- Method with Arguments
	
	public static void Month(int Revenue,int Expenses,String Month) {
	int Profit=Revenue-Expenses;
	System.out.println("Profit for the month "+Month+ "="+Profit);
	}
	
	
	//3-Method with Return Type
	public static int MonthWithReturn(int Revenue,int Expenses,String Month) {
		int Profit=Revenue-Expenses;
		System.out.println("Profit for the month "+Month+ "="+Profit);
		return Profit;
	}
	
	
	
}


