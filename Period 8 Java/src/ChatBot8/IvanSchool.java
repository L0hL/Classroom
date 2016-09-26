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
}
