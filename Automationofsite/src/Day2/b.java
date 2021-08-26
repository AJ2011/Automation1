package Day2;

import day1.A;

public class b extends A {
private int a;
private int b;    // a,b,c are private variables as global variables
private int c;

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
b ob=new b();
ob.setA(500);
int d=ob.getA();
System.out.println(d);
ob.Addition();

}
	

	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getB() {
	return b;
	}
//Webdriver bp= new webdriver(); we cannot create object of the interface

public void setC(int c) {
	this.c = c;
}
public int getC() {
	return c;
}
@Override
public void Addition() {
	System.out.println("This is overriding");
}


}
