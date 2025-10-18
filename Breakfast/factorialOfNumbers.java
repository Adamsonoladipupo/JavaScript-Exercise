import java.util.Scanner;

public class factorialOfNumbers{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = inputCollector.nextInt();

		for (int count = 1; count <= number; count++){
			number *= count
		}
		System.out.printf("The factorial of %d is: %d");
	}
}