package day11;
import java.util.Scanner;

public class ApplicationForm
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter ur first name");
	String fname=sc.next();
	System.out.println("enter ur last name");
	String lname=sc.next();
	System.out.println("enter valid E-mail id");
	String email=sc.next();
	System.out.println("enter Password");
	String pwd=sc.next();
	System.out.println("enter Parmenat address");
	String padd=sc.next();
	System.out.println("enter ur nationality");
	String nat=sc.next();
	System.out.println("enter Pincode");
	int pin=sc.nextInt();
	
	System.out.println("*****************The Details u entered are*****************");
	System.out.println("First name :"+fname);
	System.out.println("Last Name :"+lname);
	System.out.println("E-Mail id is:"+email);
	System.out.println("Password is:"+pwd);
	System.out.println("Permanent address:"+padd);
	System.out.println("Nationality:"+nat);
	System.out.println("Pincode is:"+pin);
	sc.close();
	
	
	
}
}
