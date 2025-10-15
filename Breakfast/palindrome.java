public class palindrome{
	public static void main(String[] args){
		int number = 12045;
		int storeNumberInitialValue = number;
		int digitsOfNumbers = 0;
		int numberOfDigits = 0;
		int newNumber = 0;
		int palindrome = 0;
		int palindromes = 0;
		while (number % 10 != 0 || number / 10 != 0){
			digitsOfNumbers = number % 10;
			number = number / 10;
			numberOfDigits ++;
			System.out.println(digitsOfNumbers);
		}
		
		System.out.print(storeNumberInitialValue);
		for (int count = numberOfDigits; count >= 1; count--){
			newNumber = storeNumberInitialValue % 10;
			System.out.println(newNumber);
			storeNumberInitialValue = storeNumberInitialValue / 10;
			palindrome = Math.pow(10, count-1)( newNumber);
			palindromes += palindrome;
			System.out.println(palindrome);
		}
	}
}