package Arrays;

public class swap {

	public static void main(String[] args) {

		int[] str1 = {6, 5,4,3,2,1,0};
		int[] str2 = {6,6,5,4,3,2,1,0};
		System.out.print(isSorted(str2));
	}
	
	public static boolean isSorted(int[] array){
        /**
         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
         * */
           
        /**
         * This method takes an in array as a parameter and returns 'true' if the array is already sorted in DESCENDING order
         * */
         for(int i = 0; i<array.length;i++){
        	 if(array[i] == array[i+1]+1 ){
        		 return true;
        	 }
        	 
         }
    return false;
    }
}

