// Standard import statements for Java packages
import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

//This is the primary class for this file
public class stringCount
{
	//index() method 
	/* Checks if a string is empty ("") or null. */
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
    /* Counts how many times the substring appears in the larger string. */
    public static int mySubStringCount(String first, String second)
    {
        if (isEmpty(first) || isEmpty(second)) {
            return 0;
        }
 
        int index = 0, count = 0;
        while (true)
        {
            index = second.indexOf(first, index);
            if (index != -1)
            {
                count ++;
                index += first.length();
            }
            else {
                break;
            }
        }
        return count;
    }

	public static void main(String[] args)
	{
		// Write a method in Java, called mySubStringCount that takes 
		// two string arguments and returns 
		// an integer value. It should return the number of instances 
		// the first string is found in the second string.
		String firstString = "tree";
		String secondString = "The tree is as huge as the other tree";
		System.out.println("The first string is: ");
		System.out.println(firstString);
		System.out.println("\nThe second string is: ");
		System.out.println(secondString);
		System.out.println("The number of instances " + firstString +  " is found in the string: " + secondString + " is: "); 
		int count = mySubStringCount(firstString, secondString);
		System.out.println(count);
		
	} // END PSVM
} // End public class stringCount
