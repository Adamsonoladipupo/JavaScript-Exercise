public class stringASCIIValue{
	public static void main(String[] args){
		String word = "apple";
		for (int count = 0; count < 5; count++){
			char convertWord = word.charAt(count);
			System.out.println((int)convertWord);
		}
	}
}