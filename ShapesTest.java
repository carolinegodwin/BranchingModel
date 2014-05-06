//
// CAROLINE GODWIN - CS 350 - PROJECT 1
//
// Scans the control.txt file 
// takes 3 numbers, makes them the vertices, radius, and rotation
// sets up the jframe 
//
import java.awt.BorderLayout;
import java.io.*;	
import java.util.*;	
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest
{
   public static void main( String[] args )	//main function
   {
	  Scanner input = null;
	  try {
		  input=new Scanner(new File("src/control.txt"));		//scans input file
	  }
	  catch (IOException e) {
		   System.err.println(e);
		   System.exit(1);
	  }
	  
	  int vert = input.nextInt();	// sets # of vertices in shape
	  int rad = input.nextInt();	//sets radius of shape
	  int rot = input.nextInt();	//sets # of items to rotate
	  input.close();	// ends scanner
      Shapes panel = new Shapes( vert,rad,rot ); //creates a new panel
      JFrame application = new JFrame("Shapes"); // creates a new JFrame
    
      application.add( panel, BorderLayout.CENTER ); // add the panel to the frame
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.setBounds(0,0,6*rad,6*rad) ;// set the desired size
      application.setVisible( true ); // show the frame
      
   } // end main
} // end class ShapesTest
