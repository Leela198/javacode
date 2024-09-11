package day11;
import java.util.Scanner;
public class AreaOfSquare 
{ 
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("area of square is");
		System.out.println(" enter a value");
		int a=scan.nextInt();
		System.out.println("result is");
		int re=a*a;
		System.out.println(re);
		scan.close();
		
	}

}
