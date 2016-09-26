package introduction;
import java.util.Scanner;

public class StringPractice2 {

	static Scanner input;
	static String user;

	public static void main(String[] args) {
		DemoStringMethod();
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
			print("word1 comes before word2");
		}

	}

	public static void PromptForever(){
		while (true) {
			promptInput();
		}
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
		print("Glad to meet you " + user+"."
				+ "For the rest of time, I will call you user." // \n moves down a line 
				+ "You can call me Bob. We should become friends.");
	}
	public static void promptInput(){
		print("Please Type Something.");
		String userInput = input.nextLine();
		print("Congratulations You Typed:" + userInput);
	}


	public static void createScanner(){
		input = new Scanner(System.in);

	}//kjh
	public static void print(String s){
		String printString = "";
		int cutoff = 35;
		// hello word! 
		// 01234567891011
		while (s.length()>0){
			String cut = "";
			String nextWord = "";
			//check to see if the next word will fit on the line
			// there must still be words to add
		
		while (cut.length() + nextWord.length() < cutoff && s.length()>0){
			cut+= nextWord;
			s = s.substring(nextWord.length());
			
			//identify the following without the space
			int endOfWord = s.indexOf(" ");
			// if there are no more spaces,
			//this is the last word. So add the whole thing.
			if(endOfWord== -1){
				endOfWord = s.length()-1;// -1 for index
				
			}
			nextWord = s.substring(0, endOfWord+1);
		}
		printString+= cut+"\n";
		
		
	}

		System.out.println(printString);	
	}
}