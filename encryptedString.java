import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;


class encryptedString
{
	  // Encrypts text using a shift od s
    public static StringBuffer encrypt(String sentence, int offset)
    {
        StringBuffer result= new StringBuffer();
 
        for (int i=0; i<sentence.length(); i++)
        {
            if (Character.isUpperCase(sentence.charAt(i)))
            {
                char ch = (char)(((int)sentence.charAt(i) + offset - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)sentence.charAt(i) + offset - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
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

		
		System.out.println("Enter the sentence to be encrypted: ");
		sentence = sc.nextLine();
		
		System.out.println("Please hit enter");
		sc.nextLine(); // Just to clear the keyboard buffer
		StringBuffer encrypted;
		encrypted = encrypt(sentence, offset);
		System.out.println("Original sentence: " + sentence);
		System.out.println("Encrypted sentence: " + encrypted);
		System.out.println("Decrypted sentence: " + encrypt(encrypted, 26 - (offset % 26)));
		
	
	} // End PSVM

} // End class encryptedString
