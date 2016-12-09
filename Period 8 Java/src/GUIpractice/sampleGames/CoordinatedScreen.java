package GUIpractice.sampleGames;

import java.util.ArrayList;

import GUIpractice.Screen;
import GUIpractice.components.Visible;

public class CoordinatedScreen extends Screen {
	
	private TextLabel label;
	public CoordinatedScreen(int width, int height) {
		super(width, height);
		label = new TextLabel(40,45,-80,40,"");
	}
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760,40,"Sample Text");
		viewObjects.add(label);
		
	}

}
