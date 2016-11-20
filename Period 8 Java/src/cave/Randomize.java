package cave;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Randomize {

	public static void main(String[] args) {
		int[] [] arr = { 
				{1, 2, 3, 4, 5} , 
				{ 6, 7, 8,9,10},
				{ 11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
				};
		System.out.println("You win the game if you can make the board look like"
				+ "this.");
		printArray(arr);
		System.out.println("Here is the randomized puzzle."
				+ "Good luck solving it.");
		
		solution(arr);
		printArray(arr);
		
	}
		
		
		
		
		private static void shuffleArray(int[][] arr) {
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[row].length; col++) {
					int shuffleRow = (int)(Math.random()* arr.length);
					int shuffleCol = (int)(Math.random()* arr[col].length);
					
					int placeholder = arr[row][col];
					arr[row][col] = arr[shuffleRow][shuffleCol];
					arr[shuffleRow][shuffleCol] = placeholder;
					
				}
			}
		
	}
	private static void solution(int[][] arr){
		shuffleArray(arr);
		int[] container = new int [25];
		int count = 0;
		for (int row = 0; row < arr.length; row++) {
			
			for (int col = 0; col < arr[row].length; col++) {
				container[count] = arr[row][col];
				count++;
			}
		}
		//printArr(container);
		
		
		//count inversions of the array <container>	
		
		int countInversions = 0;
		for (int i = 0; i <container.length-1; i++) {
			for (int j = i+1; j < container.length; j++) {
				if(container[i]>container[j]){
					countInversions++;
			}
		}
	}
		//If the grid width is odd, then the number of inversions in a solvable situation is even.
		if(countInversions%2 != 0){
			solution(arr);
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
	}
	public static void printArray(int arr[][]){
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
				
			}
			System.out.println();
		}
	}
		// Checks to see if container is working.
//	public static void printArr(int ar[]){
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
//		System.out.println();
//	}
	
	
	
//https://www.cs.bham.ac.uk/~mdr/teaching/modules04/java2/TilesSolvability.html
}

