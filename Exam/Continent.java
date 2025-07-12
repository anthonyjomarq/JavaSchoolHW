import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Continent
{
	// Public member (fellow) variables - inheriatable
	public String state; //Old or newly regions; New mountains
	
	// Constructors
	
	// Null 
	public Continent()
	{
		state = "";
	}
	public Continent(String st)
	{
		state = st;
	}
	public String getInfo()
	{
		String msg;
		msg = "The continent's region is: " + state;
		return msg;
	}
} // End public class Continent
