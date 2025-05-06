package froggers;

import java.awt.Color;

public class Hat {
	private int height;
	private int width;
//private Color color;

	public Hat(int width, int height) {
		this.width = width;
		this.height = height;

	}

	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(new Color(255, 0, 127)); // pink color
		Drawing.pen().drawRect(left, bottom, width, height);
		Drawing.pen().fillRect(left, bottom, width, height);
	}

}
