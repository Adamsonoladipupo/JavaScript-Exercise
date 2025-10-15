public class multiplesOfThree{
	public static void main(String[] args){
		int products = 1;
		for (int count = 1; count <= 10; count++){
			products *= count;
		}
		System.out.print(products);
	}
}