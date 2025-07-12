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

class EBike_InheritedClass_L2 extends MountainBike_InheritedClass
{
	private int rangeMiles;
	private String batteryType; // Li-ion, NiMH, SLA, AGM, LiPo
	private int batterySize; // A-hours
	private int batteryVolt; // 12/24/36/48 
	private double motorPower; // in KW 0.5. 1.0 etc
	
	// Constructor
	
	public EBike_InheritedClass_L2(int SH, boolean FS, boolean FPT, int S, int G, String C, String SF, int RM, String BTy, int BSz, int BVt, double MP)
	{
		super(SH, FS, FPT, S, G, C, SF);
		
		this.rangeMiles = RM;
		this.batteryType = BTy;
		this.batterySize = BSz;
		this.batteryVolt = BVt;
		this.motorPower = MP;	
		
	}
	
	// Getter and Setter
	public int getRange()
	{
		return this.rangeMiles;
	}
	
	public void setRange(int R)
	{
		this.rangeMiles = R;
	}
	
	public String getBatteryInfo()
	{
		String msg = ("Battery Type: " + this.batteryType + ", Battery Size: " + this.batterySize + ", Battery Voltage: " + this.batteryVolt);
		return msg;		
	}
	
	public boolean setBatteryInfo(String BT, int BS, int BV)
	{
		this.batteryType = BT;
		this.batterySize = BS;
		this.batteryVolt = BV;
		return true;
	}
	
	public double getKW()
	{
		return this.motorPower;
	}
	
	public boolean setKW(double pwr)
	{
		this.motorPower = pwr;
		return true;
	}
	
	public String getInfo()
	{
		String msg;
		msg = "Bike Info 1/4: {Max speed setting  " + maxSpeed + ", No of gears " + noOfGears + ", Frame color " + paintColor + ", Safety features " + safetyFeatures + "}\n";
		msg = msg + "Bike Info 2/4: {Seat Height " + this.getSeatHeight() + ", Full Suspension " + this.isFullSuspension() + ", Flat Proof Tyres " + this.isFlatProofTyres() + " }\n";
		msg = msg + "Bike Info 3/4: {" + getBatteryInfo() + " }\n";
		msg = msg + "Bike Info 4/4: {Range in miles " + this.rangeMiles + ", Motor Power " + this.motorPower + " }\n";
		return msg;
	}
	
	
} // End class EBike_InheritedClass_L2 extends MountainBike_InheritedClass
