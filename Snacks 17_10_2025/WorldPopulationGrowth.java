public class WorldPopulationGrowth{
	public static void main(String[] args){
		String docString = """

		Welcome!, This table displays the world polulation 
		growth ( 75 years) using this formula:

		P(t) = Po . e^rt

		where:
		- P(t) = population at time t
		- Po = initial population (8230000000 (mid-2025))
		- r = growth rate (0.84% == 0.0084)
		- t = time (in year)
		- e = Euler's number (2.71828)

		""";
		System.out.print(docString);

		double population = 0;
		double initial = 8.23;
		double increasePolulation = 0;
		double pupulationX2 = 0;

		System.out.println("Year	Anticipated Population	Increase Population");
		for (int count = 1; count <=75; count++){
			population = 8.23 * Math.pow(2.71828, (0.0084*count));
			increasePolulation = population - initial;
			System.out.printf("%d	%.2fB			%.2fB %n",count, population, increasePolulation);
			
		}
		
	}

}