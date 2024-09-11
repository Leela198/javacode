package basics;

public class Globdemo
{
	static int value;//global variabel
	
	 void update()
	{
		value=value+50;
		System.out.println("static method"+value);
		//System.out.println(value);
		
	}
 void update2()
 {
	 value=value+550;
	 
	 System.out.println("non static method");
	 System.out.println(value);
 }
 public static void main(String[] args)
 {
	value=3000;
	
	Globdemo g1=new Globdemo();
	g1.update2();
	g1.update();
	
 }
 
}
