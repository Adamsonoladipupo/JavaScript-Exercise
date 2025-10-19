public class countLeapYear{
	public static void main(String[] args){

		int count = 1900;
		int checker = 0;
		for (count = 1900; count <= 2025; count++){
			checker = getLeapYear(count);
			if (checker > 0){
				System.out.println(checker);
			}
		}
	}

	public static int getLeapYear(int number){

		if ( number % 4 == 0 && number % 100 != 0){
			return number;
		}
		else{
			return 0;
		}

	}
}