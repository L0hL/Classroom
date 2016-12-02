package Pokemon;

public class RecursionIntro {

	public static void main(String[] args) {
		int n = 10;
		fibonacci(n);
		System.out.println("The " + n + "th Fibonacci is "+ fibonacci(n));
		
		//hanoiSolution(1, "a", "b", "c");
//		System.out.println("Using a for loop");
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Hello world #" + i);
//		}
//		System.out.println("Without using a for loop");
//		forLoop(5, new Action() {
//			
//			private int value = 0;
//			
//			public void act() {
//				System.out.println("Hello world #" + value);
//				value++;
//			}
//		});
	}
	
	private static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}else{ 
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}
	
	private static void forLoop(int i, Action action) {
		if(i <= 0) {
			return;
		}else {
			//standard action
			action.act();
			//recursive call
			forLoop(i-1, action);
		}
	}
	
	public static int factorial(int x) {
		//for loop method
		if (x <= 0) {
			return 0;
		}else {
			
			
		}
		return x;
		//recursion method
		//return 0;
	}
	
	private static int count = 1;
	public static void print(String s) {
		System.out.println("Move a " + count +":" + s);
		count++;
	}
	
	public static void hanoiSolution(int numberOfDiscs, String startPeg, 
			String midPeg, 
			String endPeg) {
		if(numberOfDiscs <= 1) {
			System.out.println("move "+startPeg+" to " +endPeg);
		}else {
			System.out.println("In order to move "+numberOfDiscs+" over the peg "+endPeg
					+" we must move "+(numberOfDiscs - 1)+" over to peg " + midPeg+ " first");
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
			
		}
		
	}
	
	
	
	
	
}