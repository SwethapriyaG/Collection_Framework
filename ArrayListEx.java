//program to demonstrat ArrayList

import java.util.*;

class ArrayListEx
{
	public static void main(String ar[])
	{
		ArrayList list = new ArrayList();
		System.out.println("list.isEmpty():" +list.isEmpty());
		list.add("Swetha");
		list.add("Priya");
		list.add(1, "Kaashvi");
		list.add(2, "Chandu");
		
		System.out.println(list);
		System.out.println("is list contains Kaashvi : " +list.contains("Kaashvi"));
		System.out.println("Element at index 3 is " +list.get(2));
		System.out.println("no of elements in list is " +list.size());
		
		ListIterator<String> li =list.listIterator(); //Array list will convert into listIterator
		while(li.hasNext())
		{
			String s = li.next();
			System.out.println("Hello " +s+ "welcome to Java world");
		}
		list.remove(2);
		
		System.out.println(list);
	}	
	
}	
		