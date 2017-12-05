
public class removeDuplicates {

	public static void main(String[] args) {
		
			String inputString = "banana";
			
			char[] characters = inputString.toCharArray();
			
			int length = characters.length;
			System.out.println("Entered string with duplicates : " + inputString);
		for (int i = 0; i < length; i++) {
	            for (int j = i + 1; j < length; j++) {
	                if (characters[i] == characters[j]) {
	                    int temp = j;//set duplicate element index
	 
	                    //delete the duplicate element by shifting the elements to left
	                    for (int k = temp; k < length - 1; k++) {
	                    	characters[k] = characters[k + 1];
	                    }
	                    j--;
	                    length--;//reduce char array length
	 
	                }
	            }
	        }
		String outputString = new String(characters);
		outputString = outputString.substring(0, length);
		System.out.println("Final String without duplicates: " + outputString);
	}
	}


