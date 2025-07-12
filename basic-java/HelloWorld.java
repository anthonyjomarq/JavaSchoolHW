// Lecture #04 - OOP 1/31/2022  
// In class live demo for Coding tips and simple class definition and usage
// All (15/20) students in attendance, Instrutor: Dr. Charles Thangaraj
// Note 01: Name the file the same as the main class name 

// Post lecture comment: 	

// Lecture #05 - OOP 2/2/2022  
// In class live demo for Coding tips and simple class definition and usage
// All (16/20) students in attendance, Instrutor: Dr. Charles Thangaraj
// Note 01: Name the file the same as the main class name 

// Post lecture comment: 	


// Standard import statements for Java packages
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


public class HelloWorld
{
	
	// Class variable and methods 
	
	// Class variables
	// We created a variable of type String called greeting and assigned a 
	// string value to it.
	// We also made it private so no one else (otherthan fellow methods) can 
	// access this variable
	private String greeting = "Hello UST folks of OOP Spring 2022 ";
		
	// Class methods
	void displayGreeting()
	{
		System.out.println("This is my greeting:  " + this.greeting);
		
	} // End displayGreeting()
	
	// Getters and Setter
	
	//Return type of string
	String getGreeting()
	{
		return this.greeting;
		
	} // End displayGreeting()
	
	void setGreeting(String msg)
	{
		this.greeting = msg;
	}
	
	
	// Constructor is used when an object of a class is created, 
	// the contents of the constructor initializes the object for us
	// Null constructor
	// A method with same name as the class
	// has no return type 
	// can accept arguments passed to it
	HelloWorld()
	{
		// Null sentences
		//greeting = "I am null";
	}
	
	// Second constructor
	HelloWorld(String testMessage)
	{
		greeting = testMessage;
	}

	
	// This is the main method where the execution starts
	// this is mandatory for java files that are intended for executing some code
	
	public static void main(String[] args)
	{
		// Declaring an object of the HelloWorld class 
		HelloWorld myFirstGreeting;
		
		// Creating the object that was declared above
		myFirstGreeting = new HelloWorld();
		
		// Declaring an object of the HelloWorld class
		HelloWorld mySecondGreeting;
		
		// Creating the object that was declared above
		mySecondGreeting = new HelloWorld("I now know how to use the other constructor !!");
		

		// The two statements below directly access a private class variable
		// while this will work here because we are inside the same file
		// But it is better to have a methods that accesses the variable and call that 
		// method instead of the variable directly 
		System.out.println("This is my 1st rodeo  " + myFirstGreeting.greeting);
		System.out.println("This is my 2nd rodeo  " + mySecondGreeting.greeting);	
		
		myFirstGreeting.displayGreeting();
		mySecondGreeting.displayGreeting();		
		
		
	} // End PSVM
	
} // End public class HelloWorld
