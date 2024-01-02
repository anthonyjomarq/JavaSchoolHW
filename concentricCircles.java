// Standard import statements for Java packages
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Standard imports for GUI 
import javax.swing.*; // We will use JFrames to hold the GUI elements and JFrames is found in swing
import java.awt.*; 	// We will use Graphics class found here to pick and choose buttons, radio boxes etc
					// Canvas is found here as well

public class concentricCircles extends Canvas
{
	public void paint(Graphics g)
	{
		int j = 0;
		for ( int x = 0; x <= 400; x+= 10 )
        {
			if(j == 3)
				j = 0;
			int[][] myNumbers = { {255, 0, 0}, {51, 51, 51}, {204,204,204} };
			int R = myNumbers[j][0];
			int G = myNumbers[j][1];
			int B= myNumbers[j][2];
			Color random = new Color (R, G, B);  //creates your new color
			int y = 400 - ( x * 2 );
			g.setColor(random);
			g.fillOval( x + 100, x + 100, y, y );
			j++;
        }
	}
	concentricCircles(){
		//null
	}
	// Optional needed only for an executable JAVA file
	public static void main(String[] args)
	{
		concentricCircles myGUI = new concentricCircles();
		// This is a container to hold the canvas
		JFrame f = new JFrame();
		
		// Adding the canvas to the frame
		f.add(myGUI);
		
		f.setSize(700,700);
		f.setVisible(true);
		
	} // END PSVM
} // End public class concentricCircles
