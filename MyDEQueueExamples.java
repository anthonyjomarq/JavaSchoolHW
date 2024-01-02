// Lecture #12 - Data structures 10/04/2022 
// In class live demo for DEQ data structure
// The stack is the third type of data structure we are looking at.
// 9 of 15 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #13 - Data structures 10/04/2022 
// In class live demo for DEQ data structure
// The stack is the third type of data structure we are looking at.
// 9 of 15 students in attendance, Instrutor: Dr. Charles Thangaraj

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
import java.time.*;

// Using this class to define what the DEQ should look like and how it should behave 
// The under lying DS to hold this DEQ is an arrry !! 
// AKA using an array to implement this DEQ

// In this class we will define the DEQ, its properties and behavior
class MyDEQueue
{
	// Max size of the DEQ
	private int maxSize;
	
	//An array of double numbers for the DEQ
	private  double[] deqArray; // If the DEQ should store double type numbers ONLY
	
	//private  int[] deqArray; // If the DEQ should store interger type numbers ONLY
	//private  String[] deqArray; // If the DEQ should store strings ONLY
	//private  yourClassName[] deqArray; 	// If the DEQ should store any combination of int, double, string, char
											// define a class and create an array of the class type
	
	// Left, Right and Center index variables
	private int leftIndex;
	private int rightIndex;
	private int centerIndex;
	
	// Current size of the DEQ
	private int currDEQSize;
	
	// Direction 
	// Type of SEQ, direcrtion = 0, => L (head, insert) to R (tail, remove) L2R
	// Type of SEQ, direcrtion = 1, => R (head, insert) to L (tail, remove) R2L
	private int direction;
	
	// Mode 
	// Mode = 0, default i.e. DEQ
	// Mode = 1, single ended i.e. SEQ L2R or R2L, direction will set this
	// Mode = 2, Stack i.e. only allow insertion or removal on the R
	private int deqMode;
	
	public double mostRecentlyRemoved;
	public boolean mostRecentRemovalSuccess;
	
	// Constructors
	public MyDEQueue()
	{
		// Null
		maxSize = 20;
		deqMode = 0;
		
		deqArray = new double[maxSize];
		
		centerIndex = (maxSize/2) - 1;
		leftIndex = centerIndex - 1;
		rightIndex = centerIndex;
		currDEQSize = 0;
		direction = 0;
		
		mostRecentlyRemoved = 0;
		mostRecentRemovalSuccess = false;
		
	}
	
	public MyDEQueue(int size)
	{
		maxSize = size;
		
		deqArray = new double[maxSize];
		
		centerIndex = (maxSize/2) - 1;
		leftIndex = centerIndex - 1;
		rightIndex = centerIndex;
		currDEQSize = 0;
		deqMode = 0;
		direction = 0;
		
		mostRecentlyRemoved = 0;
		mostRecentRemovalSuccess = false;
	}
	
	public MyDEQueue(int size, int type)
	{
		maxSize = size;
		
		deqArray = new double[maxSize];
		
		centerIndex = (maxSize/2) - 1;
		leftIndex = centerIndex - 1;
		rightIndex = centerIndex;
		currDEQSize = 0;
		deqMode = type;
		direction = 0;
		
		mostRecentlyRemoved = 0;
		mostRecentRemovalSuccess = false;
	}
	
	public MyDEQueue(int size, int type, int orientation)
	{
		maxSize = size;
		
		deqArray = new double[maxSize];
		
		centerIndex = (maxSize/2) - 1;
		leftIndex = centerIndex - 1;
		rightIndex = centerIndex;
		currDEQSize = 0;
		deqMode = type;
		direction = orientation;
		
		mostRecentlyRemoved = 0;
		mostRecentRemovalSuccess = false;
	}
	
	
	// Behavior of the DEQ
	// Interface methods or API - Application Programming Interface
	
	// Insert on left
	public void insertL(double num)
	{
		// Insert of L is OK when 
		// Mode = 0 i.e. DEQ 
		// Mode = 1 i.e. SEQ and direction is L2R i.e. 0
		
		if( deqMode == 0 || ((deqMode == 1) && (direction == 0)) )
		{
			if(leftIndex == -1)
				leftIndex = (maxSize - 1); // Wrap around the DEQ or L2R SEQ
			
			deqArray[leftIndex] = num; // new number put in the current left index
			leftIndex--; // Decrement the left index
			currDEQSize++; // Update DEQ element count by 1		
		}
		
	}
	
