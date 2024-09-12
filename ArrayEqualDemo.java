package day24;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a1=new int[4];
		int[] a2=new int[4];
		System.out.println("enter array elements");
	    	for(int i=0;i<=a1.length-1;i++)
	    	{
	    	a1[i]=sc.nextInt();
	    	}
	    
	    	for(int i=0;i<=a1.length-1;i++)
	    {
	    System.out.println("array elements in a1 array are-->"+a1[i]);
	    }
	    
	    System.out.println("enter array elements in second array");
	    
	    	
	    for(int i=0;i<=a2.length-1;i++)
	    	{
	    	a2[i]=sc.nextInt();
	    	}
	    for(int i=0;i<=a2.length-1;i++)
	    {
	    System.out.println("array elements in a1 array are-->"+a2[i]);
	    }
	    	
	    
	    boolean b=Arrays.equals(a1, a2);
	    
	    		if(b)
	    			{
	    			System.out.println(" both arraya are equal");
	    				}
	    else 
	    			System.out.println(" both arraya are  not   equal");
	    
	    sc.close();
	}
	
	}
	

