package introduction;

public class Senior extends Student {

	public Senior(String name) {
		// super must be right below or else it won't work
		super(name);//constructs a Student first
	}
		public void talk(){
			super.talk();
			System.out.println("..and I am a senior");
		}
		public void average(){
			System.out.println("my averageis 100% ");
		}
	
	}

