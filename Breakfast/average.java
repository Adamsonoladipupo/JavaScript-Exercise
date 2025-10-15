public class average{
	public static void main(String[] args){
		double average = 0;
		int count = 1;
		for (count = 1; count <= 100; count++){
			average += count;
		}
		average = average / count;
		System.out.printf("Average is %.2f",average);
	}
}