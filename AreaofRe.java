package day12;

/*Write a Java program to create a class called Shape with a method called getArea().
 *  Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.*/
class Shape
{
	void getArea()
	{
		System.out.println("square area");
		
	}
}
class Rectangel extends Shape
{
	 void getArea()
	{
		System.out.println("area of rectangel");
		super.getArea();
	}
}

class AreaofRe extends Rectangel
{
public static void main(String[] args)
{
	AreaofRe a1=new AreaofRe();
	a1.getArea();
	//a1.getArea();
}

}
