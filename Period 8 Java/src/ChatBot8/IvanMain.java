package ChatBot8;
import java.util.Scanner;

public class IvanMain {

	static Scanner input;
	static String user;
	static boolean inMainLoop;
	static Chatbot school;
	static String response;
	

	public static void main(String[] args) {
		PromptForever();
	//	DemoStringMethod();
		//PromptForever(); // forever asks you to type something so bottom wont load btw cuz still asking you to type something
		

	}

	public static void PromptForever(){
		inMainLoop = true;
		while (inMainLoop) {
			print("Hi"+ user + ". How are you?");
			response = promptInput();
		}
		if(findkeyword()){
			print("That's wonderful. So glad you feel good.");
		}
		while (response.indexOf("school")>= 0){
			print("School is great. Tell me about School.");
			inMainLoop=false;
			school.talk();
		}
	}
	public static boolean findkeyword(String searchString, String keyword, int StartPsn){
		//delete white space
		searchString = searchString.trim();
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		//find first position of key word
		int psn = searchString.indexOf(0);
		//keep searching until context keyword found
		while(psn>=0){
			//assume proceeded and followed by space
			String before = " ";
			String after = " ";
			if(psn>0){
					before = searchString.substring(psn-1, psn);
			}
			if(psn+keyword.length()<searchString.length()){
				after = searchString.substring(psn+keyword.length(), psn+keyword.length()+1);
			}
			if(before.compareTo("a")<0){
				//psn+1 is one space after current
				psn = searchString.indexOf(keyword,psn+1);
			}
		}
	}

	public static void DemoStringMethod(){

		createScanner();
	//	promptInput();
		createField();
		promptName();
	}
	public static void createField(){
		input = new Scanner(System.in);

	}
	public static void promptName(){
		print("enter your name.");
		user = input.nextLine();
		print("Glad to meet you " + user+"."
				+ "For the rest of time, I will call you user." // \n moves down a line 
				+ "You can call me Bob. We should become friends.");
	}
	public static String  promptInput(){
		print("Please Type Something.");
		String userInput = input.nextLine();
		print("Congratulations You Typed:" + userInput);
		return userInput;
	}


	public static void createScanner(){
		input = new Scanner(System.in);

	}
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