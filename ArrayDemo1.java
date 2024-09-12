package day23;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args)
	{
		int a[]=new int[3]; //method---1
		a[0]=23;
		a[1]=567;
		a[2]=1234;
		
		
		for(int i=0;i<3;i++)
		{
			System.out.println("array element at position" +i+" is.."+a[i]);
		}
		System.out.println(Arrays.toString(a));
		
		int[] b={23,45,67}; //method---2
		for(int i=0;i<3;i++)
		{
			System.out.println("array element at position" +i+" is.."+b[i]);
		}
		
		String[] str= {"hi","hello","jello"};//string declaration nd initialization
		
		for(int i=0;i<4;i++)
		{
			System.out.println("array element at position" +i+" is.."+str[i]);
		}
		
		
		
	}

}
