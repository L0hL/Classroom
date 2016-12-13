package GUIpractice.sampleGames;

import GUIpractice.GUIApplication;

public class MouseFollower extends GUIApplication {

	private CoordinatedScreen coordScreen;
	public static void main(String args[]){
		GUIApplication game= new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	@Override
	protected void initScreen() {
		coordScreen = new CoordinatedScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

	

}
