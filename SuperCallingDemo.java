package day15;
class Person
{
	Person()
	{
		System.out.println("i am a peron");
	}
}
class Employee extends Person
{
	Employee(int sal)

	{
		super();//calling constructor in parent class Person
		System.out.println("i am employee my salary is "+sal);
	}
}
public class SuperCallingDemo extends Employee
{
	SuperCallingDemo(String name)
	{ 
		super(880000000); //calling constructor to parent class Employee
		System.out.println("child class constructor with para    "+name);	
	}
public static void main(String[] args)
{
	System.out.println(" u are at child class nd demonstrting SUPER calling stmt");
	SuperCallingDemo sc1=new SuperCallingDemo("Leela");
}
}
