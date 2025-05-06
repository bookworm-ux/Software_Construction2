package froggers;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;
	private Scene aScene;

	public DrawingArea() {
		super();
		Dimension screenSize = getToolkit().getScreenSize();
		aScene = new Scene(screenSize.width, screenSize.height);
	}

	protected void paintComponent(Graphics pen) {

		super.paintComponent(pen);
		Drawing.set(pen);
		aScene.draw();

		// Frog myFrog = new Frog(300, 300, 300, 300); //size do not need this
		// myFrog.draw(); do not need this

	}

	public Scene getScene() {
		return aScene;
	}
}
