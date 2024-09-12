package day28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo
{
	public static void main(String args[])
	{  
		LinkedList al=new LinkedList();  
		al.add(30);  
		al.add("siri");  
		al.add("veda");  
		al.add("sam"); 
		al.add('s');
		al.add('t');
		al.add(null);
		al.add(null);
		al.add("siri");
		
		Iterator itr=al.iterator();  
		
		
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		
		
		ListIterator lii=al.listIterator();
		System.out.println("using  Listiterator");
		
		while(lii.hasNext())
		{  
			System.out.println(lii.next());  
		} 
		System.out.println("printing reverse order of elements");
		while(lii.hasPrevious())
		{  
			System.out.println(lii.previous());  
		} 
		al.set(3,"ammu");
		
		System.out.println(al);
		System.out.println(" is the list empty    "+al.isEmpty());
		al.add(6,'N');
		System.out.println("after insertion al is:::"+al);
		}  
	
		}  

