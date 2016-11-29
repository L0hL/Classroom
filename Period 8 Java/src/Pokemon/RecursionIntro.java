package Pokemon;

public class RecursionIntro {

	public static void main(String[] args) {
		hanoiSolution(5,"a","b","c");
//		System.out.println("Using a for loop");
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hello world! "
//					+ "x "+ i);
//		}
//		System.out.println("Without using a for loop.");
//		forLoop(5, new Action(){
//			
//			private int value = 0;
//			public void act(){
//				System.out.println("Hello world! x "+(value++));
//			}
//		});

	}

	private static void forLoop(int i, Action action) {
		if (i<=0) {
			// base case
			return;
		}else{
			//standard action
			action.act();
			//recursive call
			forLoop(i-1,action);
		}
		
	}
	private static int factorial(int x){
//		if(x<=0){
//			return 0;
//		} else{
//			int y = 0;
//			for(int i = 0; i<x;i++){
//				y = x*factorial(x-1);
//			}
//			x = y;
//		}
		int factorial = 1;
		for( int i = x; i> 0; i--){
			factorial = factorial*i;
		}
		System.out.println(factorial);
		return factorial;
		/**
		 if(x>1){
		 return x*factorial(x-1);
		 }
		 return 1;

		 */
		
	}
	public static void hanoiSolution(int numberOfDiscs,
		String startPeg,
		String midPeg,
		String endPeg ){
		if(numberOfDiscs<=1){
			System.out.println("Move"+ startPeg+" to "+endPeg);
		}else{
			hanoiSolution(numberOfDiscs-1,startPeg,endPeg,midPeg);
			hanoiSolution(1,startPeg,endPeg,midPeg);
			hanoiSolution(numberOfDiscs-1,midPeg,startPeg,endPeg);
		}
		
	}

}
