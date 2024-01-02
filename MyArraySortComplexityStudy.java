// Lecture #10 - Data structures 09/27/2022
// Complete the matrix and ragged array for loops and methods and then move on to sorting (ppt) then demo
// 12/15 students in attendance, Instrutor: Dr. Charles Thangaraj

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
import java.time.*;

// This file is used to test the time taken by various sorting algorithms to sort arrays of various preset sizes

public class MyArraySortComplexityStudy
{
	public static void main(String[] args)
	{
		
		// Open a file to store my results into
		// File outFile = new File("runtimes.txt")
		
		try
		{
			// Code that could results in an error
			FileWriter myTextToWrite = new FileWriter("runtimes.txt");
			
			// To create a random number
			Random rd = new Random();
			
			int[] arrSize = {10,100,500,1000,5000,10000,50000,100000,500000,1000000};
			
			for (int i = 0; i < arrSize.length; i++) 
			{
				int[] arrBS = new int [arrSize[i]]; // Array to use with bubble sort
				int[] arrSS = new int [arrSize[i]]; // selection sort
				int[] arrIS = new int [arrSize[i]];	// insertion sort
				int[] arrAS = new int [arrSize[i]];	// built-in sort
			
			
				for (int j = 0; j < arrBS.length; j++) {
					arrBS[j] = rd.nextInt(); // storing random integers in an array			
				}
				
				// Create copies to get 4 identical arrays
				System.arraycopy(arrBS,0,arrSS,0,arrBS.length);
				System.arraycopy(arrBS,0,arrIS,0,arrBS.length);
				System.arraycopy(arrBS,0,arrAS,0,arrBS.length);
				
				// Calling all the sort algorithms to check time stamps
				
				System.out.println("\n\nRun " + i + " of " + (arrSize.length-1) + " | Sort array size: " + arrSize[i] + "\n");
				myTextToWrite.write("\n\nRun " + i + " of " + (arrSize.length-1) + "\n");
				System.out.println("\nSorting the random large array using bubble sort algorithm at " + LocalDateTime.now());
				myTextToWrite.write("\nSorting the random large array using bubble sort algorithm at " + LocalDateTime.now());
				MyArraySortExamples.bubbleSort(arrBS, 0);
				System.out.println("\nBubble sort algorithm complete at " + LocalDateTime.now());
				myTextToWrite.write("\nBubble sort algorithm complete at " + LocalDateTime.now());
				
				System.out.println("\nSorting the random large array using selection sort algorithm at " + LocalDateTime.now());
				myTextToWrite.write("\nSorting the random large array using selection sort algorithm at " + LocalDateTime.now());
				MyArraySortExamples.selectionSort(arrSS, true);
				System.out.println("\nSelection sort algorithm complete at " + LocalDateTime.now());
				myTextToWrite.write("\nSelection sort algorithm complete at " + LocalDateTime.now());
				
				System.out.println("\nSorting the random large array using insertion sort algorithm at "+ LocalDateTime.now());
				myTextToWrite.write("\nSorting the random large array using insertion sort algorithm at "+ LocalDateTime.now());
				MyArraySortExamples.insertionSort(arrIS, true);
				System.out.println("\nInsertion sort algorithm complete at " + LocalDateTime.now());
				myTextToWrite.write("\nInsertion sort algorithm complete at " + LocalDateTime.now());
			
				System.out.println("\nSorting the random large array using Arrays.sort algorithm at "+ LocalDateTime.now());
				myTextToWrite.write("\nSorting the random large array using Arrays.sort algorithm at "+ LocalDateTime.now());
				Arrays.sort(arrAS);
				System.out.println("\nArrays.sort algorithm complete at " + LocalDateTime.now());
				myTextToWrite.write("\nArrays.sort algorithm complete at " + LocalDateTime.now());		
				
			
			} // Outer loop
			
			myTextToWrite.close();
		
		} catch (Exception e)
		{
			System.out.println("An error occured while trying to open the results file for writing - quiting");
			e.printStackTrace();
		}
		
		
		
	} // End PSVM



} // End public class MyArraySortComplexityStudy
