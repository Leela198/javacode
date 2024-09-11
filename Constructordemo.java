package basics;

public class Constructordemo 
{
	void add(int a,int b)// non static method 1
	{
		int sum=a+b;
		System.out.println("non static sum of 2");
		System.out.println(sum);
	}
	void sub(int a,int b)// non static method 2
	{
		int sub=a-b;
		System.out.println("non static sub of 2");
		System.out.println(sub);
		
	}
	void add(int a,int b,int c)// non static method 3
	{
		int t=a+b+c;
		System.out.println("non static add of 3 numbers");
		System.out.println(t);
	}
	static void mul(int a,int b)//  static method 1
	{
		int r=a*b;
		System.out.println("satic methos mul of 2 numbers is");
		System.out.println(r);
	}
	static void mul(int a,int b,int c)// static method 2
	{
		int r=a*b*c;
		System.out.println("satic methos mul of3 numbers is");
		System.out.println(r);
	}
	static void div(int c,float d)//static method 3
	{
		float re=c%d;
		System.out.println("satic method div of variables is");
		System.out.println(re);
	}
	
	Constructordemo(float c,int a)//constructor 1
	{
		System.out.println(c);
	}
	Constructordemo(int c,float a)//constructor 2
	{
		float sal=c*a;
		System.out.println(sal);
	}
	Constructordemo(int a ,int b,int c)//constructor 3
	{
		if((a>b)&&(a>c))
		System.out.println("a is big");
		else if(b>c)
			System.out.println("b is big");
		else 
			System.out.println("c is big");
	}
	
	public static void main(String[] args)
	{
		mul(6,10);
		mul(12,5,25);
		div(100,30.23f);
		Constructordemo cd1=new Constructordemo(12.3f,23);
		Constructordemo cd2=new Constructordemo(2345,12.5f);
		Constructordemo cd3=new Constructordemo(13,14,15);
		System.out.println("***************** cd1");
		cd1.add(12,13);
		cd1.add(12,13,14);
		cd1.sub(25,10);// calling non static methods with 1 object cd1
		System.out.println("***************** cd2");
		cd2.add(17,13);
		cd2.add(234,456,578);
		cd2.sub(456, 234);//calling non static methods with s2 object cd2
		System.out.println("***************** cd3");
		cd3.add(75, 125);
		cd3.add(900,800,700);
		cd3.sub(10000, 55);
		
	}

}
