// Java Program to illustrate Memory Mapped File via
// RandomAccessFile to open a file using FileChannel's map()
// method
 
// Importing standard classes from respective packages
import java.io.*;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;
 
// Main class
public class HashHouston {
 
    // The next line shows 76 MB as the max value of the
    // count
    private static int count = 76000000;    ;
 
    // Main driver method
    public static void main(String[] args) throws Exception
    {
 
        // Display message asking user to enter the input
        // string
        System.out.print("enter character or string");
 
        // The method RandomAccessFile has an object sc and
        // is used to create a text file
 
        // Try block to check for exceptions
        try (RandomAccessFile sc
             = new RandomAccessFile("text.txt", "rw")) {
 
            // Scanner class to take objects input
            // Taking String a as input
            Scanner s = new Scanner(System.in);
 
            String a;
 
            a = s.next();
 
            // Mapping the file with the memory
            // Here the out is the object
            // This command will help us enable the read and
            // write functions
            MappedByteBuffer out = sc.getChannel().map(
                FileChannel.MapMode.READ_WRITE, 0, 10);
 
            // Writing into memory mapped file
            // taking it as 10 and printing it accordingly
            for (int i = 0; i < 10; i++) {
                System.out.println((out.put((byte)i)));
            }
 
            // Print the display message as soon
            // as the memory is done writing
            System.out.println(
                "Writing to Memory is complete");
 
            // Reading from memory mapped files
            // You can increase the size , it not be 10 , it
            // can be higher or lower Depending on the size
            // of the file
            for (int i = 0; i < 76; i++) {
                System.out.println((char)out.get(i));
            }
 
            // Display message on the console showcasing
            // successful execution of the program
            System.out.println(
                "Reading from Memory is complete");
        }
    }
}