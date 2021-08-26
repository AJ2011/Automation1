
public class Nonstatic {

	public static void main(String[] args) {
	 /* to create an object,
		NameoftheClass NameoftheObject=new Constructor of the class*/
		Nonstatic ob= new Nonstatic(50);
		ob.MonthWithReturn(50000, 25000,"May");
				
	}
	
	//static method go with static word,non static is without method
	public static void profitofcompany() {
	int Revenue=100000;
	int Expenses=30000;
	int Profit=Revenue-Expenses;
	System.out.println(Profit);
	}
	public void  MonthWithReturn(int Revenue,int Expenses,String Month) {
		int Profit=Revenue-Expenses;
		System.out.println("Profit for the month "+Month+ "="+Profit);
	}
	public Nonstatic(int s) {
		System.out.println("The is constuctor s="+s);
	
	}
	

}
