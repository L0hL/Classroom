package ChatBot8;

public class IvanSchool implements Chatbot{

	private boolean inSchoolLoop;
	private String schoolResponse;
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			IvanMain.print("Type 'quit' to go back.");
			schoolResponse = IvanMain.promptInput(); // static call on prompt input method

			if(schoolResponse.indexOf("print")>= 0){
				inSchoolLoop = false;
				
				IvanMain.PromptForever();
			}
			else{	
							IvanMain.print("That my favorite part"
					+ "about school.");
		}
	}

	}
	public boolean isTriggered(String userInput){
		String[] triggers = { "school", "class", "teacher"};
		//
		//
		if(IvanMain.findkeyword(userInput, "school",0)>0){
			return true;
			
		}
		if(IvanMain.findkeyword(userInput, triggers[1], 0)>0){
			return true;
		}
		return false;
	}
}
