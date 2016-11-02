package cave;

import java.util.Arrays;
public class TwoDArray {

	public static void main(String[] args) {
		boolean [][] mines = new boolean [6][6]; // primitive array boolean its set to 0 (false)
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
	}
	private static void printPic(String[][] field) {
		// TODO Auto-generated method stub
		
	}
	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		for(int row = 0; row < field.length;row++){
			for(int col = 0; col < field[row].length;col++){
				if(mines[row][col])field[row][col] = "x";
				else{
					field[row][col] = countNearby(mines,row,col);
				}
			}
		}
		return null;
	}
	private static String countNearby(boolean[][] mines, int row, int col) {
		for( int r = row -1; r<= row + 1; r++){
			for(int c = col -1; col<= col +1;c++){
				if( r>= 0 && r<mines.length && c>= 0 && c< mines[0].length){
					
				}
			}
		}
		return null;
	}
	private static void plantMines(boolean[][] mines){
		int numberOfMines = 20;
		while(numberOfMines> 0){
			int row = (int)(Math.random()* mines.length);
			int col = (int)(Math.random()*mines[0].length);
			//this prevents the same mine from being selected twice.
//			while(mines[row][col]){ // means as long as row and col is a mine will pick another mine
//				 row = (int)(Math.random()* mines.length);
//				 col = (int)(Math.random()*mines[0].length);				
//			}
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
	}

}
