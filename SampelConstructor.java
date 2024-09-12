package day15;
/*Chaining Constructors
Write a Java program to create a class called Student with instance variables studentId,
 studentName, and grade. Implement a default constructor and a parameterized constructor 
 that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.*/


public class SampelConstructor
{
	int stuid;
	String studentname;
	char grade;

	SampelConstructor()
	{
		
		System.out.println(" Non  parameterized constructor");
		System.out.println("student id  "+stuid);
		System.out.println("student name  "+studentname);
		System.out.println("student grade1  "+grade);
	}

	SampelConstructor(int sid,String name1,char grade1)
	{
		this();
		System.out.println("parameterized constructor");
		System.out.println("student id  "+sid);
		System.out.println("student name   "+name1);
		System.out.println("student grade1  "+grade1);
		
	}
	public static void main(String[] args)
	{
		SampelConstructor scs=new SampelConstructor(20,"shresta",'A');
	}
}


