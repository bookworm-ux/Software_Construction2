package froggers;

import java.awt.*;

public class Nose {
	private static final int NOSE_WIDTH_FACTOR = 15;
	private static final int NOSE_HEIGHT_FACTOR = 15;
	private static final int NOSE_GAP_FACTOR = 30;
	
	int width;
	int height;
    private int gap;

    public Nose(int width, int height) {
    	this.width= width / NOSE_WIDTH_FACTOR;
    	this.height=height / NOSE_HEIGHT_FACTOR;
    	this.gap = width / NOSE_GAP_FACTOR;
	}

	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(Color.BLACK);
		int leftNose = left - (width + gap);
		int rightNose = left + gap;
		
		Drawing.pen().fillOval(leftNose  + (width / 4), bottom - height / 2, width, height);
		Drawing.pen().fillOval(rightNose  + (width / 4), bottom- height / 2 ,width,height); // Draw the nose
    }
}