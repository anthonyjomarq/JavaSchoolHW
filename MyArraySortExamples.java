// Lecture #08 - Data structures 09/20/2022
// Complete the matrix and ragged array for loops and methods and then move on to sorting (ppt) then demo
// 12/15 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #09 - Data structures 09/22/2022
// Complete the matrix and ragged array for loops and methods and then move on to sorting (ppt) then demo
// 14/15 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #10 - Data structures 09/27/2022
// Complete the matrix and ragged array for loops and methods and then move on to sorting (ppt) then demo
// 12/15 students in attendance, Instrutor: Dr. Charles Thangaraj


import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class MyArraySortExamples
{
	
	public static void main(String[] args)
	{
	
		// Declare and assign an array of 25 elements to sort, interger array
		int[] list = {103,32,73,47,72,52,71,89,65,47,29,11,6,99,3,7,18,39,44,61,117,154,309,212,102};
		int[] listA = {103,32,73,47,72,52,71,89,65,47,29,11,6,99,3,7,18,39,44,61,117,154,309,212,102};
		int[] listB = {103,32,73,47,72,52,71,89,65,47,29,11,6,99,3,7,18,39,44,61,117,154,309,212,102};
		
		int[] listC = {3,7,12,47,52,71,89,99,117,154,212,302};
	
		System.out.println(linearSearchInt(47, list)); // Should return 3
		System.out.println(linearSearchInt(47352, list)); // Should return -1
	
		System.out.println(binarySearchInt(47, listC));
		System.out.println(binarySearchInt(433, listC));
		
		MyArrayExamples.showIntArrayContentsAll(list);
		
		int[] listSorted = bubbleSort(list, 0);
		//System.out.println("Length of new array = " + bubbleSort(listC, 0).length );
		MyArrayExamples.showIntArrayContentsAll(listSorted);
		
		listSorted = bubbleSort(list, 1);
		MyArrayExamples.showIntArrayContentsAll(listSorted);
	
	} // End PSVM
	
	
	// Search Algorithm 1 of 2
	// Linear search
	
	// If an element is found, return the index of the element (first occurence)
	// If not found i.e. we reach the end of the array then return a -1
	
	static int linearSearchInt(int target, int [] arr)
	{
		int result = -1;
		
		for (int i = 0; i < arr.length-1; i++)
		{
			
			if (target == arr[i])
			{	
				result = i;		
				break;
			}
		}
		
		return result;
	}
	
	
	// Search Algorithm 2 of 2
	// Binary search
	// For this to work, the array must be sorted in ascending or descending order
	
	// If an element is found, return the index of the element (first occurence)
	// If not found i.e. we reach the end of the array then return a -1
	
	static int binarySearchInt(int target, int [] arr)
	{
		int result = -1;
				
		// check to see if the array is pre-sorted
		if( isAscending(arr) || isDescending(arr)  )
		{
			int low = 0; // low pointer
			int mid = 0; // mid pointer
			int high = arr.length-1; // high pointer
			
			while(result == -1 && low <= high)
			{
				mid = low + ( (high - low)/2 ); 
				
				if(arr[mid] == target)
					result = mid;
				else if (arr[mid] > target)
					high = mid - 1;
				else 
					low = mid + 1;
			}
		}	
		else
		{
			System.out.println("The input array is not pre-sorted: Cannot proceed with search - Exiting now");
		}
		
		return result;
	}
	
	// A method to check to see of an comming interger array is sorted in ascending order
	static boolean isAscending(int [] arr)
	{
		boolean sorted = true;
		int i = 1;
		
		while( sorted && i < arr.length && i >= 0)
		{
			sorted = (arr[i-1] <= arr[i]);
			i++;			
		}
		
		return sorted;
	}
	
	// A method to check to see of an comming interger array is sorted in descending order
	static boolean isDescending(int [] arr)
	{
		boolean sorted = true;
		int i = 1;
		
		while( sorted && i < arr.length && i >= 0)
		{
			sorted = (arr[i-1] >= arr[i]);
			i++;			
		}
	
		return sorted;
	}
	
	
	//Sorting Algorithm 1 of 3 
	// Bubble Sort 
	// We compare two adjacent elements in an array and swap them if needed 
	// for ascending sort swap when value[i-1] > value[i]
	// for descending sort swap when value[i-1] < value[i]
	// Do this repeatedly until no swapping is needed
	// direction 0 = ascending, 1 = descending
	
	public static int[] bubbleSort(int[] arr, int direction)
	{
		// Checking if the incomming array is already sorted
		if( (direction == 0) && (isAscending(arr)) )
			return arr;
		if( (direction == 1) && (isDescending(arr)) )
			return arr;
		
		// Creating a new array the same size as the original 
		int newSize = arr.length;
		int[] newArr = new int[newSize];
		
		System.arraycopy(arr, 0, newArr, 0, newSize);
		
		// DO the sorting here
		
		boolean swapDone = true;
		int count = 0;
		int temp;
		
		// While loop outside the for loop and condition to check is a swap was made
		while(swapDone)
		{
			swapDone = false;
			
			for(int i = 1; (i < newSize); i++)
			{
				
				if ( (newArr[i-1] > newArr[i]) && direction == 0) 
				{
					temp = newArr[i-1];
					newArr[i-1] = newArr[i];
					newArr[i] = temp;
					swapDone = true;			
				}
			
				if ( (newArr[i-1] < newArr[i]) && direction == 1) 
				{
					temp = newArr[i-1];
					newArr[i-1] = newArr[i];
					newArr[i] = temp;
					swapDone = true;			
				}
			
			}
	
			count++;
		}
		System.out.println("Total number of cycles needed to sort the array : " + count++);
		return newArr;
	}
	
	
	//Sorting Algorithm 2 of 3 
	// Selection Sort 
	
	// This will iterate through an array, find the lowest element (in value) and swap that element 
	// with the first element in the (sub)array.
	
	// Ignoring the already sorted portions of the original array the above process is repeated.
	
	// direction = true is ascending, false is desending
	public static int [] selectionSort(int[] list, boolean direction)
	{
		int min; // to hold the index of the newly found min value in the sub array
		int tmp; // temporary variable to swap
		
		// Creating a new array the same size as the original 
		int newSize = list.length;
		int[] newArr = new int[newSize];
		
		System.arraycopy(list, 0, newArr, 0, newSize);		
		
		for(int i = 0; i < newArr.length - 1; i++)
		{
			min = i; // setting the min index to outer loop value
			
			// Sub-Array 
			for(int j = i + 1; j < newArr.length; j++)
			{
				if(direction)
				{
					if(newArr[j]<newArr[min])
						min = j;
					//replacing the first element in the sub-array with the newly found min value
					// we are using the index to do the replacement
					int temp;
					temp = newArr[i];
					newArr[i] = newArr[min];
					newArr[min]=temp;				
				}
				else
				{
					if(newArr[j]>newArr[min])
					min = j;
					//replacing the first element in the sub-array with the newly found max value
					// we are using the index to do the replacement
					int temp;
					temp = newArr[i];
					newArr[i] = newArr[min];
					newArr[min]=temp;
				}

			}		
			
		}

		return newArr;
		
	} // End selectionSort()
	
	
	
	//Sorting Algorithm 3 of 3 
	// Insertion Sort 
	
	// Iterate through the array for each element compare it to all the previous elements and insert the current element at the location 
	// when it is smaller than the element to its right (left) for decending (ascending)
	// 
	// direction = true is ascending, false is desending 
	public static int [] insertionSort(int[] list, boolean direction)
	{
		int temp, j;
		
		// Creating a new array the same size as the original 
		int newSize = list.length;
		int[] newArr = new int[newSize];
		
		System.arraycopy(list, 0, newArr, 0, newSize);
		
		for(int i = 1; i < newArr.length; i++)
		{
			temp = newArr[i];
			j = i;
		
			while( j > 0 && temp < newArr[j - 1] && direction){
				// swap elements
				newArr[j] = newArr[j - 1];
				newArr[j - 1] = temp;
				j--;
			}
		
			while( j > 0 && temp > newArr[j - 1] && (!direction)){
				// swap elements
				newArr[j] = newArr[j - 1];
				newArr[j - 1] = temp;
				j--;
			}

		}
		
		return newArr;
		
	} // End insertionSort()

	
} // End class MyArraySortExamples
