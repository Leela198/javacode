package day23;
import java.util.Scanner;

public class StringReverseDemo 
{
	public static void main(String[] args)
	{  //method ---1
		
		/*String str="hello";
		String rev=" ";*/
		
		//method--2
		String str;
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to perform reverse operation");
		str=sc.next();
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		
		}
		System.out.println("reverse of given string is"+rev);
		
		
		if(str.equals(rev))
		{
			//System.out.println("reverse test"+rev);
			System.out.println(str+"   is a palendrome");
			
		}
		else 
		{
			//System.out.println("reverse test2"+rev);
			
			System.out.println(str+"   is not a palendrome");
		}
		sc.close();
	}
	
}

