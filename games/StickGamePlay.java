// Lecture #09 - Object Oriented Programming 02/16/2022
// Stick game play only 
// 15/20 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #10 - Object Oriented Programming 02/21/2022
// Stick game play only, adding a simple GUI display only 
// 15/20 students in attendance, Instrutor: Dr. Charles Thangaraj


import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class StickGamePlay
{
	public static void main(String[] args)
	{
		
		// Create an object of the StickGame class
		
		// Create and initialize the game instance with 25 sticks and player 1 starting
		StickGame myGame = new StickGame(25,1);
		
		String name1 = "null";
		String name2 = "null";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input player #1's name: ");
		name1 = sc.nextLine();
		
		System.out.println("Please hit enter");
		sc.nextLine(); // Just to clear the keyboard buffer
		
		System.out.println("Input player #2's name: ");
		name2 = sc.nextLine();
		
		System.out.println("Please hit enter");
		sc.nextLine(); // Just to clear the keyboard buffer
		
		System.out.println("Player #1: " + name1);
		System.out.println("Player #2: " + name2);
		
		
		// do these steps when the game is not over 
		
		while(!myGame.gameOver())  // when the game is still going, myGame.gameOver() will retrun a false
		{
			// You are here since the game is not over yet
			
			// Get the current status of the game
			myGame.status();
			
			// Prompt the current player for how many sticks to remove
			System.out.print("\nEnter the number of sticks you wish to remove: ");
			int toRemove;
			toRemove = sc.nextInt(); // Read from the std input and store it in the variable
			
			// Now go and remove the entered number of sticks
			if( myGame.takeSticks(toRemove) )
				System.out.println("Successfully removed " + toRemove + " sticks."  );
			else
				System.out.println("Removal ERROR" );
			
			System.out.println();	// just a blank line			
		}
		
		
		if (myGame.getWinner() > 0)
		{
			if (myGame.getWinner() == 1)
			{
				System.out.println("\nThe winner is player #1: " + name1);
			} 
			else 
			{
				System.out.println("\nThe winner is player #2: " + name2);
			}
		}
		
		
	} // End PSVM	
	
} // End public class StickGamePlay
