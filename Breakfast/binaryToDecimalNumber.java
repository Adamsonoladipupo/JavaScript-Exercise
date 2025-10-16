public class binaryToDecimalNumber{
	public static void main(String[] args){
		int binaryNumber = 1111011;
	
		while (binaryNumber % 10 != 0 || binaryNumber / 10 != 0){
			digitsOfNumbers = number % 10;
			number = number / 10;
			numberOfDigits ++;
			System.out.println(digitsOfNumbers);
		}
	}
}