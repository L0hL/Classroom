package Arrays;

public class ArrayPractice {
	static boolean[] boos3;
	
	public static void main(String[] args) {
		// how do you time a process
		long/* integer of higher order; more info than an int*/ currentTime = System.currentTimeMillis();
		String[] someString = new String[1000];
		standardPopulate(someString);
		print(someString);
		initializingArraysExamples();
		long endTime = System.currentTimeMillis();

		System.out.println("The process took "
				+ (endTime-currentTime) + " ms.");
		
		
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
