import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


class wordVowels
{
	static int distance0 = 0;
    static int distance1 = 0;
    static int distance2 = 0;
	public static void main(String args[])
	{
	
	
        String generaticText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed quis purus magna. Suspendisse porttitor at elit non vehicula. Sed posuere a lectus in rhoncus. Suspendisse sit amet erat tincidunt, luctus urna sit amet, convallis urna. Fusce convallis urna id sapien lacinia lobortis sit amet sit amet dolor. Suspendisse rutrum tortor nisl, et aliquet tellus dignissim eget. Morbi vehicula tortor nec rhoncus semper. Proin lacinia elit nec lectus ullamcorper vestibulum. Vivamus pellentesque molestie fermentum. Sed faucibus est eget erat vehicula imperdiet. Donec bibendum tincidunt augue, pharetra venenatis sem. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. In quis augue ut nisl porttitor imperdiet vitae vel diam. Cras sit amet diam aliquet, vehicula ligula in, blandit ex. Sed accumsan velit sit amet sem laoreet luctus. Donec sit amet sollicitudin elit. Praesent mauris augue, scelerisque eu purus at, convallis dapibus est. Donec lobortis aliquet mattis. Integer vehicula nisi ac sem mattis congue. Aliquam quis vehicula nisl, sit amet elementum ligula. Suspendisse justo ligula, aliquam in tempor et, dapibus a lacus. Aliquam maximus, odio eget mattis placerat, diam ligula commodo augue, a vestibulum lectus nisi ullamcorper tortor. Duis sed varius lacus, eget dictum dui. Aenean vitae tincidunt neque, nec suscipit arcu. Morbi vel nunc non sem iaculis vulputate. Cras lacinia bibendum orci vitae accumsan. Praesent diam ligula, dignissim quis tortor a, rhoncus suscipit elit. Mauris aliquet leo at metus volutpat, ac euismod augue faucibus. Suspendisse sed velit sit amet arcu pretium faucibus. Pellentesque tempus at tellus eu volutpat. Ut elementum ac risus vitae blandit. Sed gravida arcu vitae posuere gravida. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Donec velit arcu, fringilla et purus ut, pulvinar auctor ipsum. Fusce est arcu, fermentum id turpis et, blandit maximus dui. Nullam et scelerisque velit, nec hendrerit risus. Fusce a rhoncus neque. Integer nec tellus ante. Cras in lorem sem. Aliquam a hendrerit est, at gravida justo. Nunc ac bibendum risus. Nunc tristique est non mauris mattis, sed rutrum massa consectetur. Etiam sem felis, ultricies at felis lobortis, ornare ultrices lorem. Donec vitae lectus ipsum. Maecenas lobortis, turpis sed fringilla vehicula, eros libero interdum diam, nec semper est nibh nec ex. Mauris in vehicula tortor, vitae tempor augue. Pellentesque tristique rutrum sem, nec semper erat fermentum quis. Sed suscipit dapibus lectus eu molestie. Integer laoreet feugiat accumsan. Aliquam commodo arcu et sem maximus pulvinar.";
        String[] straightline = generaticText.split(" ");

        countDistance(straightline);
        System.out.println("Words with vowels next to each other : " + distance0);
        System.out.println("Words with vowels one character apart: " + distance1);
        System.out.println("Words with vowels two character apart: " + distance2);
    }
    public static void countDistance(String[] text)
    {
        for(String s : text)
        {
            for(int i = 0; i<s.length(); i++)
            {
                if(isItAVowel(s.charAt(i)))
                {
                    if(i + 1 < s.length() && isItAVowel(s.charAt(i+1)))
                    {
                        distance0++;
                    }
                    if(i + 2 < s.length()&& isItAVowel(s.charAt(i+2)))
                    {
                        distance1++;
                    }
                    if(i+3 < s.length() && isItAVowel(s.charAt(i+3)))
                    {
                        distance2++;
                    }
                    else
                    {
                        continue;
                    }
                } 			
            } 		
        } 	
    } 	
	
	// A method to show selected the contents of a String array
	static void showStringArrayContents(String [] arr, int st, int sp)
	{
		int i;
		if(arr.length-1 < sp)
			return;
		System.out.print("[");
		for(i = st; i < sp-1; i++)
		{
			System.out.print(arr[i]+",");			
		}
		System.out.println(arr[sp-1]+"]");
		
	}
	public static boolean isItAVowel(char ch)
    {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
			return true;
		else
			return false;
    } 
	
} // END class wordVowels
