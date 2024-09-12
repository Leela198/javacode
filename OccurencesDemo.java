package day25;

public class OccurencesDemo 
{
public static void main(String[] args)
{
	
String str="i am %&§: GOING to Mu1234nich";
 char[] ch=str.toCharArray();
 int alphacount=0;
 int numcount=0;
 int spacecount=0;
 int uppercount=0;
 int speccharcount=0;
 int totcount=0;
 /*for(int i=0;i<str.length();i++)
 {
 	
 	boolean b=Character.is(ch[i]);
 	if(b==true)
 	{
 		totcount++;	
 	}
 }*/
 
 for(int i=0;i<str.length();i++)
{
	
	boolean b=Character.isLetter(ch[i]);
	if(b==true)
	{
		alphacount++;	
	}
}
	
System.out.println("alphabet count is"+alphacount);

for(int i=0;i<str.length();i++)
{
	
	boolean b=Character.isDigit(ch[i]);
	if(b==true)
	{
		numcount++;	
	}
}
	
System.out.println("number count is"+numcount);

for(int i=0;i<str.length();i++)
{
	
	boolean b=Character.isWhitespace(ch[i]);
	if(b==true)
	{
		spacecount++;	
	}
}
	
System.out.println("space count is"+spacecount);

for(int i=0;i<str.length();i++)
{
	
	boolean b=Character.isUpperCase(ch[i]);
	if(b==true)
	{
		uppercount++;	
	}
}
	
System.out.println("uppercase count is"+uppercount);
//speccharcount=alphacount+numcount+spacecount;

//System.out.println("no of special charecters:::"+speccharcount);
}
}
