public class MoveZero{
	public static void main(String[] args){
		int [] numbers = {4,0,2,0,1,0,3};
		
		for (int count = 0; count < numbers.length; count++){
			if (numbers[count] == 0){
				numbers[count] = numbers[count+1];
			}
				
			System.out.print(numbers[count]);
		}
	}
}