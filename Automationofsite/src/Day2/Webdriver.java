package Day2;

public interface Webdriver extends Browser {
public void multiplication();/*Interface is a collection of abstract method 
         //thats why it will not ask about the abstract keyword in the class
// interface is use to achieve 100% abstraction in Java.
we use multiple inheritance in interfaces
We can use implement keyword to inherit other class
interface is not allowing to use non-abstract method
you cannot be able to create object of the interface
we can implement multiple interfaces at the same time unlike the inheritance
we can extend a class while implementing multiple interfaces
We can inherit 2 interface by keyword extends and can inherit a class 
by keyword implement */

/*public void addition() {
	// non abstract class is not allowed in interface, it will through an error
}*/

//Webdriver bp=new Webdriver(); we cannot create the object of the interface


}



