package Arrays;

public class ArrayPractices {
	static boolean[] boos3;
	
	public static void main(String[] args) {
		
		listPrimes(120);
		// how do you time a process
//		long/* integer of higher order; more info than an int*/ currentTime = System.currentTimeMillis();
//		int[] fiftyNumbers = new int[50];
//		int max = 50;
//		populate(fiftyNumbers);
	//	print(fiftyNumbers);
//		randomize(fiftyNumbers);
	//	print(fiftyNumbers);
//		RollDice(fiftyNumbers);
//		print(fiftyNumbers);
		//count each dice roll and provide a percentage
//		countResults(fiftyNumbers);
//		long endTime = System.currentTimeMillis();

//		System.out.println("The process took "
//				+ (endTime-currentTime) + " ms.");
		
		
	}
	private static void listPrimes(int limit) {
		int lastToCheck = (int) (Math.sqrt(limit)); // starts at 0 so if limit = 100 its actually 99.
		boolean[] numbers = new boolean[limit+1];
		for(int i = 0 ; i < limit +1; i++){
			numbers[i] = true;
		}
		//0 and 1 are not prime
		numbers[0] = false;
		numbers[1] = false;
		//ignores 0 and 1 and starts at 2
		for(int prime = 2; prime <= lastToCheck;prime++){
			if(numbers[prime]){
				System.out.println("\n" + prime+" is prime."
						+ "Crossing off:");
				// if number is true, hasn't be crossed off
				for(int i = (int)(Math.pow(prime, 2));
						i<limit+1; i +=prime){
					System.out.println(i+", ");
					numbers[i] = false;
				}
			}
		}
		//print the primes
		System.out.println("\nThe primes are:");
		for(int index = 0; index<numbers.length;index++){
			if(numbers[index])System.out.print(index+", ");
		}
	}
	private static void countResults(int[] arr) {
		int [] counter = new int[12];
	//	populate(counter);
		for(int n: arr){
			counter[n-1] = counter[n-1] + 1;
		}
		for( int i = 0; i <counter.length;i++){
			System.out.println(i+1+ " was rolled " 
					+ 100*counter[i]/arr.length + " percent of the time.");
		}
		
	}
	private static void RollDice(int[] arr /*, int numberofDice*/) {
	//	int dice = 0;
	/*	for(int i = 0; i<arr.length;i++){
			
			for ( int j = 0; j < numberofDice;j++){
				
				dice = dice + (int)(1+6*Math.random());
			}
			arr[i] = dice;
			
			} */
			for(int i = 0; i<arr.length;i++){
			
				int dice1 = (int) (6*Math.random()) +1;
				int dice2 = (int) (6*Math.random()) +1;
				arr[i] = dice1 + dice2;
				
			}
		
	}
	private static void randomize(int[] arr) {

		for(int i = 0; i<arr.length;i++){
			arr[i] = (int) (50*Math.random() +1);
		}
		
	}
	private static void print(int[] arr) {
		for ( int i = 0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
	private static void populate(int[] arr) {
			for( int i =0; i<arr.length;i++){
			arr[i] = i+1;
				
		}
		
	}

	
	
	
	
	
	
	
	private void demonstratePassByValue(){
		int x = 10;
		increase(x);
		String[] someString = new String[1000];
		standardPopulate(someString);
		String s = someString[999];
		makeSpecial(s);
		someString[999] = getSpecialString();
		print(someString);
		initializingArraysExamples();
	}
	private static int increase(int i) {
		return i+1;
		
	}
	public static String getSpecialString(){
		return "This string is special";
	}
	public static void makeSpecial(String s){
		s = "THIS STRING IS SPECIAL";
	}
	public static void print(String[]s){
		for(int i = 0; i<s.length;i++){
			System.out.println(s[i]);
		}
	}
	private static void standardPopulate(String[] s) {
		//int i =0; // for each doesn't work
		for(/*int i = 0; i<s.length;i++*//* String z: s*/ int i = 0;i<s.length;i++){
			//s[i] = "String #"+(i+1);
			/*i++;
			z = "String #"+(i+1); */
			String string= "String #"+(i+1);
			s[i] = string; // setting position i into string
			
		}
	}
	//primitive type[] = are "already" in the system, start as zero.
	//object[] = unless initialized, will start as null. different types of array of common supertype
	public static void initializingArraysExamples(){
		
		// if you want to put  different primitive types into an array, you must use their wrapper class.
				// the different way to initiate array
				boolean[] boos1 = new boolean[3];
				boolean[] boos2 = { false,false,false}; // this can only be done at the declaration
				//because it sets size and content	
				//this does not work
				//boos3 = {false,true,true}; this doesn't work because u have boolean declared up there while the bottom only initializes it
				boos3 = new boolean[3]; //this is all that will work 
				
				
				/** 2 ways to iterate through an array
				STANDARD FOR LOOP
					THE INDEX IS IMPORTANT TO KEEP CHECK OF 
					YOU NEED TO CUSTOMIZE THE ORDER
				
				
				*/
				for(int i = 0; i<boos1.length;i++){
				//	System.out.println(boos1[i]); //everything in a boolean is set to false prior; if int will be 0
				}
				/** FOR EACH LOOOP
				 	-the index is no important 
				 *	- you don't need to customize
				 * 	- automatically assigns a "handle" aka identifier
				 */
				for(boolean b: boos1){ // is the same as top + boolean b = boos1[i]
				//	System.out.println(b);
				}
				
				//OBJECT ARRAYS
				String[] someStrings1 = new String[3];
				String[] someStrings2 = {"a","b","c"};
			//	someStrings1[0] = "a";
			//	someStrings1[1] = "b";
			//	someStrings1[2] = "c";
				//but this is repetitive
				
		/*		for(int i = 0; i<someStrings1.length;i++){
					someStrings1[i] = "a new string"; // (when String s: someStrings1) you would had thought that this will make 
															//someStrings1 all be called a new string.
													//doesn't work if you make s = someStrings[i] because it is a local variable
					
				}
				// a loop to print it
				for(String s: someStrings1){
					System.out.println(s);
				} */
			
	}


}
