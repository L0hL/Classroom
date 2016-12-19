package GUIpractice.sampleGames;

import GUIpractice.GUIApplication;

public class MouseCoordinateGame extends GUIApplication {
public static MyScreen myScreen;


public static MouseCoordinateGame game;


public MouseCoordinateGame(int i, int j) {
	// TODO Auto-generated constructor stub
}


public static void main(String[] args){

game = new MouseCoordinateGame(500, 500);

Thread app = new Thread(game);

app.start();
	}


@Override
protected void initScreen() {
	// TODO Auto-generated method stub
	
}

}