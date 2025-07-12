// Lecture #06 - Data structures 09/13/2022
// Complete the matrix and ragged array for loops and methods and then move on to sorting (ppt) then demo
// 14/15 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #07 - Data structures 09/15/2022
// Complete the matrix and ragged array for loops and methods and then move on to sorting (ppt) then demo
// 12/15 students in attendance, Instrutor: Dr. Charles Thangaraj


import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


class MyArrayExamples
{
	
	public static void main(String args[])
	{
		// This is a 1-D array 
		// An array contains like elements only 
		// An array must be created with a known size i.e. for efficient memory allocation
		int [] aArray; // Declaration 
		aArray = new int[50]; // Creating an array of integers and size 50
		
		System.out.println("This is my arrays base address "+aArray);
		System.out.println("This is my arrays first element "+aArray[0]);
		
		// To get the size of an array
		System.out.println("This is the number of elements in my array "+aArray.length);
		
		showIntArrayContentsAll(aArray);
		showIntArrayContents(aArray,5,160);
		
		// To created a double (fractions or floating point number) array
		// The size is implicit and immutable
		// For scientific computations we need a fixed set of constants as shown here
		final double [] fpArray = {3.1415926535, 0.00000000016, 0.987479, 1e-16};
			
		
		String [] autos; // Declaration
		// After declaration the values for the array can be obtained from the user
		// from stdin
		String str01 = "Test";
		autos = new String [] {str01, "Ford", "BMW", "Audi", "Toyota", "Nissan"}; // Creation
		
		
		showStringArrayContents(autos, 1, 3);
		
		// This is a character array
		char [] myCharArray = {'f','e'};
		
		
		// 2-D Arrays 
		// AKA Matrices if #of row = # of columns i.e. non-ragged array or square matrix
		// if # of rows != # of columns => i.e. non-ragged array or matrix
		// if # of columns in each row is not the same => ragged array i.e. 2D array
		
		// type [] [] name 
		
		int [] [] my3x4matrix; // declared a 3x4 array
		//my3x4matrix = new int [3][4];
		
		my3x4matrix = new int [] [] {{2,3,4,5},{6,7,3},{1,2,3,0}}; 
		// {{row #1 values comma separated},
		//  {row #2 values  comma separated},
		//  {row #3 values  comma separated}}
		//
		
		// Nested for loops to go through the matrix row by row, column by column
		showInt2DArrayContentsAll(my3x4matrix);
		
		// Silimarly we can create 2D arrays of built in data types such as String, double, char etc
		// and also of objects of an user defined class
		
	} // END PSVM

	// A method to show all the contents of an interger array
	static void showIntArrayContentsAll(int[] arr)
	{
		int i;
		System.out.print("[");
		for(i = 0; i < arr.length-1; i++)
		{
			System.out.print(arr[i]+",");			
		}
		System.out.println(arr[arr.length-1]+"]");
		
	}
	
	// A method to show selected the contents of an interger array
	static void showIntArrayContents(int[] arr, int st, int sp)
	{
		int i;
		if(arr.length-1 < sp)
			return;
		System.out.print("[");
		for(i = st; i < sp-1; i++)
		{
			System.out.print(arr[i]+",");			
		}
		System.out.println(arr[sp-1]+"]");
		
	}
	
	// A method to show selected the contents of a String array
	static void showStringArrayContents(String [] arr, int st, int sp)
	{
		int i;
		if(arr.length-1 < sp)
			return;
		System.out.print("[");
		for(i = st; i < sp-1; i++)
		{
			System.out.print(arr[i]+",");			
		}
		System.out.println(arr[sp-1]+"]");
		
	}
	
	
	// A method to show all the contents of an interger 2D array
	static void showInt2DArrayContentsAll(int[][] arr)
	{
		int i, j;
		System.out.print("[");
		// row loop
		for(i = 0; i < arr.length; i++)
		{
			// column loop
			System.out.print("[");
			for(j = 0; j < arr[i].length-1; j++)
			{
				System.out.print(arr[i][j]+",");			
			}
		
			System.out.print(arr[i][arr[i].length-1]+"]");		
		}
				
		System.out.print("]");		
	}
	
	
} // END class MyArrayExamples
