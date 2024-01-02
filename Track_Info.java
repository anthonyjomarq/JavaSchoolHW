// Standard import statements for Java packages
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Track_Info
{
	private String lyrics1;
	private String lyrics2;
	private String key;
	private int BPM; //Beats per minute
	private String artist;
	private int year;
		
	public Track_Info()
	{
		lyrics1 = "";
		lyrics2 = "";
		key = "";
		BPM = 0;
		artist = "";
		year = 0;
	}
	public Track_Info(String aLyrics1)
	{
		lyrics1 = aLyrics1;
		lyrics2 = "";
		key = "";
		BPM = 0;
		artist = "";
		year = 0;
	}
	public Track_Info(String aLyrics1, String aLyrics2)
	{
		lyrics1 = aLyrics1;
		lyrics2 = aLyrics2;
		key = "";
		BPM = 0;
		artist = "";
		year = 0;
	}
	public Track_Info(String aLyrics1, String aLyrics2, String aKey)
	{
		lyrics1 = aLyrics1;
		lyrics2 = aLyrics2;
		key = aKey;
		BPM = 0;
		artist = "";
		year = 0;
	}
	public Track_Info(String aLyrics1, String aLyrics2, String aKey, int aBPM)
	{
		lyrics1 = aLyrics1;
		lyrics2 = aLyrics2;
		key = aKey;
		BPM = aBPM;
		artist = "";
		year = 0;
	}
	public Track_Info(String aLyrics1, String aLyrics2, String aKey, int aBPM, String aArtist)
	{
		lyrics1 = aLyrics1;
		lyrics2 = aLyrics2;
		key = aKey;
		BPM = aBPM;
		artist = aArtist;
		year = 0;
	}
	public Track_Info(String aLyrics1, String aLyrics2, String aKey, int aBPM, String aArtist, int aYear)
	{
		lyrics1 = aLyrics1;
		lyrics2 = aLyrics2;
		key = aKey;
		BPM = aBPM;
		artist = aArtist;
		year = aYear;
	}
	public void setLyrics1(String aLyrics1)
	{
		lyrics1 = aLyrics1;
	}
	public void setLyrics2(String aLyrics2)
	{
		lyrics2 = aLyrics2;
	}
	public void setKey(String aKey)
	{
		key = aKey;
	}
	public void setBPM(int aBPM)
	{
		BPM = aBPM;
	}
	public void setArtist(String aArtist)
	{
		artist = aArtist;
	}
	public void setYear(int aYear)
	{
		year = aYear;
	}
	public String getLyrics1()
	{
		return lyrics1;
	}
	public String getLyrics2()
	{
		return lyrics2;
	}
	public String setKey()
	{
		return key;
	}
	public int setBPM()
	{
		return BPM;
	}
	public String getArtist()
	{
		return artist;
	}
	public int getYear()
	{
		return year;
	}
	public void display()
	{
		System.out.print("\n-----------------------------------------------------\n");
		
		System.out.print("Artist: " + artist + "\n");
		System.out.print("Year: " + year + "\n");
		System.out.print("Lyrics: " + lyrics1 + "\n");
		
		System.out.print("\n-----------------------------------------------------\n");
	}
		
	public static void main(String[] args)
	{
		Track_Info artist1 = new Track_Info("Una colilla de cigarro mas", "Un cenicero que va a reventar", "G#", 93, "Frankie Ruiz", 1992); 
		Track_Info artist[];
		
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.println("Enter the amount of songs you are going to enter (You can only do less than a 100): " );
		count = sc.nextInt(); // Read from the std input and store it in the variable
		sc.nextLine(); // Just to clear the keyboard buffer
		
		artist = new Track_Info[99];
		for (int i = 0; i < count; i++){
			String lyrics1;
			String lyrics2;
			String key;
			int BPM; //Beats per minute
			String name;
			int year;
			
			System.out.println("First line of the lyrics: " );
			lyrics1 = sc.nextLine(); // Read from the std input and store it in the variable
			System.out.println("Please hit enter");
			sc.nextLine(); // Just to clear the keyboard buffer
			
			System.out.println("Second line of the lyrics: " );
			lyrics2 = sc.nextLine(); // Read from the std input and store it in the variable
			System.out.println("Please hit enter");
			sc.nextLine(); // Just to clear the keyboard buffer
			
			System.out.println("What is the musical key for the song: " );
			key = sc.nextLine(); // Read from the std input and store it in the variable
			System.out.println("Please hit enter");
			sc.nextLine(); // Just to clear the keyboard buffer
			
			System.out.println("Enter the beats per minute of the song: " );
			BPM = sc.nextInt(); // Read from the std input and store it in the variable
			sc.nextLine(); // Just to clear the keyboard buffer
			
			System.out.println("Enter the name of the artist: " );
			name = sc.nextLine(); // Read from the std input and store it in the variable
			System.out.println("Please hit enter");
			sc.nextLine(); // Just to clear the keyboard buffer
			
			System.out.println("Enter the year the song came out: " );
			year = sc.nextInt(); // Read from the std input and store it in the variable
			sc.nextLine(); // Just to clear the keyboard buffer
			
			artist[i] = new Track_Info(lyrics1, lyrics2, key, BPM, name, year);
			artist[i].display();
		}
		for (int i = 0; i < count; i++){
			artist[i].display();
		}

	} // END PSVM
} // End public class Track_Info
