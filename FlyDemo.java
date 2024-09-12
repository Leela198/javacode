package day18;
/*Write a Java program to create an interface Flyable with a method called fly_obj().
 *  Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. 
 *  Implement the fly_obj() method for each of the three classes
 */
interface Flyable
{
	void fly_obj();
}

class Spacecraft implements Flyable
{
	public void fly_obj()
	{
		System.out.println("spacecraft method for obj flying");
	}
}

class Airplane implements Flyable
{
	public void fly_obj()
	{
		System.out.println("airplane method for obj flying");
	}
}
class Helicopter implements Flyable
{
	public void fly_obj()
	{
		System.out.println("Helicopter method for obj flying");
	}
}
public class FlyDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};
		for (Flyable obj : flyingObjects) {
            obj.fly_obj();
		}

	}

}
