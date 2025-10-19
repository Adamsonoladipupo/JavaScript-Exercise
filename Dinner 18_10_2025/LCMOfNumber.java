import java.util.Scanner;

public class LCMOfNumber{
	public static void main(String[] args){

		System.out.println("Welcome! This app helps you calculate the L.C.M of a number.");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		int divisor = 2;
		int sumOfDivisors = 0;

		while ( number != 1){
			if (number % divisor == 0 ){
				number = number/divisor;
				sumOfDivisors += divisor;
			} else {
				divisor++;
			}
		}
		System.out.printf("The LCM is: %d",sumOfDivisors);
	}
}