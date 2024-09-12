package day24;

import java.util.Arrays;

public class CharArrayEqualDemo {

	public static void main(String[] args)
	{
	
		char[] ch1= {'a','b','c','d'};
		char[] ch2= {'a','b','r','d'};
		boolean b=Arrays.equals(ch1, ch2);
		if(b)
			
		{
			System.out.println("both charecter arrays are equal");
		}
		
		else
			System.out.println("both charecter arrays not are equal");
			
	}

}
