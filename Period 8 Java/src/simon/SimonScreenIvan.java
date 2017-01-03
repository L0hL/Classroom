package simon;

import java.util.ArrayList;
import java.util.List;

import GUIpractice.components.TextLabel;
import GUIpractice.components.Visible;
import GUIpractice.sampleGames.ClickableScreen;

public class SimonScreenIvan extends ClickableScreen implements Runnable {
	private TextLabel textlabel;
	private ButtonInterfaceIvan buttonIvan;
	private ProgressInterfaceIvan progressIvan;
	private ArrayList<MoveInterfaceIvan> moveIvan;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	int lastSelectedButton;


	public SimonScreenIvan(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

}
