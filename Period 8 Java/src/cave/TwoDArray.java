package cave;

import java.util.Arrays;

public class TwoDArray {
		
		public static void main(String[] args) {
			String[][] pic = new String[16][21];
			
			for (int row = 0; row < pic.length-1; row++) {
				for (int col = 0; col < pic[row].length-1; col++) {
					pic[row][col] = " ";
					
				}
			}	

			for(int col = 0; col < pic[0].length; col++){
				pic[0][col] = "_";
				pic[pic.length-1][col] = "_";
			}
			for (int row = 0; row < pic.length-1; row+=3) {
				for (int col = 0; col < pic[row].length-1; col++) {
					pic[row][col] = "_";
					
				}
			}
		
			for (int col = 1; col < pic.length; col++) {
				for (int row = 0; row < pic[col].length; row+=4) {
					pic[col][row] = "|";
					
				}
			}
			
			
			//first and last column is "|"
		
						
			for (String[] row : pic) {
				for(String col: row){
				System.out.print(col);
			}
			System.out.println();;
		}	
	}
}