package day23;

public class CharBoolDoubDemo {

	public static void main(String[] args)
	{
		char[] ch= {'a','g','e','r'};  //char demo
		for(int i=0;i<=3;i++)
		{
			System.out.println("array element at position" +i+" is.."+ch[i]);
		}

		
		boolean[] bool= {true,false};//boolean array demmo
		for(int i=0;i<=1;i++)
		{
			System.out.println("array element at position" +i+" is.."+bool[i]);
		}
		double[] dd= {12.3,34.5,67.789};//doubel array demo
		
		for(int i=0;i<3;i++)
		{
			System.out.println("array element at position" +i+" is.."+dd[i]);
		}
		
	}

}
