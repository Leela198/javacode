package day11;
import java.util.Scanner;

public class CircumCircel 
{
 public static void main(String[] args)
 {
	 Scanner scc=new Scanner(System.in);
	 System.out.println("enter radius");
	 int r=scc.nextInt();
	 System.out.println("circumference of circle is");
	 float result=2*3.14f*r;
	 System.out.println(result);
	 scc.close();
	 
 }
}
