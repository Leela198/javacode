package day17;

public class BthisDemo 
{
	static int stu_id;
	static String name;
	static double gpa;
	BthisDemo(int stu_id,String name,double gpa)
	{
		this.stu_id=stu_id;
		this.name=name;
		this.gpa=gpa;
		
	}
	void printdetails()
	{
		System.out.println("after initialization  global values using This keyword");
		System.out.println(stu_id);
		System.out.println(name);
		System.out.println(gpa);
	}
	public static void main(String[] args)
	{
		
		System.out.println("before initialization default global values");
		System.out.println(stu_id);
		System.out.println(name);
		System.out.println(gpa);
		
		BthisDemo l1=new BthisDemo(1234,"xyzw",88.98);
		
		l1.printdetails();
		
	}

}
