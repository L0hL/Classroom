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
		if(findkeyword(response,"good",0) >= 0){
			print("That's wonderful. So glad you feel good.");
		}
		else if (response.indexOf("school")>= 0){
			print("School is great. Tell me about School.");
			inMainLoop=false;
			school.talk();
		}
		else{
			print("I don't understand.");
		}
	}
	// this is a helper method. designed to help larger method because of this helper methods are generally private 
	//because they are only used by the method they are helping. Also when you do your project, I expect to see helper methods because they make the code more readable.
	// will return true if no negation words from the methods
	private static boolean noNegations(String searchString, 
			int psn){
		//check to see if no is from psn
			//check to see if 3 spaces in front. then check to see if no is there
		if(psn - 3 >= 0 && searchString.substring(psn-3,psn).equals("no ")){
			return false;
		}
		//check for not
		if(psn - 6>=0 && searchString.substring(psn-6,psn).equals("never")){
			return false;
		}
		if(psn - 4>=0 && searchString.substring(psn-4,psn).equals("not ")){
			return false;
		}
		return true;
	}
	public static int findkeyword(String searchString, String keyword, int StartPsn){
		
		//delete white space
		searchString = searchString.trim();
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		System.out.println("the key word is found in at");
		//find first position of key word
		int psn = searchString.indexOf(0);
		//keep searching until context keyword found
		System.out.println("the key is" + keyword);
		System.out.println(" the key is found at"+ psn);
		
		while(psn>=0){
			//assume proceeded and followed by space
			String before = "";
			String after = "";
			if(psn>0){
					before = searchString.substring(psn-1, psn);
			}
			if(psn+keyword.length()<searchString.length()){
				after = searchString.substring(psn+keyword.length(), psn+keyword.length()+1);
			}
			if(before.compareTo("a")<0 && after.compareTo("a")<0 && noNegations(searchString,psn)){
				//pos+1 is one space after current
				return 0;
			}
			else{
				psn = searchString.indexOf(keyword,psn+1);
			}
		}
		return psn;
	}

	public static void DemoStringMethod(){

		createScanner();
		promptInput();
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
		String userInput = input.nextLine();
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