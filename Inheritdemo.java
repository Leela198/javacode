package day12;

class Vehicel// super class
{
	 void drive()
	{
		System.out.println("reparing car");
	}
}
class Car extends Vehicel //parent class
{
	 void repair()
	{
	System.out.println("reparing Vehicel");
}
}
public class Inheritdemo extends Car // sub class or child class
{
	static void bill()
	{
		System.out.println("bill generated");
	}
	public static void main(String[] args)
	{
		Inheritdemo i1=new Inheritdemo();
		i1.drive();
		i1.repair();
		bill();
	}
	

}
