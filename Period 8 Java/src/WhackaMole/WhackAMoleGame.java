package WhackaMole;

import GUIpractice.GUIApplication;

public class WhackAMoleGame  extends GUIApplication{

	public WhackAMoleGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initScreen() {
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
		
	}

}
