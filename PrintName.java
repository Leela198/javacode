package basics;

public class PrintName 
{
void name2()//name 2 times
{
	for(int i=1;i<3;i++)
	{
		System.out.println("leela");
	}
}
void name10() //name 10times
{
	for(int i=1;i<=10;i++)
	{
		System.out.println("leela");
	}
}
void zerototen()  //i value 0 to 10
{
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
	}
}
void tentozero()   // I VALUE 10 TO 0
{
	for(int i=10;i>=0;i--)
	{
		System.out.println(i);
	}
}
void negapos()  //PRINTS FROM -5 TO 5
{
	for(int i=-5;i<=5;i++)
	{
		System.out.println(i);
	}
}
public static void main(String[] args)
	{
	PrintName p1=new PrintName();
	System.out.println("***********prints name 2 times***********");
	p1.name2();
	System.out.println("***********prints name 10 times***********");
	p1.name10();
	System.out.println("***********prints i value from 0 to  10 times***********");
	p1.zerototen();
	System.out.println("***********prints i value from 10 to  0 times***********");
	p1.tentozero();
	System.out.println("***********prints i value from -5 to  5 times***********");
	p1.negapos();
	
	}


}
