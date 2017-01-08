package WhackaMole;

import GUIpractice.component.Action;
import GUIpractice.component.Clickable;


public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int i);

	void setAction(Action action);

}
