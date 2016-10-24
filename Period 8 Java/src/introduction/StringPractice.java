package introduction;
import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;

	public static void main(String[] args) {
		/*DemoStringMethod();
		//PromptForever(); // forever asks you to type something so bottom wont load btw cuz still asking you to type something
		String text1 = new String("Hello World");
		String text2 = "Hello World"; // these two codes do the exact same thing.
		if (text1 .equals (text2))  { // instead of == you use .equals () instead
			System.out.println("These strings are equal."); // even though they look the same, they are not.
		}
		print(text1);
		print(text2);
		String word1 = "asdasd";
		String word2 = "zzzzz";
		if (word1.compareTo(word2)<0){ //use compareTo if you want to know if one comes before the other 
			print("word1 comes before word2"); */
		String user,pass = waitforentry(); // basically 
		String fill = "asd";
		boolean valid = false;
		System.out.println("What is the username?");
		if(fill.equals("test_user")){
			for( int i = 0; i<3;i++){
				System.out.println("you have"+(3-i)+"tries.");
				if(pass.equals("test")){
					valid = true;
					break;
				}
			
				else{
					System.out.print("Invalid pass");
				}
			}
		}
		else{
			System.out.println("invald user");}

	//}
	}
	public static void PromptForever(){
		while (true) {
			promptInput();
		}
	}
	public static String waitforentry(){
		user = input.nextLine();
		return user;
		
	}
	public static void DemoStringMethod(){

		createScanner();
	//	promptInput();
		createField();
		promptName();
	}
	public static void createField(){

	}
	public static void promptName(){
		print("enter your name.");
		user = input.nextLine();
	//	print("Glad to meet you " + user+"."
	//			+ "For the rest of time, I will call you user." // \n moves down a line 
	//			+ "You can call me Bob. We should become friends.");
	}
	public static void promptInput(){
		print("Please Type Something.");
		String userInput = input.nextLine();
		print("Congratulations You Typed:" + userInput);
	}


	public static void createScanner(){
		input = new Scanner(System.in);

	}
	public static void print(String s){
		String printString = s;
		int cutoff= 10;
		if(printString.length()>cutoff){
			for (int i = 0; i*cutoff<s.length();i++){
				printString = getCut(s, cutoff, i+1)+"\n";
			}
		}
		System.out.println(s);	
	}
	private static String getCut (String s, int cutoff, int cut){

		int cutIndex = cut * cutoff;
		if(cutIndex > s.length()){
			cutIndex = s.length();
		}
		String currentCut = s.substring(0,cutIndex);
		int indexOfLastSpace = currentCut.length()-1;
		for(int i = currentCut.length()-1; i>=0; i--){//the length is different than the index of the character ( 1 less than length){
			String letter = currentCut.substring(i, i+1);
			if(letter.equals(" "));{
				indexOfLastSpace = i;
				break;
			}
		}
		//shorten the cut to end on a space
		currentCut = currentCut.substring(0,indexOfLastSpace);
		return currentCut;

	}
}
