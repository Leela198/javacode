package day21;
import java.util.Scanner;

public class ExceptionDemo
{

	public static void main(String[] args) 
	{
		System.out.println("program si started");
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("invalid input....");
		}
		System.out.println("program is completed");
		System.out.println("program is exited");
		sc.close();

	}

}
