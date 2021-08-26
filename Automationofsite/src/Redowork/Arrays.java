package Redowork;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays
		int [] Students= new int [10];
		String [] Teachers = new String [100];
		float [] price = new float[1000];
		
		
		Students[0]=100;
		Students[3]=78;
		Students[7]=990;
		/*Students[29]=2300;//runtime error,Java couldn't catch it at compile time
		Java will catch it on runtime(logical error)*/
		System.out.println(Students[0]);
		System.out.println(Students[3]);
		System.out.println(Students[7]);
		System.out.println(Teachers[6]);//we didn't declare the value for teachers
	    //in String it will print the default value'Null', for float'0.0',for int'0'
		System.out.println(price[57]);//we didn't declare value for Price
		
		System.out.println(Students);//we can't call it as by the name,must give index #
		System.out.println(Students.length);//length is the size of the Arrays
		//i will be the index number,either i<10 or i<=9
		for(int i=0;i<=9;i++) {
			System.out.println("Students["+i+"]"+Students[i]);
		
			/*For each loop only design for Arrays,we don't have to declare any i,
			no increment,decrement value, it automatically adjust size of the Arrays
			It uses keyword for and data type and Stu (another variable)*/
			for(int Stu:Students)
			System.out.println(Stu);
		}
		int[][] Computer= new int [3][6];
		Computer[0][2]=150;
		System.out.println(Computer[0][2]);
			

	}

}