	// Insert on right
	public void insertR(double num)
	{
		// Insert of R is OK when 
		// Mode = 0 i.e. DEQ 
		// Mode = 1 i.e. SEQ and direction is R2L i.e. 1
		// Mode = 2 i.e. Stack
		
		if( deqMode == 0 || ((deqMode == 1) && (direction == 1)) || deqMode == 2 )
		{
			
			if(rightIndex == maxSize-0)
				rightIndex = (maxSize - maxSize); // Wrap around the DEQ or R2L SEQ
			
			deqArray[rightIndex] = num; // new number put in the current right index
			rightIndex++; // Increment the right index
			currDEQSize++; // Update DEQ element count by 1				
			
		}

	}
	
	// Removal on the Left
	public void removeL()
	{
		
		// Remove of L is OK when 
		// Mode = 0 i.e. DEQ 
		// Mode = 1 i.e. SEQ and direction is R2L i.e. 1
		
		mostRecentRemovalSuccess = false;
		
		if(deqMode == 0 || ((deqMode == 1) && (direction == 1)) )
		{
		
			mostRecentlyRemoved = deqArray[leftIndex]; // Copy the item to be removed
			deqArray[leftIndex] = 0; // Reset the array element after copying
			leftIndex++; // Increment the left index by one
			
			if(leftIndex == maxSize)
				leftIndex = 0; // Wrap around the left index
				
			currDEQSize--; // Decrement the DEQ elements count by one
			
			mostRecentRemovalSuccess = true;
		}

	}

	// Removal on the Right
	public void removeR()
	{
		// Removal of R is OK when 
		// Mode = 0 i.e. DEQ 
		// Mode = 1 i.e. SEQ and direction is L2R i.e. 0
		// Mode = 2 i.e. Stack
		
		mostRecentRemovalSuccess = false;
		
		if(deqMode == 0 || ((deqMode == 1) && (direction == 0)) || deqMode == 2 )
		{
			mostRecentlyRemoved = deqArray[rightIndex]; // Copy the item to be removed
			deqArray[rightIndex] = 0; // Reset the array element after copying 
			rightIndex--; // Decrement the right index by one
			
			if(rightIndex == -1)
				rightIndex = maxSize - 1; // Wrap around the right index
			
			currDEQSize--; // Decrement the DEQ elements count by one
			
			mostRecentRemovalSuccess = true;			
		}
	}


	// Probing Methods
	
	public boolean isEmpty()
	{
		return (currDEQSize == 0);
	}
	
	public boolean isFull()
	{
		return (currDEQSize == maxSize);
	}
	
	public int sizeOf()
	{
		return currDEQSize;
	}
	
	// List the contents of the DEQ
	public void show()
	{
		if (deqMode == 0) // default DEQ
		{
			System.out.print("\nL><[");
		}
	
		if ((deqMode == 1) && (direction == 0)) // SEQ, L2R
		{
			System.out.print("\nL>[");
		}
		
		if ((deqMode == 1) && (direction == 1)) // SEQ, R2L
		{
			System.out.print("\nL<[");
		}
		
		
		if (deqMode == 2) // Stack
		{
			System.out.print("\nL[");
		}
	
		for(int i = 0; i < maxSize-1; i++)
		{
			System.out.print(deqArray[i]+",");
			
		}
		
		System.out.print(deqArray[maxSize-1]); // The last element
	
	
		if (deqMode == 0) // default DEQ
		{
			System.out.print("]R><");
		}
	
		if ((deqMode == 1) && (direction == 0)) // SEQ, L2R
		{
			System.out.print("]R>");
		}
		
		if ((deqMode == 1) && (direction == 1)) // SEQ, R2L
		{
			System.out.print("]R<");
		}
		
		if (deqMode == 2) // Stack
		{
			System.out.print("]R><");
		}

	}
	
} // End class MyDEQueue


// In this class we will create a DEQ and see how it works
public class MyDEQueueExamples
{
	public static void main(String[] args)
	{
		int myDEQSize = 100;
		
		MyDEQueue myDEQInst = new MyDEQueue(myDEQSize, 0, 0);
		
		myDEQInst.show();
		
		myDEQInst.insertR(49876.98769);
		
		myDEQInst.insertL(4234.0780985029850298);
		
		myDEQInst.show();		
		
	} // End PSVM
	
} // End class MyDEQueueExamples
