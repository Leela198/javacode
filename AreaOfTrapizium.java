package day11;
import java.util.Scanner;
public class AreaOfTrapizium 
{
	public static void main(String[] args)
	{
		Scanner sca=new Scanner(System.in);
		System.out.println("area of trapizium is");
		System.out.println(" enter the l1 value");
		int l1=sca.nextInt();
		System.out.println(" enter the l2 value");
		int l2=sca.nextInt();
		System.out.println(" enter the height h value");
		int h=sca.nextInt();
		float result=0.5f*(l1+l2)*h;
		System.out.println(result);
		sca.close();
		
	}

}
