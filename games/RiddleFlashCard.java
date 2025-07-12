// Lecture #08 - Object Oriented Programming 02/14/2022
// Riddle flash card game 
// 15/20 students in attendance, Instrutor: Dr. Charles Thangaraj

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class RiddleFlashCard extends Object
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
	RiddleFlashCard()
	{
		// Null constructor
		this.question = "Null";
		this.answer = "Null";
		this.hint = "Null";
	}
	
	// When the question and answer are known
	RiddleFlashCard(String q, String a)
	{
		this.question = q;
		this.answer = a;
		this.hint = "Null";
	}
	
	// When the question, answer and hint are known
	RiddleFlashCard(String q, String a, String h)
	{
		this.question = q;
		this.answer = a;
		this.hint = h;
	}
		
	
	// Optional needed only for an executable JAVA file
	public static void main(String[] args)
	{
		// Creating a few flash card objects to play this game
		RiddleFlashCard fc001 = new RiddleFlashCard(); // create the blank flash card
		
		RiddleFlashCard fc002 = new RiddleFlashCard("what is 3 ^ 3?","27"); // create a flash card with a Q and A
		
		RiddleFlashCard fc003 = new RiddleFlashCard("what is 4 ^ 3?","64", "how many bits processor in a computer"); // create a flash card with a Q, A and H
		
		RiddleFlashCard fc004 = new RiddleFlashCard("what gets better when rotting?","wine", "yeast by dear folks, yeast I am"); // create a flash card with a Q, A and H
		
		
		fc001.displayCard();
		fc002.displayCard();
		fc003.displayCard();
		fc004.displayCard();
		
		
		fc001.setQuestion("Why did the koala go to college?");
		fc001.setAnswer("To get better koala-fications !!");
		fc001.setHint("Kurt the koala likes to dress in graduation gowns");
		
		fc001.displayCard();
		
		
	} // END PSVM
	
	
	
} // End public class RiddleFlashCard 
