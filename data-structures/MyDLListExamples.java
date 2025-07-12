// Lecture #16 - Data structures 10/20/2022 
// In class live demo for DLL data structure
// The stack is the third type of data structure we are looking at.
// 8 of 15 students in attendance, Instrutor: Dr. Charles Thangaraj

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
import java.time.*;


// A class for the individual double link 
class MyDLink
{
	// Part 1
	// This is portion where we store the desired data 
	public int iData; // This could be student ID number
	public double dData; // This could be GPA
	public String sData; // This could be name
		
	// Part 2
	// This is the pointer or reference to the next link in the list
	public MyDLink next;
	
	// This is the pointer or reference to the previous link in the list
	public MyDLink previous;
	
	
	// Constructors
	MyDLink()
	{
		// Null constructor
		iData = 0;
		dData = 0.0;
		sData = "Default";
		
		next = null;
		previous = null;
				
	}
	
	MyDLink(int id)
	{
		// Null constructor
		iData = id;
		dData = 0.0;
		sData = "Default";
		
		next = null;
		previous = null;
				
	}
	
	MyDLink(int id, double dd)
	{
		// Null constructor
		iData = id;
		dData = dd;
		sData = "Default";
		
		next = null;
		previous = null;
				
	}
	
	MyDLink(int id, double dd, String sd)
	{
		// Null constructor
		iData = id;
		dData = dd;
		sData = sd;
		
		next = null;
		previous = null;
				
	}

	// Getters and Setter
	public int getIntValue()
	{
		return this.iData;
	}

	public double getDoubleValue()
	{
		return this.dData;
	}
	
	public String getStringValue()
	{
		return this.sData;
	}

	public String getValues()
	{
		return ( Integer.toString(this.iData) + " - " + Double.toString(this.dData) + " - " + sData );
	}
	
	public void showValues()
	{
		System.out.println( Integer.toString(this.iData) + " - " + Double.toString(this.dData) + " - " + sData );
	}
	
	public void setIntValue(int id)
	{
		this.iData = id;
	}
	
	public void setDoubleValue(double dd)
	{
		this.dData = dd;
	}
	
	public void setStringValue(String sd)
	{
		this.sData = sd;
	}
} // End class MyDLink


// A class for defining the linked list - how to connect the link and their properties

class MyDLList
{
	// For a DLList to exist, we need at least a single node called the head node
	// The head node must be made undeleteable (or private) 
	
	// This is the head node
	private MyDLink firstLink;
	
	// Constructor for the MyDLList class 
	MyDLList()
	{
		// null constructor
		firstLink = null;
	}
	
	// Probing, Getters and Setters 
	
	public boolean isEmpty()
	{
		return(firstLink == null); // Check and see if the head node is pointing to a null if so the list is empty
	}
	
	// Inserting a link 
	// When it is the first link or head node 
	public void insertFirstLink(int i, double d, String s)
	{
		// Creating a new link object
		MyDLink newLink = new MyDLink(i, d, s);
		
		// When we are inserting the first link, the firstLink is pointing to null 
		// so we are using it here simply as a null poniter
		newLink.next = firstLink;
		
		// Rewrite or over wright the firstLink to now point to the newly created link
		firstLink = newLink;		
	}
	
	// When the to be inserted link is NOT the head node and
	// We are inserting at the end or tail ONLY
	public void insertLink(int i, double d, String s)
	{
		// Created a temp pointer to start at the head node and find the tail of the 
		// list to add the new link to it.
		// Starting from the head node
		MyDLink currentLink = firstLink;
		
		// walk through the list to find the last or tail node
		while(currentLink.next != null)
		{
			currentLink = currentLink.next;	
			// When this loop is broken that means that the currentLink 
			// is pointing to the last or tail node or link		
		}
		
		if(currentLink.next == null)
		{
			// Create the new link here
			MyDLink newLink = new MyDLink(i, d, s);
			
			// For the newly created link, set its previous to the current link
			newLink.previous = currentLink;
			
			// Now over write the currentLink's next to point to the 
			// newly created link 			
			currentLink.next = newLink;	
		}
	}
	
