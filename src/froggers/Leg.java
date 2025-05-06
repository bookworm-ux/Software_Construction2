package froggers;
import java.awt.Color;

public class Leg {
	int width;
	int height;

 // Define a constant for the rightward offset
    private static final int RIGHT_OFFSET = 20;
    
    public Leg(int width, int height) {
    	this.width = width;  //change from /2 because here it has to be just width, but in the body i can change it to width/2
        this.height = height;
    }

    public void drawAt(int left, int bottom) {
      
    	  int legWidth = width; // Half the width of the leg
          int legHeight = height;   // Full height of the leg

          // Calculate the position of the leg
          int legLeft = left - (legWidth / 2) + RIGHT_OFFSET; // Adjusted left position, shifted to the right
          int legBottom = bottom * 2 - legHeight;           // Adjusted bottom position, shifted lower

          // Drawing the leg 
          Drawing.pen().setColor(Color.BLACK); 
          Drawing.pen().drawArc(legLeft, legBottom, width, height, 0, 180); // Draw the leg arc
          
          Drawing.pen().setColor(Color.BLACK);
          Drawing.pen().fillArc(legLeft, legBottom, width, height, 0, 180); // Fill the leg arc
    	
        
    }
}