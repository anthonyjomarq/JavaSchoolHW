import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

// Standard imports for GUI 
import javax.swing.*; // We will use JFrames to hold the GUI elements and JFrames is found in swing
import java.awt.*; 	// We will use Graphics class found here to pick and choose buttons, radio boxes etc
					// Canvas is found here as well
public class Riddle extends Canvas
{

	// Space for any variable that will be used
	// Public 

	// Private 
	private String question; // This hold the question phrase
	private String answer; // This hold the answer response phrase
	private String hint; // This hold the hint response phrase when requested
	
	// Protected
	
	// Space for any methods that will be used 
	// Public
	 
	// paint is a method that is defined in the Canvas class
	// we are redefining it here to modify it to suit our needs
	
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(10,10,435,400);// This creates a rectangle and fills it with the current set color
		
		g.setColor(Color.black);
		Font font = new Font("Serif", Font.ITALIC + Font.BOLD, 18); // font is an object of the class Font
        g.setFont(font); // sets the font type for the Graphics object g in our canvas 
		
		g.drawString("Question : " + question, 20,120); // This will create a textbox
		g.drawString("Answer : " + answer, 20,220); // This will create a textbox
		g.drawString("Hint : " + hint, 20,320); // This will create a textbox
		
	}
	
	// Getters and Setters
	
	public String getQuestion()
	{
		return question;
	}
	
	public String getAnswer()
	{
		return answer;
	}
	
	public String getHint()
	{
		return hint;
	}
	
	public void setQuestion(String text)
	{
		question = text;
	}
	
	public void setAnswer(String text)
	{
		answer = text;
	}
	
	public void setHint(String text)
	{
		hint = text;
	}
	
	// Behavior of the objects of this class
	
	public void displayCard()
	{
		System.out.print("\n-----------------------------------------------------\n");
		
		System.out.print("Question is: " + question + "\n");
		System.out.print("Answer is: " + answer + "\n");
		System.out.print("Hint is: " + hint + "\n");
		
		System.out.print("\n-----------------------------------------------------\n");
		
	}
		
	// Private 
	
	// Protected
	
	// CONSTRUCTORS go here
	
	//Null
	Riddle()
	{
		// Null constructor
		this.question = "Null";
		this.answer = "Null";
		this.hint = "Null";
	}
	
	// When the question and answer are known
	Riddle(String q, String a)
	{
		this.question = q;
		this.answer = a;
		this.hint = "Null";
	}
	
	// When the question, answer and hint are known
	Riddle(String q, String a, String h)
	{
		this.question = q;
		this.answer = a;
		this.hint = h;
	}
		
	
	// Optional needed only for an executable JAVA file
	public static void main(String[] args)
	{
		
		Riddle myGUI = new Riddle();
		
		// This is a container to hold the canvas
		JFrame f = new JFrame();
		
		// Adding the canvas to the frame
		f.add(myGUI);
		
		f.setSize(500,500);
		f.setVisible(true);
		
		// Creating a few flash card objects to play this game
		Riddle fc001 = new Riddle(); // create the blank flash card
		
		Riddle fc002 = new Riddle("What is 3 ^ 3?","27"); // create a flash card with a Q and A
		
		Riddle fc003 = new Riddle("What is 4 ^ 3?","64", "How many bits processor in a computer"); // create a flash card with a Q, A and H
		
		Riddle fc004 = new Riddle("What gets better when rotting?","Wine", "Yeast by dear folks, yeast I am"); // create a flash card with a Q, A and H
		
		
		Scanner sc = new Scanner(System.in);
		
		fc001.setQuestion("Why did the koala go to college?");
		fc001.setAnswer("To get better koala-fications !!");
		fc001.setHint("Kurt the koala likes to dress in graduation gowns");
		
		fc001.displayCard();
		myGUI.question = fc001.getQuestion();
		myGUI.answer = fc001.getAnswer();
		myGUI.hint = fc001.getHint();
	    myGUI.repaint(); // Update the GUI with the new counts
		System.out.print("\nEnter if you want to continue (Yes: 1, No: Anything else): ");
		int toEnd;
		toEnd = sc.nextInt(); // Read from the std input and store it in the variable
		if (toEnd == 1){
			fc002.displayCard();
			myGUI.question = fc002.getQuestion();
			myGUI.answer = fc002.getAnswer();
			myGUI.hint = fc002.getHint();
			myGUI.repaint(); // Update the GUI with the new counts
		}
		else{
			System.out.print("\nTHANK YOU!");
			System.exit(0);
		}
		System.out.print("\nEnter if you want to continue (Yes: 1, No: Anything else): ");
		toEnd = sc.nextInt(); // Read from the std input and store it in the variable
		if (toEnd == 1){
			fc003.displayCard();
			myGUI.question = fc003.getQuestion();
			myGUI.answer = fc003.getAnswer();
			myGUI.hint = fc003.getHint();
			myGUI.repaint(); // Update the GUI with the new counts
		}
		else {
			System.out.print("\nTHANK YOU!");
			System.exit(0);
		}
		System.out.print("\nEnter if you want to continue (Yes: 1, No: Anything else): ");
		toEnd = sc.nextInt(); // Read from the std input and store it in the variable
		if (toEnd == 1){
			fc004.displayCard();
			
			myGUI.question = fc004.getQuestion();
			myGUI.answer = fc004.getAnswer();
			myGUI.hint = fc004.getHint();
			myGUI.repaint(); // Update the GUI with the new counts
		}
		else{
			System.out.print("\nTHANK YOU!");
			System.exit(0);
		}
	} // END PSVM
} // End public class Riddle
