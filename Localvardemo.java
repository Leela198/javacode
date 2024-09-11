package basics;

public class Localvardemo
{
	int a=10;
	int b=20;
	void add()
	{
		Localvardemo lv1=new Localvardemo();
		System.out.println(a+b);
	}
public static void main(String[] args)
{
	Localvardemo lv1=new Localvardemo();
	lv1.add();
}
}
