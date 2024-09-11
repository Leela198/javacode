package day11;
import java.util.Scanner;

public class AreaOfTriangel 
{ 
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter base of triangel");
	int b=sc.nextInt();
	System.out.println("enter height of triangel");
	int h=sc.nextInt();
	float v=0.5f*b*h;
	System.out.println("area of triangel is"+v);
	sc.close();

}
}