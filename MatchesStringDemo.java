package day23;
import java.util.Scanner;

public class MatchesStringDemo {

	public static void main(String[] args)
	{
		String a="Leela is h";
		//System.out.println(a.matches("(.*)l")); //returns boolean value
		boolean b=a.matches("(.*)a");
		System.out.println(b);
		//starts with l
		System.out.println("is the given string starts with l is..."+a.matches("L(.*)"));
		System.out.println("is charecter  a present in given string..."+a.matches("(.*)a(.*)"));
		
		Scanner sc=new Scanner(System.in);
		//String c="roxy";
		String c=sc.next();
		
		
		System.out.println(c.matches("...."));
		sc.close();
		

	}

}

