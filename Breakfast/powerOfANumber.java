public class powerOfANumber{
	public static void main(String[] args){
		int number = 2;
		int storeNumber = number;
		int exponent = 5;
		for (int count = 1; count < exponent; count++){
			number *= storeNumber; 
		}
		System.out.printf("2^5 = %d", number);
	}
}