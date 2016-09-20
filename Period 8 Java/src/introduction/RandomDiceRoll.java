package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		int[] results = new int[6]; //fill array with six 0s.
		//declare variable. logic test increment
		for (int index = 0; index <666; index++){
			int result = rollUnfairDie();
			System.out.println("roll # "+ (index+1)+ " : " +  result); // u need parenthesis for index +/- 1
			results[result-1]++; // -1 becuz array
		}
		for (int i = 0; i < 6; i++){
			System.out.println((i+1)+" appeared "+results[i]+" times.");
		}

	}
	public static int rollFairDie() {
		double rand = Math.random(); //return a double between 0 and one exclusive ; will never be 1 (0<x<1)
		int roll = (int) (6 * rand); //includes 0 to 5 inclusive.[0,5]
		roll ++;
		return roll;
	}
	public static int rollUnfairDie(){
		double rand = Math.random();
		int roll = (int) (6 * rand); 
		roll ++;
		if (roll<6) return roll = 6 ;
		return roll;
		
	}
}
