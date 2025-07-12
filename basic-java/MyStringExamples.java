// Lecture #18 - Object Oriented Programming 03/28/2022
// In class live demo for String class
// 17/20 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


class MyStringExamples
{
	public static void main(String[] args)
	{
		String stdName = "";
		String stdAddress = "";
		String stdAddress1 = "";
		
		stdName = "Jabadaia Luis Fonsi";
		stdAddress = "1230 Billionare Lane, Austin, TX - 73301";
		
		System.out.println(stdName.charAt(16));
		
		System.out.println(stdName.codePointAt(16));
		
		System.out.println(stdAddress.contains("Austin")); 
		
		System.out.println(stdAddress.length());
		
		System.out.println(stdAddress.replace("Austin","Houston") );
		
		System.out.println(stdAddress.split(",").length  );
		
		System.out.println(stdName.substring(0,5));
		
		stdAddress1 = stdAddress;
		
		
		for(int i = 0; i < stdAddress.length(); i++)
		{
			System.out.println(stdAddress.charAt(i));
		}
		
		stdAddress1 = stdAddress1.replace("Austin","Blueberry");
		
		for(int i = 0; i < stdAddress1.length(); i++)
		{
			System.out.println(stdAddress1.charAt(i));
		}
				
	
	} // End PSVM

} // End class MyStringExamples
