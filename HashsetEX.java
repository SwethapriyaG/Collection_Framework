//program to demonstrate HashSet in java
import java.util.*;

class HashsetEx
{
	public static void main(String ar[])
	{
		HashSet<String> names = new HashSet<String>();
		
		System.out.println("names.isEmpty():" +names.isEmpty());
		
		//adding elements/objects
		names.add("Swetha");
		names.add("Priya");
		
		if(names.isEmpty())
			System.out.println("names hashset is still empty");
		else
			System.out.println("Size of the hashset names:" +names.size());
		    
		if(names.contains("Priya"))
			names.remove("Priya");
			
		   System.out.println("Updated size of the hashset names:" +names.size());
			
			names.clear();
			
			System.out.println("names.isEmpty() after clear:" +names.isEmpty());
			
			names.add("Anith");
			names.add("Kavitha");
			names.add("Sulochana");
			names.add("Prasanna");
			
			System.out.println(names);
			
			for(String n : names)
			{
				String newvalue = "Hello " +n;
				System.out.println(newvalue);
			}

			Iterator<String> newNames = names.iterator();
			while(newNames.hasNext())
			{
				String n = newNames.next();
				String newvalue = "Welcome " +n;
				System.out.println(newvalue);
			}		
	}
}	