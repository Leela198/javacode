package day11;
import java.util.Scanner;
public class CircumSquare 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  side length of square");
	int sl=sc.nextInt();
	int perimeter=4*sl;
	System.out.println("perimeter of square is "+perimeter);
	sc.close();
	
}
}
