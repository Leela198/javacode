package day21;

import java.util.Scanner;

/*Write a Java program to create a method that 
 * takes an integer as a parameter and 
 * throws an exception if the number is odd.package day21;*/

 
 

public class IntExceptionDemo
{

	public static void main(String[] args)
	{
		IntExceptionDemo ied=new IntExceptionDemo();
		ied.div();
		
	}
void div()
{int a = 0;
	try

{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value for a");
	 a=sc.nextInt();
	if((a%2)==0)
	{
		
		System.out.println("number is even");
} 
sc.close();	
}
	catch(IllegalArgumentException ie)
	{
		throw new IllegalArgumentException(a+ " is odd.");

}


}	

}
