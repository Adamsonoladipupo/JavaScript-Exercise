import java.util.Scanner;

public class privacyWithCryptography{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

/*
		//encryption
		System.out.println("Send a simple message in four digits");

		int[] message = new int [4];
		for (int count = 0; count <=3; count++){

			System.out.printf("Enter digit %d : ", count);
			message[count] = input.nextInt();
		}
		System.out.print("You entered: ");
		for (int count = 0; count <=3; count++){
			System.out.print(message[count]);
		}

		System.out.println("");
		System.out.println("Stage 1 (+7)");
		for (int count = 0; count <=3; count++){
			message[count] = message[count] + 7;
			System.out.printf(" %d",message[count]);
		}

		System.out.println("");
		System.out.println("Stage 2 (%10)");
		for (int count = 0; count <=3; count++){
			message[count] = message[count] % 10;
			System.out.printf(" %d",message[count]);
		}


		System.out.println("");
		System.out.println("Stage 3 (swapping)");

		int tv1 = message[0] ;
		int tv2 = message[2];
		message[0] = tv2;
		message[2] = tv1;
		tv1 = message[1];
		tv2 = message[3];
		message[1]= tv2;
		message[3] = tv1;

		for (int count = 0; count <=3; count++){
			System.out.printf(" %d",message[count]);
		}

*/







		// decryption


		System.out.println("Send a simple message in four digits");

		int[] message = new int [4];
		for (int count = 0; count <=3; count++){

			System.out.printf("Enter digit %d : ", count);
			message[count] = input.nextInt();
		}
		System.out.print("You entered: ");
		for (int count = 0; count <=3; count++){
			System.out.print(message[count]);
		}


		System.out.println("");
		System.out.println("Stage 4 (-7)");
		for (int count = 0; count <=3; count++){
			message[count] = message[count] - 7;
			System.out.print(message[count]);
		}


		System.out.println("");
		System.out.print("");
		System.out.println("Stage 2 (+10)");
		for (int count = 0; count <=3; count++){
			message[count] = message[count] + 10;
			System.out.printf(" %d",message[count]);
		}


		System.out.println("");
		System.out.println("Stage 3 (%10)");
		for (int count = 0; count <=3; count++){
			if (message[count] > 10){
				message[count] = message[count] % 10;
			}
			System.out.printf(" %d",message[count]);
		}


		System.out.println("");
		System.out.println("Stage 1 (swapping)");

		int tv1 = message[0] ;
		int tv2 = message[2];
		message[0] = tv2;
		message[2] = tv1;
		tv1 = message[1];
		tv2 = message[3];
		message[1]= tv2;
		message[3] = tv1;

		for (int count = 0; count <=3; count++){
			System.out.print(message[count]);
		}

		
	}


}