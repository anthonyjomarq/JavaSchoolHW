// Lecture #11 - Data structures 09/29/2022 
// In class live demo for Stack data structure
// The stack is the second type of data structure we are looking at.
// 8/15 students in attendance, Instrutor: Dr. Charles Thangaraj


import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
import java.time.*;

class MyStackExamples 
{
	// Searching for an element in the stack and generating a message on the screen
	// A stack is a First-in Last-out (FILO) data structure
	
	public static void main(String[] args) 
	{
		Stack<Integer> myIntStack; // Declaring an integer stack
		myIntStack = new Stack<Integer>(); // Creating an integer stack
		
		// To get the size of the stack
		System.out.println("The size of the stack is: " + myIntStack.size());
		
		// To insert into the stack from the top
		myIntStack.push(30);
		myIntStack.push(10);
		myIntStack.push(17);
		myIntStack.push(3);
		
		System.out.println("The size of the stack is: " + myIntStack.size());
		
		// To check if an element is in the stack
		int target = 32;
		
		System.out.println("Is this element " + target + " in the stack? " + myIntStack.contains(target));
		System.out.println(myIntStack.contains(3));
		
		// Remove an element from a stack
		
		System.out.println("Element on the top of the stack was "+ myIntStack.pop());
		System.out.println("The size of the stack is: " + myIntStack.size());
		
		myIntStack.push(3);
		
		// To look at the first element without poping it out of a stack
		System.out.println("Element on the top of the stack is (we are peeking) "+ myIntStack.peek());
		System.out.println("The size of the stack is: " + myIntStack.size());
		
		
		// To look at other elements in a stack (not just the top element) then we have one of two methods
		// First one is to ascertain the size of the stack and use a for loop to pop the stack element by element 
		// Second on is to use an iterator (more fancy Java stuff)
		
		// The first method goes from top of the stack to the bottom
		// The second method goes in the order of how elements were inserted into the stack
		
		Iterator myIntStackIterator = myIntStack.iterator();
		
		int count = 0;
		
		while(myIntStackIterator.hasNext())
		{
			count++;
			
			System.out.println( myIntStackIterator.next() );	
			
			// If I want to see the first 3 elements inserted ONLY 
			if(count >= 3)
				break;
		}
		
		System.out.println("The size of the stack is: " + myIntStack.size());
		
		
		// String Stack 
		
		Stack<String> myStrStack01 = new Stack<String>();
		Stack<String> myStrStack01Rev = new Stack<String>();
		
		myStrStack01.push("This");
		myStrStack01.push("is a really");
		myStrStack01.push("boring example of string stacks");
		myStrStack01.push("But it is needed");
		myStrStack01.push("since what is boring");
		myStrStack01.push("is often full of lessons to learn!!");
		
		Iterator myStrStackIterator = myStrStack01.iterator();
		
		count = 0;
		
		while(myStrStackIterator.hasNext())
		{
			count++;
			
			System.out.println( myStrStackIterator.next() );	
			
			// If I want to see the first 3 elements inserted ONLY 
			//if(count >= 3)
				//break;
		}
		
		// To clone a stack
		Stack<String> myStrStack01Clone = new Stack<String>();
		myStrStack01Clone =  (Stack<String>) myStrStack01.clone(); 
		// We are explicitly doing a type casting here from Vector to Stack
		
		System.out.println("The size of the clone stack is: " + myStrStack01Clone.size());
		
		// Using a for loop to reverse a Stack
		
		for(int i = 0; i < myStrStack01.size(); i++)
		{
			 myStrStack01Rev.push( myStrStack01Clone.pop() );			
		}
		
		
		Iterator myStrStackRevIterator = myStrStack01Rev.iterator();
		
		count = 0;
		
		while(myStrStackRevIterator.hasNext())
		{
			count++;
			
			System.out.println( myStrStackRevIterator.next() );	
			
			// If I want to see the first 3 elements inserted ONLY 
			//if(count >= 3)
				//break;
		}
		
		
	} // PSVM
	

} // End class MyStackExamples
