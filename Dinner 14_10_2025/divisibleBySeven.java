public class divisibleBySeven{
	public static void main(String[] args){
		for (int count = 1; count <= 100; count++){
			if (count % 7 == 0){
				System.out.println(count);
			}
		}
	}
}