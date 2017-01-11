package GUIpractice.sampleGame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import GUIpractice.Screen;
import GUIpractice.component.Action;
import GUIpractice.component.AnimatedComponent;
import GUIpractice.component.Button;
import GUIpractice.component.ClickableGraphic;
import GUIpractice.component.Graphics;
import GUIpractice.component.Visible;

public class MyScreen extends Screen implements MouseListener{

	private Graphics mario;
	private Button back;
	private ClickableGraphic pick;
	
	public MyScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
//		mario = new Graphics(200,200,.25,"resources/sampleImages/mario.png");
//		back = new Button(50,50,100,80,"Back",Color.BLACK, new Action(){
//			{
//		}
//			@Override
//			public void act() {
//				MouseFollower.game.setScreen(MouseFollower.coordScreen);		
//			}			
//		});
//		pick = new ClickableGraphic(100,100,100,100, "resources/sampleImages/two.png");
//		pick.setAction(
//				new Action(){
//			{
//		}
//			@Override
//			public void act() {
//			pick.setX(pick.getX() + 10);
//				
//			}			});
//		//viewObjects.add(mario);
//	//	viewObjects.add(back);
//		viewObjects.add(pick);
//		
		addAnimation(viewObjects);
	}

	private void addAnimation(ArrayList<Visible> viewObjects) {
		AnimatedComponent a = new AnimatedComponent (40,50,150,150);
		try {
			int numberInRow = 6;
			int rows = 4;
			int w = 90;
			int h = 120;
			ImageIcon icon = new ImageIcon("resources/sampleImages/SonicSprite.png");
			//create a for loop that will take a sub-image from the sprite grid
			for(int i = 0; i< numberInRow * rows; i++){
				//declare the cropped image h = 120 w = 90
				BufferedImage cropped = 
						new BufferedImage
						(w,h,BufferedImage.TYPE_INT_ARGB);
				int leftMargin = 0;
				int topMargin = 0;
				int x1 = leftMargin + w*(i%numberInRow);
				int y1 = topMargin + (i/numberInRow);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(icon.getImage(),0,0,w,h,x1,y1,x1+w,y1+h,null);
				a.addFrame(cropped, 20);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		a.play();
		
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent arg0) {
		
	}

	public void mouseClicked(MouseEvent e) {
		if(pick.isHovered(e.getX(), e.getY())){
			pick.act();
		}
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
}