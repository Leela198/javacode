package day15;
 
class A
{
	A()
	{
		System.out.println(" grandparent constructor");
	}
}
class B extends A
{  
	void add()
	{
	int a=20;
	int b=40;
	System.out.println(" sum is  "+(a+b));
	}
	
	B()
	{
		System.out.println(" Parent constructor");
	}
}
public class InheritConstructor extends B
{
	
	InheritConstructor()
	{
		System.out.println(" Child  constructor");
	}
	public static void main(String[] args)
	{
		InheritConstructor i1=new InheritConstructor();
		i1.add();
	}

}
