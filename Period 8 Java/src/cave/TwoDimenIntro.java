package cave;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimenIntro {
public static Scanner in = new Scanner(System.in);
	static String[][] arr2D;
	static int starti;
	static int startj;
	static String[][] pic;
	static int treasurei;
	static int treasurej;

	
	public static void main(String[] args) {
		arr2D = new String[5][5];
		pic = new String[5][5];
		for(int row = 0 ; row<arr2D.length;row++){
			//populate with coordinates
			for(int col = 0; col < arr2D[row].length;col++){
				arr2D[row][col] = "(" +row+ " , " +col+")";
			}
		}
		starti = 2;
		startj = 2;
		treasurei = 4;
		treasurej = 3;
		startExploring();
	}
	
	private static void startExploring() {
		while(true){
			printPic(pic);
			System.out.println("You're in room" + arr2D[starti][startj] + ".");
			if(starti == treasurei && startj == treasurej){
				break;
			}
			System.out.println("what do you want to do?");
			String input = in.nextLine();
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
		}
		
	}

	private static int[] interpretInput(String input) {
		//verify input is valid
		while(isValid(input)){
			System.out.println("Sorry, in this game, you can only use the w,a,s,d controls.");
			System.out.println("Tell me again what you would like to do");
			input = in.nextLine();
			int currenti = starti;
			int currentj = startj;
			input = input.toLowerCase();
			if(input.equals("w")) currenti --;
			if(input.equals("s")) currenti ++;
			if(input.equals("a")) currentj  --;
			if(input.equals("d")) currentj ++;
			int[] newCoordinates = { starti, startj};
			if(currenti>0 && currentj < arr2D.length && currentj >= 0  && currentj < arr2D[0].length){
				newCoordinates[0] = currenti;
				newCoordinates[1] = currentj;
			}
			else{
				System.out.println(" Sorry, you've reached the edge of the known universe. You may go no farther.");
			}
		}
		return null;
	}

	private static boolean isValid(String input) {
		String[] validKeys = { "w", "a", "s", "d"};
		for(String key: validKeys){
			if(input.toLowerCase().equals(key)){
				return true;
			}
		}
		return false;
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
}