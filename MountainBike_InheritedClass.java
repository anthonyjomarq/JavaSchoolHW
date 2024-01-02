// Lecture #19 - Object Oriented Programming 03/30/2022
// In class live demo for Inheritance
// 14/20 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 

// Lecture #20 - Object Oriented Programming 04/04/2022
// In class live demo for Inheritance
// 17/20 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Inherited class from the Base class
// Base/super/parent/root class: MyBike_BaseClass
// Inherited class: MountainBike_InheritedClass

public class MountainBike_InheritedClass extends MyBike_BaseClass
{
	// public variables
	
	// protected variable
	
	// private variables
	private int seatHeight;
	private boolean fullSuspension;
	private boolean flatProofTyres;
	
	// I am making these private for data encapsulation reasons
	// That is, no public access to class variable except through approved fellow or member methods
	// This is called data encapsulation
	
	//Constructor - only one is used here - you can have multiple constructors if you want to
	public MountainBike_InheritedClass(int SH, boolean FS, boolean FPT, int S, int G, String C, String SF)
	{
		//Passing the base class parameters to the base class constructor
		// "super" is a keyword
		// Make sure this is the first line in any inherited class' constructor
		super(S, G, C, SF);
		
		// Now deal with the inherited class' variables
		// "this" is a keyword
		this.seatHeight = SH;
		this.fullSuspension = FS;
		this.flatProofTyres = FPT;		
	}
	
	
	//Methods
	
	// Getters and Setter 
	// These are the methods that allow access to the private variables that are encapsulated by intent 
	
	// Totally optional method, but it is a good idea to have one if you need to quickly know what the class contains
	public void help()
	{
		System.out.println("Print all the relevent class information to be displayed");
	}
	
	// Getters
	
	public int getSeatHeight()
	{
		return this.seatHeight;
	}
	
	public boolean isFullSuspension()
	{
		return this.fullSuspension;
	}

	public boolean isFlatProofTyres()
	{
		return this.flatProofTyres;
	}

	// Setters
	
	public boolean setSeatHeight(int SH)
	{
		this.seatHeight = SH;
		return true;
	}
	
	public boolean setFullSuspension(boolean FS)
	{
		this.fullSuspension = FS;
		return true;
	}

	public boolean setFlatProofTyres(boolean FPT)
	{
		this.flatProofTyres = FPT;
		return true;
	}

	// Polymorphism (run time) - this inherited class method OVERRIDES the base class method
	
	public String getInfo()
	{
		String msg;
		msg = "Bike Info 1/2: {Max speed setting  " + maxSpeed + ", No of gears " + noOfGears + ", Frame color " + paintColor + ", Safety features " + safetyFeatures + "}\n";
		msg = msg + "Bike Info 2/2: {Seat Height " + seatHeight + ", Full Suspension " + fullSuspension + ", Flat Proof Tyres " + flatProofTyres + " }\n";
		return msg;
	}
	
} // End public class MountainBike_InheritedClass 
