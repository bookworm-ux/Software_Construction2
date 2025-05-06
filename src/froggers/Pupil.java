package froggers;

import java.awt.Color;

public class Pupil {
	private int width;
	private int height;
    
    Pupil(int Width,int Height) {
        this.width = Width; 
        this.height = Height;
    }
   
	void drawAt(int left, int bottom) {
		
		Drawing.pen().setColor(Color.BLACK); // Set the color of the pupil
		Drawing.pen().fillOval(left, bottom, width, height); // Draw the pupil
    }
}