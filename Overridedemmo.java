package day22;
class Test
{
	void m1()
	{
		System.out.println("super class method");
	}
	
}

public class Overridedemmo extends Test
{
	void m1() 
	{
		System.out.println("child class method");
	}
	public static void main(String[] args)
	{
		Overridedemmo o1=new Overridedemmo();
		o1.m1();
	}
}

