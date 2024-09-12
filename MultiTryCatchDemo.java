package day21;

public class MultiTryCatchDemo
{

	public static void main(String[] args)
	{
	 String s=null;
	 try 
	 {
		 System.out.println("length of string is...");
		 System.out.println(s.length());
		 
	 }
	 /*catch(ArithmeticException e)
	 {
		 System.out.println("handeled exception");
		 System.out.println(e.getMessage());
		 
	 }
	 catch(NullPointerException e)
	 {
		 System.out.println("handeled exception");
		 System.out.println(e.getMessage());
	 }

	 catch(NumberFormatException e)
	 {
		 System.out.println("handeled exception");
		 System.out.println(e.getMessage());
	 }   */
	 
	 catch(Exception e)//super class for all exceptions is Exception class
	 {
		 System.out.println("handeled exception");
		 System.out.println(e.getMessage());
	 }
	 
	 System.out.println("program executed");
	 
}
}
