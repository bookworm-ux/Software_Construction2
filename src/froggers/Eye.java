package froggers;

import java.awt.Color;

public class Eye { 
	
	private static final int PUPIL_POSITION = 30 ;
	private static final int EYE_GAP_FACTOR = 2;
	
	private int width;
	private int height;
    private Pupil pupil;
    private int gap;

    public Eye(int width, int height) {
    	this.width = width;
        this.height = height; 
        this.gap = width / EYE_GAP_FACTOR;

        int pupilWidth = width / 2;
        int pupilHeight = height / 2;
        
        this.pupil = new Pupil(pupilWidth, pupilHeight);// you need to make the magic values a constant 
	}
    
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	void drawAt( int left, int bottom) {//methods
        // eye position 
		
		int leftEye = left - (width + gap);
		int rightEye = left + gap;
		int eyeTop = bottom - (height / EYE_GAP_FACTOR);//10 the top of the eyes to show where is stops 
		
		//draw left eye 
		Drawing.pen().setColor(Color.BLACK);
		Drawing.pen().drawOval(leftEye + (width / 4), eyeTop, width, height );
    	Drawing.pen().setColor(Color.white);
    	Drawing.pen().fillOval(leftEye + (width / 4), eyeTop, width, height);
    	
    	// draw right eye 
    	Drawing.pen().setColor(Color.BLACK);
		Drawing.pen().drawOval(rightEye + (width / 4), eyeTop, width, height );
		Drawing.pen().setColor(Color.white);
    	Drawing.pen().fillOval(rightEye + (width / 4), eyeTop, width, height);
    	
    	//position of pupil 
        
    	// Draw the pupil in the center of the eye
    	int pupilLeft = leftEye + gap ;
    	int pupilRight = rightEye + gap; 
    	int pupilBottom = eyeTop + height/4  ; //bottom - height / EYE_GAP_FACTOR + PUPIL_POSITION;
    	
        pupil.drawAt( pupilLeft , pupilBottom);
        pupil.drawAt(pupilRight ,pupilBottom);
        
       
    }

	
	
}