public class RarrangeWord{
	public static String rearrangeWord(String userInput){
		String newWord = "";
		String finalOutput = "";
		for (int count = 0; count < userInput.length(); count++){
			char letter = userInput.charAt(count);
			newWord += letter; 
			if (letter == ' '){
				for (int counter = newWord.length()-1; counter >= 0 ; counter--){
					char letterTwo = newWord.charAt(counter);
					finalOutput += letterTwo;
				}
				newWord = "";
			}
		}
		return finalOutput;
	}

	public static void main(String[] args){
		String input = "This is an example";
		System.out.print(rearrangeWord(input));
		//System.out.print("get");
	}
}