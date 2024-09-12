package day24;

import java.util.Scanner;

public class CheckNumberinArray
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a1=new int[4];
		int numtocheck;
		System.out.println("enter array elements");
	    	for(int i=0;i<=a1.length-1;i++)
	    	{
	    	a1[i]=sc.nextInt();
	    	}
	    
	    	for(int i=0;i<=a1.length-1;i++)
	    		{
	    		System.out.println("array elements in a1 array are-->"+a1[i]);
	    		}
	    	
	    	System.out.println("enter element to check");
	    	numtocheck=sc.nextInt();
	    	for(int i=0;i<=a1.length-1;i++)
	    	{	
	    	if(a1[i]==numtocheck)
	    	{
		    	System.out.println("element  -->"+numtocheck+"  found at index  "+i);
	    	}
		
	}
	    	
sc.close();
}
}