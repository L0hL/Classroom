package GUIpractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel {

	private String text;
	private String font;
	private int size;
	
	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h,text);
		this.color = color;
		this.action = action;
		update();
	
	}
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	
	@Override
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 35);
		g.setColor(Color.black);
		g.drawRoundRect(1, 1, getWidth() - 1 , getHeight() - 1, 25, 35);

//		g.setColor(Color.black);
		
		
	}

}
