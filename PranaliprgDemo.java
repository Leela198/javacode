package day24;

import java.util.Arrays;
import java.util.Scanner;

public class PranaliprgDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] aa=new int[4];
		System.out.println("enter elements into array");
		for(int i=0;i<=aa.length-1;i++)
		{
			aa[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(aa));

	}

}
