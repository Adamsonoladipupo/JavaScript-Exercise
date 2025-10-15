public class digitsInNumber{
	public static void main(String[] args){
		int number = 12045;
		int numberOfDigits = 0;
		while (number % 10 != 0 || number / 10 != 0){
			//System.out.println(number);
			number = number / 10;
			numberOfDigits++;
		}
		System.out.printf("Number of digits: %d", numberOfDigits);
	}
}