package day24;

import java.util.Arrays;

public class ArraysCopyElements {

	public static void main(String[] args) 
	{
		int[] a= {2,4,6,8,10};
		int[] b= new int[a.length];
		System.out.println(Arrays.toString(a));
		/*for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}

		System.out.println(Arrays.toString(b));*/
		
		System.out.println("reverse array ");
		for(int i=a.length-1,j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
	
	
}
	