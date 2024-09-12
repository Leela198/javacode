package day23;
//remove junk or special characters in string

public class StringCompDemo {

	public static void main(String[] args) 
	{
		
		String str="w&/el**co;.me";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
		
	}

}
