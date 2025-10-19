import java.util.Scanner;

public class GCDOfNumbers{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNumber = inputCollector.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = inputCollector.nextInt();
	
		int largestNumber = 0;
		largestNumber = firstNumber;
		if (secondNumber > largestNumber){
			secondNumber = largestNumber;
		}
		int count = 0;
		int GCD = 0;
		for (count = 1; count <= largestNumber; count++){
			if (secondNumber % count == 0 && firstNumber % count == 0){
				System.out.println(count);
				GCD = count;
			}
		System.out.println(count);
		}
		System.out.printf("The GCD is : %d", count);
	}
}