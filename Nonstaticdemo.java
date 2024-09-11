package basics;

public class Nonstaticdemo 
{
	
	
		void addition()//non static method
		{
			int a=100;
			int b=300;
			int c=a+b;
			System.out.println(c);
		}
		static void sub(int a,int b)//static parameterized method
		{
			int s=a-b;
			System.out.println(s);
		}
		
		public static void main(String[] args)
		{
			Nonstaticdemo nd=new Nonstaticdemo();
			nd.addition();// non static method is accessed with help of object
			sub(400,200);//static method
		}
}


