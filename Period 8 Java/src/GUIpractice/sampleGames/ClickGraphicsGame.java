package GUIpractice.sampleGames;

import java.awt.event.MouseListener;

import GUIpractice.GUIApplication;

public class ClickGraphicsGame extends GUIApplication {
	private MyScreen MyScreen;

	public static void main(String[] args){
		ClickGraphicsGame cgg = new ClickGraphicsGame();
		Thread app = new Thread(cgg);
		app.start();
	}
	@Override
	protected void initScreen() {
		MyScreen = new MyScreen(getWidth(),getHeight());
		setScreen(MyScreen);
		
	}

}
