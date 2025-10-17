public class primeNumbers{
	public static void main(String[] args){
		int factor = 0;
		for (int count = 2; count < 100; count++){
			for (int counter = 2; counter <= count; counter++){
				if (counter % count != 0 ){
					factor++;
				}
				if (factor == 0){
					System.out.println(count);
				}
				
			}
		}
	}
}	