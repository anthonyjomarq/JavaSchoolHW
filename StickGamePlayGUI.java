// Lecture #09 - Object Oriented Programming 02/16/2022
// Stick game play only 
// 15/20 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #10 - Object Oriented Programming 02/21/2022
// Stick game play only, adding a simple GUI display only 
// 15/20 students in attendance, Instrutor: Dr. Charles Thangaraj

// Lecture #11 - Object Oriented Programming 02/23/2022
// Stick game play only, adding a simple GUI display only 
// 15/20 students in attendance, Instrutor: Dr. Charles Thangaraj

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Standard imports for GUI 
import javax.swing.*; // We will use JFrames to hold the GUI elements and JFrames is found in swing
import java.awt.*; 	// We will use Graphics class found here to pick and choose buttons, radio boxes etc
					// Canvas is found here as well



public class StickGamePlayGUI extends Canvas
{
	
	public String player_1 = "_one_";
	public String player_2 = "_two_";
	
	public int X_limit = 0; // Variables to hold the size of the parent frame X and Y
	public int Y_limit = 0;
	
	public int player_1_count = 0;
	public int player_2_count = 0;
	public int remainingSticks = 0;
	
	
	// Now write how the GUI display should be created 
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.fillRect( (X_limit*10/100) , (Y_limit*15/100) , (X_limit*40/100) , (Y_limit*10/100));// This creates a rectangle and fills it with the current set color
		
		g.setColor(Color.yellow);
		g.fillRect( (X_limit*50/100) , (Y_limit*15/100) , (X_limit*40/100), (Y_limit*10/100)); // Create a rectangle and fills it with the current set color
			
		g.setColor(Color.green);
		g.fillRect((X_limit*15/100), (Y_limit*30/100) , (X_limit*70/100) , (Y_limit*10/100)); // Create a rectangle and fills it with the current set color
		
		g.setColor(Color.black);
		
		Font font = new Font("Serif", Font.ITALIC + Font.BOLD, 18); // font is an object of the class Font
        g.setFont(font); // sets the font type for the Graphics object g in our canvas 
		
		
		g.drawString("Howdy Player #1: " + player_1, (X_limit*10/100),(Y_limit*10/100)); // This will create a textbox 
		g.drawString("Howdy Player #2: " + player_2, (X_limit*50/100),(Y_limit*10/100)); // This will create a textbox
		
		g.drawString("Sticks in hand " + player_1_count, (X_limit*10/100),(Y_limit*20/100)); // This will create a textbox
		g.drawString("Sticks in hand " + player_2_count, (X_limit*50/100),(Y_limit*20/100)); // This will create a textbox
		g.drawString("Sticks remaining in the game : " + remainingSticks, (X_limit*20/100),(Y_limit*35/100)); // This will create a textbox
			
	}


	public static void main(String[] args)
	{
		// Create an object of the StickGamePlayGUI class to get the GUI portion to work
		StickGamePlayGUI myGUI = new StickGamePlayGUI();
		
		// This is a container to hold the canvas
		JFrame f = new JFrame();
		
		// Adding the canvas to the frame
		f.add(myGUI);
		
		int frame_size_X = 500;
		int frame_size_Y = 500;
		
		f.setSize(frame_size_X,frame_size_Y);
		f.setVisible(true);
			
		
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
		
		int temp_count1 = 0; // To temp hold the counts to update the gui
		int temp_count2 = 0;
		
		System.out.println("Player #1: " + name1);
		System.out.println("Player #2: " + name2);
		
		// For GUI
		myGUI.player_1 = name1;
		myGUI.player_2 = name2;
		myGUI.remainingSticks = myGame.getNoOfSticks();
		
		myGUI.X_limit = frame_size_X;
		myGUI.Y_limit = frame_size_Y;
		
		myGUI.repaint();
		
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
			{
					System.out.println("Successfully removed " + toRemove + " sticks."  );
					if (myGame.getCurrPlayer() == 2)
						temp_count1 += toRemove;
					else
						temp_count2 += toRemove;
			}
			else
				System.out.println("Removal ERROR" );
			
			
			
			System.out.println();	// just a blank line			
		
			myGUI.player_1_count = temp_count1;
			myGUI.player_2_count = temp_count2;
			myGUI.remainingSticks = myGame.getNoOfSticks();
			
			myGUI.repaint(); // Update the GUI with the new counts
		
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
	
} // End public class StickGamePlayGUI
