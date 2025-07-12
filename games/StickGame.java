// Lecture #09 - Object Oriented Programming 02/16/2022
// Stick game description only
// 15/20 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #10 - Object Oriented Programming 02/21/2022
// Stick game description only - changes as needed
// 15/20 students in attendance, Instrutor: Dr. Charles Thangaraj



import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// We have a fixed number of sticks to start with, we have two players
// each player get their turn and they get to pick 1 or 2 or 3 stick(s), the 
// players alternate their turns and who ever picks the last stick looses the 
// game

public class StickGame
{
	
	// Space for any variable that will be used
	// Public 
	
	
	// Private 
	private int noOfSticks = 21; // Default value
	final private int noOfPlayers = 2; // Default value and it cannot be changed
	private int currPlayer = 1; // Whos turn it is now
		
	
	// Protected
	

	// Space for any methods that will be used 
	// Public 
	
	// Behavior of the game
	public void takeOne()
	{
		noOfSticks--; // Decrement the sticks by 1
		// Change the current player to the other person
		currPlayer = 3 - currPlayer;		
	}
	
	public boolean takeSticks(int toTake)
	{
		if( (toTake < 1 ) || (toTake > 3 )  )
		{
			return false; // Erroneous no of sticks to remove
		}
		else 
		{
			noOfSticks = noOfSticks - toTake; // Decrement the sticks by toTake value
			// Change the current player to the other person
			currPlayer = 3 - currPlayer;
			return true;
		}
	}
	
	
	// Getters and Setter 
	
	public int getNoOfSticks()
	{
		return noOfSticks;
	}
	
	public int getNoOfPlayers()
	{
		return noOfPlayers;
	}
	
	public int getCurrPlayer()
	{
		return currPlayer;
	}
	
	public boolean setNoOfSticks(int sticks)
	{
		if (sticks >= 1)
			noOfSticks = sticks;
		return true;
	}
	
	// Status update methods to provide info about the game progress
	public void status()
	{
		System.out.println("No of sticks left in the game: " + noOfSticks);
		System.out.println("Next turn belongs to: " + currPlayer);
	}
	
	public boolean gameOver()
	{
		return(noOfSticks <= 0);
	}
	
	public int getWinner()
	{
		if(noOfSticks < 1)
			return getCurrPlayer();
		else
			return 0;
	}
	
	
	// Private 
	
	// Protected
	
	// CONSTRUCTORS go here
	
	// Null constructor
	StickGame()
	{
		// null
	}
	
	// Constructor to allow more user control
	StickGame( int sticks, int start)
	{
		if (sticks >= 1)
			noOfSticks = sticks;
		
		if ( (start == 1) || (start == 2) )
			currPlayer = start;
	
	}
	
	
	/*
	// Optional needed only for an executable JAVA file
	public static void main(String[] args)
	{
		
		
	} // END PSVM
	*/
	
} // End public class StickGame
