package GUIpractice.sampleGames;

import GUIpractice.components.Visible;

public interface Clickable extends Visible{
	public boolean isHovered(int x, int y);
	public void act();
}
