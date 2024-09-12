package day28;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) 
	{
		Set s=new HashSet();
		
		s.add(100);
		s.add(12.45);
		s.add("hello");
		s.add('n');
		s.add(null);
		s.add(100);
		s.add(600);
		s.add(null);
		s.add(null);
		System.out.println(s);
		Iterator si=s.iterator();
		System.out.println("printing elements in set object");
		while(si.hasNext())
		{
			System.out.println(si.next());
		}
		System.out.println("elemnts in the set are"+si);

	}

}
