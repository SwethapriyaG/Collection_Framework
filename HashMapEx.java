//program to demonstrat HashMap

import java.util.*;

class HashMapEx
{
	public static void main(String ar[])
	{
		HashMap<String,String> maps = new HashMap<String,String>();
		
		System.out.println("is hashmap empty: "+maps.isEmpty());
		
		maps.put("fl", "English");
		maps.put("sl", "Swedish");
		maps.put("tl", "Telugu");
		
		if(maps.isEmpty())
				System.out.println("Map is still empty");
			else
				System.out.println("Maps size is: "+maps.size());
				
				System.out.println(maps.keySet());
				System.out.println(maps.values());
				
				System.out.println("entrySet():" + maps.entrySet());
				
				System.out.println("value of the tl is: " +maps.get("tl"));
				System.out.println(maps.keySet());
				System.out.println("is key sl available? " +maps.containsKey("sl"));
				System.out.println("is value English available? " +maps.containsValue("English"));
		
		
	}
	
	
}	