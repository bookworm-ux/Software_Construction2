package froggers;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons {
	private JButton frogsButton = new JButton("Frogs");
	private JButton hatsButton = new JButton("Hats");
	private JButton sceneButton = new JButton("Scene");
	

	public void addActionListener(ActionListener listener) {
		frogsButton.addActionListener(listener);
		hatsButton.addActionListener(listener);	
		sceneButton.addActionListener(listener);	
	}

	public void addButtonsToAPanel(JFrame frame) {
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(18, 1, 15, 20));

		menu.add(frogsButton);
		menu.add(hatsButton);
		menu.add(sceneButton);
		
	

		menu.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.add(menu, BorderLayout.WEST);
	}

	public JButton getFrogsButton() {
		return frogsButton;
	}

	public JButton getHatsButton() {
		return hatsButton;
	}

	public JButton getSceneButton() {
		
		return sceneButton;
	}
}
