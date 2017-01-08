package WhackaMole;

import GUIpractice.component.ClickableGraphic;


public class Mole extends ClickableGraphic implements MoleInterface {

	private double appearanceTime;
	

	public Mole(int x, int y) {
		super(x, y, .50, "resources/sampleImages/mole.jpg");
	}

	public void setAppearanceTime(double d) {
		this.appearanceTime = d;

	}



	@Override
	public void setAppearanceTime(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return 0;
	}

}