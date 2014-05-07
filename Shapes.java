//
// CAROLINE GODWIN - CS 350 - PROJECT 1
//
// This program allows you to draw any shape by reading from a file named control.txt
// The first number in the program is the number of vertices the shape will have
// 0 is a circle, 1 is a point, 2 is a line, 3 is triangle, 4 is a square, and 5 is a pentagon
// circles are blue, triangles are red, squares are orange, and everything else is magenta
// 
// The second number is the radius - the screen size is determined by the radius size
// The third number is the number of times the shape is to be copied and rotated around the center
//
// The only thing that I could not get to work completely is the centering of the object in the Jframe
// It is centering on the x axis, but not on the y axis. I couldn't figure out why.
//

//Just kidding it isn't really, its the Develop 2 change

import java.awt.*;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Shapes extends JPanel
{
private static final long serialVersionUID = 1L;
private int vert; // how many sides/vertices the shape will have
private int rad; // radius
private int rot; // # of times to rotate
  
   // constructor sets the ver, rad, and rot
   public Shapes( int vert,int rad,int rot){	//creates a shape constructor
     this.vert = vert;		//# of vertices
     this.rad = rad;		//radius
     this.rot = rot;		//# of shapes to rotate
   } // end Shapes constructor
   
   // draws a set number of shapes with set number of sides and radius around a focal point
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      for ( int i = 0; i <= rot ; i++ ) //for # in rotate, draw this many shapes
      {
    	  Graphics2D g2d = (Graphics2D) g;
    	  if(vert == 0){	//If shape has no vertices (circle)
    		  g2d.setColor(Color.blue); 		//color is blue
    		  g2d.drawArc( rad,rad,rad,rad, 0, 360 );			//radius is center, 360 degree arc = circle
    		  g2d.rotate(Math.toRadians(360/rot), rad+(rad/2), (2*rad)); 		// offset by half radius

    	  }
    	  else if(vert == 3){		// if triangle
    		  g2d.setColor(Color.red);		// color is red
    	  }
    	  else if(vert == 4){		//if square
    		  g2d.setColor(Color.orange);		//color is orange
    	  }
    	  else{			//if pentagon or greater
    		  g2d.setColor(Color.magenta);}			//color is magenta
    	  if(vert != 0){		//if not a circle
    		  Polygon p = new Polygon();		//creates a polygon
    		  int w = (int) (2*rad + rad * Math.cos(vert * 2 * Math.PI / vert));
    		  int h = (int) (2*rad + rad * Math.sin(vert * 2 * Math.PI / vert));
    		  double x = (h - w)/2.0;
    	      double y = (w - h)/2.0;
    		    for (int i1 = 0; i1 <= vert; i1++)		//with vert number of sides by adding point ints for each vert
    		      p.addPoint((int) (2*rad + rad * Math.cos(i1 * 2 * Math.PI / vert)),
    		          (int) (2*rad + rad * Math.sin(i1 * 2 * Math.PI / vert)));	
    		    g2d.drawPolygon(p);			//draws polygon
    		    g2d.rotate(Math.toRadians(360/rot),w, h);
    		    
    	  		}
      		}  
   		}
   }	// end class Shapes

