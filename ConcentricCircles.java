import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
import javax.swing.*; //drawing package
import java.awt.*; //graphics interface

// Primary class for this java file
// the name of this class must be the same as the name of the file
public class ConcentricCircles extends JFrame 
{
    public ConcentricCircles() 
    {
        setName("Drawing Circle");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paint(Graphics Painter) 
    {
        Painter.drawOval(150, 150, 100, 100);
    }

    public static void main(String[] args) 
    {

        new ConcentricCircles();

    }
}

