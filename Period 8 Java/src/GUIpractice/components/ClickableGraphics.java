package GUIpractice.components;


// change the coordinates of the image when you click on the thing

public class ClickableGraphics extends Graphics implements Clickable {
	private Action action;
	public ClickableGraphics(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphics(int x, int y, double scale, String imageLocation, Action action) {
		super(x, y, scale, imageLocation);
		this.action = action;
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphics(int x, int y, String imageLocation, Action action) {
		super(x, y, imageLocation);
		this.action = action;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}
