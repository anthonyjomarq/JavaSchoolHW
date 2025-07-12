// Lecture #05 - OOP 2/2/2022  
// In class live demo for Coding tips and simple class definition and usage
// All (16/20) students in attendance, Instrutor: Dr. Charles Thangaraj
// Note 01: Name the file the same as the main class name 

// Post lecture comment: 	This file is to demo the use of private variables and how to get and set them 
//							externally


// Standard import statements for Java packages
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


public class HelloWorld2
{
	
	public static void main(String[] args)
	{
		// Declaration and creation all in one line
		HelloWorld myExternalGreeting = new HelloWorld("This is the externally created greeting");
		
		myExternalGreeting.displayGreeting();
		
		System.out.println("I got this greeting: " + myExternalGreeting.getGreeting());
		
		myExternalGreeting.setGreeting("This is an externally resetted message :)");
		
		System.out.println("I got this greeting: " + myExternalGreeting.getGreeting());
		
	} // End PSVM


} //End public class HelloWorld2
