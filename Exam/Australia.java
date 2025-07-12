import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Australia extends Continent	
{
	// public variables
	public String climate; // Every continent has a type of climate and this affects the food 
	public String environment; 
	public String religion; // Some religions may affect the exchange of food

	public Australia(String st, String c, String e, String r)
	{
		super(st);
		
		climate = c;
		environment = e;
		religion = r;
	}
	// Getters
	public String getClimate()
	{
		return climate;
	}
	public String getEnviroment()
	{
		return environment;
	}
	public String getReligion()
	{
		return religion;
	}
	// Setters
	void setClimate(String c)
	{
		climate = c;
	}
	void setEnviroment(String e)
	{
		environment = e;
	}
	void setReligion(String r)
	{
		religion = r;
	}
	public String getInfo()
	{
		String msg;
		msg = "The continent's region is (" + state + "), ";
		msg = msg + " the climate is (" + climate + "), the enviroment is (" + environment + "), " + "the religion is (" + religion + ")\n";
		return msg;
	}
	
} // End public class

