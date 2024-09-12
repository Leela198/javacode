package day27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(112);
		al.add('c');
		al.add("hello");
		al.add(null);
		al.add(true);
		al.add(12.3);
		al.add(1123.45f);
		al.add(3);
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(5));
		al.set(3, "hi");
		
		System.out.println(al);
		System.out.println(al.contains(3));
		System.out.println(al.contains(10));
		ArrayList<Character> a2=new ArrayList<Character>();
		a2.add('a');
		a2.add('b');
		a2.add('c');
		a2.add('d');
		a2.add('e');
		a2.add('f');
		a2.add('g');
		a2.add('h');
		a2.add('i');
		System.out.println("character array list demo:::"+a2);
		a2.remove(3);  //removing object by specifying index value
		System.out.println("***after removing any obj***"+a2);
		System.out.println("size of arraylist al is**"+al.size());
		System.out.println("size of arraylist is a2 is***"+a2.size());
		System.out.println("using iterator for printing elements in arraylist");
		Iterator ial=al.iterator();
		while(ial.hasNext())
		{
			System.out.println(ial.next());
		}
		
		a2.clear();
		System.out.println("visiting a2 arraylist after executing clear cmd:::"+a2.isEmpty());
		a2.addAll(al);  //adding object using addAll method
		System.out.println(a2);
		System.out.println("uUSING LISTITERATOR");
		ListIterator li1=al.listIterator();
		while(li1.hasNext())
		{
			System.out.println(li1.next());
		}
		
		System.out.println("revering printing usin listiterator concept");
		while(li1.hasPrevious())
		{
			System.out.println(li1.previous());
		}
		
	}

}
