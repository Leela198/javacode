package day11;
import java.util.Scanner;

public class CircumRect
{
	public static void main(String[] args)
	{
		Scanner scc=new Scanner(System.in);
		System.out.println("enter length L");
		int l=scc.nextInt();
		System.out.println("enter breadth B");
		int b=scc.nextInt();
		System.out.println("circumference of rectangel is");
		int result=2*(l+b);
		System.out.println(result);
		scc.close();
	}

}
