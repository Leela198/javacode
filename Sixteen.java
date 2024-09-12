package day17;
class Soma
{ Soma()
	{
	System.out.println("Hello");
	}	
	
}

class Mona extends Soma
{ 
	Mona()
	{
	System.out.println("Hiii");
	}	
	
}

class Numa extends Mona
{ 
	Numa()
	{
	System.out.println("byee");
	}	
	
}
public class Sixteen
{
public static void main(String[] args)
{
	new Numa();
}
}
