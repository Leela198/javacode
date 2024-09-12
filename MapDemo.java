package day2930;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {



	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap<Integer,String> ();
		
m1.put(121, "xxx");
m1.put(122, "xyy");
m1.put(123, "xzz");
m1.put(124, "yxx");
m1.put(125, "yyx");
m1.put(126, "yyy");

System.out.println(m1);
System.out.println(m1.get(121));  //returns specific key value
System.out.println(m1.get(127)); //returns null if key not present
Object ob=m1.getClass();
System.out.println(ob);  //returns class name

boolean b1=m1.containsKey(128);//return true if present if not false

System.out.println(b1); 
boolean b2=m1.containsValue("yxx");//return true if present if not false


System.out.println(b2);

Set< Entry<Integer,String>> s1=m1.entrySet();
System.out.println(s1);

//using iterator concept 
Iterator< Entry<Integer,String>> i1=s1.iterator();
System.out.println("fusing iterator along with while loop");
while(i1.hasNext())
{
	System.out.println(i1.next());
}
System.out.println("printing only key ");
for(Integer	ss1	:	m1.keySet())
{
	System.out.println(ss1);
}

System.out.println("printing only values");
for(	String s2:			m1.values())
{
	System.out.println(s2);
}
System.out.println("for each set output");


for(	Entry<Integer,String> s3     :			m1.entrySet())
{
	System.out.println(s3);
}

m1.remove(122);
System.out.println("fafter removing a particular key");
System.out.println(m1);
System.out.println("size of hasp map is"+m1.size());

Map<Integer,String> m2=new HashMap<Integer,String> ();

m2.put(121, "xxx");
m2.put(122, "xyy");
m2.put(123, "xzz");
m2.put(124, "yxx");
m2.put(125, "yyx");
m2.put(126, "yyy");
boolean b12=m1.equals(m2);
System.out.println(b12);
m2.clear();
System.out.println(m2.isEmpty());
Map<Integer,String> m3=new HashMap<Integer,String> ();

m3.put(121, "xxx");
m3.put(122, "xyy");
m3.put(123, "xzz");
System.out.println(m3); //becoz of duplicates prints only one value as output



	}

}
