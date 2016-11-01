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
		
		pic[1][3] = "O";
		pic[1][2] = "<";
		pic[1][4] = ">";
		
		pic[1][5] = "O";
		pic[1][2] = "<";
		pic[1][4] = ">";
		
		for(int row = 5; row<pic.length; row++){
			for(int col=0; col<pic[row].length; col++){
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
}