// Java program to illustrate default modifier
package p1;

// Class Geeks is having Default access modifier
class Geek
{
	void display()
	{
		System.out.println("Hello World!");
	}
}

//Java program to illustrate error while 
//using class from different package with 
//default modifier 
package p2; 
import p1.*; 

//This class is having default access modifier 
class GeekNew 
{ 
 public static void main(String args[]) 
 { 
     // Accessing class Geek from package p1 
     Geeks obj = new Geek(); 

     obj.display(); 
 } 
} 
//Java program to illustrate error while
//using class from different package with
//private modifier
package p1;

class A
{
private void display()
	{
		System.out.println("GeeksforGeeks");
	}
}

class B
{
public static void main(String args[])
	{
		A obj = new A();
		// Trying to access private method
		// of another class
		obj.display();
	}
}
//Java program to illustrate
//protected modifier
package p1;

//Class A
public class A
{
protected void display()
	{
		System.out.println("GeeksforGeeks");
	}
}
//Java program to illustrate
//protected modifier
package p2;
import p1.*; // importing all classes in package p1

//Class B is subclass of A
class B extends A
{
public static void main(String args[])
{
	B obj = new B();
	obj.display();
}
	
}
package p2;
import p1.*;
class B {
	public static void main(String args[])
	{
		A obj = new A;
		obj.display();
	}
}
//Java program to illustrate
//public modifier
package p1;
public class A
{
public void display()
	{
		System.out.println("GeeksforGeeks");
	}
}
