package cave;

import java.util.Arrays;
public class TwoDArray {

	public static void main(String[] args) {
		
		
	}
	public static void printPic(String[][] arr) {
		for(int i = 0 ; i != arr.length;i++){
			for ( int j = 0; j!= arr.length;j++){
				if(arr[i][j] == null)
					System.out.print("");
				else
					System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
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
		return field;
	}
	private static String countNearby(boolean[][] mines, int row, int col) {
//		for( int r = row -1; r<= row + 1; r++){
//			for(int c = col -1; col<= col +1;c++){
//				if( r>= 0 && r<mines.length && c>= 0 && c< mines[0].length){
//					
//				}
//			}
//		}
		
		// this method only considers actual elements.
//		int count = 0;
//		for ( int r = 0; r<mines.length;r++){
//			for ( int c = 0 ; c<mines[r].length;c++){
//				if(Math.abs(r-row)+Math.abs(c-col) == 1 && mines[r][c]){
//					count++;
//				}
//			}
//		}
//		return ""+count;
		
		//this method allows you to be most specific
		//for example, you only want north and east
		int count = 0;
		count+= isValidAndTrue(mines,row-1,col);
		count+= isValidAndTrue(mines,row+1,col);
		count+= isValidAndTrue(mines,row,col-1);
		count+= isValidAndTrue(mines,row,col+1);
		return ""+count;
		
	}
	private static int isValidAndTrue(boolean[][] mines, int i, int j) {
		if (i>= 0 && i< mines.length && j>= 0 && j<mines[0].length && mines[i][j]) // cannot be first b/c will give out of bound exception
				
			return 1; 
		else return 0;
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
