package graphicState;

import froggers.Scene;

public abstract class State {
    
	protected Scene context;
	
	protected static FrogState frogs;
	protected static HatState hats;
	protected static SceneState scene;
	
	public abstract State drawFrogs();
	
	public abstract State drawHats();
	
	public abstract State drawScene();
}
