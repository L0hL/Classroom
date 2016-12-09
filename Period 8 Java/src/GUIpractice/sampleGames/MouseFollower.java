package GUIpractice.sampleGames;

import GUIpractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	private CoordinatedScreen coordScreen;
	public static void main(String args[]){
		
	}
	@Override
	protected void initScreen() {
		coordScreen = new CoordinatedScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

}
