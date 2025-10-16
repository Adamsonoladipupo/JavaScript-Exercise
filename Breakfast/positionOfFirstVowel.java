public class positionOfFirstVowel{
	public static void main(String[] args){
		String word = "mathematics";
		int count = 0;
		for (count = 0; count < word.length(); count++){
			char convertWord = word.charAt(count);
			if (convertWord == 'a' || convertWord == 'e' || convertWord == 'i' || convertWord == 'o' || convertWord == 'u'){
			System.out.println("vowel letter: " + convertWord + " position " + count); 
			break;
			}
			
		}

	}
}