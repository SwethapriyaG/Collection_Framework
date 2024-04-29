//program to demonstrate stack (LIFO) in Java

import java.util.*;

class stackEx
{
	public static void main(String ar[])
	{
		Stack<Integer> marks = new Stack<Integer>();
		
		//push an element
		marks.push(90);
		marks.push(99);
		marks.push(98);
		marks.push(97);
		marks.push(96);
		
		if(marks.empty()) // it checks whether stack is empty or not
			System.out.println("Stack is empty");
		else
			System.out.println("Top element in the stack marks is:" +marks.peek()); //returns the top element
		
		System.out.println("Element 98 position in the stack marks is :" +marks.search(98));
		
		//it removes the top element from the stack
		marks.pop();
		
		System.out.println("Top element in the stack marks is :" +marks.peek());
		System.out.println("Element 98 position in the stack marks is :" +marks.search(98));
		
		
	}
}	
