// Lecture #07 - OOP 2/9/2022  
// In class live demo for generating a simple gui for the hello world example
// All (16/20) students in attendance, Instrutor: Dr. Charles Thangaraj
// Note 01: Name the file the same as the main class name 

// Post lecture comment: 	This file is to demo the use of private variables and how to get and set them 
//							externally


// Standard import statements for Java packages
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Standard imports for GUI 
import javax.swing.*; // We will use JFrames to hold the GUI elements and JFrames is found in swing
import java.awt.*; 	// We will use Graphics class found here to pick and choose buttons, radio boxes etc
					// Canvas is found here as well

public class HelloWorldGUI extends Canvas
{
	// Space for any variable that will be used
	// Public 
	
	// Private 
	
	// Protected
	

	// Space for any methods that will be used 
	// Public 
	
	// paint is a method that is defined in the Canvas class
	// we are redefining it here to modify it to suit our needs
	
	public void paint(Graphics g)
	{
		g.drawString("Howdy - fine folks of OOP SP 2022", 250,50); // This will create a textbox 
		
		g.setColor(Color.cyan);
		g.fillRect(20,20,220,220);// This creates a rectangle and fills it with the current set color
		
		g.setColor(Color.yellow);
		g.fillOval(220,100,220,280); // Create an oval and fills it with the current set color
		
		g.setColor(Color.red);
		for(int i = 10; i< 210; i += 20 )
		{
			g.drawLine(100,20,i,500);
		}
		
	}
	
	// Private 
	
	// Protected
	
	// CONSTRUCTORS go here
	
	// Null 
	HelloWorldGUI()
	{
		// null
	}
	
	
	// Optional needed only for an executable JAVA file
	public static void main(String[] args)
	{
		
		HelloWorldGUI myGUI = new HelloWorldGUI();
		
		// This is a container to hold the canvas
		JFrame f = new JFrame();
		
		// Adding the canvas to the frame
		f.add(myGUI);
		
		f.setSize(500,500);
		f.setVisible(true);
		
	} // END PSVM
	
	
	
} // End public class HelloWorldGUI

