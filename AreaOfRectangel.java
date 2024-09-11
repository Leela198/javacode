package day11;
import java.util.Scanner;

public class AreaOfRectangel
{
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter length of rectangel");
			int l=sc.nextInt();
			System.out.println("enter breath of rectangel");
			int b=sc.nextInt();
			int r=l*b;
			System.out.println("area of rectangel is is"+r);
			
			sc.close();
		}

	}


