
public class methods {
static int d=6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		profitofcompany();
		profitofcompany();
		profitofcompany();
		profitofcompany();
		profitofcompany();
		Month(10000, 2000,"January");
		Month(50000, 30000, "feburary");
		Month(60000, 35000, "March");
		int ProfitOfMarch=MonthWithReturn(60000, 35000,"March");
		System.out.println(ProfitOfMarch);
		methods.ob=new methods();
		ob.profi
		ob.Month
		
		
	}
		
		
		//how to create a method
		
		//Calculate the profit of a company=revenue-expences
	// way #1 Method without arguments
	
	public static void profitofcompany() {
		int Revenue=100000;
		int Expenses=30000;
		int Profit=Revenue-Expenses;
		System.out.println(Profit);
		int d=6000;
		this.d=60000;
		System.out.println(this.d);
	
	
	
	
	}
		// 2-Method with arguments
		public static void Month(int Revenue,int Expenses,String Month) {
			int Profit=Revenue-Expenses;
			System.out.println("Profit for the month "+Month+ "="+Profit);
		}
			
			
			//Way#3 Methods with Return Value
			//What to do if we want to save
			public static int MonthWithReturn(int Revenue,int Expenses,String Month) {
				int Profit=Revenue-Expenses;
				System.out.println("Profit for the month "+Month+ "="+Profit);
				return Profit;
			}


				
			
		}
		
		
	
	
		

	