	// When the to be inserted link is NOT the head node and
	// We are inserting at any point along the list
	public void insertLink(int i, double d, String s, int target)
	{
		MyDLink currentLink = firstLink;
		
		// walk through the list to find the target link in the list
		while(currentLink.iData != target)
		{
			currentLink = currentLink.next;	
			// When this loop is broken that means that the currentLink 
			// is pointing to the target link		
		}
		
		if(currentLink.iData == target)
		{
			// Create the new link here
			MyDLink newLink = new MyDLink(i, d, s);
			
			// Current list previous' next must be the new link
			currentLink.previous.next = newLink;
			
			// For the newly created link, set its previous to the current link
			newLink.previous = currentLink.previous;
			
			// Now over write the currentLink's next to point to the 
			// newly created link 
			
			// The newly created link will now point to what ever the target link 
			// was pointing to
			newLink.next = currentLink;
			
			// Resetting the target link's next to point to the newly created link
			currentLink.previous = newLink;			
		}
		
	}
	
	// End - // Inserting a link

	// Deleting a link
	
	// To delete a link in the list, all we need is the target ID to locate the link to be 
	// deleted

	public void deleteLink(int target)
	{
		// Two temp links to point to the current and the previous link in a list
		// initialized to firstLink 
		MyDLink currentLink = firstLink;
		MyDLink previousLink = firstLink;
		
		// walk through the list to find the target link in the list
		while(currentLink.iData != target)
		{
			if(currentLink.next == null)
			{
				// We have reached the end of the list and not found the target yet
				System.out.println("Target link not found: Unable to remove link");
				break;
			}else
			{			
			previousLink = currentLink;
			currentLink = currentLink.next;
			}
		}
		// When the previous loop is broken we have either found the target to delete 
		// Or reached the end and not found the target
		
		if(currentLink.iData == target)
		{
			if(currentLink != firstLink)
			{
				currentLink.previous.next = currentLink.next;
				currentLink.next.previous = currentLink.previous;
				
			} else
			{
				firstLink = firstLink.next;
				firstLink.previous = null;
			}
		}
		
	}
	
	public void showListContents()
	{
		// Two temp links to point to the current and the previous link in a list
		// initialized to firstLink 
		MyDLink currentLink = firstLink;
		System.out.println("\nList contents follows:\n");		
		
		while(currentLink.next != null)
		{
			currentLink.showValues();
			currentLink = currentLink.next;
		}
		
		if(currentLink.next == null)
		{
			currentLink.showValues(); // This is to get the last link in the list
		}
		
		System.out.println("\nList contents complete\n");
	
	}
	
	public void showListContents(int direction)
	{
		// direction = 1 => head to tail 
		// direction = 2 => head to tail and back
		
		// Two temp links to point to the current and the previous link in a list
		// initialized to firstLink 
		MyDLink currentLink = firstLink;
		System.out.println("\nList contents follows:\n");		
		
		if((direction == 1) || (direction == 2))
		{
			while(currentLink.next != null)
			{
				currentLink.showValues();
				currentLink = currentLink.next;
			}
			
			if(currentLink.next == null)
			{
				currentLink.showValues(); // This is to get the last link in the list
			}
			
			System.out.println("\nEnd of list\n");
			
			if(direction != 1)
			{		
				// going in the reverse since direction was set to 2
				while(currentLink.previous != null)
				{
					currentLink.showValues();
					currentLink = currentLink.previous;
					
				}
				
				if(currentLink.previous == null)
				{
					currentLink.showValues(); // This is to get the first link in the list
				}
				
				System.out.println("\nBegining of list\n");
			}
		}
	}

} // End class MyLList


// A class for demoing the linked list example
public class MyDLListExamples
{
	public static void main(String[] args)
	{
		
		// Create the list object 
		// LIST > LINK
		
		MyDLList myDListObject = new MyDLList();
		
		System.out.println("Is my list empty?: " + myDListObject.isEmpty());
		//myListObject.showListContents();
		
		// Add a link to the newly created list
				
		myDListObject.insertFirstLink(123001, 3.657, "Joe Smith");
		myDListObject.insertLink(123002, 2.657, "Jim Smith");
		myDListObject.insertLink(123003, 3.257, "Jill Smith");
		myDListObject.insertLink(123004, 3.887, "Ely Smith");
		myDListObject.insertLink(123005, 1.357, "Dan Smith");
		myDListObject.insertLink(123005, 4.000, "Dan Smith");
		
		System.out.println("Is my list empty?: " + myDListObject.isEmpty());
		myDListObject.showListContents();
		
		myDListObject.deleteLink(123005);
		myDListObject.showListContents();
		
		myDListObject.deleteLink(123001);
		myDListObject.showListContents();	
		
		myDListObject.showListContents(2);
		
	} // End PSVM
	
	
} // End public class MyDLListExamples
