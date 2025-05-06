package froggers;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import graphicState.SceneState;
import graphicState.State;

public class Scene extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Frog> frogs;
	private int screenWidth;
	private int screenHeight; 
	private int width, height;
	private static State graphicState;
	
	public Scene(int screenWidth, int screenHeight) {
		frogs = new ArrayList<Frog>();
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		graphicState = SceneState.getInstance(this);
	}

	private void constructSomeFrogs() {
		for (int i = 0; i < 100; i++) {
			int width = RandomNumber.between(20, 200);
			int height = RandomNumber.between(20, 80);
			int x = RandomNumber.between(0, screenWidth);
			int y = RandomNumber.between(0, screenHeight);
			int colorR = RandomNumber.between(0, 255);
			int colorG = RandomNumber.between(0, 255);
			int colorB = RandomNumber.between(0, 255);
			int colorA = RandomNumber.between(0, 255);

			Frog aNewFrog = new Frog(x, y, width, height, new Color(colorR, colorG, colorB, colorA));
			if (thereIsNoIntersectionTo(aNewFrog)) {
				frogs.add(aNewFrog);
			}

		}
	}
	
	
	private boolean thereIsNoIntersectionTo(Frog aNewFrog) { // 'aNewFrog' represents the Frog object passed to the// method
		boolean intersects = false;
		// check if the aNewFrog intersects with any other frog in the scene iteration
		for (Frog h : frogs) {
			intersects = intersects || h.intersects(aNewFrog, -100);
		}
		// return true if there is intersection, false otherwise
		return !intersects;
	}
	
	// Method to draw the scene, including frogs
		public void draw() {
			for (Frog frog : frogs) {
				frog.draw(); // Draw each frog in the scene
			}
		}
	
	public ArrayList<Frog> getFrogs() {
		return frogs;
	}

	public void setHats() {
		graphicState = graphicState.drawHats();
	}

	public void setFrogs() {
		graphicState = graphicState.drawFrogs();
	}
	
	public void setScene() {
		graphicState = graphicState.drawScene();
	}

	public void drawHats() {
		// TODO Auto-generated method stub
		
	}

	public void generateRandomHats() {
		graphicState = graphicState.drawHats();
		
	}

	public void generateFrogs() {
		graphicState = graphicState.drawFrogs();		
	}


}