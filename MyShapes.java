// Fig. 5.26: Shapes.java
// Demonstrates drawing different shapes.
import java.awt.*;
import javax.swing.JPanel;

public class MyShapes extends JPanel
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int choice; // user's choice of which shape to draw
   
   // constructor sets the user's choice
   public MyShapes( int userChoice )
   {
      choice = userChoice;
   } // end Shapes constructor
   
   // draws a cascade of shapes starting from the top-left corner
//   public void paintComponent( Graphics g )
//   {
//	   
//      super.paintComponent( g );
//      
////      g.setColor(Color.red);
//          // Draw the polygon described by the arrays xCoord and yCoord
//          // and the integer choice.  A filled polygon with a black 
//          // outline is drawn.  If choice is 0 or 1, nothing is drawn.
//          // If pointCt is 2, only a black line is drawn.
//    	  int[] xCoord, yCoord;  // Arrays to hold he coordinates.
//          xCoord = new int[500];
//          yCoord = new int[500];
//          switch ( choice )
//        {
//          case 0:
//        	  g.drawOval( 10, 10, 
//                 50, 50);
//              g.drawArc( 10, 10, 
//                       50, 50, 0, 360 );
//          case 1:
//          return;
//          
//          case 2:
//        	  g.drawLine(xCoord[0], yCoord[0], xCoord[1], yCoord[1]);
//          default:
//        	  g.setColor(Color.red);
//              g.fillPolygon(xCoord, yCoord, choice);
//              g.setColor(Color.black);
   
   
   
   super.paintComponent(g);
   {
        g.drawLine(10,10,50,50);
        g.drawRect(10,60,40,30);
           g.setColor(Color.blue);
        g.fillRect(60,10,30,80);
           g.setColor(Color.green);
        g.drawRoundRect(10,100,80,50,10,10);
        g.setColor(Color.yellow);
        g.fillRoundRect(20,110,60,30,5,5);
        g.setColor(Color.red);
        g.drawLine(100,10,230,140);
        g.drawLine(100,140,230,10);
        g.drawString("Line Rectangles Demo",65,180);
        g.drawOval(230,10,200,150);
        g.setColor(Color.blue);
        g.fillOval(245,25,100,100);
   }
};
//              g.drawPolygon(xCoord, yCoord, choice);
              
              
              
//       if (choice == 2) {
//          g.drawLine(xCoord[0], yCoord[0], xCoord[1], yCoord[1]);
//       }
//       else {
//          g.setColor(Color.red);
//          g.fillPolygon(xCoord, yCoord, choice);
//          g.setColor(Color.black);
//          g.drawPolygon(xCoord, yCoord, choice);
//       }
//       g.dispose();
//   
//   }{
//  
//      for ( int i = 0; i < 10; i++ )
//      {
//         // pick the shape based on the user's choice
//         switch ( choice )
//         {
//            case 1: // draw rectangles
//               g.drawRect( 10 + i * 10, 10 + i * 10, 
//                  50 + i * 10, 50 + i * 10 );
//               break;
//            case 2: // draw ovals
////               g.drawOval( 10 + i * 10, 10 + i * 10, 
////                  50 + i * 10, 50 + i * 10 );
//               g.drawArc( 10 + i * 10, 10 + i * 10, 
//                       50 + i * 10, 50 + i * 10, 0, 360 );
//               break;
//            case 3: // fill rectangles
//                g.fillRect( 10 + i * 10, 10 + i * 10, 
//                   50 + i * 10, 50 + i * 10 );
//                break;
//            case 4: // fill ovals
////                g.fillOval( 10 + i * 10, 10 + i * 10, 
////                   50 + i * 10, 50 + i * 10 );
//                g.fillArc( 10 + i * 10, 10 + i * 10, 
//                        50 + i * 10, 50 + i * 10, 0, 360 );
//                break;
//            default: // draw lines
//                g.drawLine( 10 + i * 10, 60 + i * 20, 
//                   60 + i * 20, 10 + i * 10 );
//                break;
//         } // end switch
//      } // end for
//      
      // added by Zhang
//      int x=20;
//      int y=getHeight()-20;
//      if (choice==1) {
//    	  g.drawString("10 rectangles drawn", x, y);
//      }
//      else if (choice==2) {
//    	  g.drawString("10 circles drawn", x, y);
//      }
//      else if (choice==3) {
//    	  g.drawString("10 rectangles filled", x, y);
//      }
//      else if (choice==4) {
//    	  g.drawString("10 circles filled", x, y);
//      }
//      else {
//    	  g.drawString("10 lines drawn", x, y);    	 
//      }
//      choice=(choice+1)%5;
//      // end of addition
      
   } // end method paintComponent
} // end class Shapes
}

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
