package day17;
/*Write a Java program to create an abstract class Animal with an abstract method called sound().
Create subclasses Lion and Tiger that extend the Animal 
class and implement the sound() method to make a specific sound for each animal.*/
abstract class Animal   //abstract class
{
	abstract void sound();
}
class Lion extends Animal  //subclass Lion
{
	void sound()
	{
		System.out.println("Lion says Roar Roar");
	}
}

class Tiger extends Animal  //subclass Lion
{
	void sound()
	{
		System.out.println("Lion says Roarrrrrrrr");
	}
}
public class BaseAnimalDemo
{
public static void main(String[] args)
{
	Tiger ta=new Tiger();
	ta.sound();
	Lion li=new Lion();
	li.sound();
}
}
