package GUIpractice.sampleGame;

import GUIpractice.component.Visible;

public interface Clickable extends Visible{
	public boolean isHovered(int x, int y);
	public void act();
}
