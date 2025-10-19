import java.util.Scanner;

public class leapYear{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		if ( year % 4 == 0 && year % 100 != 0){
			System.out.print("Is a leap year");
		}
		else{
			System.out.print("Not a leap year");
		}
	}
}