package ChatBot8;

public class IvanHello implements Chatbot {

	private String helloResponse;
	private boolean inHelloLoop;
	private String[] calmResponse = {"We already said hello."
				+ "Lets move on wit the conversation."
	};
	private String[] angryResponse = { "Please stop repeating yourself."
			+ " Okay, seriously, stop saying hello."};
	private int helloCount;
	public IvanHello(){
		helloCount = 0;
	}
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			Object response;
			printResponse(); // helper method
			helloResponse = IvanMain.promptInput();
			if(isTriggered(helloResponse)){
				inHelloLoop = false;
				IvanMain.PromptForever();
			}
		}
		
	}
	public void printResponse(){
		if(helloCount > 0){
			int responseSelection = (int)(Math.random()*angryResponse.length);
			IvanMain.print(angryResponse[responseSelection]);
		}
		else{
			
				int responseSelection = (int)(Math.random()*calmResponse.length);
				IvanMain.print(angryResponse[responseSelection]);
			}
	
	}
	@Override
	public boolean isTriggered(String userInput) {
		if(IvanMain.findkeyword(userInput, "hello", 0)>=0){
			return true;
		}
		if(IvanMain.findkeyword(userInput, "hi", 0)>=0){
			return true;
		}
		if(IvanMain.findkeyword(userInput, "hey", 0)>=0){
			return true;
		}
		return false;
	}

}