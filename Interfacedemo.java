package day18;
/*Write a Java program to create a Animal interface with a method called bark() 
 * that takes no arguments and returns void. 
 * Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
 */
interface Animal
{
	void bark();
}


public class Interfacedemo implements Animal
{

	public static void main(String[] args)
	{
		Interfacedemo id1=new Interfacedemo();
		
		id1.bark();
	}


	public void bark() 
	{
		
		System.out.println("dog is barking");
	}

}
