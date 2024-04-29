//program to demonstrate linked list
import java.util.*;

class LinkedListEx
{
	public static void main(String ar[])
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Swetha");
		list.add("Priya");
		
		list.add(1, "Kaashvi");
		list.addLast("Sateesh");
		list.addFirst("Suresh");
		
		System.out.println(list);
		System.out.println("Is list contains Kaashvi?" +list.contains("Kaashvi"));
		System.out.println("first element is : " +list.getFirst());
		System.out.println("Last element is : " +list.getLast());
		System.out.println("Element at index 3 is : " +list.get(3));
		System.out.println("No of elements in list is : " +list.size());
		
		for(String s:list)
			System.out.println("Hello "+s+ " Welcome to Java world");
		
		list.remove();//Removes first element
		list.remove(2);
		System.out.println(list);
		
	}
}	
		
