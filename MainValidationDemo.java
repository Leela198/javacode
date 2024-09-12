package day16;

public class MainValidationDemo
{
void main()
{
	System.out.println("wothou Para main method");
}
void main(int a,String name)
{
	System.out.println("with integer nd string arguments");
}
void main(char grade)
{
	System.out.println("with char argument");
}
public static void main(String[] args)
{
	MainValidationDemo m1=new MainValidationDemo();
	m1.main();
	m1.main(12,"lrk");
	m1.main('A');
}
}
