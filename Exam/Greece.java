import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


class Greece extends Europe
{
	public Boolean localIngredients; 
	public String food; 
	
	// Constructor
	public Greece(String st, String c, String e, String r, Boolean local, String f)
	{
		super(st, c, e, r);
		localIngredients = local;
		food = f;
	}
	// Getters
	public String getFood()
	{
		return food;
	}
	public Boolean isLocalIngredients()
	{
		return localIngredients;
	}
    // Setters
	void setLocalIngredients(Boolean local)
	{
		localIngredients = local;
	}
	void setFood(String f)
	{
		food = f;
	}
	public String getInfo()
	{
		String msg;
		msg = "The continent's region is (" + state + "), ";
		msg = msg + " the climate is (" + climate + "), the enviroment is (" + environment + "), " + "the religion is (" + religion + "), \n";
		msg = msg + "ingredients local: " + localIngredients + ", Food: " + food + "\n";
		return msg;
	}
} // End class
