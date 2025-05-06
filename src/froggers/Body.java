package froggers;


import java.awt.Color;
import java.awt.Graphics;

public class Body {
	
	private final int LEG_LOWER_OFFSET = 70; // Define a named constant for leg lower offset
    private final int LEG_LEFT_OFFSET = 20; // Define a named constant for leg left offset
    private final int BODY_POSITION = 100;
    
	private int width;
	private int height;
	private Color color;
	//private Belly belly; 
	private Leg leftLeg;
    private Leg rightLeg;
    
    public Body(int width, int height) {
		this.width = width; 
		this.height = height; 
		//this.bodyWidth = bodyWidth;
		//this.bodyHeigh = bodyHeight;
	
		// Adjust the width and height of the belly
       /* int bellyWidth = width / 2; // Adjusted to 3/4 of the body's width
        int bellyHeight = height * 3 / 4; // Adjusted to half of the body's height
		
	    this.belly = new Belly(bellyWidth, bellyHeight); //add color , width/2 size was in the belly class
	    
	    this.leftLeg = new Leg(width/2, height); //width/2 size of the leg in the body class, not in the leg class
	    this.rightLeg = new Leg(width/2, height); //width/2*/
    }

    public void drawAt(int left, int bottom) {
    	
    	// Adjusting the bottom position to lower the oval body for body
        int adjustedBottom = bottom * 2 - height / 2; 
    
        // we wrote the leg first, so it will appear behind the body
        // Drawing the legs 
        /*leftLeg.drawAt(left - LEG_LEFT_OFFSET, adjustedBottom - height + LEG_LOWER_OFFSET); // Draw the left leg
        rightLeg.drawAt(left + width - LEG_LEFT_OFFSET, adjustedBottom - height + LEG_LOWER_OFFSET); // Draw the right leg
        
        */
       /* // Drawing the body
        Drawing.pen().setColor(Color.green); //the outer line
        Drawing.pen().drawOval(left, bottom - BODY_POSITION , width, height);
        Drawing.pen().fillOval(left,  bottom - BODY_POSITION, width, height); // Draw the body as a filled oval
        */
        //Drawing the belly
      /*  Drawing.pen().setColor(Color.YELLOW); //the outer line
        Drawing.pen().drawOval(left, height, width, height);
        Drawing.pen().fillOval(left, height, width, height); // Draw the body as a filled oval
        */
        
     // Drawing the belly
      /*int bellyWidth = belly.getWidth();
        int bellyHeight = belly.getHeight();
        int bellyLeft = left + (width - bellyWidth) / 2; // Center the belly horizontally
	
     // Position the belly lower by adjusting the bellyBottom
        int bellyBottom = adjustedBottom - (height - bellyHeight); // Lower the belly by 1/4 of the body's height        
  
        Drawing.pen().setColor(Color.YELLOW); // Use different color for belly
        Drawing.pen().drawOval(bellyLeft, bellyBottom, bellyWidth, bellyHeight);
        Drawing.pen().fillOval(bellyLeft, bellyBottom, bellyWidth, bellyHeight); // Draw the belly as a filled oval
        */

       
      
    }
}
   
	