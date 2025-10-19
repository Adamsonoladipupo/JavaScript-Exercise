public class countArmStrong{
	public static void main(String[] args){

		int checker = 0;
		int count = 1;
		for (count = 1; count <= 1000; count++){
			checker = checkArmStrong(count);
			if (checker > 0){
				System.out.println(checker);
			}
		}
	}
	
	public static int checkArmStrong(int number){

		int initialInput = 0;
		initialInput = number;
		int seperatedNumber = 0;
		int cubeOfSeperatedNumber = 0;
		int SumOfCubeOfSeperatedNumber = 0;

		while(number % 10 !=0 || number / 10 !=0){
			seperatedNumber = number % 10;
			cubeOfSeperatedNumber = seperatedNumber*seperatedNumber*seperatedNumber;
			SumOfCubeOfSeperatedNumber += cubeOfSeperatedNumber;
			number /=10;
			seperatedNumber = 0;
		}
		if (initialInput == SumOfCubeOfSeperatedNumber){
			return SumOfCubeOfSeperatedNumber;
		} else {
			return 0;
		}

	}
}
