public class countPerfectNumbers{
	public static void main(String[] args){

		int count = 1;
		int checker = 0;
		for (count = 1; count <= 1000; count++){
			checker = checkPerfectNumbers(count);
			if (checker > 0){
				System.out.println(checker);	
			}
		}

	}

	public static int checkPerfectNumbers(int number){

		int divisor = 0;
		int perfectNumbers = 0;
		int count = 1;
		for (count = 1; count < number; count++){
			if (number % count == 0){
				divisor += count;
			}
		}
		if (divisor == number){
			perfectNumbers = count;
			return perfectNumbers;
		} 
		if (divisor != number) { 
			return 0;
		}

		return perfectNumbers;
	}
}