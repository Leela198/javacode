package day19;

public class MatheclassDemo 
{
public static void main(String[] args)
{
	final double pi=Math.PI;
	for(int i=0;i<10;i++)
	{
	double r=Math.random();
	System.out.println("radius of the circle is   "+r);
	double area=pi*r*r;
	System.out.println("area of the circel for radius --->   "+r+"*****is****"+area);
	}
	
}
}
