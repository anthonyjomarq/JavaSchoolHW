import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


class encryptionText
{
   public static void main(String[] args)
    {
		String ciphertext = ""; 
		char alphabet;
		encryptionText(){
		}
		//Method from Java hungry 
        String ciphertext = ""; 
		char alphabet;
		for(int i=0; i < sentence.length();i++) 
        {
             // Shift one character at a time
            alphabet = sentence.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet + offset);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + offset);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
		}
        return ciphertext;
    }
