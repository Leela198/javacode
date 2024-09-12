package day19;
public class AccessSpecDemo 
{

	public void one()
	{
		System.out.println("ONE");
	}
	private void two()
	{
		System.out.println("TWO");
	}
	protected void three()
	{
		System.out.println("THREE");
	}
 void four()
	{
		System.out.println("FOUR");
	}
}
/*public class AccessSpecDemo 
{

	public static void main(String[] args) 
	{
		SpecifierDemo sd=new SpecifierDemo();
		sd.one();
		sd.two();//private method cannot be accessed
		sd.three();
		sd.four();
	}

}*/
