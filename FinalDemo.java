package day19;
class Test
{
	final int x=200;
}

public class FinalDemo 
{ static int y;
public static void main(String[] args)
{
	Test t =new Test();
	//t.y=500;
	y=t.x;
	System.out.println(y);
}
}
