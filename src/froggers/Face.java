package froggers;

import java.awt.Color;

public class Face {
	private static final int EYE_WIDTH_FACTOR = 7;
	private static final int EYE_HEIGHT_FACTOR = 5;

	private int width;
	private int height;
	private Eye leftEye;
	private Eye rightEye;
	private Nose nose;
	private Smile smile;
	private Hat hat;

	public Face(int width, int height) {
		this.width = width;
		this.height = height / 2;
		// size of the eyes
		this.leftEye = new Eye(width / EYE_WIDTH_FACTOR, height / EYE_HEIGHT_FACTOR);
		this.rightEye = new Eye(width / EYE_WIDTH_FACTOR, height / EYE_HEIGHT_FACTOR);
		this.nose = new Nose(width, height);
		this.smile = new Smile(width, height);
		this.hat = new Hat(width,height);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void drawAt(int left, int bottom) {
		//Draw the Hat 
		hat.drawAt(left, bottom);
		
		// Draw the face
		Drawing.pen().setColor(new Color(34, 139, 34)); // Green color
		Drawing.pen().fillOval(left, bottom - height, width, height);

		// outline the face
		Drawing.pen().setColor(Color.BLACK);
		Drawing.pen().drawOval(left, bottom - height, width, height);

		// this gets the width and height that was initialized in the eye class
		int eyeLeft = left + width / 2;
		int eyeBottom = bottom - height;
		// position of eyes
		leftEye.drawAt(eyeLeft, eyeBottom);
		rightEye.drawAt(eyeLeft, eyeBottom);

		int noseLeft = left + width / 2;
		int noseBottom = bottom - height / 2;

		nose.drawAt(noseLeft, noseBottom);
		smile.drawAt(left, bottom);

	}

}