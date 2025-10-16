public class decimalToBinaryNumber{
	public static void main(String[] args){
		int decimalNumber = 123;
		int storeDecimalNumber = decimalNumber;
		int remainders = 0;
		String remaindersAsString = "";

		while (decimalNumber / 2 != 0 || decimalNumber % 2 != 0){
			remainders = decimalNumber % 2;
			decimalNumber /= 2;
			System.out.printf("decimalNumber: %d remainders: %d %n", decimalNumber, remainders);
			remaindersAsString += remainders + "";
		}
		System.out.printf("%d to binary is: %s", storeDecimalNumber, remaindersAsString);
	}
}