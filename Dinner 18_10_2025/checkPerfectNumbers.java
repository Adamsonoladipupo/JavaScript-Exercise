import java.util.Scanner;

public class checkPerfectNumbers{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);

		int divisor = 0;
		System.out.print("Enter a number: ");
		int number = inputCollector.nextInt();
		for (int count = 1; count < number; count++){
			if (number % count == 0){
				divisor += count; 
			}
		}
		if (divisor == number){
			System.out.print("Is a perfect number");
		} 
		if (divisor != number) {System.out.print("Is not a perfect number");}

		
		
	}
}