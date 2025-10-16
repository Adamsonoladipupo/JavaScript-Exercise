public class primeNumbers{
	public static void main(String[] args){
		int factors = 0;
		for (int count = 1; count <= 100; count++){
			if (100 % count == 0 ){
				System.out.println(count);
			}
		}
	}
}	