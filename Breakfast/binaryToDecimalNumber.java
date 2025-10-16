public class binaryToDecimalNumber{
	public static void main(String[] args){
		int binaryNumber = 1111011;
		String binaryNumberToString = binaryNumber + "";
		char binaryNumberToChar = '';

		for (int count = 1; count <= binaryNumberToString.length(); count++){
			binaryNumberToChar = binaryNumberToString.charAt(count) * Math.pow(2,count)
		}
		

		System.out.print(binaryNumberToChar);
	}
}