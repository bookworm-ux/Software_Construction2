package froggers;

import java.awt.Color; //add color
import java.awt.Point;

public class Frog implements LocatedRectangle {
	private Point location;
	private int width;
	private int height;
	private Face face;
	private Body body;
	private Color color;

	public Frog(int x, int y, int width, int height, Color color2) {
		this.location = new Point(x, y);
		this.width = width;
		this.height = height;
		this.face = new Face(width, height); // Instantiate the Face object with frog's position
		this.body = new Body(width, height); // Instantiate the Body object with frog's position
	}

	

	@Override
	public Point address() {
		return location;
	}

	@Override
	public int width() {
		return width;
	}

	@Override
	public int height() {
		return height;
	}

	@Override
	public void draw() {
		drawAt(location.x, location.y);
	}
	
	public void drawAt(int left, int bottom) {
		// Draw the body
		
		//Drawing.pen().setColor(Color.green);
		//Drawing.pen().fillOval(left, bottom, width, height);
		
		face.drawAt(left, bottom);
		body.drawAt(left, bottom);
	}



	@Override
	public boolean doesNotIntersect(LocatedRectangle other, int margin) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean above(LocatedRectangle other, int margin) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean below(LocatedRectangle other, int margin) {
		// TODO Auto-generated method stub
		return false;
	}

}