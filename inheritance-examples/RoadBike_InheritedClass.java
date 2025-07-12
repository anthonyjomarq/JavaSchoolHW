// Lecture #21 - Object Oriented Programming 04/06/2022
// In class live demo for Inheritance
// 17/20 students in attendance, Instrutor: Dr. Charles Thangaraj
// Post lecture comment: 

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Inherited class from the Base class
// Base/super/parent/root class: MyBike_BaseClass
// Inherited class: RoadBike_InheritedClass

class RoadBike_InheritedClass extends MyBike_BaseClass
{
	
	private boolean flatHandleBar;
	
	// Getter
	public boolean isFlatHandleBar()
	{
		return flatHandleBar;
	}
	
	// Setter
	public void setFlatHandleBar(boolean type)
	{
		flatHandleBar = type;
	}
	
	// Constructor
	public RoadBike_InheritedClass(int S, int G, String C, String SF, boolean FHB)
	{
		super(S, G, C, SF);
		flatHandleBar = FHB;		
	}
	
	// Methods
	
	public String getInfo()
	{
		String msg;
		msg = "Bike Info 1/2: {Max speed setting  " + this.maxSpeed + ", No of gears " + this.noOfGears + ", Frame color " + this.paintColor + ", Safety features " + this.safetyFeatures + "}\n";
		msg = msg + "Bike Info 2/2: {Flat Handle Bar: " + flatHandleBar + " }\n";
		return msg;
	}
	
	
} // End class RoadBike_InheritedClass extends MyBike_BaseClass
