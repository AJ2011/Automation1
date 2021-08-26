
public class Staticandnonstaticmethod {

	public static void main(String[] args) {
		/* to create an object,
		NameoftheClass NameoftheObject=new Constructor of the class*/
		NONStatic ob= new NONStatic();
				
	}
	//static method go with static word,non static is without method
	
	public int MonthWithReturn(int Revenue,int Expenses,String Month) {
		int Profit=Revenue-Expenses;
		System.out.println("Profit for the month "+Month+ "="+Profit);
		return Profit;
}
}