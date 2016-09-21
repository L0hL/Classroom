package introduction;


public class StringPractice {

	public static void main(String[] args) {
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
	public static void print(String s){
		System.out.println(s);	
	}

}
