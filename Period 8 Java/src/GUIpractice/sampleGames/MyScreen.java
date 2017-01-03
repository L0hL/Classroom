package GUIpractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import GUIpractice.Screen;
import GUIpractice.components.Action;
import GUIpractice.components.Button;
import GUIpractice.components.ClickableGraphic;
import GUIpractice.components.Graphics;
import GUIpractice.components.Visible;

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
		pick = new ClickableGraphic(100,100,100,100, "resources/sampleImages/two.png");
		pick.setAction(
				new Action(){
			{
		}
			@Override
			public void act() {
			pick.setX(pick.getX() + 10);
				
			}			});
		//viewObjects.add(mario);
	//	viewObjects.add(back);
		viewObjects.add(pick);
		
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