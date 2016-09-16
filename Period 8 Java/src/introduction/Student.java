package introduction;

public class Student {
	//string
	 private String name; 
	// String favoritecolor;
	 //constructor ( initializes fields < 1 field = 1 line>)
	 // Construc. must match name as the one above or else it will think that it's a method.
	 public Student (String name){ //you can add favorite color into it
		 this.name = name;
		 
	 }
	 public void talk(){ // talk is inheritance by every other class... we can override it too
		 
		 System.out.println("Hello, my name is " +name);
	 }

	 
}


