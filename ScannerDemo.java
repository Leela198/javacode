package day11;
import java.util.Scanner;

public class ScannerDemo
{
	static float pi=3.14f;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
		int r=sc.nextInt();
		
		float area=pi*(r*r);
		System.out.println("area of circle is"+area);
		
		sc.close();
	}

}
