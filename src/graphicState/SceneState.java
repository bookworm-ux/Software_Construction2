package graphicState;

import froggers.Scene;

public class SceneState extends State {
	
	private static SceneState instance;
	
		private SceneState(Scene context) {
			this.context = context;
			scene = this;
		}
		
		public static SceneState getInstance(Scene context) {
			if(instance == null) {
				instance = new SceneState(context);
			}
			return instance;
		}

		@Override
		public State drawFrogs() {
			context.generateFrogs();
			return FrogState.getInstance(context);
		}

		@Override
		public State drawHats() {
			context.drawHats();
			return HatState.getInstance(context);
		}

		@Override
		public State drawScene() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
}
