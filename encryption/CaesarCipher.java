import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


class CaesarCipher
{
    public static String encrypt(String sentence, int offset)
    {
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
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int offset; 
		String sentence = "";
		System.out.println("How much is the offset: " );
		offset = sc.nextInt(); // Read from the std input and store it in the variable
		offset = offset % 26;	
		sc.nextLine(); // Just to clear the keyboard buffer
		String encrypted = ""; 
		String decrypted = ""; 

		
		System.out.println("Enter the sentence to be encrypted: ");
		sentence = sc.nextLine();
		
		System.out.println("Please hit enter");
		sc.nextLine(); // Just to clear the keyboard buffer
		
		encrypted = encrypt(sentence, offset);
		
		System.out.println("Encrypted sentence: " + encrypted);
		
		decrypted = encrypt(encrypted, 26 - (offset % 26));
		System.out.println("Decrypted sentence: " + decrypted);
		
	
	} // End PSVM

} // End class CaesarCipher
