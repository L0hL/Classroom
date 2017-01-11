package GUIpractice.sampleGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import GUIpractice.Screen;
import GUIpractice.component.Action;
import GUIpractice.component.AnimatedComponent;
import GUIpractice.component.Button;
import GUIpractice.component.Graphics;
import GUIpractice.component.MovingComponent;
import GUIpractice.component.TextArea;
import GUIpractice.component.TextLabel;
import GUIpractice.component.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760,40,"Sample Text");
		paragraph = new TextArea(40,85,550,500,
				"");
		button = new Button(40,200,80,40,"Button",
				new Color(100,100,250),new Action() {
			
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		Graphics picture = new Graphics(50,50,.5,"resources/sampleImages/Penguins.jpg");
		
		viewObjects.add(picture);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(button);
		
//		MovingComponent mc = new MovingComponent(30, 60, 80, 80);
//		viewObjects.add(mc);
//		mc.setVy(3);
//		mc.play();
		
		addAnimation(viewObjects);
	}

	private void addAnimation(ArrayList<Visible> viewObjects) {
		AnimatedComponent a = new AnimatedComponent (40,50,150,150);
		try {
			int numberInRow = 4;
			int rows = 4;
			int w = 400;
			int h = 600;
			ImageIcon icon = new ImageIcon("resources/sampleImages/retroSprite.png");
			//create a for loop that will take a sub-image from the sprite grid
			for(int i = 0; i< numberInRow * rows; i++){
				//declare the cropped image h = 120 w = 90
				BufferedImage cropped = 
						new BufferedImage
						(w,h,BufferedImage.TYPE_INT_ARGB);
				int leftMargin = 0;
				int topMargin = 0;
				int x1 = leftMargin + w*(i%numberInRow);
				int y1 = topMargin + h*(i/numberInRow);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(icon.getImage(),0,0,w,h,x1,y1,x1+w,y1+h,null);
				a.addFrame(cropped, 100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		viewObjects.add(a);
		a.play();
		
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at" + m.getX()+", "+m.getY());
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

}