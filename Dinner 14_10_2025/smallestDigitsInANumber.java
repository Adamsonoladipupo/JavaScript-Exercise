public class smallestDigitsInANumber{
	public static void main(String[] args){
		int number = 4387555;
		int initialNumberValue = number;
		int numberOfDigits = 0;
		int digitsOfNumbers = 0;

		while (number % 10 != 0 || number / 10 != 0){
			digitsOfNumbers = number % 10;
			number = number / 10;
			numberOfDigits ++;
		}

		int smallest = initialNumberValue % 10;
		initialNumberValue = initialNumberValue / 10;
		int digits = 0;

		for (int count = 1; count < numberOfDigits; count++){
			digits = initialNumberValue % 10;
			initialNumberValue = initialNumberValue / 10;
	
			//System.out.printf("digits %d %n", digits);
			
			if (digits < smallest){
				smallest = digits;
			}
		}
		System.out.printf("Smallest number is : %d", smallest);
		
	}
}