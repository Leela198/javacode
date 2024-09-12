package day17;
import java.util.Scanner;

/*Write a Java program to create an abstract class Shape with abstract methods 
 * calculateArea() and calculatePerimeter(). 
 * Create subclasses Circle and Triangle that extend the Shape class and 
 * implement the respective methods to calculate the area and perimeter of each shape.
 */

abstract class Shape  //abstract class
{
	abstract void calculateArea();
	abstract void calculatePerimeter();
	
}

class Circle extends Shape
{int r=6;
final float pi=3.14f;
	void calculateArea()
	{
		float res=pi*r*r;
		System.out.println("area of circel is "+res);
	}
	void calculatePerimeter()  //2pir
	{
		System.out.println("will calcuate soon");
	}
}

class Triangel extends Shape
{ 
	int b=20;
	int h=15;
	void calculateArea()
	{
		float res=0.5f*b*h;
		System.out.println("area of circel is "+res);
	}
	void calculatePerimeter()//a+b+c
	{
		System.out.println("will calculate soon");
	}
}


public class AreaPerim 
{
public static void main(String[] args)
{
	Circle c1=new Circle();
	Triangel t1=new Triangel();
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter radius of circel"+sc.nextInt());
	c1.calculateArea();
	c1.calculatePerimeter();
	t1.calculateArea();
	t1.calculatePerimeter();
	
	
	
}
}
