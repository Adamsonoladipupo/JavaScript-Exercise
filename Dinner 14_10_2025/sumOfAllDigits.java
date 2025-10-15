public class sumOfAllDigits{
	public static void main(String[] args){
		int number = 123454376;
		int digits = 0;
		while (number % 10 != 0 || number / 10 != 0){
			digits += number % 10;
			number = number / 10;
		}
		System.out.printf("Sum of all digits: %d", digits);
	}
}