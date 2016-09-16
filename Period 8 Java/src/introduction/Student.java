package introduction;

public class Student {
	//string
	 private String name; 
	 
	 //constructor ( initializes fields < 1 field = 1 line>)
	 // Construc. must match name as the one above or else it will think that it's a method.
	 public Student (String name){
		 this.name = name;
		 
	 }
	 public void talk(){
		 
		 System.out.println("Hello, my name is " + name);
	 }
	 
}


