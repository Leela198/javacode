package basics;

public class Areaofcircle
{
	float pi=3.14f;
	void circle1() 
	{	int r=7;
		Areaofcircle a1=new Areaofcircle();
		double  aof= a1.pi*r*r;
		System.out.println(aof);
	}
	void circle2() 
	{	int r=12;
		//Areaofcircle a1=new Areaofcircle();
		double  aof= pi*r*r;
		System.out.println(aof);
	}
	void circle3() 
	{	int r=22;
		Areaofcircle a1=new Areaofcircle();
		double  aof= a1.pi*r*r;
		System.out.println(aof);
	}
	void circle4() 
	{	int r=8;
		Areaofcircle a1=new Areaofcircle();
		double  aof= a1.pi*r*r;
		System.out.println(aof);
	}

	public static void main(String[] args)
	{
		Areaofcircle a11=new Areaofcircle();
		a11.circle1();
		a11.circle2();
		a11.circle3();
		a11.circle4();
		
	}
}
