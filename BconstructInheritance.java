package day17;
class L
{
	L()
	{
		System.out.println("grand parent");
	}
}

class M extends L
{
	M()
	{
		System.out.println("Parent");
	}
	void add()
	{
		int l=20;
		int m=30;
		System.out.println("addition of 2 numbers"+(l+m));
	}
}

public class BconstructInheritance  extends M
{
	BconstructInheritance()
	{
		System.out.println("child class");
	}
	
public static void main(String[] args)
{
	BconstructInheritance  l1=new BconstructInheritance();
	l1.add();
	
}
}
