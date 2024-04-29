//program to demonstrat vector

import java.util.*;

class VectorEx
{
	public static void main(String ar[])
	{
		Vector<String> list = new Vector<String>(3, 2);
		System.out.println("initial capacity: " +list.capacity());
		list.add("a");
		list.add("b");
		list.add("c");
		
		
		System.out.println("capacity after adding 3 elements: " +list.capacity());
		
		list.add("d");
		
		System.out.println("capacity after adding 4 elements: " +list.capacity());
		System.out.println("First element in vector list is: " +list.firstElement());
		System.out.println("Last element in vector list is: " +list.lastElement());
		
		Enumeration<String> en = list.elements();
		
		while(en.hasMoreElements())
		
		   System.out.println("Hello " +en.nextElement());
		   
		   System.out.println(list);
		
		
	}	
	
}	
		