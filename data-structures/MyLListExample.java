// Lecture #14 - Data structures 10/13/2022 
// In class live demo for DEQ data structure
// The stack is the third type of data structure we are looking at.
// 12 of 15 students in attendance, Instrutor: Dr. Charles Thangaraj

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
import java.time.*;

// Here we define a link (for a singly linked list)
// A link will have two (or three for DLL) parts
// Part A - the data to be stored at each node or link
// Part B - a pointer to the next link in the list if any or null if end node
class MyLink
{
	// Part A
	public int iData; // Think of this as a student's ID
	public double dData; // Think of this as the student's GPA
	public String sData; // Think of this as the student's name
	//public String [] coursesCompleted; // Think of this a transcript
	//public GPAData studGPA; // We can even store an object of an other class as part of the data
	
	// Part B
	public MyLink next;
	
	// Constructor
	public MyLink()
	{
		this.iData = 0;
		this.dData = 0.0;
		this.sData = "null";
		
		next = null;		
	}
	
	public MyLink(int inInt)
	{
		this.iData = inInt;		
		this.dData = 0.0;
		this.sData = "null";
		
		next = null;		
	}
	
	
	public MyLink(int inInt, double inDob)
	{
		this.iData = inInt;		
		this.dData = inDob;
		this.sData = "null";
		
		next = null;		
	}
	
	public MyLink(int inInt, double inDob, String inStr)
	{
		this.iData = inInt;		
		this.dData = inDob;
		this.sData = inStr;
		
		next = null;		
	}
	
	// Getters and Setters
	public void showContents()
	{
		System.out.println("ID = "+iData+", GPA = "+dData+", Name = "+sData);
	}
	
	public void setNext(MyLink NR)
	{
		this.next = NR; // next reference
	}
	
	public void setIData(int ID)
	{
		this.iData = ID;
	}
	
	public void setDData(double DD)
	{
		this.dData = DD;
	}
	
	public void setSData(String SD)
	{
		this.sData = SD;
	}
	
} // End class MyLink


// Here we define a list


// Here we will create a LL and play with it - yay !!
public class MyLListExample
{
	
	public static void main(String [] args)
	{
		
		
	} //PSVM
	
	
	
} // End class MyLListExample
