import java.util.Scanner;

public class StrongNumber{
	public static void main(String[] args){
		int initialInput= 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		initialInput = number;


		int seperatedNumber = 0;
		int factorial = 1;
		int sumFactorials = 0;
		while (number%10!=0 || number/10!=0){
			seperatedNumber = number % 10;
			for (int i=1; i<=seperatedNumber; i++){
				factorial = factorial *i;
			}
			sumFactorials += factorial ;
			factorial = 1;
			number = number /10;
		}
		if (initialInput == sumFactorials){
			System.out.printf("%d is a strong number ", initialInput);
		} else {
			System.out.printf("%d is not a strong number ", initialInput);
		}



	}
}
