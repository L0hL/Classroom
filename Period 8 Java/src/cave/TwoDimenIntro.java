package cave;

import java.util.Arrays;

public class TwoDimenIntro {

	public static void main(String[] args) {
		String[][] pic = new String[10][8];
		
		
		for(int row=0; row<pic.length; row++){ 
			for(int column = 0; column<pic[row].length; column++){
				pic[row][column] = " ";

			}
		}
		
		for ( int col = 0; col<pic[0].length;col++){
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";
		}
		//first and last column is a vertical line
		for( int row = 1;row<pic.length;row++){
			pic[row][0] = "|";
			pic[row][pic[0].length-1] = "|";
		}
		for(int row = 5; row<pic.length-1; row++){
			for(int col=0; col<pic[row].length-1; col++){
				pic[row][col] = "m";

				
			}
		}
		
		for(String[] row : pic){
			for(String col: row){
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	public static void intro(){
		String[] xox = {"x", "o", "x", "o", "x"};
		System.out.println(Arrays.toString(xox));
		
		String[][] arr2d = new String[5][4];
		
		for(int row=0; row<arr2d.length; row++){ 
			for(int column = 0; column<arr2d[row].length; column++){
				arr2d[row][column] = "(" + row + ", " + column + ")";
			}
		}
		
		//alternative method
//		for(int i=0; i<arr2d.length; i++){
//			System.out.println(Arrays.toString(arr2d[i]));
//		}
		
		for(String[] row : arr2d){
			System.out.println(Arrays.toString(row));
		}
	}
	public static void printPic(String[][] pic){
		for(String[] row : pic){
			for(String col: row){
				
			}
		}
	}
}