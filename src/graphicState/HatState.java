package graphicState;

import froggers.Scene;

public class HatState extends State {
	
	private static HatState instance;
	
	private HatState(Scene context) {
		this.context = context;
	}
	
	public static HatState getInstance(Scene context) {
		if(instance == null) {
			instance = new HatState(context);
		}
		return instance;
	}

	@Override
	public HatState drawFrogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HatState drawHats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HatState drawScene() {
		// TODO Auto-generated method stub
		return null;
	}

}
