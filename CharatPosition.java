package day23;

public class CharatPosition {

	public static void main(String[] args)
	{
			String str="helloworld";
			for(int i=0;i<=str.length()-1;i++)
			{
				System.out.println("charecter at each index is..."+str.charAt(i)+"   unicode of each char is.."+str.codePointAt(i));
			}

	}

}
